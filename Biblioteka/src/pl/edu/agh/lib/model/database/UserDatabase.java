package pl.edu.agh.lib.model.database;

import pl.edu.agh.lib.model.User;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Arek on 2017-01-15.
 */
public class UserDatabase {
    private List<User> userList;

    public UserDatabase() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }

}

