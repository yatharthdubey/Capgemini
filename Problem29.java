import java.util.Scanner;

public class Problem29 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		int arr[]= new int[26];
		char ssarr[] = ss.toCharArray();
		for(int i=0;i<ssarr.length;i++) {
			arr[ssarr[i]-97]+=1;
		}

		for(int i=0;i<26;i++) {
			System.out.println((char)(i+97)+"="+arr[i]);
		}
		
	}
}