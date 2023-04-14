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

		ReporteDeGastos reporte = new ReporteDeGastos(new ArrayList<Registro>(), LocalDate.now());

		Ticket ticket = reporte.imprimir(misGastos);

		Registro cenaReg = ticket.obtenerRegistro(0);
		Registro alquiReg = ticket.obtenerRegistro(1);
		Registro desaReg = ticket.obtenerRegistro(2);

		Assert.assertEquals("X", cenaReg.obtenerMarca());
		Assert.assertEquals("", alquiReg.obtenerMarca());
		Assert.assertEquals("", desaReg.obtenerMarca());

		Assert.assertEquals(LocalDate.now(), ticket.obtenerFecha());

		Assert.assertEquals(5145, (int) ticket.obtenerGasto());
		Assert.assertEquals(5105, (int) ticket.obtenerTotal());

	}

	@Test
	public void reporteDeGastosOK() {

		List<Gasto> misGastos = new ArrayList<Gasto>();

		Gasto cena2 = new Cena(6000, "Cena con Ravioles");
		Gasto cena = new Cena(5100, "Cena");
		Gasto desayuno = new Desayuno(1100, "Desayuno");

		misGastos.add(cena);
		misGastos.add(cena2);
		misGastos.add(desayuno);

		ReporteDeGastos reporte = new ReporteDeGastos(new ArrayList<Registro>(), LocalDate.now());

		Ticket ticket = reporte.imprimir(misGastos);

		Registro cenaReg = ticket.obtenerRegistro(0);
		Registro alquiReg = ticket.obtenerRegistro(1);
		Registro desaReg = ticket.obtenerRegistro(2);

		Assert.assertEquals("X", cenaReg.obtenerMarca());
		Assert.assertEquals("X", alquiReg.obtenerMarca());
		Assert.assertEquals("X", desaReg.obtenerMarca());

		Assert.assertEquals(12200, (int) ticket.obtenerGasto());
		Assert.assertEquals(12200, (int) ticket.obtenerTotal());

	}
}
