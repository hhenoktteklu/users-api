package com.springboot.project01.repository;

import com.springboot.project01.model.Address;
import com.springboot.project01.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class UserRepository {

    private static List<User> users = new ArrayList<User>(Arrays.asList(
            new User("Henok", "Teklu", "01/01/2000", new Address("0101 Old Riverroad", "", "VA", "Arlington", "20020")),
            new User("Sam", "John", "02/02/2010", new Address("5712 Richerd ct", "", "TX", "Frisco", "84841")),
            new User("Jessica", "Dorl", "05/21/1980", new Address("7477 first avenue", "", "FL", "South Miami", "00854")),
            new User("Daniel", "Yolande", "11/15/1974", new Address("6458 Richardson", "", "CA", "Orange", "84845")),
            new User("Samson", "Aldo", "08/26/1985", new Address("1564 Silverston", "", "IL", "South Chicago", "11280"))
    ));
    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public User addUser(User user) {
        users.add(user);
        return user;
    }

    public void removeUser(long id) {
        for (User user : users) {
            if (user.getId() == id) {
                users.remove(user);
            }
        }
    }
}
