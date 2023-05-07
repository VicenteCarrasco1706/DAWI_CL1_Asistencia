package pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.model.bd.Asistencia;
import pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.repository.AsistenciaRepository;



@Service
public class AsistenciaService {
	@Autowired
	private AsistenciaRepository asistenciaRepository;
	
	//Listar
	public List<Asistencia> listarAsistencia(){
		return asistenciaRepository.findAll();
	}

	
}
