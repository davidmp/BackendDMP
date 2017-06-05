/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.api;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.model.Dientes;
import pe.edu.upeu.service.DientesServis;



/**
 *
 * @author Alumnos
 */
@RestController
@RequestMapping("/dientes")
public class DientesController {
    
@Autowired
public DientesServis service;

@Autowired
MessageSource messageSource;

@RequestMapping(value = "/all", method = RequestMethod.GET)
public List<Dientes> listarDientes(){
    return service.listarDientes();
}
    
}
