package cn.genius.study.test.service.impl;

import cn.genius.study.test.entity.Test;
import cn.genius.study.test.mapper.TestMapper;
import cn.genius.study.test.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Users and global privileges 服务实现类
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

}
