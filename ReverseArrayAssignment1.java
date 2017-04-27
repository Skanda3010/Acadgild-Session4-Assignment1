import java.util.Scanner;

public class ReverseArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReferenceClass refClass = new ReferenceClass();
				
		
		
		System.out.println("Enter the number of elements in the array");
		Scanner sc = new Scanner(System.in);
		refClass.setLen(sc.nextInt());
		
		int[] arr= new int[refClass.getLen()];
				
		System.out.println("Enter the "+refClass.getLen()+" elements of the array");
		for(int i=0;i<(refClass.getLen());i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sc.close();
		refClass.setArray(arr);
		

		refClass.RevOfArray(refClass.getLen(), refClass.getArray());
	}

}
