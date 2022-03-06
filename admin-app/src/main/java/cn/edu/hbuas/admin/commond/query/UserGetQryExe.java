package cn.edu.hbuas.admin.commond.query;

import cn.edu.hbuas.admin.dto.UserGetQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserGetQryExe {

    @Resource
    private UserMapper userMapper;

    public SingleResponse<UserCO> execute(UserGetQry qry) {
        UserDO userDO = userMapper.selectById(1);
        UserCO userCO = new UserCO();
        BeanUtils.copyProperties(userDO, userCO);
        return SingleResponse.of(userCO);
    }

}
