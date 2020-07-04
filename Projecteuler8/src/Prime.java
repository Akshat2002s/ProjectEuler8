import java.util.*;
public class Prime {
	static boolean factor(int i) {
		for(int j=2; j<i; j++) {
			if (i%j==0)
					return false ;
				
			}return true;
	}

	public static void main(String[] args) {
		int a=999999999;
		int count=0;
		int prime=0;
		for( int k=2; k<a; k++) {
			boolean b= factor(k);
		
			if(b==true) {
				count++;
				prime=k;
		
			if (count==10001) {
				System.out.println(prime);
				break;
			}
		}
		

	}

}
}
