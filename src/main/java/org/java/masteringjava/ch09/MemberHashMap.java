package org.java.masteringjava.ch09;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> map;

	public MemberHashMap() {
		map = new HashMap<>();
	}

	public void addMember(Member member) {
		map.put(member.getMemberId(), member);
	}

	public boolean removeMember(int memberId) {
		if (map.containsKey(memberId)) {
			map.remove(memberId);
			return true;
		}
		return false;
	}

	public void showAllMembers() {

		Iterator<Integer> ir = map.keySet().iterator();

		while (ir.hasNext()) {
			Integer key = ir.next();
			Member member = map.get(key);

			System.out.println(member);
		}

	}
}
