package net.lantrack.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *@Description
 *@Author dahuzi
 *@Date 2020/4/10  12:20
 */
@RestController
public class UserController {

    @GetMapping("/user")
    private String info(){
        System.out.println("9002");
        return "tom";
    }
}
