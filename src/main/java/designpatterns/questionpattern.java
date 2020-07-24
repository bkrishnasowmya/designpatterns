package designpatterns;


	public class questionpattern extends questionmanager {  
	    public questionpattern(String catalog){  
	        super(catalog);  
	    }  
	    public void displayAll() {  
	        System.out.println("\n---------------------------------------------------------");  
	        super.displayAll();  
	        System.out.println("-----------------------------------------------------------");  
	    }  
	

}
