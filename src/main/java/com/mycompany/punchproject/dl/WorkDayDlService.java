/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.dl;

import com.mycompany.punchproject.entities.Account;
import com.mycompany.punchproject.entities.WorkDay;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */

@Repository
public interface WorkDayDlService extends JpaRepository<WorkDay,Long> {
    
    List<WorkDay> findByDate(LocalDate date);
    List<WorkDay> findByAccount(Account account);
    WorkDay findByDateAndAccount(LocalDate date,Account account);
}
