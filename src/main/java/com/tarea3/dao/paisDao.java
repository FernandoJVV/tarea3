/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea3.dao;

import org.springframework.data.repository.CrudRepository;
import com.tarea3.domain.Pais;

public interface paisDao extends CrudRepository<Pais, Long>{
    
}
