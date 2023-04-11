package ar.unrn.eje2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;

public class Recaudacion {

	private static TipoFiltro COMPANIA = TipoFiltro.COMPANIA;
	private static TipoFiltro CIUDAD = TipoFiltro.CIUDAD;
	private static TipoFiltro ESTADO = TipoFiltro.ESTADO;
	private static TipoFiltro ENTORNO = TipoFiltro.ENTORNO;

	public static List<Map<String, String>> where(Map<String, String> options) throws IOException {

		CSV csvControlador = new CSV(new ArrayList<String[]>(), new CSVReader(new FileReader("data.csv")),
				((HashMap<String, String>) options));
		csvControlador.cargarCSV();

		if (options.containsKey(COMPANIA.obtenerNombre())) {
			csvControlador.filtrarPorTipo(COMPANIA.obtenerNombre(), COMPANIA.obtenerValor());
		}

		if (options.containsKey(CIUDAD.obtenerNombre())) {
			csvControlador.filtrarPorTipo(CIUDAD.obtenerNombre(), CIUDAD.obtenerValor());
		}

		if (options.containsKey(ESTADO.obtenerNombre())) {

			csvControlador.filtrarPorTipo(ESTADO.obtenerNombre(), ESTADO.obtenerValor());
		}

		if (options.containsKey(ENTORNO.obtenerNombre())) {
			csvControlador.filtrarPorTipo(ENTORNO.obtenerNombre(), ENTORNO.obtenerValor());
		}

		return csvControlador.cargarMapa();
	}

}
