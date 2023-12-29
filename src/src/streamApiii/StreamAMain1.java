package streamApiii;

import java.util.ArrayList;
import java.util.List;

public class StreamAMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creat a list And filter all even number
		
		List <Integer> li=List.of(2,4,6,3,35,89);//update version
		// you can use arraylist with add
		
		// with out streamApi
		
		List <Integer> listEven=new ArrayList<>();
		for (Integer i:li) {
			if (i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(listEven);
		
		
	}

}
