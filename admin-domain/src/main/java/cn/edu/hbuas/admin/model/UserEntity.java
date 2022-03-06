package cn.edu.hbuas.admin.model;

import lombok.Data;

import java.time.LocalDate;

/**
 * User Domain
 *
 */
@Data
public class UserEntity {

    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 密码盐
     */
    private String salt;

    private String phoneNo;

    private Integer gender;

    private LocalDate birthday;

    private String description;
}
