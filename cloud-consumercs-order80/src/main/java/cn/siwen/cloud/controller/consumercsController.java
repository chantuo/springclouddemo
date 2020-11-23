package cn.siwen.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

/**
 * @author gx
 * @create 2020-11-11 16:46
 */
@RestController
public class consumercsController {
    private final static String PAYMENT_URL = "http://payment8004";
    @Resource
    RestTemplate restTemplate;
    @GetMapping("/insert")
    public String select() {
        String result = restTemplate.getForObject(PAYMENT_URL+"/select",String.class);
        return result;
    }
}