package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

// ================================
// ENTIDAD USUARIO
// ================================
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "persona_id")
    private Integer personaId;

    @Column(name = "plan_id")
    private Integer planId;

    @Column(name = "fecha_registro_plan")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date fechaRegistroPlan;

    // Relaciones
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id", insertable = false, updatable = false)
    private Plan plan;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vehiculo> vehiculos;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Factura> facturas;
}
