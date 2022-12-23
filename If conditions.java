package math;

public class Compare2 {
	int low(int a,int b,int c) {
		int l =0;

		if (a <b && b > c) {
			l=a;
		}
		else if (b<c) {
			l=c;
		}else {
			l=c;
		}
		return l;}
	
	public static void main(String[] args) {
		Compare2 kk = new Compare2();	
		System.out.println(kk.low(100, 60, 50));
	}
}
