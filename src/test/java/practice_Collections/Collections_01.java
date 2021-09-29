package practice_Collections;


import java.util.TreeSet;

public class Collections_01 {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(100);
		set.add(20);
		set.add(30);
		//set.add('g');//ClassCastException - since we are trying to store homogenous data.
		set.add(5);
		//set.add(null);//NullPointerException - since TressSet doesn't accept null.
		System.out.println(set.descendingSet());
		System.out.println(set);// prints elements in sorted order and doesnot maintains insertion order.
		
		

	}

}
