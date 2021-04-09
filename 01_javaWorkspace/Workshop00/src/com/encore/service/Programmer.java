package com.encore.service;

import com.encore.util.MyDate;

public class Programmer {

	public String name;
	public MyDate birthDate;
	public String company;
	public String tech;
	

	public NoteBook notebook;
	
	
	public void buyNotebook(NoteBook notebook) {
		this.notebook = notebook;
	}
	
	public Programmer(String name, String company, String tech) {
		this.name = name;
		this.birthDate = birthDate;
		this.company = company;
		this.tech = tech;
	}
	
	public NoteBook getNotebook() {
		return notebook;
	}

	public String getProgrammerInfo() {
		return name+","+birthDate.getDate()+","+company+","+tech;
	}


	
}
