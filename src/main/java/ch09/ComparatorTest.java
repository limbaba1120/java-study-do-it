package ch09;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2) * (-1);
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>(new MyCompare());
		set.add("aa");
		set.add("bb");
		set.add("cc");

		System.out.println(set);
	}
}

class Str {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
	}
}
