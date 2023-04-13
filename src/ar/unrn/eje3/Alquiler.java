package ar.unrn.eje3;

import java.util.Objects;

public class Alquiler implements Gasto {

	private Integer monto;
	private String nombre;

	public Alquiler(Integer monto, String nombre) {
		this.monto = Objects.requireNonNull(monto);
		this.nombre = Objects.requireNonNull(nombre);
	}

	@Override
	public String marcarGasto() {
		return "";
	}

	@Override
	public Integer calcularGasto(Integer gastoTotalDeComida) {
		// TODO Auto-generated method stub
		return gastoTotalDeComida;
	}

	@Override
	public Integer calcularGastoTotal(Integer gastoTotal) {
		return gastoTotal += monto;
	}

	@Override
	public Registro emitirRegistro() {
		return new Registro(nombre, monto, marcarGasto());
	};
}
