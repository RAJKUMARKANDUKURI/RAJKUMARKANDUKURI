package loops;

public class While_do_while {

	public static void main(String[] args) {


		for(int a=10;a<100;a++)
		{
			System.out.println(a);

		}

		for (int b = 100 ;;) {
			if(b<500) {
				b*=3;
				System.out.println("b*3 result"+b);
			}else
				System.out.println("wrong");
			break;
		}

	}
}




