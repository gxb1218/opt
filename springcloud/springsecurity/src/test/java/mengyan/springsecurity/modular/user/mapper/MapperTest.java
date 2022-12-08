/**
 * @Description: TODO
 * @author: scott
 * @date: 2022年11月28日 20:45
 */
package mengyan.springsecurity.modular.user.mapper;

import mengyan.springsecurity.modular.menu.entity.SysMenu;
import mengyan.springsecurity.modular.menu.mapper.SysMenuMapper;
import mengyan.springsecurity.modular.role.entity.SysRole;
import mengyan.springsecurity.modular.role.mapper.SysRoleMapper;
import mengyan.springsecurity.modular.user.entity.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.lang.model.element.VariableElement;
import java.util.List;

@SpringBootTest
public class MapperTest {

    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Test
    public void testBCryptPasswordEncoder(){
        //加密
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("mengyan123");
        System.err.println("encode= " + encode);
        //校验铭文
        boolean matches = passwordEncoder.matches("mengyan123", "$2a$10$2YeJg16s0vGtoJLWwKjiG.br571o2Vau2W/iR.VScCUS1tMYyV6vK");
        System.err.println("matches= " + matches);
    }
    @Test
    public void testUserMapper(){
        List<SysUser> users = userMapper.selectList(null);
        System.out.println(users);
    }
    @Test
    public  void testSelectPermsByUserId(){
        List<String> strings = sysMenuMapper.selectPermsByUserId(2l);
        System.err.println("strings+" +strings);
    }
}
