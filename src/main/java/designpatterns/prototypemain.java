package designpatterns;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  

public class prototypemain {
	
	  
	     public static void main(String[] args) throws IOException {  
	          
	        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));  
	        System.out.print("Enter Student Id: ");  
	        int sid=Integer.parseInt(br.readLine());  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Student Name: ");  
	        String sname=br.readLine();  
	        System.out.print("\n");  
	          
	       
	          
	        System.out.print("Enter Student emailAddress: ");  
	        String eaddress=br.readLine();  
	        System.out.print("\n");  
	          
	        System.out.print("Enter Student Marks: ");  
	        double marks= Double.parseDouble(br.readLine());  
	        System.out.print("\n");  
	           
	        protomarksrecord e1=new protomarksrecord(sid,sname,marks,eaddress);  
	          
	        e1.showRecord();  
	        System.out.println("\n");  
	        protomarksrecord e2=(protomarksrecord) e1.get();  
	        e2.showRecord();  
	    }     
	

}
