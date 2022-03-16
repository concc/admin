package cn.edu.hbuas.admin.commond;

import cn.edu.hbuas.admin.dto.UserAddCmd;
import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import com.alibaba.cola.dto.Response;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserAddCmdExe {

    @Resource
    private UserMapper userMapper;

    /**
     *  新增用户
     */
    public Response execute(UserAddCmd cmd) {
        return null;
    }

}
