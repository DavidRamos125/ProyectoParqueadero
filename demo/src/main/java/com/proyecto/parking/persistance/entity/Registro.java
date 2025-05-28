package com.proyecto.parking.persistance.entity;

import jakarta.persistence.*;

import java.util.List;

// ================================
// ENTIDAD REGISTRO
// ================================
@Entity
@Table(name = "registro")
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registro_id")
    private Integer registroId;

    @Column(name = "espacio_parqueo_id", nullable = false)
    private Integer espacioParqueoId;

    @Column(name = "vehiculo_id", nullable = false)
    private Integer vehiculoId;

    @Column(name = "usuario_id")
    private Integer usuarioId;

    @Column(name = "hora_entrada", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date horaEntrada;

    @Column(name = "hora_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date horaSalida;

    @Column(name = "valor_cobrado")
    private Double valorCobrado;

    @Column(name = "pagado", nullable = false)
    private Boolean pagado = false;

    @Column(name = "tipo_cobro")
    private String tipoCobro;

    @Column(name = "empresa_id", nullable = false)
    private Integer empresaId;

    // Relaciones
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "espacio_parqueo_id", insertable = false, updatable = false)
    private EspacioParqueo espacioParqueo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehiculo_id", insertable = false, updatable = false)
    private Vehiculo vehiculo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "empresa_id", insertable = false, updatable = false)
    private Empresa empresa;

    @OneToMany(mappedBy = "registro", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Factura> facturas;
}
