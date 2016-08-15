package com.jensonjo;

public class Driver {

	public static void main(String[] args) {
		Student std1 = new Student("Jenson", new Address("India", "431003"));
		Student std3 = new Student("XXX", new Address("India", "431003"));
		Student std2 = std1;
		Student std4 = null;
		std2 = std4;
		std1 = std3;
		// std2.setName("YYY");
		// std1 = new Student("Joseph", new Address("India", "431003"));
		System.out.println("Is student 2 null ?");
		if (std2 != null) {
			System.out.println(std2.getName());
		} else {
			System.out.println("Yes, Student 2 is null and reference to object initially created for std1 is lost");
		}
	}

}
