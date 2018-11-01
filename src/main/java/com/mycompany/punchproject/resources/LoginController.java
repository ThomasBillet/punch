/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.resources;


import ch.qos.logback.core.CoreConstants;
import com.mycompany.punchproject.bl.AccountBlService;
import com.mycompany.punchproject.bo.AccountBo;
import com.mycompany.punchproject.dl.AccountDlService;
import com.mycompany.punchproject.entities.Account;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tho
 */


@RestController
@RequestMapping("sign-up")
public class LoginController {
    
    @Autowired
    private AccountDlService accService;
 
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    
    
    @PostMapping(path ="/",consumes ="application/json")
    public void signUp(@RequestBody Account user) {    
        
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        accService.save(user);
        System.out.println(accService.getOne(user.getId()).toString());
        
    }
    
    
}
