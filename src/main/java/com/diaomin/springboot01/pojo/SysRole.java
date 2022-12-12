package com.diaomin.springboot01.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 系统角色
 * </p>
 *
 * @author diaominyh
 * @since 2022-11-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_sys_role")
public class SysRole implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 角色编码
     */
    private String code;

    /**
     * 角色名称
     */
    @TableField("roleName")
    private String roleName;

    /**
     * 创建者
     */
    @TableField("createdUserId")
    private Long createdUserId;

    /**
     * 创建时间
     */
    @TableField("createdTime")
    private LocalDateTime createdTime;

    /**
     * 修改者
     */
    @TableField("updatedUserId")
    private Long updatedUserId;

    /**
     * 修改时间
     */
    @TableField("updatedTime")
    private LocalDateTime updatedTime;


}
