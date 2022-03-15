package cn.edu.hbuas.admin.api;


import cn.edu.hbuas.admin.dto.*;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;

/**
 * 用户相关
 *
 * @author YC01858
 */
public interface IUserService {

    /**
     *  查询用户列表
     */
    PageResponse<UserCO> listUser(UserGetQry userGetQry);

    /**
     *  根据ID查询用户
     */
    SingleResponse<UserCO> getUserById(UserGetSingleQry userGetSingleQry);

    /**
     *  添加用户
     */
    Response addUser(UserAddCmd cmd);

    /**
     *  修改用户信息
     */
    Response updateUser(UserUpdateCmd cmd);

    /**
     *  删除用户
     */
    Response deleteUserById(UserDeleteByIdCmd cmd);
}
