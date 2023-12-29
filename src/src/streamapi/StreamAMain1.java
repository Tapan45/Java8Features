package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creat a list And filter all even number
		
		//List <Integer> li=List.of(2,4,6,3,35,89);//update version
		// you can use arraylist with add
		List <Integer>li=new ArrayList<>();
		li.add(5);
		li.add(4);
		li.add(7);
		li.add(3);
		li.add(6);
		// with out streamApi
		
		List <Integer> listEven=new ArrayList<>();
		for (Integer i:li) {
			if (i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(listEven);
		// using Stream Api
	Stream<Integer>stream	=li.stream();
	List <Integer>newList	=stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
	}

}
