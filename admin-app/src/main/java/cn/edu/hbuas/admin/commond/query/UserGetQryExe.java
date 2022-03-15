package cn.edu.hbuas.admin.commond.query;

import cn.edu.hbuas.admin.convertor.UserMapping;
import cn.edu.hbuas.admin.dto.UserGetQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserGetQryExe {

    @Resource
    private UserMapper userMapper;

    public PageResponse<UserCO> execute(UserGetQry qry) {
        Page<UserDO> userPage = userMapper.selectPage(new Page<>(qry.getPageIndex(), qry.getPageSize()),
                null);
        List<UserDO> records = userPage.getRecords();
        ArrayList<UserCO> result = Lists.newArrayList();
        records.forEach(userDO -> {
            UserCO userCO = UserMapping.INSTANCE.UserDoToUserCo(userDO);
            result.add(userCO);
        });
        return PageResponse.of(result, qry.getPageSize(), qry.getPageSize(), qry.getPageIndex());
    }

}
