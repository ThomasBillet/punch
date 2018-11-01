/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.dl;

import com.mycompany.punchproject.entities.Account;
import com.mycompany.punchproject.entities.TimePunch;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */

@Repository
public interface TimePunchDlService extends JpaRepository<TimePunch,Long> {
    
    
    List<TimePunch> findByAccount(Account account);
    
}
