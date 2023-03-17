import java.util.Arrays;
import java.util.Scanner;

class Drawing{
    static char[][] createCanvas(){
        char[][] emptyCanvas = new char[10][5];
        for (int j = 0; j < 5; j++){
            for (int i = 0; i < 10; i++){
                emptyCanvas[i][j] = ' ';
            }
        }
        for (int i = 1; i < 5; i++){
            emptyCanvas[0][i] = '|';
            emptyCanvas[9][i] = '|';
        }
        for (int i = 1; i < 9; i++){
            emptyCanvas[i][0] = '=';
            emptyCanvas[i][4] = '=';
        }
        emptyCanvas[0][4] = '+';
        emptyCanvas[0][0] = '+';
        emptyCanvas[9][0] = '+';
        emptyCanvas[9][4] = '+';
        return emptyCanvas;
    }

    static char[][] addCharacter(char[][] canvas, char character, int[] coordinates){
        canvas[coordinates[0]][coordinates[1]] = character;
        return canvas;
    
    }  

    static void printCanvas(char[][] canvas){
        System.out.println("Canvas:");
        for (int j = 0; j < 5; j++){
            System.out.print(4 - j);
            for (int i = 0; i < 10; i++){
                System.out.print(canvas[i][j]);
            }
            System.out.println("");
        }
        System.out.print(" ");
        for (int k = 0; k < 10; k++){
            System.out.print(k);
        }
        System.out.println("");
    } 

    static boolean rangeCheck(int[] coordinates){
        boolean passable = false;
        if (!(coordinates[0] < 9)){
            System.out.println("The x coordinate you entered is too big");
        } else if (!(coordinates[0] > 0)){
            System.out.println("The x coordinate you entered is too small");
        } else {
            if (!(coordinates[1] < 4)){
                System.out.println("The y Coordinate you entered was too big");
            } else if (!(coordinates[1] > 0)){
                System.out.println("The y Coordinate you entered was too small");
            } else { 
                passable = true;
                return passable;
            }
        }
        return passable;
    }

    static int[] getCoordinates(){
        Scanner userInput = new Scanner(System.in);
        boolean passable = false;
        int xCoord = 0;
        int yCoord = 0;
        int[] coordinates = {xCoord, yCoord};
        while (passable == false){
            System.out.println("What is the x coordinate of the space you want to edit?(1-8)");
            coordinates[0] = userInput.nextInt();
            System.out.println("What is the y coordinate of the space you want to edit?(1-3)");
            userInput.nextLine();
            coordinates[1] = userInput.nextInt();
            passable = rangeCheck(coordinates);
        }
        return coordinates;
    }
    
    public static void main(String[] args){
        char character;
        String str1;
        int[] coordinates;
        Scanner userInput = new Scanner(System.in);
        System.out.println("This is your empty canvas.");
        char[][] canvas = createCanvas();
        Drawing.printCanvas(canvas);
        System.out.println("Would you like to 'add' a character, 'erase' a character, or 'clear' a new canvas? (Enter 'exit' to leave)");
        String option = userInput.next();
        while (!(option.equals("exit"))){
            if (option.equals("add")){
                coordinates = getCoordinates();
                str1 = String.format("What would you like to put in (%s, %s) \n", coordinates[0], coordinates[1]);
                System.out.println(str1);
                character = userInput.next().charAt(0);
                canvas = Drawing.addCharacter(canvas, character, coordinates);
                Drawing.printCanvas(canvas);
                System.out.println("Would you like to 'add' a character, 'erase' a character, or 'clear' a new canvas? (Enter 'exit' to leave)");
                option = userInput.next();
            } else if (option.equals("erase")){
                coordinates = getCoordinates();
                character = ' ';
                canvas = Drawing.addCharacter(canvas, character, coordinates);
                Drawing.printCanvas(canvas);
                System.out.println("Would you like to 'add' a character, 'erase' a character, or 'clear' a new canvas? (Enter 'exit' to leave)");
                option = userInput.next();
            } else if (option.equals("clear")){
                canvas = createCanvas();
                Drawing.printCanvas(canvas);
                System.out.println("Would you like to 'add' a character, 'erase' a character, or 'clear' thge whole canvas? (Enter 'exit' to leave)");
                option = userInput.next();
            }
        }
        userInput.close();
    }
}
    