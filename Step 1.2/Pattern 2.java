import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void pattern1(int n){
        
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
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
