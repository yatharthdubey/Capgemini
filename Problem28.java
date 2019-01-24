import java.util.Arrays;
import java.util.Scanner;

public class Problem28 {

	public static void main(String[] args) {
		// median of two arrays
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the elements in first array/string ");
		int n1=sc.nextInt();
		System.out.println("Enter the elements in second array/string");
		int n2=sc.nextInt();
		System.out.println("Enter first array/string ");
		String s1= sc.nextLine();
		 s1= sc.nextLine();
		System.out.println("Enter second array/string ");
		String s2=sc.nextLine();
		String []a1= s1.split(" ");
		String []a2= s2.split(" ");
		int [] b1 =new int[10];
		int [] b2 =new int[10];
		for(int i=0;i<a1.length;i++)
			b1[i]=Integer.parseInt(a1[i]);
		for(int i=0;i<a2.length;i++)
			b2[i]=Integer.parseInt(a2[i]);
		int []c=new int[n1+n2];
		for(int i=0;i<n1;i++) {
			c[i]=b1[i];
		}
		for(int i=n1,j=0;i<(n1+n2);i++) {
			c[i]=b2[j++];
		}
		Arrays.sort(c);
		int n=n1+n2;
		if(n%2!=0) {
			System.out.println("Median is "+ (c[(n)/2]));
		}
		else
			System.out.println("Meadian is " +((c[n/2]+c[(n+1)/2])/2));
	}
}