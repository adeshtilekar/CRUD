package com.crud.servicesimpl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.Entity.user;
import com.crud.Repository.UserRepo;
import com.crud.Services.Userservice;

@Service
public class Userservicesimpl implements Userservice {

    @Autowired
    private UserRepo userRepo;

    @Override
    public user createUser(user user) throws Exception {
        return this.userRepo.save(user);
    }

    @Override
    public void deleteuser(Long userId) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteuser'");
    }

    @Override
    public user updateUser(user user) {
        return this.userRepo.save(user);

    }

    @Override
    public Set<user> getUsers() {
        return new LinkedHashSet<>(this.userRepo.findAll());
    }

    @Override
    public user getUser(Long userId) {
        // TODO Auto-generated method stub
        return this.userRepo.findById(userId).get();
    }
}
