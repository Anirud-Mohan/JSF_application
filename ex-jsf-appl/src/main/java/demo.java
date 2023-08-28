import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class demo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String country;
	private String favLanguage;
	private String[] favSubject;
	private String email;
//	private ArrayList<String> favSport;
	
	List<String> countryOptions;
	public demo() {
		firstName="Home";
		lastName="Lander";
		country="India";
		favLanguage="C++";
		
		countryOptions = new ArrayList<>();
		
		countryOptions.add("Brazil");
		countryOptions.add("France");
		countryOptions.add("India");
		countryOptions.add("United Kingdom");
		countryOptions.add("United States of America");
	}
	
	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public String[] getFavSubject() {
		return favSubject;
	}

	public void setFavSubject(String[] favSubject) {
		this.favSubject = favSubject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

//	public ArrayList<String> getFavSport() {
//		return favSport;
//	}
//
//	public void setFavSport(ArrayList<String> favSport) {
//		this.favSport = favSport;
//	}




	
	
}
