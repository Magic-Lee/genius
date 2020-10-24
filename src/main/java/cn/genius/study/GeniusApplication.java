package cn.genius.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

@SpringBootApplication
@MapperScan("cn.genius.study.*.mapper")
//@ComponentScan({"cn.genius.study.*.*"})
public class GeniusApplication {

    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(GeniusApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
        //我是帅哥
    }



}
