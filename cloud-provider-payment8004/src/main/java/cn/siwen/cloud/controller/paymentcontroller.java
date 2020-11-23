package cn.siwen.cloud.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author gx
 * @create 2020-11-11 16:38
 */
@RestController
@Log4j2
public class paymentcontroller {
    @Value("${server.port}")
    String port;
    @GetMapping("/select")
    public String select(){
        return "port:"+port+"随机数:"+UUID.randomUUID().toString();
    }
}
