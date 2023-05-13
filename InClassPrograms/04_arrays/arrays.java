public class arrays {
    public static void main(String[] args){
        
        /*
         * if (args.length > 0){
            System.out.println("Argument was: " + args[0]);
            int size = Integer.parseInt(args[0]);
            int[] numbers = new int[size];
            System.out.println("Length of array: " + numbers.length);
        }
         */


         /*ARRAYS:
          * 
          */

        String[] movies = new String[5];
        movies[0] = "Whiplash";
        movies[1] = "Birdman";
        movies[2] = "I Tonya";
        System.out.println(movies);

        for (int i = 0; i < movies.length; i++){
            if (movies[i] == null){
                movies[i] = "To BE ANNOUNCED";
            }
            System.out.println(movies[i]);
            


        }




        int[] votes = {};
        int totalVotes = 0;
        for (int v : votes){
            totalVotes += v;
        }
        System.out.println("We've had " + totalVotes + " total votes.");

        String winner = "Birdman";
        System.out.println("Here's a hint...");
        for (char l : winner.toUpperCase().toCharArray()){
            String VOWELS = "AEIOU";
            if (VOWELS.indexOf(l) == -1){
                System.out.print(l);
            }
        }
        System.out.println();

   
   
   
   
    }  

}
