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
import org.springframework.stereotype.Service;

/**
 *
 * @author tho
 */

@Service
public class AccountBlService {
    
    @Autowired
    private AccountDlService service;
    
    
    public List<Account> getAllPersons(){
        
        return service.findAll();
    }

    public AccountBlService() {
    }

    public AccountBlService(AccountDlService service) {
        this.service = service;
    }
    
    
    
    public List<Account> getPersonByName(String name){
        
        return service.findByLastName(name);
    }
    
    public Account getAccountById(long id){
        
        return service.getOne(id);
    }
    
    
}
