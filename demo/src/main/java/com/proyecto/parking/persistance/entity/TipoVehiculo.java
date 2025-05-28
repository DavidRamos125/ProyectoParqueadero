package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// ================================
// ENTIDAD TIPO VEHICULO
// ================================
@Entity
@Table(name = "tipo_vehiculo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {

    @Id
    @Column(name = "tipo_vehiculo_id")
    private String tipoVehiculoId;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    // Relaciones
    @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Vehiculo> vehiculos;

    @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Tarifa> tarifas;

    @OneToMany(mappedBy = "tipoVehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EspacioParqueo> espaciosParqueo;
}
