import java.util.Scanner;

public class Problem19 {
	
	public static void main(String[] args) {
		
		//Prime Fraction
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				for(int i=2;i<=n;) {
					if(n%i==0 && isPrime(i)) {
						System.out.println(i);
						n/=i;
					}
					else
						i++;
				}
				
			}
			public static boolean isPrime(int n) {
				for(int i=2;i<n;i++) {
					if(n%i==0)
						return false;
					
				}
				return true;
	}

}
