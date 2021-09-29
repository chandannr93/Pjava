package practice_Collections;

import java.util.HashMap;

public class Collections_02 {
public static void main(String[] args) {
	HashMap map = new HashMap();
	map.put(10, 100);
	map.put(20, 200);
	map.put(30, 300);
	map.put(40,  200);
	map.put(10, 243);// for the key 10, new value 243 will be updated in place of 100.
	map.put(10, 100);//
	map.put(null, 343);
	map.put(23, null);
	map.put("abc", null);
	//System.out.println("I can add n number of Null values");
	//System.out.println("I can add hetterogenous keys in hashmap");
	//System.out.println("");
	System.out.println(map);
//not maintaining the order of insertion	
}
}
