package pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.service.AsistenciaService;


@Controller
@RequestMapping("/Asistencia")
public class AsistenciaController {
	@Autowired
	private AsistenciaService asistenciaService;
	
	@GetMapping("/frmMantAsistencia")
	public String frmMantAsistencia(Model model){
		model.addAttribute("listaAsistencia",asistenciaService.listarAsistencia());
		return "Asistencia/frmMantAsistencia";
	}
}
