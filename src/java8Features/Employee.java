package java8Features;

public class Employee {
	private int id;
	private int salarry;
	public Employee(int id, int salarry) {
		super();
		this.id = id;
		this.salarry = salarry;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalarry() {
		return salarry;
	}
	public void setSalarry(int salarry) {
		this.salarry = salarry;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salarry=" + salarry + "]";
	}
	

}
