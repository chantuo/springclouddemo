package cn.siwen;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author gx
 * @create 2020-11-05 17:34
 */
@SpringBootApplication
@EnableEurekaServer
public class eureka7002 {
    public static void main(String[] args) {
        SpringApplication.run(eureka7002.class, args);
    }

}
