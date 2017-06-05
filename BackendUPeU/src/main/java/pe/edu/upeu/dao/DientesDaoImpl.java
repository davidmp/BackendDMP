/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.configuration.SysDataAccess;
import pe.edu.upeu.model.Dientes;

/**
 *
 * @author Alumnos
 */
@Repository("dientesDao")
public class DientesDaoImpl extends SysDataAccess<Integer, Dientes> implements DientesDao{
    
    @SuppressWarnings("unchecked")
    public List<Dientes> listarDientes(){
        return getListAll();
    }
    
}
