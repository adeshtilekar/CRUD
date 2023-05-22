package com.crud.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Entity.user;
import com.crud.Services.Userservice;

@RestController
@RequestMapping("/crud")
@CrossOrigin("*")
public class userController {
    @Autowired
    private Userservice userservice;
    // create user

    @PostMapping("/create")
    public user createuser(@RequestBody user user) throws Exception {
        return this.userservice.createUser(user);
    }

    @GetMapping("get/{userId}")
    public user getuser(@PathVariable("userId") Long userId) {
        return this.userservice.getUser(userId);
    }

    @GetMapping("/getall")
    public ResponseEntity<?> getuser() {
        return ResponseEntity.ok(this.userservice.getUsers());
    }

    @PutMapping("/update")
    public user updateuser(@RequestBody user user) {
        // category.setCat_Status("0");
        return this.userservice.updateUser(user);
    }

    @DeleteMapping("delete/{userId}")
    public void deleteuser(@PathVariable("userId") Long userId) {
        this.userservice.deleteuser(userId);
        ;
    }
}
