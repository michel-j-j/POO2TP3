package ar.unrn.eje1;

import java.util.Objects;

public class Alquiler {
	private Libro copia;
	private Integer diasAlquilados;

	public Alquiler(Libro copia, Integer diasAlquilados) {
		this.copia = Objects.requireNonNull(copia);
		this.diasAlquilados = Objects.requireNonNull(diasAlquilados);
	}

	public Double calcularMonto(Double monto) {
		return copia.calcularMonto(diasAlquilados, monto);
	}

	public Integer sumarPuntos(Integer puntosAlquilerFrecuente) {
		return copia.sumarPuntos(diasAlquilados, puntosAlquilerFrecuente);
	}
}
