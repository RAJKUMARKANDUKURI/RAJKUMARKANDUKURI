package variables;

public class Variables {
   int        a      = 100;
   String name       = " mind q";
   boolean status    = true;
   double price      = 27363.2;
   float f           = 1121.3f;
   char k            = 'k';
   
   //global variables (class variaables/static variables)
   
   static   int                b =  300;
   static  String fullname      = "mind q systems";
   static boolean flag1         =  false;
   static double newprice       = 282828;
   static float f1              = 34292f;
   static char group            = 'b';
   
   public static void main(String[] args) {
	
	   //syntax to call global variables from out side class
	   
	   Variables krish=new Variables();
	   
	   //calling  instant variables using object creation 
	   
	   int x =krish.a;                                              System.out.println(x);
	   String fname=krish.name;                                    System.out.println(fname);
	   boolean status =krish.status;                           System.out.println(true);
	   double  newprice =krish.price;                      System.out.println(newprice);
	   System.out.println(1000+krish.f);
	   System.out.println(krish.name);
	   
	   //calling static variables using class refence
	   
	   int y =Variables.b;                                             System.out.println(y);
	   String instname=Variables.fullname;                           System.out.println(instname);                                                        System.out.println("instaname");
	   boolean flag3=Variables.flag1;                                System.out.println(flag3);
	   float f3  =Variables.f1;                                    System.out.println(f3);
	   char k =Variables.group;                                     System.out.println(k);
	   
}
   
   
   
	
	
}
