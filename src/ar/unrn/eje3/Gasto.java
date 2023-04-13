package ar.unrn.eje3;

public interface Gasto {

	public Integer calcularGasto(Integer gastoTotalDeComida);

	public Integer calcularGastoTotal(Integer gastoTotal);

	public Registro emitirRegistro();

	public String marcarGasto();

}
