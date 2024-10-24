package org.java.masteringjava.ch06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.java.masteringjava.ch05.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;

	public MemberHashSet() {
		hashSet = new HashSet<>();
	}

	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		/*for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/

		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				hashSet.remove(member);

				return true;
			}
		}
		System.out.println(memberId + "존재하지 않습");
		return false;

		// System.out.println(memberId + "가 존재하지 않습니다");

		// return false;
	}

	public void showAllMembers() {
		/*for (Member member : arrayList) {
			System.out.println(member);
		}

		System.out.println();*/

		Iterator<Member> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
	}
}
