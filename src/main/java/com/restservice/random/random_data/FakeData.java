package com.restservice.random.random_data;

import java.util.ArrayList;
import java.util.List;

import com.github.javafaker.Faker;

public class FakeData {
	private int id;
	private String firstName;
	private String lastName;
	private String fullAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}
	
	public List<FakeData> getFakeRecords(int count) {
		
		List<FakeData> dataList = new ArrayList<>();
		
		for(int i = 0; i < count; i++) {
			Faker facker = new Faker();
			FakeData data = new FakeData();
			data.setId(i+1);
			data.setFirstName(facker.address().firstName());
			data.setLastName(facker.address().lastName());
			data.setFullAddress(facker.address().fullAddress());
			dataList.add(data);
		}
		
		return dataList;
		
	}

}
