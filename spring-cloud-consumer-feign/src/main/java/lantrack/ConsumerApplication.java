package lantrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *@Description 启动类
 *@Author dahuzi
 *@Date 2020/4/9  15:12
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }


}
