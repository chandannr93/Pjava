package practice_Collections;


import java.util.TreeMap;

public class Collections_03 {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		map.put(10, 100);
		map.put(20, 200);
		map.put(40, 300);
		map.put(30, 200);
		//map.put("fruit", "mango");//CCE 
		map.put(120, "Mango");
		//map.put(null, "hi");//NullPointerException
		map.put(400, null);
		System.out.println(map);
	// keys should be homogenous and values can be either homogenous or heterogenous.

	}

}
