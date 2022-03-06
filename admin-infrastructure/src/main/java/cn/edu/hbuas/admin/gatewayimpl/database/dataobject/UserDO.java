package cn.edu.hbuas.admin.gatewayimpl.database.dataobject;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * UserDO
 */

@TableName("sys_user")
public class UserDO extends BaseDO {

    /**
     * 账号id
     */
    @TableId
    private String userId;

    /**
     * 姓名
     */
    private String userName;

}
