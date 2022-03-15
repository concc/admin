package cn.edu.hbuas.admin.dto;

import lombok.Data;

@Data
public class UserGetQry extends CommonCommand{
    private String userId;

    private String userName;

    private String nickName;

    private String status;

    private Integer pageSize;

    private Integer pageIndex;



    public UserGetQry(){

    }

}