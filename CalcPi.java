// Computes an approximation of PI.
public class CalcPi {
	
	public static void main(String [] args) { 

		int input = Integer.parseInt(args[0]);
		double PI = Math.PI;
		double element;
		double sum = 0;

		for (int i = 0; i < input; i++) {
			element = (( Math.pow( (-1), i) ) /  (double) ( 2*i + 1 )) ;
			sum = sum + element;

		}

	    System.out.println(
			"pi according to Java: " + PI +
			"pi, approximated:     " + sum * 4);

	}
}
