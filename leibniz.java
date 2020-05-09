package pi;
import java.util.*;

public class leibniz {

	public static void main(String[] args) {
		
		double pi,tmp,minus,i; 
		pi=0;
		tmp=1;
		minus=-1;
		i=1; 
		
		while(i<1000000){
			minus*=-1;
			pi+=(minus*1.0)/tmp;
			tmp+=2;
			i++;
		}
		
		System.out.println(4*pi);
	}
}
