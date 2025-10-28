package com.demo.first.app;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    private Map<Integer, User> userDb = new HashMap<>();

    public User createUser(User user) {
        System.out.println(user.getEmail());
        userDb.putIfAbsent(user.getId(), user);
        return user;
    }

    public User updateUser(User user) {
        if (!userDb.containsKey(user.getId()))
            throw new IllegalArgumentException("User with ID " + user.getId() + " does not exist");
        userDb.put(user.getId(), user);
        return user;
    }

    public boolean deleteUser(int id) {
        if (!userDb.containsKey(id))
            return false;
        userDb.remove(id);
        return true;
    }

    public List<User> getAllUsers() {
        if (userDb.isEmpty())
            throw new NullPointerException("No users found in the database");
        return new ArrayList<>(userDb.values());
    }

    public User getUserById(int id) {
        return userDb.get(id);
    }

    public List<User> searchUsers(String name, String email) {
        return userDb.values().stream()
                .filter(u -> u.getName().equalsIgnoreCase(name))
                .filter(u -> u.getEmail().equalsIgnoreCase(email))
                .toList();
    }
}
