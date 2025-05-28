package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "parqueadero")
public class Parqueadero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parqueadero_id")
    private Integer parqueaderoId;

    @Column(name = "empresa_id", nullable = false)
    private Integer empresaId;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "latitud")
    private Double latitud;

    @Column(name = "ancho")
    private Integer ancho;

    @Column(name = "profundo")
    private Integer profundo;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "departamento")
    private String departamento;

    @Column(name = "capacidad_total")
    private Integer capacidadTotal;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private Empresa empresa;

    @OneToMany(mappedBy = "parqueadero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ZonaParqueo> zonasParqueo;

    @OneToMany(mappedBy = "parqueadero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Personal> personal;

    public Integer getParqueaderoId() {
        return parqueaderoId;
    }

    public void setParqueaderoId(Integer parqueaderoId) {
        this.parqueaderoId = parqueaderoId;
    }

    public Integer getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Integer empresaId) {
        this.empresaId = empresaId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getProfundo() {
        return profundo;
    }

    public void setProfundo(Integer profundo) {
        this.profundo = profundo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Integer getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(Integer capacidadTotal) {
        this.capacidadTotal = capacidadTotal;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<ZonaParqueo> getZonasParqueo() {
        return zonasParqueo;
    }

    public void setZonasParqueo(List<ZonaParqueo> zonasParqueo) {
        this.zonasParqueo = zonasParqueo;
    }

    public List<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Personal> personal) {
        this.personal = personal;
    }
}
