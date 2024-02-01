package com.example.springonetoonemapping.springonetoonemapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public void saveUsers(@RequestBody User userDetails){

        User user = userRepository.save(userDetails);
        System.out.println("User Details has been saved.");

    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String testApi(){
        return "This is test API from spring boot.";
    }
}
