/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.util.security;

import com.mycompany.punchproject.bl.AccountBlService;
import com.mycompany.punchproject.dl.AccountDlService;
import com.mycompany.punchproject.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author tho
 */


public class AccountDetailService implements UserDetailsService {

    
    @Autowired
    private AccountDlService accountDlService;
    
    
    public AccountDetailService() {
       
    }
    
    
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
       
        
      AccountDetails accd = new AccountDetails(accountDlService.getOne(Long.parseLong(string)));
      return accd;
        
    }
    
}
