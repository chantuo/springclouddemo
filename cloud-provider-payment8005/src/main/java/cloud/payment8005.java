package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author gx
 * @create 2020-11-11 16:36
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker//激活Hystrixl断路器
public class payment8005 {
    public static void main(String[] args) {
        SpringApplication.run(payment8005.class,args);
    }
}
