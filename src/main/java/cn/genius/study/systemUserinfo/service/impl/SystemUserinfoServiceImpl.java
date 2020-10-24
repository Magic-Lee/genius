package cn.genius.study.systemUserinfo.service.impl;

import cn.genius.study.systemUserinfo.entity.SystemUserinfo;
import cn.genius.study.systemUserinfo.mapper.SystemUserinfoMapper;
import cn.genius.study.systemUserinfo.service.SystemUserinfoService;
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
    @Override
    public List<SystemUserinfo> queryBySex(String sex) throws Exception {
        return this.baseMapper.queryListBySex(sex);
    }
}
