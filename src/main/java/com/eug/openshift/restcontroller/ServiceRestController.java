package com.eug.openshift.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eug.openshift.model.Contatto;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Aldo", "Reggiani", "Aldore"));
		lista.add(new Contatto("Maria", "Polazzo", "Maripol"));
		lista.add(new Contatto("Anna", "Galli", "Annag"));
		return lista;
	}
}
