import java.util.Scanner;

public class Problem17 {

	public static void main(String[] args) {
		//S. KANAPATHY
		int arr []= {1,2,3,4,5,8,3,5,1,1,2,3,4,5,7,8,1,2,3,4,6,6,6,5,1,7};
		Scanner sc = new Scanner(System.in);
		String ss = sc.nextLine();
		int num=0;
		char ssarr [] = ss.toCharArray();
		for(int i=0;i<ssarr.length;i++) {
			if(ssarr[i]!=' ' && ssarr[i]!='.') {
				num+=arr[ssarr[i]-65];
			}
		}
		if(num%9!=0)
		System.out.println(num%9);
		else 
			System.out.println(0);
	}

}
