package com.atosSyntel.Java8Samples;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Java8ForEachMap_02 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("USA", "Washington");
		map.put("Australia", "Canberra");
		map.put("Canada", "Ottawa");
		map.put("Belgium", "Brussells");

		//1. Map entries
		System.out.println("------- Map Entries---------");
		Consumer<Map.Entry<String, String>> action = System.out::println;
		map.entrySet().forEach(action);

		//2. Map keys
		System.out.println("------- Map Key Entries---------");
		Consumer<String> actionOnKeys = System.out::println;
		map.keySet().forEach(actionOnKeys);

		//3. Map values
		System.out.println("------- Map Value Entries---------");
		Consumer<String> actionOnValues = System.out::println;
		map.values().forEach(actionOnValues);
	}

}
