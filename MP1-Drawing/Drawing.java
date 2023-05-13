import java.util.Scanner;

public class Drawing{
    // creates an empty canvas that takes in a give amount of rows and columns
    public static char[][] createCanvas(int column, int row){
        char[][] emptyCanvas = new char[column][row];
        for (int j = 0; j < row; j++){
            for (int i = 0; i < column; i++){
                emptyCanvas[i][j] = ' ';
            }
        }
        for (int i = 1; i < row; i++){
            emptyCanvas[0][i] = '|';
            emptyCanvas[column - 1][i] = '|';
        }
        for (int i = 1; i < column; i++){
            emptyCanvas[i][0] = '=';
            emptyCanvas[i][row - 1] = '=';
        }
        emptyCanvas[0][row - 1] = '+';
        emptyCanvas[0][0] = '+';
        emptyCanvas[column - 1][0] = '+';
        emptyCanvas[column - 1][row - 1] = '+';
        return emptyCanvas;
    }
    // adds character to the canvas at the coordinates provided
    public static char[][] addCharacter(char[][] canvas, char character, int coordinate1, int coordinate2){
        canvas[coordinate1][canvas[0].length - coordinate2 - 1] = character; // since the rows increase up in printed out canvas, we have subtract the y/row/coordinate2 from the total # of rows.
        return canvas;
    
    }  
    // Prints out the canvas
    public static void printCanvas(char[][] canvas){
        System.out.println("Canvas:");
        int row = canvas[0].length;
        int column = canvas.length;
        for (int j = 0; j < row; j++){
            System.out.print(row - 1 - j);
            for (int i = 0; i < column; i++){
                System.out.print(canvas[i][j]);
            }
            System.out.println("");
        }
        System.out.print(" ");
        for (int k = 0; k < column; k++){
            System.out.print(k);
        }
        System.out.println("");
    } 
    
    public static void main(String[] args){
        char[][] canvas = createCanvas(10,5);
        addCharacter(canvas, ':', 4, 3);
        addCharacter(canvas, 'O', 5, 3);
        printCanvas(canvas);
    }
}
    