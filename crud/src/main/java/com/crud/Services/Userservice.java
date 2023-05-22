package com.crud.Services;

import java.util.Set;

import com.crud.Entity.user;

public interface Userservice {

    // creating user
    public user createUser(user user) throws Exception;

    // get all user
    public Set<user> getUsers();

    // get single user
    public user getUser(Long userId);

    // delete user by id
    public void deleteuser(Long userId);

    // update User
    public user updateUser(user user);
}