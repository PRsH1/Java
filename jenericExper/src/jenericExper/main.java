package jenericExper;

import java.util.*;
public class main {
	public static void main(String[]args) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(11, 50);
		map.put(22, 60);
		map.put(33, 70);
		System.out.println(map.get(22));
		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(20);
		System.out.println(set.size());
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(10);
		list.add(20);
		System.out.println(list.size());
	}
}