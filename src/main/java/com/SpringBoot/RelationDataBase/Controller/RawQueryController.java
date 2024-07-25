package com.SpringBoot.RelationDataBase.Controller;

import com.SpringBoot.RelationDataBase.Model.User;
import com.SpringBoot.RelationDataBase.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/get/raw")
public class RawQueryController {

//get Condition method in User class
    @Autowired
    private UserService userService;
    @GetMapping("/users/{id}")
    public List<User> User(@PathVariable Set<Long> id){
        return userService.UserRawGetApi(id);
    }

}

