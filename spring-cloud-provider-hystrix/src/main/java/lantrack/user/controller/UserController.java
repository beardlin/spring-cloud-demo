package lantrack.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

/**
 *@Description
 *@Author dahuzi
 *@Date 2020/4/10  12:20
 */
@RestController
public class UserController {

    private static int total = 0;

    @GetMapping("/user")
    @HystrixCommand(fallbackMethod = "getUserName")
    private String info(HttpServletRequest request){
        if(total>=3){
            throw new RuntimeException("超过最大次数");
        }
        total++;
        return "tom :"+request.getServerPort();
    }

    private String getUserName(HttpServletRequest request){
        return "tom : hystrix : "+request.getServerPort();
    }


}


