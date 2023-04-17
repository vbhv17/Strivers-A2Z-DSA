

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    public static void pattern1(int n){
        
        for(int i=1;i<=n;i++){                     //n rows
            for(int j=n;j>=i;j--){                // OR j=1; j<=(n-i+1) ; j++
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
