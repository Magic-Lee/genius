package cn.genius.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(scanBasePackages = "cn.genius.study")
@MapperScan("cn.genius.study.mapper")
@EnableJms //启动消息队列
public class GeniusApplication {
    public static void main(String[] args) {
        SpringApplication springApplication=new SpringApplication(GeniusApplication.class);
        springApplication.setBannerMode(Banner.Mode.CONSOLE);
        springApplication.run(args);
    }
}
