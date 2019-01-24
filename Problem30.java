
public class Problem30 {

	public static void main(String[] args) {
		//shortest array
		int [][]a= {{1,2,3,4},{0,2,7},{4,12},{1,2,5,6}};
		int min=a[0].length;
		int index=0;;
		for(int i=0;i<a.length;i++) {
			if(min>a[i].length) {
				min=a[i].length;
				index=i;
			}
		}
		System.out.print("Shortest Array: { ");
		for(int i=0;i<a[index].length;i++) {
			System.out.print(a[index][i]+" ");
		}
		System.out.println("}");
		System.out.println("Length: "+min);
	}

}
