package cn.genius.study.config;

import javax.jms.Queue;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author 李港
 * @date 2020/10/27 15:05
 */
@Configuration
public class ActivityConfig {
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("ActiveMQQueue");
    }

}
