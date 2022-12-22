package math;


public class Math {
    //int arr[]= {1,1,2,4};
	//arithmetic operators
	//addition
	int sum(int x,int y){
		return x+y;
	}
	//Deference
	int def(int x,int y){
		return x-y;
	}
	//product
	int multi(int x, int y) {
		return x*y;
	}
	//devision
	float dev(int x, int y) {
		return x/y;
	}
	int rem(int x, int y){
		return x%y;
	}
	public static void main(String args[]) {
		Math math = new Math();
		System.out.println(math.sum(9, 8));
		System.out.println(math.rem(9, 8));
//		math.sum(9, 8);
	}
	
}

