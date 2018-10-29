/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.bl;

import com.mycompany.punchproject.dl.TimePunchDlService;
import com.mycompany.punchproject.dl.WorkDayDlService;
import com.mycompany.punchproject.entities.Account;
import com.mycompany.punchproject.entities.TimePunch;
import com.mycompany.punchproject.entities.WorkDay;
import com.mycompany.punchproject.entities.WorkDayActivity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */

@Component
public class TimePunchBlService {
    
   
    
    @Autowired
    private WorkDayDlService wdservice;
    
    
    public void punch(Account acc){
        
      this.updateWorkDay(acc);
    }
    
    
    private void updateWorkDay(Account acc){
        
        
        // Zoek Vandaag op als werkdag als en beindig deze 
        // Als deze niet bestaat create en save deze
       WorkDay day =  wdservice.findByDateAndAccount(LocalDate.now(), acc);
       if(day != null){
           day.setStop(LocalDateTime.now());
           
       }
       else{
           day = new WorkDay();
           day.setAccount(acc);
           day.setStart(LocalDateTime.now());
           day.setActivities(new ArrayList<WorkDayActivity>());
           
           wdservice.save(day);
           
       }
        
        
    }
    
    
    
    
    
    
}
