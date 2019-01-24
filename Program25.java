import java.util.Scanner;

public class Program25 {

	public static void main(String[] args) {
		// substring
		String output="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String ss = sc.nextLine();
		System.out.println("Enter substring length");
		int n = sc.nextInt();
		for(int i=0;i<=ss.length()-n;i++) {
			String m ="";
			int flag=0;
			m = ss.substring(i, i+n);
			String yo[] = output.split(" ");
			for(int j=0;j<yo.length;j++) {
				if(m.equals(yo[j])){
					flag=1;
				}
			}
			if(flag==0) {
				output += m+" ";
			}
			
		}
		System.out.println(output);
		
	}
		

}
