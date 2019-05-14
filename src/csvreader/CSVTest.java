package csvreader;

import java.io.IOException;

public class CSVTest {
	public static void main (String[] args) {
		CSVReader test = new CSVReader("C:/Users/brand/eclipse-workspace/CSV-Reader/src/csvreader/project.csv");
		try {
			test.read();
			test.convertValues();
			test.getValues();
			test.addToTempArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	}

