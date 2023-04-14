package ar.unrn.eje3;

import java.time.LocalDate;

public class Fecha implements ProveedorDeFecha {

	@Override
	public LocalDate obtenerFecha() {
		// TODO Auto-generated method stub
		return LocalDate.now();
	}

}
