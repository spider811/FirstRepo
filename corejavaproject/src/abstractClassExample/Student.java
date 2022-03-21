package abstractClassExample;

public class Student {
	//pojo class//entity class// model class/Encapsulation/ / object class
	//plain old java object(pojo)
	private int rollno;
	private String name;
	private String email;
	private String address;

	
	
	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", email=" + email + ", address=" + address + "]";
	}

}
