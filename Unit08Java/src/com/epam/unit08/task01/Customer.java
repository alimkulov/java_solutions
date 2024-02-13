package com.epam.unit08.task01;

class Customer {
	
	private int id;
	private String surname;
	private String first_name;
	private String fathers_name;
	private String address_line;
    private int pan;
    private String iban;
    
	public Customer (int _id, String _surname, String _first_name, String _fathers_name, String _address_line, int _pan, String _iban) {
		this.id=_id;
		this.surname=_surname;
		this.first_name=_first_name;
		this.fathers_name=_fathers_name;
		this.address_line=_address_line;
		this.pan=_pan;
		this.iban=_iban;	
	}
	
	public void setId(int _id) {
		this.id=_id;
	}
	public int getId() {
		return id;
	}
	
	public void setSurname(String _surname) {
        this.surname=_surname;		
	}
	public String getSurname() {
		return surname;
	}
	
	public void setFirstName(String _first_name) {
        this.first_name=_first_name;		
	}
	public String getFirstName() {
		return first_name;
	}
	
	public void setFathersName(String _fathers_name) {
        this.fathers_name=_fathers_name;		
	}
	public String getFathersName() {
		return fathers_name;
	}
	
	public void setAddressLine(String _address_line) {
        this.address_line=_address_line;		
	}
	public String getAddressLine() {
		return address_line;
	}
	
	public void setPan(int _pan) {
        this.pan=_pan;		
	}
	public int getPan() {
		return pan;
	}
	
	public void setIban(String _iban) {
        this.iban=_iban;		
	}
	public String getIban() {
		return iban;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address_line == null) ? 0 : address_line.hashCode());
		result = prime * result + ((fathers_name == null) ? 0 : fathers_name.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((iban == null) ? 0 : iban.hashCode());
		result = prime * result + id;
		result = prime * result + pan;
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address_line == null) {
			if (other.address_line != null)
				return false;
		} else if (!address_line.equals(other.address_line))
			return false;
		if (fathers_name == null) {
			if (other.fathers_name != null)
				return false;
		} else if (!fathers_name.equals(other.fathers_name))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (iban == null) {
			if (other.iban != null)
				return false;
		} else if (!iban.equals(other.iban))
			return false;
		if (id != other.id)
			return false;
		if (pan != other.pan)
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", first_name=" + first_name + ", fathers_name="
				+ fathers_name + ", address_line=" + address_line + ", pan=" + pan + ", iban=" + iban + "]";
	}
	
	
}