package cn.edu.hbuas.admin.dto.clientobject;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class UserCO {

    public Long userId;

    public String userName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date createTime;

    public String delFlag;
}
