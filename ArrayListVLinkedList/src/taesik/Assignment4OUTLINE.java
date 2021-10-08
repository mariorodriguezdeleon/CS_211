package taesik;

import java.text.DecimalFormat;
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
			 index = rand.nextInt(howManyTests);

			 // generate a value String of length 10
			value = nextWord(10);
			 		  
		    // ADD 1) ArrayList
		     startTime = System.currentTimeMillis();
		
		        //add the value to ArrayList
			  AL.add(index, value);
		    
		     endTime = System.currentTimeMillis();
		     TimeAdd_ArrayList += endTime - startTime;  // accumulate
		    
		    // call graphic class to draw a bar
		     bar.setTimeAddAL(TimeAdd_ArrayList);
		    
		    //===============================================================

		    //ADD 2) LinkedList
		    startTime = System.currentTimeMillis();
		    
		       //add the value to LinkedList
			  LL.add(index, value);
		    
		    endTime = System.currentTimeMillis();
		    TimeAdd_LinkedList += endTime - startTime;	
		    
		  // call graphic class to draw a bar
		    bar.setTimeAddLL(TimeAdd_LinkedList);
		   }
		  
		  // Print result (Text version)
		  System.out.println("ADD: ");

		  // evaluate which one is faster
		timeChecker();

		}

	static void search(){
		
	  	int index;
	  	String value;
		   
		  for (int i=0; i<howManyTests; i++){
			  		 
			// generate a value String of length 10
			  index = rand.nextInt(howManyTests);
			  
		    // SEARCH 1) ArrayList
		    startTime = System.currentTimeMillis();	 
		    
		  	  // find index
			 value = AL.get(index);
		    
		    endTime = System.currentTimeMillis();		    
		    TimeSearch_ArrayList += endTime - startTime;
		    
		    // call graphic class to draw a bar
		    bar.setTimeSearchAL(TimeSearch_ArrayList);
		    
		    
		    // SEARCH 2) LinkedList
		    startTime = System.currentTimeMillis();
		    
		     // find index
			  String strLL = LL.get(index);
		    
		    endTime = System.currentTimeMillis();
		    TimeSearch_LinkedList += endTime - startTime;
		    
		 // call graphic class to draw a bar
		    bar.setTimeSearchLL(TimeSearch_LinkedList);
		   }
		  
		  // Print result (Text version)
		System.out.println("SEARCH: ");
		  
		  // evaluate which one is faster
		timeChecker();
    
		}

	static void remove(){
		
		 int index;
		 String value;

		  for (int i=0; i<howManyTests; i++){
			  
			// generate a value String of length 10;
			  value = nextWord(10);
			  
		    // REMOVE 1) ArrayList 
		    startTime = System.currentTimeMillis();  

		      // remove the value
			  AL.remove(value);
	     
		    endTime = System.currentTimeMillis();
		    TimeRemove_ArrayList += endTime - startTime; 
		    
		    // call graphic class to draw a bar
		    bar.setTimeRemoveAL(TimeRemove_ArrayList);    
		    
		    // REMOVE 2) LinkedList 
		    startTime = System.currentTimeMillis();
		    
		      // remove the value
			  LL.remove(value);
		    
		    endTime = System.currentTimeMillis();
		    
		    TimeRemove_LinkedList += endTime - startTime;
		    
		    // call graphic class to draw a bar
		    bar.setTimeRemoveLL(TimeRemove_LinkedList);
		   }
		   
		  // Print result (Text version)
		System.out.println("REMOVE: ");
		  
		  // evaluate which one is faster
		timeChecker();
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

	public static void timeChecker() {

		String formatter = "##,###,###.##";
		DecimalFormat df = new DecimalFormat(formatter);
		double speed = 0.0;

		System.out.println("ArrayList: "+TimeAdd_ArrayList/1000.0 + " Sec");
		System.out.println("LinkedList: "+TimeAdd_LinkedList/1000.0+ " Sec");

		if (TimeAdd_ArrayList < TimeAdd_LinkedList) {
			speed = TimeAdd_LinkedList/TimeAdd_ArrayList;
			System.out.println("ArrayList is " + df.format(speed) + " times faster than LinkedList");
		} else {
			speed = TimeAdd_ArrayList/TimeAdd_LinkedList;
			System.out.println("LinkedList is " + df.format(speed) + " times faster than ArrayList");
		}
		System.out.println();
	}
	
	//main method calling methods, and creating GUI as well as bars on GUI
	public static void main(String[] args) {
	
		bar = new Bar211("Mario Rodriguez", howManyTests);

		for (int i = 0; i < howManyTests; i++) {
			AL.add("null");
			LL.add("null");
		}

		add();
		search();
		remove();
	
	 }
}
