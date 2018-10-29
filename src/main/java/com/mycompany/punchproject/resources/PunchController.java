/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.resources;

import com.mycompany.punchproject.bl.TimePunchBlService;
import com.mycompany.punchproject.bo.AccountBo;
import com.mycompany.punchproject.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tho
 */

@RequestMapping("punch")
@RestController
public class PunchController {
    
    @Autowired
    private TimePunchBlService service;
    
    @PostMapping("/")
    public void punch(@RequestBody Account user) {    
       service.punch(user);
       
    }
    
    
}
