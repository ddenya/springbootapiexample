package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user = new User(1, "Denys", 32, "ddenys@github.com");
        User user1 = new User(2, "Peter", 22, "peter@github.com");
        User user2 = new User(3, "Mike", 11, "mike@github.com");
        User user3 = new User(4, "Ada", 55, "ada@github.com");
        User user4 = new User(5, "Python", 21, "python@github.com");
        User user5 = new User(6, "Java", 42, "java@github.com");
        userList.addAll(Arrays.asList(user, user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user : userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
