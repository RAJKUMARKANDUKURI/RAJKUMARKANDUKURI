
package scs;

public class Robot {
	
	static int speed =300;
	String   name = "chitti";
			
		void method1() {
		System.out.println(speed);
		System.out.println(name);
	}
		static void m2() {
			System.out.println(speed);
			System.out.println(new Robot().name);
		}
		public static void main(String[] args) {
			Robot kk = new Robot();
			int k=kk.speed;      System.out.println(90909);
			String fname=kk.name;   System.out.println("jhhjhj");
		new Robot().m2();
		}

}
