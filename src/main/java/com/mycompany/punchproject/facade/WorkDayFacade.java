/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.facade;

import com.mycompany.punchproject.bl.WorkDayBlService;
import com.mycompany.punchproject.entities.Account;
import com.mycompany.punchproject.entities.WorkDay;
import com.mycompany.punchproject.entities.WorkDayActivity;
import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */
@Component
public class WorkDayFacade {
    
    @Autowired
    private WorkDayBlService service;
    
    
     
    public List<WorkDay> getAllWorkDaysFor(Account acc){
       return service.getAllWorkDaysFor(acc);
        
    }
    
    public List<WorkDay> getAllWorkDaysForDate(LocalDate date){
        
        return service.getAllWorkDaysForDate(date);
    }
    
     public WorkDay getWorkDayForPersonAndAccount(Account acc,LocalDate date){
        
        return service.getWorkDayForPersonAndAccount(acc, date);
    }
    
     public void addNewActivityToWorkDay(WorkDayActivity activity,Account acc,LocalDate date){
         
         service.addNewActivityToWorkDay(activity, acc, date);
         
     }
    
    
    
    
}
