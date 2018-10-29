/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.util.security;


import com.mycompany.punchproject.entities.Account;
import java.util.Collection;
import java.util.Collections;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 *
 * @author tho
 */
public class AccountDetails implements UserDetails {

    public AccountDetails(Account user) {
        this.user = user;
    }

    private Account user;
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
           return Collections.emptyList();

    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
          return "" + user.getId();
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
