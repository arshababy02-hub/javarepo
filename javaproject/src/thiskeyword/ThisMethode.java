package thiskeyword;

public class ThisMethode {

	public static void main(String[] args) {
		
		ThisMethode obj= new ThisMethode();
		obj.display();
	}
public void display() {
	System.out.println("welcome");
	this.sum(1);
}
public void sum(int a) {
	System.out.println(a);
}
}
