package cn.edu.hbuas.admin.gatewayimpl.database;

import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.MenuDo;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * Menu Info Mapper
 *
 */
@Mapper
public interface MenuMapper extends BaseMapper<MenuDo> {


}
