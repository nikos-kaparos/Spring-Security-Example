package com.example.SpirngSecEx.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UserPrincipal implements UserDetails {

    private Users user;

    public UserPrincipal(Users user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        if (user.getRole().equals("admin")) {
            return Collections.singletonList(new SimpleGrantedAuthority("ADMIN"));
        } else if (user.getRole().equals("system")) {
            return Collections.singletonList(new SimpleGrantedAuthority("SYSTEM"));
        }else
            return Collections.singletonList(new SimpleGrantedAuthority("USERS"));

//        String role;
//
//        if (user.getUsername().equals("nikos")){
//            role = "ADMIN";
//            System.out.println("role equal\n" + role);
//            return Collections.singleton(new SimpleGrantedAuthority (role));
//        }else if (user.getUsername().equals("kaparos")){
//            role = "SYSTEM";
//            System.out.println("role equal\n" + role);
//            return Collections.singleton(new SimpleGrantedAuthority (role));
//        }else
//            role = "USER";
//            System.out.println("role equal\n" + role);
//            return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
