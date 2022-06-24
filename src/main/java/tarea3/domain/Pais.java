/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="practica")
public class Pais implements Serializable{
   
    private static final long serialversionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idestado;
    
    String nombre;
    String capital;
    Integer poblacion;
    String costas;
    
    public Pais(){
        
    }

    public Pais(long idestado, String nombre, String capital, Integer poblacion, String costas) {
        this.idestado = idestado;
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.costas = costas;
    }
    
    
}
