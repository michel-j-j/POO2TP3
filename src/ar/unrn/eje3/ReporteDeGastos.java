package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
	private Integer total;
	private Integer gastosDeComida;
	private List<Registro> registro;

	ReporteDeGastos(List<Registro> registro) {
		this.registro = registro;
		this.total = 0;
		this.gastosDeComida = 0;
	}

	Ticket imprimir(List<Gasto> gastos) {

		for (Gasto gasto : gastos) {
			gastosDeComida = gasto.calcularGasto(gastosDeComida);
			total = gasto.calcularGastoTotal(total);

			registro.add(gasto.emitirRegistro());
		}

		return new Ticket(total, gastosDeComida, registro, LocalDate.now());
	}

}
