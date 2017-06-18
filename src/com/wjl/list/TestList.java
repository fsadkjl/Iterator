package com.wjl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		//第一种: 通过普通for循环
		System.out.println("通过普通for循环");
		for(int i =0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//第二种: 通过foreach遍历
		System.out.println("通过foreach遍历");
		for (Integer integer : list) {
			System.out.println(integer);
		}
		//第三种: 通过iterator遍历
		System.out.println("通过iterator遍历");
		for (Iterator<Integer> it = list.iterator(); it.hasNext();) {
//			Integer integer = (Integer) it.next();
			System.out.println(it.next());
		}
	}
}
