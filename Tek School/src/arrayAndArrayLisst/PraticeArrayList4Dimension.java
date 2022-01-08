package arrayAndArrayLisst;

import java.util.Iterator;

public class PraticeArrayList4Dimension {

	public static void main(String[] args) {
		
	   int[][][][] nums= new int[2][3][5][2];
	  
	   int x=1;
	   for (int i=0; i<nums.length; i++) {
		   for (int j=0; j<nums[i].length; j++) {
		   for (int k=0; k<nums[i][j].length; k++) {
		   for (int d=0; d<nums[i][j][k].length; d++) {
			   nums[i][j][k][d]=x++;
		   System.out.print(nums[i][j][k][d]+ "\t");
	   
	   
	}System.out.println("next line");
		   }System.out.println("next table");
		   }System.out.println("next collection of table");
		   } 
	   
		}
		
		

	}


