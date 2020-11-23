package cn.siwen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author gx
 * @create 2020-11-20 16:41
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class hystrixMain {
    public static void main(String[] args) {
        SpringApplication.run(hystrixMain.class,args);
    }
}
