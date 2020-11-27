package cn.siwen.cloud.Controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * @author gx
 * @create 2020-11-26 17:37
 */
@RestController
public class Config3355Controller {
    @Value("${config.info}")
    String configInfo;
    @GetMapping("/select")
    public  String select(){
        return configInfo;
    }
}
