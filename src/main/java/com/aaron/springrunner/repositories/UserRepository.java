package com.aaron.springrunner.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.aaron.springrunner.models.User;

@Repository
public class UserRepository {
    private static List<User> userList = new ArrayList<User>() {
        {
            add(new User(1L, "ken888686", "Aaron0", "ken888686@gmail.com", "password"));
            add(new User(2L, "ken123999", "Aaron1", "ken123999@gmail.com", "password"));
            add(new User(3L, "ken234999", "Aaron2", "ken234999@gmail.com", "password"));
            add(new User(4L, "ken345999", "Aaron3", "ken345999@gmail.com", "password"));
            add(new User(5L, "ken456999", "Aaron4", "ken456999@gmail.com", "password"));
            add(new User(6L, "ken567999", "Aaron5", "ken567999@gmail.com", "password"));
            add(new User(7L, "ken678999", "Aaron6", "ken678999@gmail.com", "password"));
        }
    };
    private static long id = userList.size();

    public User getReferenceById(long id) {
        var user = userList.stream().filter(u -> u.getId() == id).findFirst();
        return user.orElse(null);
    }

    public List<User> findAll() {
        return userList;
    }

    public User save(User data) {
        data.setId(++id);
        userList.add(data);
        return userList.stream().filter(u -> u.getUsername().equalsIgnoreCase(data.getUsername())).findFirst().get();
    }
}
