package streamapi;

import java.util.List;

import java.util.stream.Collectors;

public class TestFlatmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(4,5,7,8,9);
		List<Integer> li1=List.of(1,3,8,6,2);
		List<Integer> li2=List.of(4,2,6,8,7);
		List<List<Integer>> list= List.of(li,li1,li2);

		System.out.println(list);
		List<Integer>list2=list.stream().flatMap(e->e.stream()).collect(Collectors.toList());
System.out.println(list2);
	}

}
