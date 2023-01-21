package java_practice;

public class Condiational_operatiors {

	public static void main(String[] args) {

		int a = 10;
		int b= 20;


		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a<=b);

		int age =19;
		boolean flag = false;
		if (age >1 &&  flag ==true) {
			System.out.println("accept");
		}else {
			System.out.println("REJECT");
		}
		if (age>1 && flag ==true) {
			System.out.println("sending report to continue");
		}else {
			System.out.println("verify again");
		}


	}

}
