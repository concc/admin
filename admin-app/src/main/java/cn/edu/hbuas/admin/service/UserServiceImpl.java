package cn.edu.hbuas.admin.service;

import cn.edu.hbuas.admin.api.IUserService;
import cn.edu.hbuas.admin.commond.query.UserGetQryExe;
import cn.edu.hbuas.admin.dto.UserGetQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import com.alibaba.cola.catchlog.CatchAndLog;
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
    public SingleResponse<UserCO> getUserBy(UserGetQry qry) {
        return userGetQryExe.execute(qry);
    }

}
