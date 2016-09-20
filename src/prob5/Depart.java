package prob5;

public class Depart extends Employee {
	private String department;
	
	
	public Depart(String name, int Salary, String department) {
		setName(name);
		setSalary(Salary);
		this.department = department;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + getName() + " 연봉 : " + getSalary() + " 부서 : " + this.department);
	}
	
	
}
