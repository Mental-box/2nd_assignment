package profile;
import java.util.Scanner;

public class asmt_2nd {
	public static void main(String args[]){
		String s1,s2,s3="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Give me a sentence: ");
		s1=sc.nextLine();
//		System.out.flush();
		
		System.out.print("Give me characters to delete: ");
		s2=sc.nextLine();
		sc.close();
	
		s3=s1;
		for(int i=0;i<s2.length();i++){
			s3=s3.replace(""+s2.charAt(i),"");
		}
		System.out.println("Original sentence: "+s1);
		System.out.println("Modified sentence: "+s3);
	}

}
