package cn.edu.hbuas.admin.web;

import cn.edu.hbuas.admin.api.IUserService;
import cn.edu.hbuas.admin.dto.*;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
*  用户相关
*/

@RestController
public class UserController {

    @Resource
    private IUserService userService;


    @GetMapping(value = "/user")
    public PageResponse<UserCO> list(@RequestBody UserGetQry userGetQry) {
        return userService.listUser(userGetQry);
    }

    @GetMapping(value = "/user/{id}")
    public SingleResponse<UserCO> getUserById(@PathVariable String id) {
        UserGetSingleQry userGetSingleQry = new UserGetSingleQry();
        return userService.getUserById(userGetSingleQry);
    }

    @PutMapping(value = "/user")
    public Response updateUser() {
        UserUpdateCmd userUpdateCmd = new UserUpdateCmd();
        return userService.updateUser(userUpdateCmd);
    }

    @PostMapping(value = "/user")
    public Response addUser() {
        UserAddCmd userAddCmd = new UserAddCmd();
        return userService.addUser(userAddCmd);
    }

    @DeleteMapping(value = "/user/{id}")
    public Response deleteUser(@PathVariable String id) {
        UserDeleteByIdCmd userDeleteByIdCmd = new UserDeleteByIdCmd();
        return userService.deleteUserById(userDeleteByIdCmd);
    }

}
