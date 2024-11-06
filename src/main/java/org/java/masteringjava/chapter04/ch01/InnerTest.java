package org.java.masteringjava.chapter04.ch01;


class OutClass {

	private int num = 10;
	private static int sNum = 20;
	private InnerClass inClass;

	public OutClass() {
		inClass = new InnerClass();
	}

	class InnerClass {

		int inNum = 100;
		static int sInNum = 200;


		void inTest() {
			System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
		}

		static void sTest() {
			// instance 변수는 선언 안됨
			System.out.println("inner static method inNum = " + sInNum);
		}
	}

	public void usingInClass() {
		inClass.inTest();
	}

	static class InStaticClass {
		int inNum = 200;
		static int sInNum = 600;

		void inTest(){   //정적 클래스의 일반 메서드
			//num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
		}

		static void sTest(){  // 정적 클래스의 static 메서드
			//num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
			//inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

		}

	}
}


public class InnerTest {
	public static void main(String[] args) {
	/*	OutClass outClass = new OutClass();

		outClass.usingInClass();

		System.out.println("OutClass.InnerClass.sInNum = " + OutClass.InnerClass.sInNum);

		OutClass.InnerClass innerClass = outClass.new InnerClass();
		innerClass.inTest();*/

		// 정적 메서드 호출
		OutClass.InStaticClass.sTest();
		// OutClass.InStaticClass.inTest();
		// 일반 메서드 호출
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		inStaticClass.inTest();

	}
}
