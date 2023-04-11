package ar.unrn.eje2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.opencsv.CSVReader;

public class CSV {
	private List<String[]> csvData;
	private Map<String, String> options;
	private CSVReader csvReader;

	public CSV(ArrayList<String[]> csvData, CSVReader csvReader, HashMap<String, String> options) {
		this.csvData = Objects.requireNonNull(csvData);
		this.csvReader = Objects.requireNonNull(csvReader);
		this.options = Objects.requireNonNull(options);
	}

	public void filtrarPorTipo(String tipo, Integer indice) {
		List<String[]> results = new ArrayList<String[]>();
		for (int i = 0; i < csvData.size(); i++) {
			if (csvData.get(i)[indice].equals(options.get(tipo))) {
				results.add(csvData.get(i));
			}
		}
		this.csvData = results;
	}

	public ArrayList<Map<String, String>> cargarMapa() {
		List<Map<String, String>> output = new ArrayList<Map<String, String>>();

		for (int i = 0; i < csvData.size(); i++) {
			Map<String, String> mapped = new HashMap<String, String>();
			mapped.put("permalink", csvData.get(i)[0]);
			mapped.put("company_name", csvData.get(i)[1]);
			mapped.put("number_employees", csvData.get(i)[2]);
			mapped.put("category", csvData.get(i)[3]);
			mapped.put("city", csvData.get(i)[4]);
			mapped.put("state", csvData.get(i)[5]);
			mapped.put("funded_date", csvData.get(i)[6]);
			mapped.put("raised_amount", csvData.get(i)[7]);
			mapped.put("raised_currency", csvData.get(i)[8]);
			mapped.put("round", csvData.get(i)[9]);

			output.add(mapped);
		}
		return (ArrayList<Map<String, String>>) output;
	}

	public void cargarCSV() throws IOException {
		csvReader.forEach(row -> csvData.add(row));
		csvReader.close();
		csvData.remove(0);
	}

}
