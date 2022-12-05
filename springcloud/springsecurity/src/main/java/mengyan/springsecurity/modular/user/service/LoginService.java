package mengyan.springsecurity.modular.user.service;

import mengyan.springsecurity.modular.user.entity.SysUser;
import mengyan.springsecurity.response.ResponseResult;

public interface LoginService {

    ResponseResult login(SysUser user);

    ResponseResult logout();
}
