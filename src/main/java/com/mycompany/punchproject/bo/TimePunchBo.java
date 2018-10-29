/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.bo;

import com.mycompany.punchproject.entities.Account;
import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author tho
 */
public class TimePunchBo {
    
    private long id;
    
    private Account account;
    
    private LocalDateTime time;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    
}
