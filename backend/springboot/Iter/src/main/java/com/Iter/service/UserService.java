package com.Iter.service;

import com.Iter.model.User;
import com.Iter.model.UserRole;

import java.util.List;
import java.util.Set;


public interface UserService {

    public User createUser(User user, Set<UserRole> userRoles) throws Exception;

    public User getUser(String username);

    public List<User> getAllUser();

    public User updateUser(User user,Long id);

    public void deleteUser(Long id);

}