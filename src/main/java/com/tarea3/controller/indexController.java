/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tarea3.controller;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import com.tarea3.domain.Pais;
import com.tarea3.service.paisService;

/**
 *
 * @author Cris Picado
 */
@Controller
@Slf4j
public class indexController {

    @Autowired
    private paisService paisService;

    @GetMapping("/")
    public String inicio(Model model) {
        var paises = paisService.getPaises();
        model.addAttribute("paises", paises);
        return "index";
    }

    @GetMapping("/nuevoPais")
    public String nuevoPais(Pais pais) {
        return "modificarPais";
    }

    @PostMapping("/guardarPais")
    public String guardarPais(Pais pais) {
        paisService.save(pais);
        return "redirect:/";
    }

    @GetMapping("/modificarPais/{idEstado}")
    public String modificarPais(Pais pais, Model model) {
        pais = paisService.getPais(pais);
        model.addAttribute("Pais", pais);
        return "modificarPais";
    }

    @GetMapping("/eliminarPais/{idEstado}")
    public String eliminarPais(Pais pais) {
        paisService.delete(pais);
        return "redirect:/";
    }
}
