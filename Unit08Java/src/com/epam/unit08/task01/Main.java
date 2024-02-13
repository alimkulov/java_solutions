package com.epam.unit08.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		Dossier clientList = new Dossier();
		
		clientList.addCustomer(new Customer(1,"Smith","John","George","1, New York",1001,"US4000") );
		clientList.addCustomer(new Customer(2,"Connor","Sarah","Sam","54, Boston",1010,"US7080") );
		clientList.addCustomer(new Customer(3,"Anderson","George","Larison","82, Oregon",4052,"US8400") );
		clientList.addCustomer(new Customer(4,"Watson","Emma","Richard","41, London",8040,"UK1111") );
		clientList.addCustomer(new Customer(5,"Ivanov","Ivan","Ivanovich","45, Moscow",2065,"RU5555") );
		clientList.addCustomer(new Customer(6,"Kim","Chin","Ir","78, North Korea",4990,"NK4444") );
		
		//sorted by surname
        clientList.sortList();
               
		System.out.println("List of Range PAN:");
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		for(Customer cst: clientList.findRangeOfPan(1000, 4000)) {
					
			System.out.println(cst.toString()+"\n");
		}
        
		
	}
	
}
