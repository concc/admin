package cn.edu.hbuas.admin.gatewayimpl;

import cn.edu.hbuas.admin.gateway.UserGateway;
import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
/**
 * 仓储
 *
 */
@Component("userGateway")
public class UserGatewayImpl implements UserGateway {

    @Resource
    private UserMapper userMapper;
}
