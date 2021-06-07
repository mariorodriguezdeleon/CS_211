package taesik;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Assignment4OUTLINE {
	
	static taesik.Bar211 bar;
	
	static int howManyTests=18000; //Change this number if it takes too long or too short.
	
	static ArrayList<String> AL = new ArrayList<>();
	static LinkedList<String> LL = new LinkedList<>(); 
	
	static double TimeAdd_ArrayList;   // in milisecond
	static double TimeAdd_LinkedList;
	
	static double TimeSearch_ArrayList;   
	static double TimeSearch_LinkedList;
	
	static double TimeRemove_ArrayList;   
	static double TimeRemove_LinkedList; 

	static double startTime, endTime, totalTime;
	static Random rand = new Random();
	
	
	static void add(){
		
		  int index;
		  String value;	
		  
		  for (int i=0; i<howManyTests; i++){
			  
			 // generate an index within ArrayList size		 
			 // generate a value String of length 10
			 		  
		    // ADD 1) ArrayList
		     startTime = System.currentTimeMillis();
		
		        //add the value to ArrayList
		    
		     endTime = System.currentTimeMillis();
		     TimeAdd_ArrayList += endTime - startTime;  // accumulate
		    
		    // call graphic class to draw a bar
		     bar.setTimeAddAL(TimeAdd_ArrayList);
		    
		    
		    //ADD 2) LinkedList
		    startTime = System.currentTimeMillis();
		    
		       //add the value to LinkedList
		    
		    endTime = System.currentTimeMillis();
		    TimeAdd_LinkedList += endTime - startTime;	
		    
		  // call graphic class to draw a bar
		    bar.setTimeAddLL(TimeAdd_LinkedList);
		   }
		  
		  // Print result (Text version)
		  System.out.println("ADD: "); 
		  System.out.println("ArrayList: "+TimeAdd_ArrayList/1000.0 + " Sec");
		  System.out.println("LinkedList: "+TimeAdd_LinkedList/1000.0+ " Sec");

		  // evaluate which one is faster	  
		}

	
	static void search(){
		
		  int index;
		  String value;
		   
		  for (int i=0; i<howManyTests; i++){
			  		 
			// generate a value String of length 10
			  
		    // SEARCH 1) ArrayList
		    startTime = System.currentTimeMillis();	 
		    
		  	  // find index	    
		    
		    endTime = System.currentTimeMillis();		    
		    TimeSearch_ArrayList += endTime - startTime;
		    
		    // call graphic class to draw a bar
		    bar.setTimeSearchAL(TimeSearch_ArrayList);
		    
		    
		    // SEARCH 2) LinkedList
		    startTime = System.currentTimeMillis();
		    
		     // find index
		    
		    endTime = System.currentTimeMillis();
		    TimeSearch_LinkedList += endTime - startTime;
		    
		 // call graphic class to draw a bar
		    bar.setTimeSearchLL(TimeSearch_LinkedList);
		   }
		  
		  // Print result (Text version)
		  
		  // evaluate which one is faster
    
		}

		
	static void remove(){
		
		 int index;
		 String value;
		   
		  for (int i=0; i<howManyTests; i++){
			  
			// generate a value String of length 10;
			  
		    // REMOVE 1) ArrayList 
		    startTime = System.currentTimeMillis();  

		      // remove the value 
	     
		    endTime = System.currentTimeMillis();
		    TimeRemove_ArrayList += endTime - startTime; 
		    
		    // call graphic class to draw a bar
		    bar.setTimeRemoveAL(TimeRemove_ArrayList);    
		    
		    // REMOVE 2) LinkedList 
		    startTime = System.currentTimeMillis();
		    
		      // remove the value 
		    
		    endTime = System.currentTimeMillis();
		    
		    TimeRemove_LinkedList += endTime - startTime;
		    
		    // call graphic class to draw a bar
		    bar.setTimeRemoveLL(TimeRemove_LinkedList);
		   }
		   
		  // Print result (Text version)
		  
		  // evaluate which one is faster
		}
		
		
	public static String nextWord(int length) {
	  String s="";
	  for (int i=1;i<=length;i++) {
		 int r=rand.nextInt('Z'-'A'+ 1) + 'A';
		 char c= (char) r;
		s+=c;
	  }
	  return s;
	}
	
	//main method calling methods, and creating GUI as well as bars on GUI
	public static void main(String[] args) {
	
		bar = new Bar211("Mario Rodriguez", howManyTests);  // if your first name is "your" and your last name is "name", use this statement as is.
		                                              // Otherwise, change it to your real name.
		add();
		search();
		remove();
	
	 }
}
