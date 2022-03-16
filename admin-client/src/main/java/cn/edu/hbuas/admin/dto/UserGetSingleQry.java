package cn.edu.hbuas.admin.dto;

import com.sun.istack.internal.NotNull;
import lombok.Data;

@Data
public class UserGetSingleQry extends CommonCommand{

    @NotNull
    private Long userId;
}
