package cn.edu.hbuas.admin.gatewayimpl.database.dataobject;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@TableName("t_comment")
public class CommentDo {

    /**
     * 评论ID
     */
    @TableId
    private Long comment_id;

    /**
     * 父评论ID
     */
    private Long parent_id;

    /**
     * 博客ID
     */
    private Long blog_id;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论用户信息
     */
    private String  holder_info;

    /**
     * 创建时间
     */
    private Date create_time;


    /**
     * 类型状态（0正常 1删除）
     */
    private String status;



}
