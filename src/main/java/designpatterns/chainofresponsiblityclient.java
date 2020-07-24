package designpatterns;

import java.lang.System.Logger;

public class chainofresponsiblityclient {
	
	    private static logger doChaining(){  
	          logger consoleLogger = new consolebasedlogger(logger.OUTPUTINFO);  
	            
	          logger errorLogger = new errorbasedlogger(logger.ERRORINFO);  
	          consoleLogger.setNextLevelLogger(errorLogger);  
	            
	          logger debugLogger = new debugbasedlogger(logger.DEBUGINFO);  
	          errorLogger.setNextLevelLogger(debugLogger);  
	            
	          return consoleLogger;   
	          }  
	          public static void main(String args[]){  
	          logger chainLogger= doChaining();  
	  
	              chainLogger.logMessage(logger.OUTPUTINFO, "Enter the sequence of values ");  
	              chainLogger.logMessage(logger.ERRORINFO, "An error is occured now");  
	              chainLogger.logMessage(logger.DEBUGINFO, "This was the error now debugging is compeled");  
	              }  
	}  


