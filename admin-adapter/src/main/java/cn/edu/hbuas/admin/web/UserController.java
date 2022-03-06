package cn.edu.hbuas.admin.web;

import cn.edu.hbuas.admin.api.IUserService;
import cn.edu.hbuas.admin.dto.UserGetQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
*  用户相关
*/

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private IUserService userService;


    @GetMapping(value = "/list")
    public SingleResponse<UserCO> list() {
        return userService.getUserBy(null);
    }

}
