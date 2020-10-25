package cn.genius.study.controller;


import cn.genius.study.service.TestService;
import cn.genius.study.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import cn.genius.study.controller.BaseController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * Users and global privileges 前端控制器
 * </p>
 *
 * @author magicLee
 * @since 2020-10-25
 */
@RestController
@RequestMapping("/test")
public class TestController extends BaseController {

    @Resource
    private TestService testService;

    @RequestMapping("/list")
    public Result<?> list(){
        return Result.ok(this.testService.list());
    }
}

