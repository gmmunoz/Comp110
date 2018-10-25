package comp110.lecture26;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class FoodRunner {

	public static void main(String[] args) throws IOException {

		// Input Data: Initial goal is to populate this Map with:
		// the food's name as a key and the MenuItem as the value
		Map<String, MenuItem> menu = new HashMap<String, MenuItem>();

		// Construct a CSV Iterable from the Apache Commons CSV Library
		Reader in = new FileReader("data/chase-2017-04-21.csv");
		Iterable<CSVRecord> records = CSVFormat.EXCEL.withFirstRecordAsHeader().parse(in);

		// Iterate through each CSV record in the file to input the data
		for (CSVRecord record : records) {
			// Parse each field from the CSV

			String name = record.get("name");
			double calories = Double.parseDouble(record.get("calories"));
			double protein = Double.parseDouble(record.get("protein"));
			double carbs = Double.parseDouble(record.get("carbs"));
			double fat = Double.parseDouble(record.get("fat"));
			boolean organic = Boolean.parseBoolean(record.get("organic"));
			boolean vegetarian = Boolean.parseBoolean(record.get("vegetarian"));
			boolean glutenFree = Boolean.parseBoolean(record.get("glutenFree"));
			boolean vegan = Boolean.parseBoolean(record.get("vegan"));

			// Assign each parsed value to a MenuItem object
			MenuItem item = new MenuItem(record.get("name"));
			item.setCalories(calories);
			item.setProtein(protein);
			item.setCarbs(carbs);
			item.setFat(fat);
			item.setOrganic(organic);
			item.setVegetarian(vegetarian);
			item.setGlutenFree(glutenFree);
			item.setVegan(vegan);

			// Add the Object to a Data Structure
			menu.put(name, item);
		}

		// Process / Filter Data
		List<MenuItem> filteredList = new ArrayList<MenuItem>();
		for (MenuItem item : menu.values()) {
			// TODO: Filter the Data
			if (item.getFat() < 0) {
				filteredList.add(item);
			}
			if (item.getOrganic() == true) {
				filteredList.add(item);
			}
			if (item.getProtein() > 5) {
				filteredList.add(item);
			}
		}

		// Sort Processed Data
		// TODO: Sort the Data
		filteredList.sort(new CompareByProtein());

		// Print Processed Data
		// TODO: Print the Data
		for (MenuItem item : filteredList) {
			System.out.println(item.getName() + " " + item.getProtein());
		}

		// Save Output to Storage
		FileWriter writer = new FileWriter("data/chase-results.csv");
		CSVPrinter printer = new CSVPrinter(writer, CSVFormat.EXCEL);
		// TODO: Write Data as Output
		for (MenuItem item : filteredList) {
			printer.printRecord(item.getName(), item.getProtein(), item.getCalories());
		}
		printer.close();

	}
}
