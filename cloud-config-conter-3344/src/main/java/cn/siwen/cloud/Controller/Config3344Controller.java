package cn.siwen.cloud.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author gx
 * @create 2020-11-26 17:28
 */
@RestController
public class Config3344Controller {
    @Value("${server.port}")
    String port;
    @GetMapping("/select")
    public  String select(){
        return port;
    }

}
