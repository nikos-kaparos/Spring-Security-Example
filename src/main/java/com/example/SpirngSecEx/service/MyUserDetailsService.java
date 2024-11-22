package com.example.SpirngSecEx.service;

import com.example.SpirngSecEx.model.UserPrincipal;
import com.example.SpirngSecEx.model.Users;
import com.example.SpirngSecEx.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = repo.findByUsername(username);
        if (user == null) {
            System.out.println("Den brika user");
            throw new UsernameNotFoundException("Den brika user");
        }
        return new UserPrincipal(user);
    }

    public Users saveUser(Users user) {
        System.out.println("user: " + user.getUsername() + " saved");
        return repo.save(user);
    }

}
