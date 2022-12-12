package com.diaomin.springboot01.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author diaominyh
 * @since 2022-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号
     */
    private String account;

    /**
     * 真是姓名
     */
    @TableField("realName")
    private String realName;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别（1:女、 2:男）
     */
    private Integer sex;

    /**
     * 出生日期（年-月-日）
     */
    private Date birthday;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 用户地址
     */
    private String address;

    /**
     * 用户角色id
     */
    @TableField("roleId")
    private Long roleId;

    /**
     * 创建人
     */
    @TableField("createdUserId")
    private Long createdUserId;

    /**
     * 创建时间
     */
    @TableField("createdTime")
    private Date createdTime;

    /**
     * 修改人
     */
    @TableField("updatedUserId")
    private Long updatedUserId;

    /**
     * 修改时间
     */
    @TableField("updatedTime")
    private Date updatedTime;

    @TableField("idPicPath")
    private String idPicPath;

    @TableField("workPicPath")
    private String workPicPath;

    @TableLogic
    private Integer deleted;


}
