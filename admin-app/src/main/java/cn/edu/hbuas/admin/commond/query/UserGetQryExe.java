package cn.edu.hbuas.admin.commond.query;

import cn.edu.hbuas.admin.convertor.UserMapping;
import cn.edu.hbuas.admin.dto.UserGetQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.alibaba.cola.dto.PageResponse;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserGetQryExe {

    @Resource
    private UserMapper userMapper;

    /**
    *  条件检索
    */
    public PageResponse<UserCO> execute(UserGetQry qry) {

        QueryWrapper<UserDO> userQueryWrapper = new QueryWrapper<>();

        boolean timeCondition = null != qry.getBeginTime() && null != qry.getEndTime();
        boolean nickNameCondition =
                StringUtils.isNotEmpty(qry.getNickName()) && StringUtils.isNotBlank(qry.getNickName());

        LambdaQueryWrapper<UserDO> queryWrapper = userQueryWrapper.lambda()
                .between(timeCondition, UserDO::getCreateTime, qry.getBeginTime(), qry.getEndTime())
                .like(nickNameCondition, UserDO::getNickName, qry.getNickName())
                .eq(UserDO::getStatus, qry.getStatus());

        Page<UserDO> userPage = userMapper.selectPage(new Page<>(qry.getPageIndex(), qry.getPageSize()), queryWrapper);

        List<UserDO> records = userPage.getRecords();
        ArrayList<UserCO> result = Lists.newArrayList();
        records.forEach(userDO -> {
            UserCO userCO = UserMapping.INSTANCE.UserDoToUserCo(userDO);
            result.add(userCO);
        });
        return PageResponse.of(result, qry.getPageSize(), qry.getPageSize(), qry.getPageIndex());
    }

}
