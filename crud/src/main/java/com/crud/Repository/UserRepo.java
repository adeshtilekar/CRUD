package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Entity.user;

public interface UserRepo extends JpaRepository<user, Long> {

}
