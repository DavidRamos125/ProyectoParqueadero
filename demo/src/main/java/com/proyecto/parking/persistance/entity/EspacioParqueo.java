package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "espacio_parqueo")
public class EspacioParqueo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "espacio_parqueo_id")
    private Integer espacioParqueoId;

    @Column(name = "zona_id", nullable = false)
    private Integer zonaId;

    @Column(name = "codigo", nullable = false)
    private String codigo;

    @Column(name = "tipo_vehiculo_id")
    private String tipoVehiculoId;

    @Column(name = "estado")
    private String estado;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    @Column(name = "ancho")
    private Integer ancho;

    @Column(name = "profundo")
    private Integer profundo;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "zona_id", insertable = false, updatable = false)
    private ZonaParqueo zonaParqueo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_vehiculo_id", insertable = false, updatable = false)
    private TipoVehiculo tipoVehiculo;

    @OneToMany(mappedBy = "espacioParqueo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Registro> registros;

    public Integer getEspacioParqueoId() {
        return espacioParqueoId;
    }

    public void setEspacioParqueoId(Integer espacioParqueoId) {
        this.espacioParqueoId = espacioParqueoId;
    }

    public Integer getZonaId() {
        return zonaId;
    }

    public void setZonaId(Integer zonaId) {
        this.zonaId = zonaId;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipoVehiculoId() {
        return tipoVehiculoId;
    }

    public void setTipoVehiculoId(String tipoVehiculoId) {
        this.tipoVehiculoId = tipoVehiculoId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
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

    public ZonaParqueo getZonaParqueo() {
        return zonaParqueo;
    }

    public void setZonaParqueo(ZonaParqueo zonaParqueo) {
        this.zonaParqueo = zonaParqueo;
    }

    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }
}
