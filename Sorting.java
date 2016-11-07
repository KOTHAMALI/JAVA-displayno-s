package assignment3;

import java.sql.Date;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Sorting {
	
	public static void Integer(){ // storing and sorting the integer values
		
		Scanner S = new Scanner(System.in);
		System.out.println("enter size(N) of input :");
		int N = S.nextInt();
		System.out.println("enter input values");
		
		Vector<Integer> K = new Vector<Integer>(N);
		
		for(int i=1;i<=N;i++)
		{
			int m = S.nextInt();
			K.addElement(m);
		}
		System.out.println("the original values are :" +K);
		
				Integer[]kp = new Integer[N];
				K.toArray(kp);
				Arrays.sort(kp);
				System.out.println("sorted values are :");
				for(int i=0;i<kp.length;i++){
					System.out.print(kp[i] + ",");
				}
				S.close();
	}
	public static void String(){ // storing and sorting the String values
		Scanner S = new Scanner(System.in);
		System.out.println("enter input size :");
		int N = S.nextInt();
		System.out.println("enter input values");
		
		Vector<String> K = new Vector<String>(N); // storing the user entered values
		
		for(int i=1;i<=N;i++)
		{
			String m = S.nextLine();
			K.addElement(m);
		}
		System.out.println("the original values are :" +K);
		
				String[]kp = new String[N];
				K.toArray(kp);
				Arrays.sort(kp); // sorting of the stored values
				System.out.println("sorted values are :");
				for(int i=0;i<kp.length;i++){
					System.out.print(kp[i] + ",");
				}
		S.close();
	}
	public static void Double(){  // Storing and sorting the double values
		Scanner S = new Scanner(System.in);
		System.out.println("enter input size :");
		int N = S.nextInt();
		System.out.println("enter input values");
		
		Vector<Double> K = new Vector<Double>(N);
		
		for(int i=1;i<=N;i++)
		{
			Double m = S.nextDouble();
			K.addElement(m);
		}
		System.out.println("the original values are :" +K);
		
				Double[]kp = new Double[N];
				K.toArray(kp);
				Arrays.sort(kp);
				System.out.println("The sorted values are :");
				for(int i=0;i<kp.length;i++){
					System.out.print(kp[i] + ",");
				}
		S.close();
	}
public static void date(){ // Storing and sorting the date 
	Scanner S = new Scanner(System.in);
	System.out.println("enter input size :");
	int N = S.nextInt();
	System.out.println("enter input values");
	
	Vector<Date> K = new Vector<Date>(N);
	
//	System.out.println(SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy"));
	for(int i=1;i<=N;i++)
	{
		String m = S.next();
		//K.addElement(m);
		

	}
	System.out.println("the original values are :" +K);
	
			Date[]kp = new Date[N];
			K.toArray(kp);
			Arrays.sort(kp);
			System.out.println("sorted values are :");
			for(int i=0;i<kp.length;i++){
				System.out.print(kp[i] + ",");
			}
	
S.close();
}
	
public static void main(String[] args) { 
	System.out.println("enter a value to choose "+ "\n 1.Integer"+ "\n 2.String"+ "\n 3.Double"+ "\n 4.Date");
	Scanner S = new Scanner(System.in);
	int num = S.nextInt();
	switch(num){         // selection of appropriate data type
	case 1:
		   Integer();
		   break;
	case 2 :
		    String();
		    break;
	case 3:
		    Double();
		    break;
	case 4:
		    date();
		    break;
	}
	S.close();
	
}
}
