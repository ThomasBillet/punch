/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.converter;

import com.mycompany.punchproject.bo.AccountBo;
import com.mycompany.punchproject.entities.Account;

/**
 *
 * @author tho
 */
public class AccountBoConverter implements  GenericConverter<Account,AccountBo>{

    @Override
    public Account convertTo(AccountBo from) {
       Account acc =  new Account();
       acc.setFirstName(from.getFirstName());
       acc.setLastName(from.getLastName());
       acc.setId(from.getId());
       acc.setPassword(from.getPassword());
       
       return acc;

    }
    
}
