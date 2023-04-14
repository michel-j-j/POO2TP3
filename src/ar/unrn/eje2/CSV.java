package ar.unrn.eje2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.opencsv.CSVReader;

public class CSV {
	private List<String[]> csvData;
	private Map<String, String> opciones;
	private CSVReader csvReader;
	private List<String[]> resultados;

	public CSV(ArrayList<String[]> csvData, CSVReader csvReader, HashMap<String, String> options) {
		this.csvData = Objects.requireNonNull(csvData);
		this.csvReader = Objects.requireNonNull(csvReader);
		this.opciones = Objects.requireNonNull(options);
	}

	private Boolean existeElTipo(Integer indice1, Integer indice2, String tipo) {
		return csvData.get(indice1)[indice2].equals(opciones.get(tipo));
	}

	public void filtrarPorTipo(String tipo, Integer indice) { // Hacer la propia interfaz.
		resultados = csvData.stream().filter(fila -> existeElTipo(csvData.indexOf(fila), indice, tipo))
				.collect(Collectors.toCollection(ArrayList::new));
		this.csvData = resultados;
	}

	public ArrayList<Map<String, String>> cargarMapa() {

		ArrayList<Map<String, String>> output = new ArrayList<>();

		for (String[] fila : csvData) {
			Map<String, String> mapped = new HashMap<>();
			mapped.put("permalink", fila[0]);
			mapped.put("company_name", fila[1]);
			mapped.put("number_employees", fila[2]);
			mapped.put("category", fila[3]);
			mapped.put("city", fila[4]);
			mapped.put("state", fila[5]);
			mapped.put("funded_date", fila[6]);
			mapped.put("raised_amount", fila[7]);
			mapped.put("raised_currency", fila[8]);
			mapped.put("round", fila[9]);

			output.add(mapped);
		}
		return output;
	}

	public void cargarCSV() throws IOException {
		csvReader.forEach(row -> csvData.add(row));
		csvReader.close();
		csvData.remove(0);
	}

}
