package example;

import java.util.Scanner;

/**
 *
 * @author Aarthi
 * Class Average
 */
public class Average {

	    /*
	     * Returns the average of an array of numbers
	     * @param the arrary of integer numbers
	     * @return the average of the numbers
	     */
		public float average(int[] nums) {
	        float result = 0;
	        // Add your code
	        for(int i=0;i<nums.length;i++) {
	        	result+=nums[i];
	        }
	        result=result/nums.length;
	        return result;
	    }

	    public static void main(String[] args) {
	    	// Add your code
	    	Scanner sc = new Scanner (System.in);
	    	
	    	int[] nums2= new int[5];
	    	int i=0;
	    	while (sc.hasNextInt()) {
	    		int s = sc.nextInt();
	    		nums2[i]= s;
	    		i++;
	    		if (i==5) {break;}
	    	}
	    	Average ave = new Average();
	    
	    	System.out.println(ave.average(nums2));
	    }
}
