package ar.unrn.eje1;

public class Main {
	/* 
	 * 
	 */

	public static void main(String args[]) {

		Libro elTunel = new LibroRegular("El Túnel", 1);
		Libro antesDelFin = new LibroInfantil("Antes del Fin", 2);

		Libro elTunelCopia = elTunel;
		Libro antesDelFinCopia = antesDelFin;

		Alquiler alquilerElTunel = new Alquiler(elTunelCopia, 5);
		Alquiler alquilerAntesDelFin = new Alquiler(antesDelFinCopia, 3);
		Cliente yo = new Cliente("Javier");

		yo.alquilar(alquilerElTunel);
		yo.alquilar(alquilerAntesDelFin);

	}
}