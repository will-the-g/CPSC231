public class Driver {
    /*Our Driver class holds the main method for our program and is where the program
     * and is where the program actually executes
     */
    public static void main(String[] args){
        // create our instances of our new Canvas object
        // new keyword is used to instantiate a new object
        // put it before the desired constructor
        Canvas square = new Canvas();
        Canvas rectangle = new Canvas(20, 10);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
