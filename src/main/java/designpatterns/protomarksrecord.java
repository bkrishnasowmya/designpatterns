package designpatterns;

public class protomarksrecord implements prototype{
	 
	      
		   private int id;  
		   private String name;  
		   private double marks;  
		   private String address;  
		   public protomarksrecord(){  
	            System.out.println("   Student Marks ");  
	            
	            System.out.println("Sid"+"\t"+"Sname"+"\t"+"marks"+"\t"+"Eaddress");  
	      
	}   
		  
		 public    protomarksrecord(int id, String name, double marks, String address) {  
		          
		        this();  
		        this.id = id;  
		        this.name = name;  
		         
		        this.marks = marks;  
		        this.address = address;  
		    }  
		      
		  public void showRecord(){  
		          
		        System.out.println(id+"\t"+name+"\t"+marks+"\t"+address);  
		   }  
		  
		    public prototype get() {  
		          
		        return new protomarksrecord(id,name,marks,address);  
		    }  
		
}
