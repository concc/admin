package cn.edu.hbuas.admin.convertor;

import cn.edu.hbuas.admin.dto.clientobject.UserCo;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapping {

    UserMapping INSTANCE = Mappers.getMapper(UserMapping.class);

    /**
     * userDo 转化为 UserCO
     * @param userDo 数据库对象
     * @return userCo
     */
    UserCo userDoToUserCo(UserDO userDo);

}
