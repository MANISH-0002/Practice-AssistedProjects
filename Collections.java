package demo;

import java.util.*;

	public class Collections {
		    public static void main(String[] args) {
		        // ArrayList verification
		        ArrayList<String> arrayList = new ArrayList<>();
		        arrayList.add("Apple");
		        arrayList.add("Banana");
		        arrayList.add("Orange");
		        System.out.println("ArrayList: " + arrayList);

		        // HashSet verification
		        HashSet<String> hashSet = new HashSet<>();
		        hashSet.add("Red");
		        hashSet.add("Green");
		        hashSet.add("Blue");
		        System.out.println("HashSet: " + hashSet);

		        // HashMap verification
		        HashMap<Integer, String> hashMap = new HashMap<>();
		        hashMap.put(1, "One");
		        hashMap.put(2, "Two");
		        hashMap.put(3, "Three");
		        System.out.println("HashMap: " + hashMap);

		        // Accessing elements in a HashMap
		        int key = 2;
		        if (hashMap.containsKey(key)) {
		            System.out.println("Value for key " + key + ": " + hashMap.get(key));
		        } else {
		            System.out.println("Key " + key + " not found in HashMap.");
		        }
		    }
		}



