/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月28日 21:31
 */
package mengyan.springsecurity.modular.user.controller;

import mengyan.springsecurity.modular.user.entity.SysUser;
import mengyan.springsecurity.modular.user.service.LoginService;
import mengyan.springsecurity.response.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginServcie;
    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody SysUser user){
        return loginServcie.login(user);
    }
}
