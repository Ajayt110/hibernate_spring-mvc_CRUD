package spring_mvc_web_demo2.controller;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String anime;
	private String[] animeGenre;

	public Student() {
		super();
		
	}


	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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


	public String getAnime() {
		return anime;
	}


	public void setAnime(String anime) {
		this.anime = anime;
	}


	public String[] getAnimeGenre() {
		return animeGenre;
	}


	public void setAnimeGenre(String[] animeGenre) {
		this.animeGenre = animeGenre;
	}

	
}
