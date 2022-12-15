package variables2;

public class Variables2 {
	
	int    k = 12;
	String name  = "Roja";
	boolean  status  = true;
	double  salary  = 293939;
	
	
	public void method1()
	{
		System.out.println(k);
		System.out.println(name);
		System.out.println(status);
		System.out.println(salary);
	}
		public static void method2 ()
		{
		int    n  =  200;
		String  name =  " radha";
		
		System.out.println(new Variables2().salary);
	     }
		public static void main(String[] args) {
			Variables2  kvk=new Variables2();
			
			int b =kvk.k;                               System.out.println(999);
			String bb  = kvk.name;                       System.out.println("Krish");
			boolean j  =kvk.status;                      System.out.println(2829);
			
			//calling local variables with class name
			
			kvk.method2();System.out.println(kvk);
			
			
					}
		}
	
