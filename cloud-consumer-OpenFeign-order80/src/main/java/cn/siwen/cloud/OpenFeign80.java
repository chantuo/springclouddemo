package cn.siwen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gx
 * @create 2020-11-12 11:04
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OpenFeign80 {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeign80.class,args);
    }
}
