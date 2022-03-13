SET NAMES utf8mb4;

-- ----------------------------
-- 1、用户信息表
-- ----------------------------
drop table if exists t_user;
create table t_user (
                          user_id           bigint(20)      not null auto_increment    comment '用户ID',
                          user_name         varchar(30)     not null                   comment '用户账号',
                          nick_name         varchar(30)     not null                   comment '用户昵称',
                          user_type         varchar(2)      default '00'               comment '用户类型（00系统用户）',
                          email             varchar(50)     default ''                 comment '用户邮箱',
                          phone_number      varchar(11)     default ''                 comment '手机号码',
                          sex               char(1)         default '0'                comment '用户性别（0男 1女 2未知）',
                          avatar            varchar(100)    default ''                 comment '头像地址',
                          password          varchar(100)    default ''                 comment '密码',
                          status            char(1)         default '0'                comment '帐号状态（0正常 1停用）',
                          del_flag          char(1)         default '0'                comment '删除标志（0代表存在 2代表删除）',
                          login_ip          varchar(128)    default ''                 comment '最后登录IP',
                          login_date        datetime                                   comment '最后登录时间',
                          create_by         varchar(64)     default ''                 comment '创建者',
                          create_time       datetime                                   comment '创建时间',
                          update_by         varchar(64)     default ''                 comment '更新者',
                          update_time       datetime                                   comment '更新时间',
                          remark            varchar(500)    default null               comment '备注',
                          primary key (user_id)
) engine=innodb auto_increment=100 comment = '用户信息表';



-- ----------------------------
-- 2、菜单权限表
-- ----------------------------
drop table if exists t_menu;
create table t_menu (
                          menu_id           bigint(20)      not null auto_increment    comment '菜单ID',
                          menu_name         varchar(50)     not null                   comment '菜单名称',
                          parent_id         bigint(20)      default 0                  comment '父菜单ID',
                          order_num         int(4)          default 0                  comment '显示顺序',
                          path              varchar(200)    default ''                 comment '路由地址',
                          component         varchar(255)    default null               comment '组件路径',
                          query             varchar(255)    default null               comment '路由参数',
                          is_frame          int(1)          default 1                  comment '是否为外链（0是 1否）',
                          is_cache          int(1)          default 0                  comment '是否缓存（0缓存 1不缓存）',
                          menu_type         char(1)         default ''                 comment '菜单类型（M目录 C菜单 F按钮）',
                          visible           char(1)         default 0                  comment '菜单状态（0显示 1隐藏）',
                          status            char(1)         default 0                  comment '菜单状态（0正常 1停用）',
                          perms             varchar(100)    default null               comment '权限标识',
                          icon              varchar(100)    default '#'                comment '菜单图标',
                          create_time       datetime                                   comment '创建时间',
                          update_by         varchar(64)     default ''                 comment '更新者',
                          update_time       datetime                                   comment '更新时间',
                          primary key (menu_id)
) engine=innodb auto_increment=2000 comment = '菜单权限表';



-- ----------------------------
-- 3、博客信息表
-- ----------------------------
drop table if exists t_blog;
create table t_blog (
                          blog_id           bigint(20)      not null auto_increment    comment '博客ID',
                          user_id           bigint(20)      not null                   comment '用户ID',
                          type_id           bigint(20)      not null                   comment '类型ID',
                          commentable       char(1)         not null                   comment '是否开启评论(0开启,1关闭)',
                          content           longtext        not null                   comment '博客内容',
                          create_time       datetime                                   comment '创建时间',
                          description       varchar(255)    default null               comment '博客描述',
                          first_picture     varchar(255)    default null               comment '首图地址',
                          recommend         char(1)         default 0                  comment '是否推荐(0开启,1关闭)',
                          published         char(1)         not null                   comment '是否发布(0开启,1关闭)',
                          views             int(11)         default 0                  comment '浏览数量',
                          commentCount      int(10)         default 0                  comment '评论数量',
                          flag              char(1)         not null                   comment '是否原创',
                          update_by         varchar(64)     default ''                 comment '更新者',
                          update_time       datetime                                   comment '更新时间',
                          status            char(1)         default 0                  comment '博客状态（0正常 1删除）',
                          primary key (blog_id)
) engine=innodb auto_increment=2000 comment = '博客信息表';






-- ----------------------------
-- 4、博客类型表
-- ----------------------------
drop table if exists t_type;
create table t_type (
                        type_id           bigint(20)      not null auto_increment    comment '类型ID',
                        type_name         varchar(255)    not null                   comment '类型名称',
                        create_time       datetime                                   comment '创建时间',
                        description       varchar(255)    default null               comment '类型描述',
                        status            char(1)         default 0                  comment '类型状态（0正常 1删除）',
                        primary key (type_id)
) engine=innodb auto_increment=2000 comment = '博客类型表';






-- ----------------------------
-- 5、评论表
-- ----------------------------
drop table if exists t_comment;
create table t_comment (
                        comment_id           bigint(20)      not null auto_increment    comment '评论ID',
                        parent_id            bigint(20)      not null                   comment '父评论ID',
                        blog_id              bigint(20)      not null                   comment '博客ID',
                        content              longtext        not null                   comment '评论内容',
                        holder_info          varchar(255)    not null                  comment '评论用户信息',
                        create_time          datetime                                   comment '创建时间',
                        status               char(1)         default 0                  comment '类型状态（0正常 1删除）',
                        primary key (comment_id)
) engine=innodb auto_increment=2000 comment = '评论表';