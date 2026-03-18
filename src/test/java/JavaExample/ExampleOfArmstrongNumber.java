package JavaExample;

public class ExampleOfArmstrongNumber {
public static void main(String[] args) {
	int num=1553;
	int z,l=0,sum=0,d=0;
	z=num;
	
	while(z>0) {
		z=z/10;
		d++;
	}
	
	System.out.println(d);
	z=num;
	while(z>0) {
		l=z%10;
		System.out.println(l);
		sum  += (Math.pow(l, d));
		z=z/10;	
	}
	
	if(num==sum) {
		System.out.println("Number is armstrong");
	}else {
		System.out.println("Number is not armstrong");
	}
	
}
}
