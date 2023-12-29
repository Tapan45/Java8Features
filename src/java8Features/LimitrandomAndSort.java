package java8Features;

import java.util.Random;

public class LimitrandomAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random no = new Random();
           no.ints(0,1000).limit(5).sorted().forEach(System.out::println);
	}

}
// to generate unique values to create distinct () before limt()