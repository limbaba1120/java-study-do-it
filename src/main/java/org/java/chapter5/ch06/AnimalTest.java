package org.java.chapter5.ch06;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}

	public void readBooks() {
		System.out.println("사람이 책을 읽음");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunt() {
		System.out.println("사냥을 한다");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 날아감");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		Animal hAnimal = new Human();
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();

		ArrayList<Animal> animalArrayList = new ArrayList<Animal>();
		animalArrayList.add(hAnimal);
		animalArrayList.add(tAnimal);
		animalArrayList.add(eAnimal);

		/**
		 *  다형성 사용
		 *
		 *  상속과 메서드 재정의를 활용하여 확장성 있는 프로그램 만듬
		 *  상위 클래스 공통적인 부분 제공하고 하위 클래스에서는 각 클래스에 맞는 기능 구현
		 */

		for (Animal ani : animalArrayList) {
			ani.move();
		}

		animalMove((hAnimal)); // upcasting
		animalMove((tAnimal));
		animalMove((eAnimal));

		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalArrayList);
	}

	public static void animalMove(Animal animal) {
		animal.move();
	}

	public static void testDownCasting(ArrayList<Animal> animalArrayList) {
		for (int i = 0; i < animalArrayList.size(); i++) {
			Animal animal = animalArrayList.get(i);

			if (animal instanceof Human) {
				Human human = (Human) animal;
				human.readBooks();
			}
			if (animal instanceof Tiger) {
				Tiger tiger = (Tiger) animal;
				tiger.hunt();
			}

		}
	}
}
