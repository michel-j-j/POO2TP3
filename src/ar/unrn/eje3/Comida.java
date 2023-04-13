package ar.unrn.eje3;

import java.util.Objects;

public class Comida implements Gasto {
	private Integer monto;
	private String nombre;

	public Comida(Integer monto, String nombre) {
		this.monto = Objects.requireNonNull(monto);
		this.nombre = Objects.requireNonNull(nombre);
	}

	@Override
	public Integer calcularGasto(Integer gastoTotalDeComida) {

		return gastoTotalDeComida += monto;
	}

	protected Integer ObternerMonto() {
		return this.monto;
	}

	@Override
	public String marcarGasto() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public Registro emitirRegistro() {

		return new Registro(nombre, monto, marcarGasto());
	}

	@Override
	public Integer calcularGastoTotal(Integer gastoTotal) {

		return gastoTotal += monto;
	}
}
