/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.facade;

import com.mycompany.punchproject.bl.AccountBlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */

@Component
public class AccountFacade {
    
    @Autowired
    private AccountBlService accservice;
    
    
    
    
}
