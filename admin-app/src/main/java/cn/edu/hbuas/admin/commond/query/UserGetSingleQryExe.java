package cn.edu.hbuas.admin.commond.query;

import cn.edu.hbuas.admin.convertor.UserMapping;
import cn.edu.hbuas.admin.dto.UserGetSingleQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCo;
import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserGetSingleQryExe {

    @Resource
    private UserMapper userMapper;

    /**
     *  根据id查询用户
     */
    public SingleResponse<UserCo> execute(UserGetSingleQry qry) {
        UserDO userDO = userMapper.selectById(qry.getUserId());
        UserCo userCo = UserMapping.INSTANCE.userDoToUserCo(userDO);
        return SingleResponse.of(userCo);
    }
}
