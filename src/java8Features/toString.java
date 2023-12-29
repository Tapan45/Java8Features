package java8Features;
class circle {
	int radius ;
	circle (int r){
	radius =r;
}
@Override
public String toString() {
	return "circle [radius=" +radius +"]";
}

}
public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        circle c1= new circle (50);
        System.out.println( c1.toString());
	}

}
