package cn.genius.study.mapper;

import cn.genius.study.entity.SystemUserinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
public interface SystemUserinfoMapper extends BaseMapper<SystemUserinfo> {
    List<SystemUserinfo> queryListBySex(@Param("sex") String sex);
}
