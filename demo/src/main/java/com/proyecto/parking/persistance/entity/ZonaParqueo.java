package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "zona_parqueo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ZonaParqueo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "parqueadero_id", nullable = false)
    private Integer parqueaderoId;

    @Column(name = "piso")
    private Integer piso;

    @Column(name = "seccion")
    private String seccion;

    @Column(name = "capacidad")
    private Integer capacidad;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parqueadero_id", insertable = false, updatable = false)
    private Parqueadero parqueadero;

    @OneToMany(mappedBy = "zonaParqueo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EspacioParqueo> espaciosParqueo;
}
