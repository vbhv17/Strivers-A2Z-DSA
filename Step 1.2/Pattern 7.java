    *    
   ***   
  *****  
 ******* 
*********

//by observing the pattern we can see that n = no of rows, no of columns will always be n*2-1
//for each column we have to print space star and then space again
// if n = 5
// for i = 0 [4 1 4]
// for i = 1 [3 3 3]
// for i = 2 [2 5 2]
// for i = 3 [1 7 1]
// for i = 4 [0 9 0]

// space n-i-1
// star i*2+1
// space n-i-1
  
//Code
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
    
    public static void pattern1(int n){
        
        //print space
        for(int i=0;i<n;i++){
            
            //space
            for(int j=0 ; j<(n-i-1); j++){
                System.out.print(" ");
            }
            
            //star
            for(int j=0; j<((i*2)+1); j++){
                System.out.print("*");

            }
            
            //space
            for(int j=0; j<(n-i-1); j++){
                System.out.print(" ");

            }
            System.out.println();
        }
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		    int n;
		    Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();
		    pattern1(n);
	}
}
