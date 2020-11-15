package Learn_abstract_interface;

public class Learn_encaplusation {
	private String name;
	private int age;
	private int ssn;
	
		public static void main(String[] args) {
			Learn_encaplusation emp=new Learn_encaplusation();
			emp.setName("sanjay");
			emp.setAge(38);
			emp.setSsn(123456789);
			System.out.println(emp.getName());
			System.out.println(emp.getAge());
			System.out.println(emp.getSsn());
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public int getSsn() {
			return ssn;
		}

		public void setSsn(int ssn) {
			this.ssn = ssn;
		}
	}


