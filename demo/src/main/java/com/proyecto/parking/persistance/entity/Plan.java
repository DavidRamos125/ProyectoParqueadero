package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

// ================================
// ENTIDAD PLAN
// ================================
@Entity
@Table(name = "plan")
public class Plan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plan_id")
    private Integer planId;

    @Column(name = "empresa_id", nullable = false)
    private Integer empresaId;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "tipo_plan")
    private String tipoPlan;

    @Column(name = "duracion_dias")
    private Integer duracionDias;

    @Column(name = "valor", nullable = false)
    private Double valor;

    @Column(name = "porcentaje_descuento")
    private Double porcentajeDescuento;

    @Column(name = "activo", nullable = false)
    private Boolean activo = true;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private Empresa empresa;

    @OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Usuario> usuarios;
}
