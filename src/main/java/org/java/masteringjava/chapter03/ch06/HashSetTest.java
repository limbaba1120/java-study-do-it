package org.java.masteringjava.chapter03.ch06;

import java.util.HashSet;

import org.java.masteringjava.chapter03.ch05.Member;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> hashSet = new HashSet<String>();

		hashSet.add(new String("김유신"));
		hashSet.add(new String("김유신"));
		hashSet.add(new String("김유"));
		hashSet.add(new String("김"));

		System.out.println(hashSet);

		MemberHashSet memberHashSet = new MemberHashSet();
		memberHashSet.addMember(new Member(1003, "이순신"));
		memberHashSet.addMember(new Member(1002, "이순"));
		memberHashSet.addMember(new Member(1001, "이"));
		memberHashSet.showAllMembers();

		System.out.println("==================");

		memberHashSet.addMember(new Member(1001, "이"));
		memberHashSet.showAllMembers();
	}
}
