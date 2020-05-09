package pi;
import java.util.*;
public class willis {

	public static void main(String[] args) {
		double pi=1, even=2.0, odd=1.0;
		int i=1;
		
		while(i<1000000){
			pi*=even/odd;
			if(i%2==0) even+=2.0;
			else if(i%2==1) odd+=2.0;	
			
			i++;	
		}
		System.out.println(2.0*pi);
	}
}
