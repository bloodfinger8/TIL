package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.annotation.TokenRequired;
import kr.re.kitri.hello.model.User;
import kr.re.kitri.hello.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private static Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public String registUser(@RequestBody User user){
        System.out.println("데이터 삽입 : " + user);
        userService.registUser(user);
        return "insert OK";
    }

    @GetMapping("/users")
    @TokenRequired //내가 만든 어노테이션
    public List<User> viewAllUsers(){
        List<User> userList = userService.getAllUsers();

        return userList;
    }

    @GetMapping("/users/{userId}")
    public User viewUserDetails(@PathVariable String userId){
        log.debug("조회가 잘되었답니다~" + userId);
        return userService.getUserDatail(userId);
    }


}
