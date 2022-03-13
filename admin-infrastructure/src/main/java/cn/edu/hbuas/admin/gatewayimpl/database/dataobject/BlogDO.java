package cn.edu.hbuas.admin.gatewayimpl.database.dataobject;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


/**
 * UserDO
 */
@Setter
@Getter
@TableName("t_blog")
public class BlogDO {

    /**
     * 博客id
     */
    @TableId
    private Long blogId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 类型id
     */
    private Long typeId;

    /**
     * 是否开启评论(0开启,1关闭)
     */
    private String commentable;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 描述
     */
    private String description;

    /**
     * 首图地址
     */
    private String firstPicture;


    /**
     * 是否推荐
     */
    private String recommend;


    /**
     * 是否发布
     */
    private String published;

    /**
     * 浏览数量
     */
    private Integer views;

    /**
     * 评论数量
     */
    private Integer commentCount;

    /**
     * 是否原创
     */
    private String flag;


    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 博客状态（0正常 1删除）
     */
    private String status;

}
