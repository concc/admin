package cn.edu.hbuas.admin.gatewayimpl.database;

import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.BlogDO;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Blog Info Mapper
 *
 */
@Mapper
public interface BlogMapper extends BaseMapper<BlogDO> {


}
