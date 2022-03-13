package cn.edu.hbuas.admin.gatewayimpl.database.dataobject;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@TableName("t_type")
public class TypeDo {

    /**
     * 类型ID
     */
    @TableId
    private Long type_id;
    /**
     * 类型名称
     */
    private String type_name;

    /**
     * 创建时间
     */
    private Date create_time;

    /**
     * 类型描述
     */
    private String description;


    /**
     * 类型状态（0正常 1删除）
     */
    private String status;

}
