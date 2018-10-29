/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.punchproject.converter;

/**
 *
 * @author tho
 */
public interface GenericConverter<T,E> {
    
    public T convertTo(E from);
    
}
