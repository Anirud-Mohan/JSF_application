import java.io.Serializable;

//import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
//import javax.faces.context.FacesContext;

@ManagedBean(name = "employee")
@SessionScoped
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int eid;
	private int age;
	private String dept;
	private String gender;
	private String email;
	private String address;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public String save() throws  Exception {

		System.out.println("called this function......");
		try {
		connection connection1= new connection();
		connection1.insertUser(name,eid,dept,age,gender,email,address);
		}
		catch(Exception e){
		System.out.println(e);
		}
		return "emp_response1.xhtml";

	}
}
