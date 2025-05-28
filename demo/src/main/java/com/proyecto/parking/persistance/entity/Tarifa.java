package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

// ================================
// ENTIDAD TARIFA
// ================================
@Entity
@Table(name = "tarifa")
public class Tarifa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tarifa_id")
    private Integer tarifaId;

    @Column(name = "tipo_vehiculo_id", nullable = false)
    private String tipoVehiculoId;

    @Column(name = "valor_hora", nullable = false)
    private Double valorHora;

    @Column(name = "valor_fraccion")
    private Double valorFraccion;

    @Column(name = "valor_dia")
    private Double valorDia;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_vehiculo_id", insertable = false, updatable = false)
    private TipoVehiculo tipoVehiculo;
}
