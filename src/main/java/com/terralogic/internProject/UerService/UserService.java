package com.terralogic.internProject.UerService;


import com.terralogic.internProject.Authentication.AuthenticationRequest;
import com.terralogic.internProject.Exception.UserNotFoundException;
import com.terralogic.internProject.Repository.UserRepository;
import com.terralogic.internProject.SecuritySetup.JwtGenerator;
import com.terralogic.internProject.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class UserService {


    @Autowired
    UserRepository userRepository ;


    @Autowired
    JwtGenerator jwtGenerator ;


    public ResponseEntity<List<User>> getAllUsers()
    {


     return   ResponseEntity.ok(this.userRepository.findAll() ) ;

    }


    public ResponseEntity<String> updateUser(int id  , Map<String, Object> updates)

    {
        User user = userRepository.findById(id).orElse(null);

        if( user == null) {
            throw new UserNotFoundException(" User not found , please sign up before updating");

        }


        updates.forEach((key, value) -> {
            switch (key) {
                case "username":
                    user.setUsername((String) value);
                    break;
                case "firstname":
                    user.setFirstname((String) value);
                    break;
                case "email":
                    user.setEmail((String) value);
                    break;

            }
        });

        userRepository.save(user) ;


     return   ResponseEntity.ok("User details have been updated") ;


    }



    public ResponseEntity<User>   AddUser(User user)
    {
    this.userRepository.save(user) ;

    return ResponseEntity.status(HttpStatus.ACCEPTED).build() ;

    }


    public ResponseEntity<String> Authenticate( String username , String password)
    {
      User user =   this.userRepository.findByUsername(username) ;

      if( user == null)
      {
          throw new UserNotFoundException("User cannot be found, please sing up ");
      }
      else
      {

          Authentication authentication = new UsernamePasswordAuthenticationToken(username, password);

          String jwt = jwtGenerator.CreateString(authentication) ;

          return ResponseEntity.ok(jwt) ;

      }





    }


    public ResponseEntity<String> deleteUSer(int id) {

        userRepository.deleteById(id);

      return  ResponseEntity.ok("User is successfullly deleted") ;
    }
}













