package ar.unrn.eje1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ar.unrn.eje1.Alquiler;
import ar.unrn.eje1.Cliente;
import ar.unrn.eje1.Libro;
import ar.unrn.eje1.LibroRegular;
import ar.unrn.eje1.Ticket;

public class Punto1 {

	@Test
	public void calcularPuntosAlquier() {
		Libro elTunel = new LibroRegular("El Túnel", 1);
		Libro antesDelFin = new LibroRegular("Antes del Fin", 2);

		Libro elTunelCopia = elTunel;
		Libro antesDelFinCopia = antesDelFin;

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);

		Cliente yo = new Cliente("Javier");

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

		Ticket resultado = yo.calcularDeudaYPuntosObtenidos();

		assertEquals(10.0, resultado.obtenerMonto());
		assertEquals(2, resultado.obtenerPunto());

	}
}
