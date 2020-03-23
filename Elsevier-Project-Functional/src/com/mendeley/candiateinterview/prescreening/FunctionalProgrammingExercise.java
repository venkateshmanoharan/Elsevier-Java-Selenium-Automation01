package com.mendeley.candiateinterview.prescreening;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;


/**
 * The purpose of this exercise is to assess your problem solving ability (not your programming ability).
 * Whilst a working solution is preferred, for candidates not skilled in JAVA, we accept any other form of scripting or pseudo-code
 * to demonstrate the thought process behind the problems.
 *
 * Time guide for completion:  30 minutes
 */
public class FunctionalProgrammingExercise {
	
	
    private static final List<Integer> ORIGINAL = Arrays.asList(3,6,7,8,9,12,15,17,359);


    /**
     * Implement a solution to square each integer in the collection named ORIGINAL
     * and output to the console a comma separated list of the processed values
     *
     * @implNote  Expected output : 9,36,49,64,81,144,225,289,128881
     */
    @Test
    public void exerciseOne() {

    	int arraysize = ORIGINAL.size();
    	//System.out.println("\nFrom the exerciseOne method");
      	for (int i = 0; i < arraysize; i++) 
      	{
    	System.out.print(ORIGINAL.get(i)*ORIGINAL.get(i));
    	// The next line is for formatting with ","
    	if(i != ORIGINAL.size()-1)   	{ System.out.print(","); }
    	} // end of for loop

    } // end of method - exerciseOne()


    /**
     * Implement a solution to obtain only the numbers in the collection named ORIGINAL that are divisible by 3
     * and output to the console a comma separated list of the values
     *
     * @implNote  Expected output : 3,6,9,12,15
     */
    @Test
    public void exerciseTwo() {

    	//System.out.println("\n\nFrom the exerciseTwo method");
    	int j; // is to be assigned with the original number divided by 3 
    	double k; // is to be assigned with the original number divided by 3
    	int arraysize = ORIGINAL.size();
    	int m = 0;
    	for (int i = 0; i < arraysize ; i++) {
    	
    	j = (ORIGINAL.get(i)/3);
    	k = (ORIGINAL.get(i)/3d); // dividing the number getting the result in double by dividing using "3d" 
    	if (j == k) { 
        	// The next line is for formatting with ","    		
    		m++; if (m == 1) { } else { System.out.print(","); } // close of else
    	
    	System.out.print(ORIGINAL.get(i))	;
    	} // close of if
    	
    	    		
    	} // end of for loop

    } // end of method - exerciseTwo()



    /**
     * Implement a solution to sum the adjacent integers in the collection named ORIGINAL
     * and output to the console a comma separated list of the values
     *
     * @implNote  Expected output : 9,16,21,24,29,36,44,391
     */
    @Test
    public void exerciseThree() {

    	int a = 0;
    	int arraysize = ORIGINAL.size();
    	//System.out.println("\n\nFrom the exerciseThree method");
        for (int i = 0; i < arraysize; i++) {
      		
    	if (i == 0) { 
    		a = ORIGINAL.get(i)+ORIGINAL.get(i+1) ; 
    		System.out.print(a); 
    		}

    	else if (i == arraysize - 1) {     // this is to ignore the last number in the array as per the expected output
     	     } // end of else if

    	else {
    		a = ORIGINAL.get(i-1)+ORIGINAL.get(i)+ORIGINAL.get(i+1) ; 
  			System.out.print(",");
  			System.out.print(a);
    	   	} // end of Else

   	
    	} // end of for loop
    } // end of method - exerciseThree()

    
}  // Class's closure

