package cn.edu.hbuas.admin.convertor;

import cn.edu.hbuas.admin.dto.clientobject.UserCO;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapping {

    UserMapping INSTANCE = Mappers.getMapper(UserMapping.class);

    /**
     * userDo 转化为 UserCO
     */
    UserCO UserDoToUserCo(UserDO userDo);

}
