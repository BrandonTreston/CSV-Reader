package csvreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Reads character from a CSV input file. Each Line of the specified CSV file has an array created to store its contents as unique elements.
 * An ArrayList is used to store the collection of arrays. This is done to facilitate retrieving all the information about a single row in the CSV file.
 * 
 * @author Brandon Treston
 * 
 
 *
 */
public class CSVReader {
/**
 * 
 * @param inCSVFile CSV file to be read by this class's 'read()' method. Stores the string containing the file path as an instance field.
 */
	public CSVReader(String inCSVFile) {
		csvFile = inCSVFile;

	}
/**
* Reads the input file line by line, storing each line of the CSV in a temporary ArrayLis. Each element of the ArrayList can then be
* converted into an array with each element consisting of one comma separated value.
* @throws IOException If file is not found in the file system, this method will throw an IOException and execution will cease.
*/
	public void read() throws IOException {
		br = new BufferedReader(new FileReader(csvFile));
		while ((line = br.readLine())!= null) {
			values.add(line);
		}			
	}
	
/**
 * Prints all the values in the ArrayList containing the information from the CSV File.
 */
	public void printValues() {
		for (int i = 0; i<= values.size() -1; i++) {
			System.out.println(values.get(i));
		}
	}
	
/**
 * Loops through the temporary array to convert the values into distinct elements of their own ArrayList. 
 * TODO: change convertedValues from ArrayList to Queue, then from a queue, create arrays to store the info. Have to find out way to make size of each array fit needs of user.
 */
	public void convertValues() {
		for (int j = 0; j<=values.size()-1;j++) {	
		String temp = values.get(j);	//temporary string to hold an entire row of the CSV.
			for(int i = 0; i<=5; i++) {
				if (i%2 == 0 || i==0) {	//ensures you do not create an element out of a comma (","). Linear search, perhaps try to improve?
					String finalTemp = temp.substring(i,i+1);	//Creates a String of one character for each character that is not a comma.
					convertedValues.add(finalTemp);	// Add value of each row in the CSV is its own element in an ArrayList. Characters have been decoupled from the other characters in its String.
				}
			}
		}
	}
	
	
	public void printConv() {	//prints the converted numbers
	System.out.println(convertedValues);

}
	private ArrayList <String> values = new ArrayList <String>();
	private BufferedReader br = null;
	private String line = "";
	private String csvSplit = ",";
	private String csvFile;
	private ArrayList<String> convertedValues = new ArrayList<String>();
	

	
}
