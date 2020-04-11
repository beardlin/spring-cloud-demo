package net.lantrack.module;

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
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    private static String user_prefix = "http://PROVIDER/";

    @RequestMapping("/getUser")
    private String getUser(){
        String user = this.restTemplate.getForObject(user_prefix+"user", String.class);
        return user;
    }

    @RequestMapping("/services")
    private Object services(){
        List<String> services = discoveryClient.getServices();
        List<Object> list = new ArrayList<>(services.size());
        for(String s:services){
            List<ServiceInstance> instances = discoveryClient.getInstances(s);
            list.addAll(instances);
        }
        return list;
    }


}
