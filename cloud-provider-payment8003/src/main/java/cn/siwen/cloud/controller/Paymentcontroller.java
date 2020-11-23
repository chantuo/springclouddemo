package cn.siwen.cloud.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author gx
 * @create 2020-11-09 16:39
 */
@RestController
@Log4j2
public class Paymentcontroller {
    @Value("${server.port}")
    private String port;

    @GetMapping("/select")
    public  String select(){

        return "springcloud with zookeeper:"+port+"\t"+UUID.randomUUID().toString();
    }
}
