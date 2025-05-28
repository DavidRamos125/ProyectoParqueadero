package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

// ================================
// ENTIDAD PERSONAL
// ================================
@Entity
@Table(name = "personal")
public class Personal {

    @Id
    @Column(name = "persona_id")
    private Integer personaId;

    @Column(name = "empresa_id", nullable = false)
    private Integer empresaId;

    @Column(name = "parqueadero_id")
    private Integer parqueaderoId;

    @Column(name = "codigo_empleado")
    private String codigoEmpleado;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "es_admin", nullable = false)
    private Boolean esAdmin = false;

    // Relaciones
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private Empresa empresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parqueadero_id", insertable = false, updatable = false)
    private Parqueadero parqueadero;

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public Integer getParqueaderoId() {
        return parqueaderoId;
    }

    public void setParqueaderoId(Integer parqueaderoId) {
        this.parqueaderoId = parqueaderoId;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getEsAdmin() {
        return esAdmin;
    }

    public void setEsAdmin(Boolean esAdmin) {
        this.esAdmin = esAdmin;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Parqueadero getParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(Parqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }
}
