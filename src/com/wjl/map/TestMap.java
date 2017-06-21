package com.wjl.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestMap {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "value1");
		map.put("2", "value2");
		map.put("3", "value3");
		
		// 第一种: 只能遍历value
		System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
		for (String v : map.values()) {
			System.out.println("value= " + v);
		}

		// 第二种: 普遍使用，可以取key和value
		System.out.println("通过Map.keySet遍历key和value：");
		for (String key : map.keySet()) {
			System.out.println("key= " + key + " and value= " + map.get(key));
		}

		// 第三种: 通过Iterator迭代器遍历循环Map.entrySet().iterator();
		System.out.println("通过Map.entrySet使用iterator遍历key和value：");
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, String> entry = it.next();
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		// 第种: 推荐，尤其是容量大时
		System.out.println("通过Map.entrySet遍历key和value");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
		}

		
	}
}
