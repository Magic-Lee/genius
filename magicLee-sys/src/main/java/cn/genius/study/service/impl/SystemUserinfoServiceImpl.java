package cn.genius.study.service.impl;


import cn.genius.study.entity.SystemUserinfo;
import cn.genius.study.mapper.SystemUserinfoMapper;
import cn.genius.study.service.SystemUserinfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
@Service
public class SystemUserinfoServiceImpl extends ServiceImpl<SystemUserinfoMapper, SystemUserinfo> implements SystemUserinfoService {

    public List<SystemUserinfo> queryBySex(String sex) throws Exception {
        return this.baseMapper.queryListBySex(sex);
    }
}
