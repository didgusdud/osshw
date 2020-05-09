package pi;

public class oiler {

	public static void main(String[] args) {
		double pi=0, tmp=1.0;
		int i=1;
		
		while(i<10000000){
			pi+=1.0/(tmp*tmp);
			tmp+=1.0;
			
			i++;	
		}
		System.out.println(Math.sqrt(6*pi));
	}
}
