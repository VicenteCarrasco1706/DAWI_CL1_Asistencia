package pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.model.bd;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Entity
@Table(name = "especialidad")
public class Asistencia {
	@Column(name= "idEsp")
	private String idesp;
	@Column(name= "NomEsp")
	private String nomesp;
	
}
