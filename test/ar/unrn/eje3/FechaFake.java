package ar.unrn.eje3;

import java.time.LocalDate;

public class FechaFake implements ProveedorDeFecha {

	@Override
	public LocalDate obtenerFecha() {
		// TODO Auto-generated method stub
		return LocalDate.of(2023, 4, 14);
	}

}
