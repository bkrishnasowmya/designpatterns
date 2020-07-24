package designpatterns;

public class singleton {
	static int a;
	private static singleton obj=new singleton(10);//Early, instance will be created at load time  
	 private singleton(int a){this.a=a;}  
	   
	 public static int getA(){  
	  return a;  
	 }  
	  
	 public void display(){  
		 System.out.println("singleton");
	 //write your code  
	 }  
	 public static void main(String[] args) {
		 obj.display();
		 System.out.println(obj.getA());
	 }
}
