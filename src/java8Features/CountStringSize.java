package java8Features;

import java.util.Arrays;
import java.util.List;

public class CountStringSize {

	public static void main(String[] args) {
		List<String>li = Arrays.asList(" tapan","gudu","sitaram","sagar","dipika");
        long tp=li.stream().filter(e->e.length()>4).count();
        System.out.println(tp);
	}

}
