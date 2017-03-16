package calculator;

public class A {
	public static int f(int a, int b, int c){
		int s = a+b+c;
		a+=2;
		c--;
		return s;
	}
	
	public static void main (String[] a){
		int x=5, y=2, z=1;
		int w=f(x,y,z);
		double q= f(x,y,z);
		
		System.out.println(q + w + " " + (x-z));
	}

}
