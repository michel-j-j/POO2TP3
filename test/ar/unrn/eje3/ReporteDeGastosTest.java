package ar.unrn.eje3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ReporteDeGastosTest {

	@Test
	public void reporteDeGastosGenerico() {

		List<Gasto> misGastos = new ArrayList<Gasto>();

		Gasto alquiler = new AlquilerAuto(40, "Alquiler de Auto");
		Gasto cena = new Cena(5100, "Cena");
		Gasto desayuno = new Desayuno(5, "Desayuno");

		misGastos.add(cena);
		misGastos.add(alquiler);
		misGastos.add(desayuno);

		ProveedorDeFecha fecha = new FechaFake();

		ReporteDeGastos reporte = new ReporteDeGastos(new ArrayList<Registro>(), fecha.obtenerFecha()); // Comparar
																										// el
																										// string

		Ticket ticket = reporte.imprimir(misGastos);

		Registro cenaReg = ticket.obtenerRegistro(0);
		Registro alquiReg = ticket.obtenerRegistro(1);
		Registro desaReg = ticket.obtenerRegistro(2);

		Assert.assertEquals("X", cenaReg.obtenerMarca());
		Assert.assertEquals("", alquiReg.obtenerMarca());
		Assert.assertEquals("", desaReg.obtenerMarca());

		Assert.assertEquals(LocalDate.of(2023, 4, 14), ticket.obtenerFecha());

		System.out.println();

		Assert.assertEquals(
				"Expense 2023/4/14\r\n" + "Cena	5100	X\r\n" + "Alquiler de Auto	40	\r\n" + "Desayuno	5	\r\n"
						+ "Gastos de Comidad: 5145\r\n" + "Total de Gastos: 5105",
				"Expense 2023/4/14" + System.lineSeparator() + cenaReg.obtenerNombre() + "\t" + cenaReg.obtenerMonto()
						+ "\t" + cenaReg.obtenerMarca() + System.lineSeparator() + alquiReg.obtenerNombre() + "\t"
						+ alquiReg.obtenerMonto() + "\t" + alquiReg.obtenerMarca() + System.lineSeparator()
						+ desaReg.obtenerNombre() + "\t" + desaReg.obtenerMonto() + "\t" + desaReg.obtenerMarca()
						+ System.lineSeparator() + "Gastos de Comidad: " + ticket.obtenerGasto()
						+ System.lineSeparator() + "Total de Gastos: " + ticket.obtenerTotal());
	}

}
