package comp110.lecture21.spellcheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFile {

	public List<String> readLines(String path) {
		List<String> lines = new ArrayList<String>();
		try {
			Scanner sc = new Scanner(new File(path));
			while (sc.hasNextLine()) {
				lines.add(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Could not find the file " + path + ". Exiting the program.");
			System.exit(1);
		}
		return lines;
	}

}
