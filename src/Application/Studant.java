package Application;

import java.util.Scanner;

public class Studant {
	private String name;
	private int sid;
	private int cid;
	private String[] nameToNotes = {"Chinese", "Mathematic", "english", "Programming"};
	int notes[] = new int[4];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getNameToNotes() {
		return nameToNotes;
	}
	
	public void setNameToNotes(String nameToNotes) {
		this.nameToNotes = nameToNotes;
	}

	public void getNotes() {
		return notes;
	}

	public int setNotes(int notes) {
		this.notes = notes;
	}
}

class StudantData {
	private Studant[] studants = new Studant[100];
	int totalStudants = 0;

	public void addStudant(Studant studant) {
		this.studant[this.totalStudants] = studant;
		this.totalStudants++;
	}

	public void removeStudant(Studant studant) {
		this.studants[this.totalStudants] = studant;
		this.totalStudants--;
	}

	public String queryStudant(int sid) {
		for(int i = 0; i < this.studants.length; i++) {
			if(cid == this.studants[i].getSid()) {
				return this.studants[i];
			}
		}
		return "No match criteria";
	}

	public 
}
