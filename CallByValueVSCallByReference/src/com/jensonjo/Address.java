package com.jensonjo;

public class Address {
	private String country;
	private String pinCode;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Address(String _country, String _pinCode) {
		country = _country;
		pinCode = _pinCode;
	}

}
