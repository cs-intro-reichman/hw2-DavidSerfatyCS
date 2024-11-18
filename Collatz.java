// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		int n = Integer.parseInt(args[0]);
		String mode = args[1];

		String v = "v";
		String c = "c";

	if (mode.equals(v)) {
	for (int i = 1; i <= n; i++) { sequence(i); }

	System.out.println( "Every one of the first " + n + 
						" hailstone sequences reached 1");
	}

	if (mode.equals(c)) 
	System.out.println( "Every one of the first " + n + 
						" hailstone sequences reached 1");

	}
	
	public static void sequence (int firstNumber) {
 
		int newNumber = firstNumber;
		int nOfIterations = 1;

	do { 	System.out.print(newNumber + " "); 
			newNumber = hailStone(newNumber); 
			nOfIterations++;}
	
	while (newNumber != 1);  

	System.out.print(newNumber + " ");
	System.out.println("(" + nOfIterations + ")");

	}

	public static int hailStone (int numberInput) {
		
		if (( (double) numberInput % 2) == 0) { return (numberInput / 2); }
		else {return (numberInput * 3) + 1 ; }
	}
}

