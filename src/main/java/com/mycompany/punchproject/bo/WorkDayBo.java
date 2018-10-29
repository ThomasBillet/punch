/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.bo;

import com.mycompany.punchproject.entities.Account;
import com.mycompany.punchproject.entities.WorkDayActivity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author tho
 */
public class WorkDayBo {
 
    private long id;
    
    private Account account;
    
    private List<WorkDayActivity> activities;
    
    private LocalDate date;
    
    private LocalDateTime start,Stop;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    
    
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<WorkDayActivity> getActivities() {
        return activities;
    }

    public void setActivities(List<WorkDayActivity> activities) {
        this.activities = activities;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getStop() {
        return Stop;
    }

    public void setStop(LocalDateTime Stop) {
        this.Stop = Stop;
    }
}
