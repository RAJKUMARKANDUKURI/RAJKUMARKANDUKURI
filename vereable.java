package scs;

public class Vichle {
	
	
	    String brand;
	    int no_tyres;
	    String color;
	    int speed;

	    public Vichle(String brand, int no_tyres, String color, int speed) {
			this.brand = brand;
			this.no_tyres = no_tyres;
			this.color = color;
			this.speed = speed;
		}

		public static void main(String[] args) {
	        Vichle supra = new Vichle("toyato",4,"black",350);
//	        supra.brand = "toyato";
//	         supra.no_tyres = 4;
//	         supra.color = "black";
//	         sbupra.speed = 350;
	         Vichle r15 = new Vichle("yamha", 2,"black", 400 );
	         Vichle FZ = new Vichle("Yamaha", 2,"red", 250);
//	         r15.brand = "YAMAHA";
//	         r15.no_tyres = 2;
//	         r15.color = "black";
//	         r15.speed = 400;

	        System.out.println(FZ.speed);
	    }
	}




