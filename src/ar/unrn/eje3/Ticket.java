package ar.unrn.eje3;

import java.time.temporal.Temporal;
import java.util.List;
import java.util.Objects;

public class Ticket {

	private Integer gastoComida;
	private Integer total;
	private List<Registro> registro;
	private Temporal fecha;

	Ticket(Integer gasto, Integer total, List<Registro> registro, Temporal fecha) {
		this.gastoComida = Objects.requireNonNull(gasto);
		this.total = Objects.requireNonNull(total);
		this.fecha = Objects.requireNonNull(fecha);
		this.registro = registro;

	}

	Integer obtenerGasto() {
		return gastoComida;
	}

	void agregarRegistro(Registro registro) {
		this.registro.add(registro);
	}

	Integer obtenerTotal() {
		return total;
	}

	Temporal obtenerFecha() {
		return fecha;
	}

	Registro obtenerRegistro(Integer indice) {
		return registro.get(indice);
	}
}
