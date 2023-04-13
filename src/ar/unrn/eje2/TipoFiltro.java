package ar.unrn.eje2;

import java.util.Objects;

public enum TipoFiltro {

	COMPANIA("company_name", 1), CIUDAD("city", 4), ESTADO("state", 5), ENTORNO("round", 9);

	public String nombre;
	public Integer valor;

	TipoFiltro(String nombre, Integer valor) {
		this.nombre = Objects.requireNonNull(nombre);
		this.valor = Objects.requireNonNull(valor);
	}

	Integer obtenerValor() {
		return this.valor;
	}

	String obtenerNombre() {
		return this.nombre;
	}
}
