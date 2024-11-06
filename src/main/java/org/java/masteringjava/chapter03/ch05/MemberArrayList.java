package org.java.masteringjava.chapter03.ch05;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

	private ArrayList<Member> arrayList;

	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}

	public void addMember(Member member) {
		arrayList.add(member);
	}
	public boolean removeMember(int memberId) {
		/*for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);
			if (member.getMemberId() == memberId) {
				arrayList.remove(i);
				return true;
			}
		}*/

		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				arrayList.remove(member);

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

		Iterator<Member> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			Member member = iterator.next();
			System.out.println(member);
		}
	}
}
