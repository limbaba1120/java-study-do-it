package ch09;

import java.util.TreeSet;


public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();

		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		System.out.println(treeSet);

		MemberTreeSet memberTreeSet = new MemberTreeSet();
		memberTreeSet.addMember(new Member(1003, "이순신"));
		memberTreeSet.addMember(new Member(1002, "이순"));
		memberTreeSet.addMember(new Member(1001, "이"));
		memberTreeSet.showAllMembers();

	}
}
