package edu.just.resource_management_system.service;

import edu.just.resource_management_system.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findUserById(Long id);
    User login(String userName,String password);
    void saveUser(User user);
    void modifyUserInfo(User user);
}
