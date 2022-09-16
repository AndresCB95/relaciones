package edu.udea.relaciones.Relaciones.repositorio;

import edu.udea.relaciones.Relaciones.models.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository <Estudiante, Integer>{
}
