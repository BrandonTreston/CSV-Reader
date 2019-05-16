package src.csvreader;

import java.io.IOException;

import csvreader.CSVReader;

public class CSVTest {
	public static void main (String[] args) {
		CSVReader test = new CSVReader("C:/Users/brand/eclipse-workspace/CSV-Reader/src/csvreader/project.csv");
		try {
			test.read();
			test.convertValues();
			test.printConv();
			test.printValues();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	}

