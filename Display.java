package disp;
	import java.util.Scanner;
	 
	public class Display
	{
	    public static void Numbers(){
	    	
	        Scanner sc = new Scanner(System.in);
	         
	        System.out.println("enter a value for N:");
	         
	        int N = sc.nextInt();
	        
	        System.out.println(" "+ " "+ " 1");
	      
	         
	        for (int i = 2; i <= N; i++) // printing the rows of a given N
	        {
	            for (int j = 1; j <= i; j++) // printing the columns based on a given value
	            { 
	                System.out.print(j+" ");
	                
	            } 
	 
	            for(int k =i;k>=1;k--)
	            {
	            	System.out.print( k + " ");
	            }     
	           
	            System.out.println(" "); 
	        } 
	        for (int i = N; i >= 2; i--)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(j+" ");
	            }
	           
	             for(int l = i;l>=1;l--){
	            	 System.out.print(l + " ");
	             }
	            System.out.println();
	              
	     
	        }
	        System.out.println(" " + " "+" 1");
	       
	       sc.close();  
	  
	    }
	    public static void main(String[] args) {
			Numbers();
		}
	    }
	
