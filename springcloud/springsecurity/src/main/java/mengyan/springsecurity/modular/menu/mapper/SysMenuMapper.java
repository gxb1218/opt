package mengyan.springsecurity.modular.menu.mapper;

import mengyan.springsecurity.modular.menu.entity.SysMenu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author Guoxb
 * @since 2022-12-06
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    List<String> selectPermsByUserId(Long id);
}
