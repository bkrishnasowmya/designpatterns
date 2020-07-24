package designpatterns;

import java.lang.System.Logger;

public abstract class logger {  
	    public static int OUTPUTINFO=1;  
	    public static int ERRORINFO=2;  
	    public static int DEBUGINFO=3;  
	    protected int levels;  
	    protected Logger nextLevelLogger;  
	    public void setNextLevelLogger(logger errorLogger) {  
	        this.nextLevelLogger = (Logger) errorLogger;  
	    }  
	        public void logMessage(int levels, String msg){  
	        if(this.levels<=levels){  
	            displayLogInfo(msg);  
	        }  
	        if (nextLevelLogger!=null) {  
	            ((logger) nextLevelLogger).logMessage(levels, msg);  
	        }  
	    }  
	    protected abstract void displayLogInfo(String msg);  
	}  


