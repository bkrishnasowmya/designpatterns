package designpatterns;

public class adpatermain {
	 
		 public static void main(String args[]){  
		  adapter targetInterface=new adapterstucard();  
		  targetInterface.giveStudentDetails();  
		  System.out.print(targetInterface.getStudentCard());  
		 }   
	 

}
