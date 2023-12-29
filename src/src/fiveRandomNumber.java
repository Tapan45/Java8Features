import java.util.Random;
import java.util.Scanner;

public class fiveRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println(" enter n no ");
         int n= sc.nextInt();
         
         Random random = new Random();
         random.ints(0,100).limit(n).forEach(System.out::println);
        
	}

}
