import java.util.Scanner;


public class PracticeProblems {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        int num = -1;
        System.out.println("Input the student's grades. Finish with -1");
        while(input != -1){
            sum += input;
            num++;
            input = scnr.nextInt(); 
        }
        double average = (double)sum / (double)num;
        System.out.println(average);
        scnr.close();
    }
}

