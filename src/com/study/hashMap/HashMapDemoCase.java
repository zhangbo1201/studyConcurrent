package com.study.hashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * hashmap学习
 * @author Demon
 *
 */
public class HashMapDemoCase {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.hashCode();
		map.put("1", "1");
		System.out.println("jack".hashCode());
	}
}
