package mengyan.springsecurity.modular.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Guoxb
 * @since 2022-11-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SysUser对象", description="用户表")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "账号状态（0正常 1停用）")
    private String status;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "手机号")
    private String phonenumber;

    @ApiModelProperty(value = "用户性别（0男，1女，2未知）")
    private String sex;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "用户类型（0管理员，1普通用户）")
    private String userType;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "更新人")
    private Long updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "删除标志（0代表未删除，1代表已删除）")
    private Integer delFlag;

    public static void main(String[] args) {
        List<String> arrList = Arrays.asList("CICCBJFI","02100201");
        arrList.forEach(item -> {
            addString(item);
            System.err.println("测试成功"+item);
        });
    }

    private static void addString(String arr) {
        if (arr.contains("CICCBJFI") || arr.contains("02100201")) {
            return;
        }
        System.err.println("-------");
    }
}
