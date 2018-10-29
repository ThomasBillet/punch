/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.resources;

import com.mycompany.punchproject.entities.Account;
import com.mycompany.punchproject.entities.WorkDay;
import com.mycompany.punchproject.facade.WorkDayFacade;
import java.time.LocalDate;
import java.util.List;
import javax.ws.rs.Consumes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author tho
 */
@RestController
@RequestMapping("workday")
public class WorkDayController {
    
    @Autowired
    private WorkDayFacade facade;
    
    
    @PostMapping(path = "/account",produces = "application/json",consumes ="application/json")
    public List<WorkDay> getWorkingDayForAccount(@RequestBody Account user) {    
      return facade.getAllWorkDaysFor(user);
       
    }
    
    @PostMapping(path = "/date",produces = "application/json",consumes ="application/json")
    public List<WorkDay> getAllWorkingDaysForDate(@RequestBody LocalDate date) {    
       return facade.getAllWorkDaysForDate(date);
       
    }
    
    @PostMapping(path = "/account/Date",produces = "application/json",consumes ="application/json")
    public WorkDay getAllWorkingDaysForDate(@RequestBody LocalDate date, @RequestBody Account acc) {    
       return facade.getWorkDayForPersonAndAccount(acc, date);
       
    }
    
    
    
}
