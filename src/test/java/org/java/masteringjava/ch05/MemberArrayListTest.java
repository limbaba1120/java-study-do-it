package org.java.masteringjava.ch05;

import org.java.masteringjava.chapter03.ch05.Member;
import org.java.masteringjava.chapter03.ch05.MemberArrayList;

class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();

		Member memberLeee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberKang = new Member(1003, "강인");
		Member memberHong = new Member(1004, "홍길");

		memberArrayList.addMember(memberLeee);
		memberArrayList.add(memberKim);
		memberArrayList.add(memberKang);
	}

}