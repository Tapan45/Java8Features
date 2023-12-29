package java8Features;
class washerman{
	public void wash (Object obj) {
		if (obj instanceof washable) {
			System.out.println("use water to wash");
		}else {
			System.out.println("this machine is not washable type");
		}
	}
}
class bike implements washable{
	
}
class car implements washable{
	
}
class lorry implements washable{
	
}
class tv{
	
}
class washingmachine{
	
}
interface washable{
	
}
public class MarkerInterfac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//washerman wash = new washerman ();
		washerman washerman = new washerman();
		washerman.wash(new car());
		washerman.wash(new tv());
			}

}
