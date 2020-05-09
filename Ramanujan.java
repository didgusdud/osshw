package pi;

public class Ramanujan {

	public static void main(String[] args) {
		
		double pi;
		int tmp=1103;
		double top,bottom;
		int n=1;
		
		while(n<30){
			bottom = (Math.pow(fact(n), 4.0))*(Math.pow(396, 4.0*n));
			top = fact(4*n)*(1103+(26390*n));
			tmp+=top/bottom;
			n++;	
		}
		bottom=(Math.sqrt(8)/9801)*tmp;
		pi=1/bottom;
		
		System.out.println(pi);		
	}
		public static int fact(int n) {
			if (n <= 1) 	return n;
			else 	return fact(n-1) * n;
	}
}
