/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author tho
 */
@Entity
public class WorkDay implements Serializable {

    @Id
    
    private long id;
    
    @OneToOne
    private Account account;
    
    @OneToMany
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
