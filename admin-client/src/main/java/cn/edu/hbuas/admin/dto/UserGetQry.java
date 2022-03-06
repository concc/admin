package cn.edu.hbuas.admin.dto;

import com.alibaba.cola.dto.Command;
import lombok.Data;

@Data
public class UserGetQry extends Command {
    private String userId;
    private String id;

    public UserGetQry(){

    }

}