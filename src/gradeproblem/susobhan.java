package gradeproblem;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int muloffive=0;int grade =0;
		int arr[] = new int[n];
		
		int finald[] = new int[n];
		
		
		
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			grade = arr[i];
			if(grade<38) {
				finald[i] = grade;
			}
			
			else {
				muloffive=(int)Math.ceil(grade/5.0)*5;
			}
			
			
			if(grade>=38) {
			
			if((muloffive-grade)<3) {
				finald[i]= muloffive;
			}else if ((muloffive-grade)>=3) {
				finald[i]= grade;
			}
			}
			
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(finald[i]);
		}
		
		
		
		
		
	}
	
	

}
