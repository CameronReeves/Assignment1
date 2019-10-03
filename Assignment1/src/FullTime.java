
public class FullTime extends Employee {
	
	private double annualSalary;
	private int vacation;
	private boolean contract; 

		public FullTime(String name, String ssn, String dept, double annualSalary,int vacation, boolean contract) {
			super(name, ssn, dept);
			
	}
		
		
		public double getSalary() {
			return annualSalary;
		}
		
		public int getVacation() {
			return vacation;
		}
		
		public boolean getContract() {
			return contract;
		}
		
		public void setSalary(double annualSalary) {
			this.annualSalary=annualSalary;
		}
		
		public void setSSN(int vacation) {
			this.vacation=vacation;
		}
		
		public void setDept(boolean contract) {
			this.contract=contract;
		}

}
