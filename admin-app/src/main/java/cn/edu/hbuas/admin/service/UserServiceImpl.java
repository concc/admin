package cn.edu.hbuas.admin.service;

import cn.edu.hbuas.admin.api.IUserService;
import cn.edu.hbuas.admin.commond.query.UserGetQryExe;
import cn.edu.hbuas.admin.dto.*;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import com.alibaba.cola.catchlog.CatchAndLog;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.PageResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 用户相关
 */
@Service
@CatchAndLog
public class UserServiceImpl implements IUserService {
    @Resource
    private UserGetQryExe userGetQryExe;

    @Override
    public PageResponse<UserCO> listUser(UserGetQry userGetQry) {
        return userGetQryExe.execute(userGetQry);
    }

    @Override
    public SingleResponse<UserCO> getUserById(UserGetSingleQry userGetSingleQry) {
        return null;
    }

    @Override
    public Response addUser(UserAddCmd cmd) {
        return null;
    }

    @Override
    public Response updateUser(UserUpdateCmd cmd) {
        return null;
    }

    @Override
    public Response deleteUserById(UserDeleteByIdCmd cmd) {
        return null;
    }
}
