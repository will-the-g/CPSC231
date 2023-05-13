public class Canvas{
    private char[][] canvas;

    public Canvas(){
        canvas = new char[10][10];
        // createCanvas();
    }
    public Canvas(int width, int height){
        canvas = new char[height][width];
        // createCanvas();
    }

    private void creatCanvas(){
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

    }
    public void addCharacter(){}
    /* Accessors and Mutators
     * accessor for the canvas member variable
     */
    public char[][] getCanvas(){
        return this.canvas;
    }
    /*toString method allows us to override what gets printed
     * to the terminal by System.out.println()
     */
    public String toString(){
        // want it to say something like "10 x 10 canvas"
        return this.canvas[0].length + " x " + this.canvas.length + " canvas";
    }
}