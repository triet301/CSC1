package proj4;

import java.util.*;

import java.io.*;

/*/*********************************************************************************************
 * This is a program that prints an ascii histogram of the values of the 'distribution[]' array *
 *   to standard output.                                                                       *
 *                                                                                             *
 ***********************************************************************************************/    

public class PrintGeigerDistribution {
	
	public static int[] distribution = {0,1,8,59,215,703,1848,3975,8077,13937,22195,31628,
			                       41711,51099,57142,59959,59670,55756,48850,40931,32583,
			                       24995,18217,12794,8623,5577,3601,2272,1259,764,464,246,
			                       153,80,39,22,12,6,3,0};
	
	public static final int MAX_COUNTS = distribution.length;
	
	public static String stringMultiply(String s, int n){  
		// a method that can print multiple string at once.
	    StringBuilder addString = new StringBuilder();
	    for(int i = 0; i < n; i++){
	    	addString.append(s);
	    }return addString.toString();
	}
	
	public static void main(String[] args){
		//main method
		System.out.print("0");
		for (int x_axis = 0; x_axis < 7; x_axis++ ) {
			//creating x-axis
			if (x_axis != 0 ) {
				System.out.print( "                " +x_axis * 10000 );
			}}
	System.out.print("\n");
		for (int x = 0; x < 60; x++) {
			if(x == 0) {
				System.out.print("   _");
			}else{
			    System.out.print(" _");
    }}
    for (int y = 0; y < distribution.length; y++ ) {
    	 // creating y-axis
		    int number = distribution[y] / 1000;
			if(y == 0) {
				System.out.print( "\n" + "  |*" + "\n" );
			}else {
			    if (y == 5) {
			    System.out.print(y + " |" +  stringMultiply("* ", 1) + "\n" );
				}else if(y % 5 == 0 && y != 0) {
					if (number == 0) {
			    System.out.print(y+"|"+stringMultiply("* ", 1) + "\n");
					}else {
				System.out.print(y + "|"+stringMultiply("* ", number) + "\n");
					}
				}else if (number == 0) {
				System.out.print("  |"+stringMultiply("* ", 1) + "\n");
				}else {
				System.out.println("  |"+ stringMultiply("* ", number));
				}
			}}}
}

