//This class acts as bean or pojo(plain old java object) to employeetable which is representation of employeetable
//in the database
public class Employee {
	private int empid;
	private String empFirstName;
	private String empMdName;
	private String empLastName;
	private int empAge;
	private String empDept;
	private String empAddr;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpMdName() {
		return empMdName;
	}
	public void setEmpMdName(String empMdName) {
		this.empMdName = empMdName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public String getEmpAddr() {
		return empAddr;
	}
	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}
}

