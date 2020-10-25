package cn.genius.study.entity;

import cn.genius.study.model.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SystemUserinfo extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 主键自增
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 用户账号
     */
    private String username;

    private String password;

    /**
     * 盐值
     */
    private String salt;

    /**
     * 性别
     */
    private String sex;


}
