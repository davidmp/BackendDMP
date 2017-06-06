/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.service;

import java.util.List;
import pe.edu.upeu.model.Dientes;

/**
 *
 * @author Alumnos
 */
public interface DientesServis {
    public List<Dientes> listarEntidad();    
    public Dientes guardarEntidad(Dientes entidad);
    public void modificarEntidad(Dientes entidad);
    public void eliminarEntidad(Integer id);
    public Dientes buscarEntidadId(int id);    
}
