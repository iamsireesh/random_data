package com.restservice.random.random_data;

import com.github.javafaker.Faker;

public class Test {

	public static void main(String[] args) {
		Faker faker = new Faker();
		System.out.println(faker.idNumber());
		System.out.println(faker.address().firstName());
		System.out.println(faker.address().lastName());
		System.out.println(faker.address().fullAddress());
	}

}
