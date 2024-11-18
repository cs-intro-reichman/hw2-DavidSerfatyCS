// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {

        String inputString = args[0];
        int nOfIterations = Integer.parseInt(args[1]); 

       inputString = inputString.toUpperCase();  

       String lettersAn = "A E F H I L M N O R S X";

       for (int i = 0; i < inputString.length() ; i++) {
        char l = inputString.charAt(i);

        if (lettersAn.indexOf(l) != -1 ) {
                System.out.println( "Give me an " + l + ": " + l + "!" );
        } else { 
                System.out.println( "Give me a  " + l + ": " + l + "!" );
        }
        
         }

        System.out.println("What does that spell?");

        int i = 0;
         while (i < nOfIterations) {
               System.out.println(inputString + "!!!"); 
               i++ ;
               }
       }
        
        }

