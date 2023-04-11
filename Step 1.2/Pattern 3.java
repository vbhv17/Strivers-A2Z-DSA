import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    public static void pattern1(int n){
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
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
