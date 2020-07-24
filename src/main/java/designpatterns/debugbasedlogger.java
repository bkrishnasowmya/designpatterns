package designpatterns;


	public class debugbasedlogger extends logger {  
	    public debugbasedlogger(int levels) {  
	        this.levels=levels;  
	    }  
	    @Override  
	    protected void displayLogInfo(String msg) {  
	        System.out.println("DEBUG LOGGER INFO: "+msg);  
	    }  
	 

}
