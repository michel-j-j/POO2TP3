package ar.unrn.eje1;

import java.util.Objects;

public abstract class Libro {
	private String nombre;
	private Integer codigoPrecio;

	protected static final Integer PUNTO = 1;

	public Libro(String nombre, Integer codigoPrecio) {
		this.nombre = Objects.requireNonNull(nombre);
		this.codigoPrecio = Objects.requireNonNull(codigoPrecio);
	}

	public Integer codigoPrecio() {
		return codigoPrecio;
	}

	public abstract Double calcularMonto(Integer diasAlquilados, Double monto);

	public Integer sumarPuntos(Integer diasAlquilados, Integer puntosAlquilerFrecuente) {
		return PUNTO + puntosAlquilerFrecuente;
	}
}