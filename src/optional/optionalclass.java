package optional;

import java.util.Optional;

public class optionalclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // java intoduced a new class optional in jdk8.
		// it is a public final class and used to deal with 
		// nullpointerEXCEPTION IN JAVA APPLICATION.PACKAGE JAVA.IMPORT.UTILL
        String s =null;
        Optional <String> op = Optional.ofNullable(s);
	       if (op.isPresent()) {
	    	   System.out.println("VALUE IS "+ op.get());
	    	   
	       }else {
	    	   System.out.println("value is not present");
	       }
	       
	}

}