package pe.edu.upeu.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import java.util.Locale;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.upeu.model.Dientes;
import pe.edu.upeu.service.DientesServis;

/**
 *
 * @author David
 */
@Controller
@RequestMapping("/")
public class DienteCController {
    

	@Autowired
	DientesServis service;
	
	@Autowired
	MessageSource messageSource;    
    
	@RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<Dientes> entidad = service.listarEntidad();
		model.addAttribute("entidad", entidad);
		return "index";
	}


	@RequestMapping(value = { "/new" }, method = RequestMethod.GET)
	public String newEmployee(ModelMap model) {
		Dientes entidad = new Dientes();
		model.addAttribute("diente", entidad);
		model.addAttribute("edit", false);
		return "registration";
	}

        /*
	@RequestMapping(value = { "/new" }, method = RequestMethod.POST)
	public String saveEmployee(@Valid Dientes entidad, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "registration";
		}
		if(!service.isEmployeeSsnUnique(entidad.getId(), entidad.getSsn())){
			FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{entidad.getSsn()}, Locale.getDefault()));
		    result.addError(ssnError);
			return "registration";
		}
		
		service.guardarEntidad(entidad);

		model.addAttribute("success", "Employee " + entidad.getName() + " registered successfully");
		return "success";
	}


	
	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.GET)
	public String editEmployee(@PathVariable String ssn, ModelMap model) {
		Dientes employee = service.findEmployeeBySsn(ssn);
		model.addAttribute("employee", employee);
		model.addAttribute("edit", true);
		return "registration";
	}
	

	@RequestMapping(value = { "/edit-{ssn}-employee" }, method = RequestMethod.POST)
	public String updateEmployee(@Valid Dientes entidad, BindingResult result,
			ModelMap model, @PathVariable String ssn) {

		if (result.hasErrors()) {
			return "registration";
		}

		if(!service.isEmployeeSsnUnique(entidad.getId(), entidad.getSsn())){
			FieldError ssnError =new FieldError("employee","ssn",messageSource.getMessage("non.unique.ssn", new String[]{entidad.getSsn()}, Locale.getDefault()));
		    result.addError(ssnError);
			return "registration";
		}

		service.modificarEntidadId(entidad);

		model.addAttribute("success", "Employee " + entidad.getName()	+ " updated successfully");
		return "success";
	}
    */
	
	/*
	 * This method will delete an employee by it's SSN value.
	 */
	@RequestMapping(value = { "/delete-{ssn}-employee" }, method = RequestMethod.GET)
	public String deleteEmployee(@PathVariable int id) {
		service.eliminarEntidadId(id);
		return "redirect:/list";
	}
    
}
