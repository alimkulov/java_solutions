package com.epam.unit08.task01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Dossier {
	private List<Customer> customerList; 
	
	public Dossier() {
		customerList = new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer cl) {
		customerList.add(cl);
	}
	
	public void setCustomer(List<Customer> _customer) {
		this.customerList=_customer;
	}
	
	public List<Customer> getCustomers() {
		return customerList;
	}
    
	public void sortList() {
		Collections.sort(customerList, new Comparator() {
			@Override
			public int compare(Object clientOne, Object clientTwo) {
				return ((Customer)clientOne).getSurname().compareTo(((Customer)clientTwo).getSurname());
			}
		});
		
		for(Customer cst: customerList) {
			System.out.println(cst.toString()+"\n");
		}
	}

	public List<Customer> findRangeOfPan(int min, int max) {
		List<Customer> result = new ArrayList<Customer>();
		
		for(Customer cst: customerList) {
			if(cst.getPan()>=min && cst.getPan()<=max) {
				result.add(cst);
			}
		}
		
		return result;
		
	}
	
}