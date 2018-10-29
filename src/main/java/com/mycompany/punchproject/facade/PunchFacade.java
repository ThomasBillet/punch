/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.facade;

import com.mycompany.punchproject.bl.TimePunchBlService;
import com.mycompany.punchproject.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */
@Component
public class PunchFacade {
    
    @Autowired
    private TimePunchBlService service;
    
    public void Punch(Account account){
        
       service.punch(account);
        
    }
    
    
}
