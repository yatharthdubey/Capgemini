import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		String given="abcdefghijklmnopqrstuvwxyz";
		Scanner sc = new Scanner(System.in);
		char []ss = sc.nextLine().toLowerCase().toCharArray();
		int [] arr= new int[26];
		for(int i=0;i<ss.length;i++) {
			arr[ss[i]-97]+=1;
			
		}
		System.out.print("Missing character are:");
		for(int i=0;i<26;i++) {
			if(arr[i]==0) {
				System.out.print((char)(i+97)+" ");
			}
		}
		
	}

}
