/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.bl;

import com.mycompany.punchproject.dl.AccountDlService;
import com.mycompany.punchproject.entities.Account;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */

@Component
public class AccountBlService {
    
    @Autowired
    private AccountDlService service;
    
    
    public List<Account> getAllPersons(){
        
        return service.findAll();
    }
    
    
    
    
}
