// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	   
	   	int nOfTimes = Integer.parseInt(args[0]);
		int upHalf = 0;
		int downHalf = 0;

	for (int i = 0; i < nOfTimes; i++) {
			double randomNumber = Math.random();
		if (randomNumber > 0.5) {
			upHalf++; 
		}
		else {
			downHalf++;
		}
	}
		int bigger = Integer.max(upHalf, downHalf);
		int smaller = Integer.min(upHalf, downHalf);

	System.out.println("> 0.5: " + upHalf + " times");
	System.out.println("<= 0.5: " + downHalf + " times");

		if (smaller > 0) {
			double ratio = ( (double) smaller / (double) bigger);
			System.out.println("Ratio: " + ratio);
		}
		
	}
	}

