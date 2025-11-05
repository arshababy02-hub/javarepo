package thiskeyword;

public class ThisConstructors {

	public static void main(String[] args) {
		
		ThisConstructors obj=new ThisConstructors();
		}
	
	public ThisConstructors(){
		this(10);//this keyword must be declared in first line in constructors
		System.out.println("first constructors");
	}
	public ThisConstructors(int a) {
		System.out.println(a);
	
	}
}
