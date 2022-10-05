package com.bezkoder.spring.datajpa.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "grade")
	private String grade;


	@Column(name = "name")
	private String name;
	
	@Column(name = "project")
	private String project;
	
	@Column(name = "manager")
	private String manager;
	
	@Column(name = "city")
	private String city;
	
	
	@Column(name = "phoneno")
	private String phoneno;
	
	@Column(name = "gender")
	private String gender;

	@Column(name = "published")
	private boolean published;

	public Tutorial() {

	}

	public Tutorial(String title,String grade,String name, String project,String manager,String city,String phoneno,String gender, boolean published) {
		this.title = title;
		this.name=name;
		this.project=project;
		this.manager=manager;
		this.city=city;
		this.phoneno=phoneno;
		this.gender=gender;
		this.grade=grade;
		this.published=published;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", name=" + name + ", published=" + published + ",project=" + project + " ,gender=" + gender + ",manager=" + manager + ",phoneno=" +  phoneno+",city=" + city+ ",gender=" + gender+ ",grade="+grade+"]";
	}

}
