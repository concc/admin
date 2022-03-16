package cn.edu.hbuas.admin.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
public class UserGetQry extends CommonCommand{
    private String userId;

    private String userName;

    private String nickName;

    private Date beginTime;

    private Date endTime;

    @Builder.Default
    private String status = "0";

    private Integer pageSize;

    private Integer pageIndex;



    public UserGetQry(){

    }

}