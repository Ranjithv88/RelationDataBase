package com.SpringBoot.RelationDataBase.Service;

import com.SpringBoot.RelationDataBase.Model.Role;
import com.SpringBoot.RelationDataBase.Model.User;
import com.SpringBoot.RelationDataBase.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> UserGetApi() {
        return userRepository.findAll();

    }

    public String UserPostApi(User user) {
        user.setCreatedOn(LocalDate.now());
        user.setStatus("true");
        user.setRole(Role.USER);
        userRepository.save(user);
        return " Users Record Saved ! ";
    }

    public String UserPutApi(User user) {
        userRepository.save(user);
        user.setStatus("true");
        user.setRole(Role.USER);
        userRepository.save(user);
        return " Users Record Update ! ";
    }

    public String UserDeleteApi(long userId) {
        userRepository.deleteById(userId);
        return " Delete Record Successfully !";
    }

    public String UserDeleteListApi(List<Long> userId) {
        for(Long user:userId) {
            userRepository.deleteById(user);
        }
        return " List of ID Deleted Successfully !";
    }

    public List<User> UserRawGetApi(Set<Long> id) {
        List<User> rawUser = userRepository.GetId(id);
        return rawUser;
    }

}

