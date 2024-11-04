package com.example.SpirngSecEx.contoller;

import com.example.SpirngSecEx.model.UserPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Collection;

@RestController
public class HomeController {

    @GetMapping("/")
    public String HomeController() {
        //return "hello world";
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        System.out.println("User authorities" + authorities);

        if (authorities.stream().anyMatch(authority -> authority.getAuthority().equals("ADMIN"))) {
            return "You are an admin";
        }else if (authorities.stream().anyMatch(authority -> authority.getAuthority().equals("SYSTEM"))) {
            return "You are system";
        }else
            return "Welcome";
    }
}


