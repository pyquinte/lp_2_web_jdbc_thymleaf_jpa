package com.cibertec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cibertec.model.Subject;
import com.cibertec.repository.ISubjectRepository;
import com.cibertec.repository.IUserRepository;

@Controller
public class ProyectoController {
	@Autowired
	private ISubjectRepository repos;
	
	@Autowired
	private IUserRepository reposuser;
	
	
	@GetMapping("/registrar")
	public String registrerSubject(@RequestParam(name="name",required=false, defaultValue="Subject") String name, Model model) {
		Subject subj=new Subject();
		subj.setIdSubject(4);
		subj.setCode("COD004");
		subj.setName("Base de Datos I");
		subj.setLevel("Basico");
		subj.setTeacher("Luis Ponce");
		
		subj=repos.save(subj);
		
		model.addAttribute("name",subj);
				
		return "registro";
	}
	@GetMapping("/listar")
	public String listSubject(Model model) {
		model.addAttribute("lstSubject",repos.findAll());
		return "listado";
	}
	@GetMapping("/listarusers")
	public String listUser(Model model) {
		model.addAttribute("lstUser",reposuser.findAll());
		return "listadouser";
	}

}
