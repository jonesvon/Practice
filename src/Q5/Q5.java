package Q5;

public class Q5 {
//get constructor
	
		
		private String name;
		public Q5(String name, String ssn, float salary) {
			super();
			setName(name);
			setSsn(ssn);
			setSalary(salary);
			//this.salary = salary;
		}
		public String getName() {
			
			return name;
		}
		public void setName(String name) {
			
			this.name = name;
		}
		public String getSsn() {
			
			return ssn;
		}
		public void setSsn(String ssn) {
			this.ssn = ssn;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		private String ssn;
		private float salary;
		


	}


