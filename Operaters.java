package java_practice;

public class Operaters {

	public static void main(String[] args) {

		int battery = 0;
		if (battery > 99) {
			System.out.println("Remove you are plug");
		}else if (battery > 60) {
			System.out.println("Battery saver off");
		}
		else if (battery <30 && battery >=10 ) {
			System.out.println("Battery saver on");
		}
		else if (battery <10 && battery >=2) {
			System.out.println("plug in charger");
		}
		else if (battery < 2 && battery >=1) {
			System.out.println("battery going to die");
		}
		else 
			System.out.println("switchoff");
	}
}


