package cn.edu.hbuas.admin;

import cn.edu.hbuas.admin.gatewayimpl.database.UserMapper;
import cn.edu.hbuas.admin.gatewayimpl.database.dataobject.UserDO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UserTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testFindByID() {
        List<UserDO> sysUsers = userMapper.selectList(null);
        System.out.println("end");
    }
}
