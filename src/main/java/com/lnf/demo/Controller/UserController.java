package com.lnf.demo.Controller;

import com.lnf.demo.Data.User;
import com.lnf.demo.Data.UserRepository;
import com.lnf.demo.Data.UserRole;
import com.lnf.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Array;
import java.util.Arrays;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/register")
    public String register(){
        return "/users/register";
    }

    @PostMapping("/login")
    public String Login(){
        System.out.println("login process");
        return "/index";
    }

    // Get All Notes
    @GetMapping("")
    public String getAllUsers(Model model) {
        model.addAttribute("users",userRepository.findAll());
        return "user/list";
    }

    /* // Get a Single Note
    @GetMapping("/list/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long id) {
        User user = userRepository.findOne(id );
        if(user == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(user);
    }*/

    // Create a new Note
  /*  @PostMapping("/create")
    public String createUser( User user) {
        userRepository.save(user);
        return "redirect:/user/login.html";
    }*/

    //Create a new User
   /* @PostMapping("/create")
    public String createUser(User user){
        UserRole role = new UserRole();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        role.setRoleName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
        return "redirect:/";
    }*/
}
