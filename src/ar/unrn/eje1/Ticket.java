package ar.unrn.eje1;

import java.util.Objects;

public class Ticket {
	private Double monto;
	private Integer punto;

	public Ticket(Double monto, Integer punto) {
		super();
		this.monto = Objects.requireNonNull(monto);
		this.punto = Objects.requireNonNull(punto);
	}

	Double obtenerMonto() {
		return monto;
	}

	Integer obtenerPunto() {
		return punto;
	}
}
