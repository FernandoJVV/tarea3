/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.service;

import java.util.List;
import tarea3.domain.Pais;

/**
 *
 * @author Cris Picado
 */
public interface paisService {
    public List<Pais> getPais();
    
    public void save(Pais pais);//Si el id no esta creado lo crea, si esta creado hace el update
    
    public void delete(Pais pais);//Elimina el cliente
    
    public Pais getPais(Pais pais); //Obtiene objeto cliente del id que se le indique
    
}
