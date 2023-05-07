package pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.appbasededatos.DAWI_CL1_Asistencia.model.bd.Asistencia;


@Repository
public interface AsistenciaRepository extends JpaRepository<Asistencia, Integer> {

}
