package cn.siwen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gx
 * @create 2020-11-26 17:24
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudConfigMain3355 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigMain3355.class,args);
    }
}
