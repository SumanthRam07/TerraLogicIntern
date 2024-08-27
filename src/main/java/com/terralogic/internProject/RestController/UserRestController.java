package com.terralogic.internProject.RestController;


import com.terralogic.internProject.Authentication.AuthenticationRequest;
import com.terralogic.internProject.UerService.UserService;
import com.terralogic.internProject.User.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserRestController {

  UserService userService ;


    public UserRestController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("internproject/adduser")
    public ResponseEntity<User> addUser(@RequestBody User user)
    {
        return userService.AddUser(user) ;
    }




   // Assuming user is logging in with username and password
   //Can be modified as per the login type
    @PostMapping("internproject/login")
    public ResponseEntity<String> login(@RequestBody AuthenticationRequest authenticationRequest)
    {
       return userService.Authenticate(authenticationRequest.getUsername() , authenticationRequest.getPassword()) ;

    }


    @GetMapping("internproject/getallusers")

     public ResponseEntity<List<User>> getAllUsers()
    {

       return userService.getAllUsers() ;

    }

    //Since specific update parameter is not specified , i have used a map to updated the query as per the incoming request.
    //can be customized as per the requirement
    @PutMapping("internproject/updateUSer/{id}")
     public ResponseEntity<String> updateUSer(@PathVariable int id , @RequestBody Map<String, Object>updates)
    {

        return  userService.updateUser(id , updates) ;





    }


    @DeleteMapping("internproject/deleteUSer/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id)
    {
      return  userService.deleteUSer(id) ;

    }









}
