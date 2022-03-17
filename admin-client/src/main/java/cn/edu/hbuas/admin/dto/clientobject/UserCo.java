package cn.edu.hbuas.admin.dto.clientobject;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class UserCo {

    public Long userId;

    public String userName;

    public String nickName;

    public String userType;

    public String email;

    public String phoneNumber;

    public String sex;

    public String avatar;

    public String status;

    public String loginIp;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date loginDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date createTime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date updateTime;

    public String delFlag;

    public String createBy;

    public String updateBy;

    public String remark;
}
