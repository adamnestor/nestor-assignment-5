package com.coderscampus;

import main.java.com.coderscampus.arraylist.CustomArrayList;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomArrayList<String> testCustomArrayList = new CustomArrayList<>();

		// Adding elements using the .add method
		// Checking the size using the .getSize method
		// Printing elements to the console using the .get method

		testCustomArrayList.add("element 1");
		testCustomArrayList.add("element 2");
		testCustomArrayList.add("element 3");

		System.out.println("Size of the list: " + testCustomArrayList.getSize());

		for (int i = 0; i < testCustomArrayList.getSize(); i++) {
			System.out.println(testCustomArrayList.get(i));
		}

		// Adding more items to check the dynamic sizing, from 10 -> 20
		System.out.println("------------");

		for (int i = 4; i <= 11; i++) {
			testCustomArrayList.add("element " + i);
		}

		System.out.println("Size of the list: " + testCustomArrayList.getSize());

		for (int i = 0; i < testCustomArrayList.getSize(); i++) {
			System.out.println(testCustomArrayList.get(i));
		}

		// Adding more items once more to check going from 20 -> 40
		System.out.println("------------");

		for (int i = 12; i <= 21; i++) {
			testCustomArrayList.add("element " + i);
		}

		System.out.println("Size of the list: " + testCustomArrayList.getSize());

		for (int i = 0; i < testCustomArrayList.getSize(); i++) {
			System.out.println(testCustomArrayList.get(i));
		}
	}

}
