package net.lantrack.user.controller;

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

    @GetMapping("/user")
    private String info(HttpServletRequest request){
        return "tom :"+request.getServerPort();
    }
}
