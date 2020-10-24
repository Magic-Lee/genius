package cn.genius.study.test.controller;


import cn.genius.study.common.model.vo.Result;
import cn.genius.study.test.entity.Test;
import cn.genius.study.test.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import cn.genius.study.common.controller.BaseController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * Users and global privileges 前端控制器
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Resource
    private TestService testService;
    @RequestMapping(value = "/list")
    public Result<?> list(){
        List<Test> result = this.testService.list();
        return Result.ok(result);
    }

}

