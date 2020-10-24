package cn.genius.study.systemUserinfo.controller;


import cn.genius.study.common.model.vo.Result;
import cn.genius.study.systemUserinfo.service.SystemUserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.genius.study.common.controller.BaseController;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author magicLee
 * @since 2020-10-22
 */
@Slf4j
@RestController
@RequestMapping("/systemUserinfo")
public class SystemUserinfoController extends BaseController {
    @Resource
    private SystemUserinfoService systemUserinfoService;


    @RequestMapping(value = "/list")
    public Result<?> list(){
        return Result.ok(this.systemUserinfoService.list());
    }

    @RequestMapping(value = "/xmlTest")
    public Result<?> xmlTest() throws Exception {
        return Result.ok(this.systemUserinfoService.queryBySex("1"));
    }
}

