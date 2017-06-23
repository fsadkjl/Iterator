package com.wjl.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		//第一种: 普通for循环
		System.out.println("普通for循环");
		for(int i=0;i<set.size();i++){
			System.out.println(set.toString());
		}
		//第二种: foreach循环
		System.out.println("foreach循环");
		for (Integer integer : set) {
			System.out.println(integer);
		}
		//第三种: iterator遍历
		System.out.println("iterator遍历");
		for(Iterator<Integer> it = set.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		//in java8
		System.out.println("in java8");
		set.forEach(n -> System.out.println(n));
		set.forEach(System.out::println);
	}
}
