package cn.edu.hbuas.admin.gatewayimpl.database;

import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.TypeDo;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Type Info Mapper
 *
 */
@Mapper
public interface TypeMapper extends BaseMapper<TypeDo> {


}
