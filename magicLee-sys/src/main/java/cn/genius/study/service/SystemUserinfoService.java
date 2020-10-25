package cn.genius.study.service;


import cn.genius.study.entity.SystemUserinfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
public interface SystemUserinfoService extends IService<SystemUserinfo> {

    List<SystemUserinfo> queryBySex(String sex) throws Exception;
}
