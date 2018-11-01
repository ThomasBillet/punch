/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.security;

import com.mycompany.punchproject.bl.AccountBlService;
import com.mycompany.punchproject.dl.AccountDlService;
import com.mycompany.punchproject.entities.Account;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author tho
 */

@Service
public class AccountDetailService implements UserDetailsService {

    
   @Autowired
  
   private AccountDlService accService;
 
    
    
    public AccountDetailService() {
       
    }
    
    
    
    @Override
    public UserDetails loadUserByUsername(String string) throws UsernameNotFoundException {
       
      System.out.println(accService);
      Account acc = accService.findById(Long.parseLong(string)).get();
      if( acc != null){
      AccountDetails accd = new AccountDetails(acc);
      
      return accd;
      }
      return null;
    }
    
}
