

import acm.program.*;

public class Fibonacci1 extends ConsoleProgram {
	
	private static final double MAX_TERM_VALUE = 10000;

	public void run() {
		double term = 0;
		int a = 0;
		int b = 1;
		
			System.out.println(a);
			System.out.println(b);
			
		while (term < MAX_TERM_VALUE) {
			int sum = a + b;
			a = b;
			b = sum;
			term = sum;
			
			if (term>=MAX_TERM_VALUE) {
				break;
			} else {
				System.out.println(sum);
			}
		}
	}
	}


