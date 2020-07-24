package designpatterns;



public class consolebasedlogger extends logger {  
	    public consolebasedlogger(int levels) {  
	        this.levels=levels;  
	    }  
	     
	    protected void displayLogInfo(String msg) {  
	        System.out.println("CONSOLE LOGGER INFO: "+msg);  
	    }  
	}  


