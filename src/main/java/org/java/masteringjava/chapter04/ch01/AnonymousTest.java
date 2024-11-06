package org.java.masteringjava.chapter04.ch01;

class Outter2{

	Runnable getRunnable(int i){

		int num = 100;

		return new Runnable() {

			@Override
			public void run() {
				//num = 200;   //에러 남
				//i = 10;      //에러 남
				System.out.println(i);
				System.out.println(num);
			}
		};
	}

	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable 이 구현된 익명 클래스 변수");

		}
	};
}

public class AnonymousTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();

		Runnable runnable = out.getRunnable(10);
		runnable.run();

		out.runner.run();
	}
}

