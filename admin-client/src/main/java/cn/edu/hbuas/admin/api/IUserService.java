package cn.edu.hbuas.admin.api;


import cn.edu.hbuas.admin.dto.UserGetQry;
import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import com.alibaba.cola.dto.SingleResponse;

/**
 * 用户相关
 *
 * @author YC01858
 */
public interface IUserService {

    SingleResponse<UserCO> getUserBy(UserGetQry qry);
}
