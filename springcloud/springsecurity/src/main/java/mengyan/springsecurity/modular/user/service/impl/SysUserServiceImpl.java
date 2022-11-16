package mengyan.springsecurity.modular.user.service.impl;

import mengyan.springsecurity.modular.user.entity.SysUser;
import mengyan.springsecurity.modular.user.mapper.SysUserMapper;
import mengyan.springsecurity.modular.user.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Guoxb
 * @since 2022-11-16
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
