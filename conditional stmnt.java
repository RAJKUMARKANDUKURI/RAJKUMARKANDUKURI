package info;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test {

	int campare(int a, int b, int c) {
		int h =0;
         
		if(a > b && b > c)  {
			h=a;
		}else if(b < c) {
			h = c;
		}else{
			h = c;
		}
		
		return h;	
	}
	
	public static void main(String[] args) {
	    Test math = new Test();
	    System.out.println(math.campare(67, 1, 88));
	}
}
