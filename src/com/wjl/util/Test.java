package com.wjl.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		//1:
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//2:
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//3:
		for(Iterator<Integer> it = list.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		//4:
		List<String> list2 = Arrays.asList("a","c","b","d");
		list2.forEach(n->System.out.println(n));
		list2.forEach(System.out::println);
	}
	
	
//	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<>();
//		set.add(1);
//		set.add(2);
//		set.add(3);
//		set.add(4);
//		System.out.println(set);
//		//1:
//		for(int i = 0;i<set.size();i++){
//			System.out.println(set);
//		}
//		//2:
//		for(Integer integer : set){
//			System.out.println(integer);
//		}
//		//3:
//		for(Iterator<Integer> it = set.iterator();it.hasNext();){
//			System.out.println(it.next());
//		}
//		//4:
//		set.forEach(n->System.out.println(n));
//		set.forEach(System.out::println);
//	}
	
	
//	public static void main(String[] args) {
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "value1");
//		map.put(2, "value2");
//		map.put(3, "value3");
//		System.out.println("map:"+map);
//		//1:
//		for(String string : map.values()){
//			System.out.println(string);
//		}
//		//2:
//		for(Integer string : map.keySet()){
//			System.out.println("key:"+string+"value:"+map.get(string));
//		}
//		//3:
//		for(Entry<Integer, String> entry : map.entrySet()){
//			System.out.println("key:"+entry.getKey()+"value:"+entry.getValue());
//		}
//		//4:
//		map.forEach((k,v)->System.out.print(k+","+v));
//	}
}
