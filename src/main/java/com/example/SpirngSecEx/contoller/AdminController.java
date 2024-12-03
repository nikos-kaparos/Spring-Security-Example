package com.example.SpirngSecEx.contoller;

import com.example.SpirngSecEx.model.Users;
import com.example.SpirngSecEx.repository.UserRepo;
import com.example.SpirngSecEx.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
//    private UserRepo userRepo;

    private MyUserDetailsService myUserDetailsService;

    public AdminController(MyUserDetailsService myUserDetailsService) {
        this.myUserDetailsService = myUserDetailsService;
    }


    @GetMapping("/users")
    public String showUsers(Model model) {
        List<Users> users = myUserDetailsService.getAllUsers();
        model.addAttribute("users", users);
        return "usersPage";
    }

    @PostMapping("users/{id}/enable")
    public String enableUser(@PathVariable int id, boolean enabled, Model model) {
        Optional<Users> optionalUser = Optional.ofNullable(myUserDetailsService.findUser(id));
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            user.setEnabled(enabled);
            myUserDetailsService.saveUser(user);
            model.addAttribute("success", "User status updated successfully.");
        } else {
            model.addAttribute("error", "User not found.");
        }
        return "usersPage"; // Επιστρέφει το template "usersPage.html"
    }



//    @PostMapping("users/{id}/enable")
//    public String enableUser(@PathVariable int id, boolean enabled, Model model) {
//        Optional<Users> optionalUser = userRepo.findById(id);
//        if (optionalUser.isPresent()) {
//            //Des pos tha kaleseis to services kai oxi to repo
//            Users user = optionalUser.get();
//            user.setEnabled(enabled);
//            userRepo.save(user);
//            model.addAttribute("success", "User status updated successfully.");
//        } else {
//            model.addAttribute("error", "User not found.");
//        }
//        return "usersPage"; // Επιστρέφει το template "usersPage.html"
//    }
}
