package ar.unrn.eje3;

import java.time.temporal.Temporal;
import java.util.List;

public class ReporteDeGastos {
	private Integer total;
	private Integer gastosDeComida;
	private List<Registro> registro;
	private Temporal fecha;

	ReporteDeGastos(List<Registro> registro, Temporal fecha) {
		this.registro = registro;
		this.total = 0;
		this.gastosDeComida = 0;
		this.fecha = fecha;
	}

	Ticket imprimir(List<Gasto> gastos) {

		for (Gasto gasto : gastos) {

			gastosDeComida = gasto.calcularGasto(gastosDeComida);
			total = gasto.calcularGastoTotal(total);

			registro.add(gasto.emitirRegistro());
		}

		return new Ticket(total, gastosDeComida, registro, fecha);
	}

}
