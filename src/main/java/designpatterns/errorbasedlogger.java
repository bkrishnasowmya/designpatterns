package designpatterns;


	public class errorbasedlogger extends logger {  
	    public errorbasedlogger(int levels) {  
	        this.levels=levels;  
	    }  
	    @Override  
	    protected void displayLogInfo(String msg) {  
	        System.out.println("ERROR LOGGER INFO: "+msg);  
	    }  
	  

}
