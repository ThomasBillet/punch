/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.dl;

import com.mycompany.punchproject.entities.Account;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author tho
 */

@Repository
 @Transactional
public interface AccountDlService extends JpaRepository<Account,Long> {
    
    @Query("Select c from Account c WHERE c.lastName like ?1")
    List<Account> findByLastName(String lastname);
    
    
    
}
    