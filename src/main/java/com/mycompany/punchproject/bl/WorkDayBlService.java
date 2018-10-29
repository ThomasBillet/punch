/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.bl;

import com.mycompany.punchproject.dl.WorkDayDlService;
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
public class WorkDayBlService {
    
    @Autowired
    private WorkDayDlService wdService;
    
    
    public List<WorkDay> getAllWorkDaysFor(Account acc){
       return wdService.findByAccount(acc);
        
    }
    
    public List<WorkDay> getAllWorkDaysForDate(LocalDate date){
        
        return wdService.findByDate(date);
    }
    
     public WorkDay getWorkDayForPersonAndAccount(Account acc,LocalDate date){
        
        return wdService.findByDateAndAccount(date, acc);
    }
    
     public void addNewActivityToWorkDay(WorkDayActivity activity,Account acc,LocalDate date){
         WorkDay day = wdService.findByDateAndAccount(date, acc);
         day.getActivities().add(activity);
         wdService.save(day);
         
     }
    
    
    
    
}
