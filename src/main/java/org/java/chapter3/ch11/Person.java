package org.java.chapter3.ch11;

public class Person {

	private String name;
	private int age;

	public Person() {
		this("이름없음", 1);

	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person getPerson() {
		return this;
	}

	@Override
	public String toString() {
		return "Person{" +
			"name='" + name + '\'' +
			", age=" + age +
			'}';
	}

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.getPerson());
		System.out.println(person);

		System.out.println(person.name);
		System.out.println(person.age);



	}
}
