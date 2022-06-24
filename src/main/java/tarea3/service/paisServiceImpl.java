/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tarea3.dao.paisDao;
import tarea3.domain.Pais;

@Service
public class paisServiceImpl implements paisService {

    @Autowired
    private paisDao paisDao;

    @Override
    @Transactional
    public void save(Pais pais) {
        paisDao.save(pais);
    }

    @Override
    @Transactional
    public void delete(Pais pais) {
        paisDao.delete(pais);
    }

    @Override
    @Transactional(readOnly = true)
    public Pais getPais(Pais pais) {
        return paisDao.findById(pais.getIdestado()).orElse(null);
    }

    @Override
    public List<Pais> getPais() {
        return (List<Pais>) paisDao.findAll();

    }

}
