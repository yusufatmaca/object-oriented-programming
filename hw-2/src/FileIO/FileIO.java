package FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO {
	private String fileName;
	public ArrayList<String[]> allElements = new ArrayList<String[]>();

	// The ArrayList holds String arrays. In a String array, all properties of
	// objects are held.
	public FileIO(String fileName) {
		this.fileName = fileName;
		inputStream();
	}

	private void inputStream() {
		BufferedReader br = null;
		String line = "";
		String splitBy = ",";

		try {
			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				String[] tempArr = line.split(splitBy);
				allElements.add(tempArr);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
