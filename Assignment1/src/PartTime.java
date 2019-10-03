import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Scanner; 


public class PartTime extends Employee {

	private double hourlyR8;
	private int hoursWrkd;
	
	public PartTime(String name, String ssn, String dept, double hourlyR8, int hoursWrkd) {
		super(name, ssn, dept);
		
	}

	File file = new File("/Assignment1/src/employees.txt");
	Scanner scan = new Scanner(file); 
	
	while(scan.hasNextLine()) {
		if (scan.next()=="PT") {
				System.out.print(scan.next());
		}
		scan.hasNextLine();
		
	
}
