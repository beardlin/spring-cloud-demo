package lantrack.module.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *@Description  通过Feign实现接口调用
 *@Author dahuzi
 *@Date 2020/4/13  17:10
 */
@FeignClient("PROVIDER")
public interface FeignService {

    @RequestMapping("user")
    String getName();

}
