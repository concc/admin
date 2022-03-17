package cn.edu.hbuas.admin.web;

import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
    /**
     * 登录方法
     *
     */
    @PostMapping("/login")
    public SingleResponse login() {
        return null;
    }

    /**
     * 登出方法
     *
     */
    @GetMapping("/loginOut")
    public Response getInfo() {
        return null;
    }
}
