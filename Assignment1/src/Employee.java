import java.io.File; 
import java.util.Scanner; 

public abstract class Employee {

		File file = new File("C:\\Users\\Cameron\\eclipse-workspace\\Assignment1\\src\\employees.txt");
	//	Scanner sc = new Scanner(file);
		
		private String name;
		private String ssn; 
		private String dept; 
		
	public Employee(String name, String ssn, String dept) {
		this.name=name;
		this.ssn=ssn;
		this.dept=dept;
	}
	
	
	public String getName() {
		return name;
	}
	
	public String getSSN() {
		return ssn;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setSSN(String ssn) {
		this.ssn=ssn;
	}
	
	public void setDept(String dept) {
		this.dept=dept;
	}
	
	
	
}
