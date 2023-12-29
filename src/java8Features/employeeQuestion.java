package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class employeeQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List <Employee> emp = new ArrayList<>();
          emp.add(new Employee(1,500));
          emp.add(new Employee(1,700));
          emp.add(new Employee(1,400));
          emp.add(new Employee(1,1800));
          emp.add(new Employee(1,900));
          emp.add(new Employee(1,200));
          emp.add(new Employee(1,600));
          
     List<Employee>e= emp.stream().sorted ((o1,o2)->(int)(o2.getSalarry()-o1.getSalarry())).limit(3).collect(Collectors.toList());
     System.out.println(e);
          }

}
// skip last 3 using skip ()