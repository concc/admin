package cn.edu.hbuas.admin.gatewayimpl.database;

import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.CommentDo;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Comment Info Mapper
 *
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentDo> {


}
