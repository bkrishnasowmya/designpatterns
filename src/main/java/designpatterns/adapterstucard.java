package designpatterns;
import java.io.BufferedReader;  
import java.io.InputStreamReader; 


	 
	public class adapterstucard extends adapterstudentdetails implements adapter {  
	 public void giveStudentDetails(){  
	  try{  
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	      
	   System.out.print("Enter the student name :");  
	   String stuname=br.readLine();  
	   System.out.print("\n");  
	      
	   System.out.print("Enter the student number:");  
	   long no=Long.parseLong(br.readLine());  
	   System.out.print("\n");  
	      
	   System.out.print("Enter the clgname :");  
	   String name=br.readLine();  
	      
	   setstuName(stuname);  
	   setstuNumber(no);  
	   setclgName(name);  
	   }catch(Exception e){  
	        e.printStackTrace();  
	   }  
	  }  
	  
	  public String getStudentCard() {  
	   long accno=getstuNumber();  
	   String accholdername=getstuName();  
	   String bname=getclgName();  
	          
	   return ("The Student number "+accno+" of "+accholdername+" in "+bname+ " college is valid and authenticated for issuing the Student card. ");  
	  }  
	  

}
