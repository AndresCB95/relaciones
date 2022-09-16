package edu.udea.relaciones.Relaciones.controlador;

import edu.udea.relaciones.Relaciones.models.Estudiante;
import edu.udea.relaciones.Relaciones.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;
    @GetMapping("/estudiantes")
    public ResponseEntity<List<Estudiante>>getEstudiantes(){
        return new ResponseEntity<>(estudianteService.getEstudiante(), HttpStatus.OK);
    }

    @PostMapping("/estudiante")
    public ResponseEntity<Estudiante> setEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>(estudianteService.save(estudiante),HttpStatus.OK);
    }
    
}
