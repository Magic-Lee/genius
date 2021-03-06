package cn.genius.study.controller;

import cn.genius.study.entity.vo.MybatisGeneratorVo;
import cn.genius.study.utils.MysqlGeneratorUtil;
import cn.genius.study.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/generator")
public class GeneratorController {

    @RequestMapping(value = "/create")
    public Result<?> generatorCode(@RequestBody MybatisGeneratorVo vo){
        try {
            Long time = System.currentTimeMillis();
            MysqlGeneratorUtil.mybatisGenerator(vo);
            System.out.println("create() 共计耗时:"+(System.currentTimeMillis()-time)+"ms");
            return Result.ok("生成成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Result.ok("生成失败 Exception:"+e.getMessage());
        }
    }
}
