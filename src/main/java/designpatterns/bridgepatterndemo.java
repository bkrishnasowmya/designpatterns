package designpatterns;

public class bridgepatterndemo {
	 
	    public static void main(String[] args) {  
	    questionpattern questions = new  questionpattern("Java Programming Language");  
	    questions.q = new javaquestions();  
	        questions.delete("what is class?");  
	        questions.display();  
	    questions.newOne("What is inheritance? ");  
	      
	    questions.newOne("How many types of inheritance are there in java?");  
	    questions.displayAll();  
	    }  
	  

}
