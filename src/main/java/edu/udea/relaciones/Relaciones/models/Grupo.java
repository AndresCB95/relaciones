package edu.udea.relaciones.Relaciones.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="grupo")
public class Grupo {

    @Id
    private String codigoGrupo;
    @Column
    private String nombreGrupo;
    @Column
    private String descripcion;
    @JsonIgnore
    @OneToMany(mappedBy = "grupo")
    //@OneToMany
    //@JoinColumn(name = "grupo_id")
    private List<Estudiante> estudiantes;
    @ManyToMany
    private List<Materia> materias;

    public Grupo(String codigoGrupo, String nombreGrupo, String descripcion, List<Estudiante> estudiantes, List<Materia> materias) {
        this.codigoGrupo = codigoGrupo;
        this.nombreGrupo = nombreGrupo;
        this.descripcion = descripcion;
        this.estudiantes = estudiantes;
        this.materias = materias;
    }

    public Grupo() {
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}
