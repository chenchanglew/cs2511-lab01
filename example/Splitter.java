package example;

import java.util.Scanner;

public class Splitter {

	public static void main(String[] args){
        System.out.println("Enter a sentence specified by spaces only: ");
        // Add your code
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] ans= s.split(" ");
        for(int i=0;i<ans.length;i++) {
        	System.out.println(ans[i]);
        }
        sc.close();
    }
}
