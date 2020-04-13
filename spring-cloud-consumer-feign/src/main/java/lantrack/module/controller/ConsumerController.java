package lantrack.module.controller;

import lantrack.module.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 *@Description
 *@Author dahuzi
 *@Date 2020/4/9  18:15
 */
@RestController
public class ConsumerController {



    @Autowired
    private FeignService feignService;


    @RequestMapping("/getUser")
    private String getUser(){
        return  feignService.getName();
    }


}
