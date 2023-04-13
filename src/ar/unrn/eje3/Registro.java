package ar.unrn.eje3;

import java.util.Objects;

public class Registro {
	private String nombre;
	private Integer monto;
	private String marca;

	Registro(String nombre, Integer monto, String marca) {
		this.nombre = Objects.requireNonNull(nombre);
		this.monto = Objects.requireNonNull(monto);
		this.marca = Objects.requireNonNull(marca);
	}

	public String obtenerNombre() {
		return nombre;
	}

	public Integer obtenerMonto() {
		return monto;
	}

	public String obtenerMarca() {
		return marca;
	}
}
