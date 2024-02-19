package by.epam.lb.nb.main;

import java.util.Date;

public class Main {

	
	public static void main(String[] args) {
		Note n1= new Note("note1");
		Note n2= new Note("note2", new Date());
		
		n1.setNote("new note1");
	}
}
