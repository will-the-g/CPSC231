import java.util.*;

public class ComparingLists{
    public static void main(String[] args){
        Random randy = new Random();
        // Primitive Array Populating
        long start = System.currentTimeMillis();
        int[] array = new int[100000];
        for(int i = 0; i < 100000; i++){
            array[i] = randy.nextInt(100);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Elapsed Primitive Array Populating Time: " + (stop - start));
        // Primitive Array Sum
        start = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 20000; i++){
            sum += array[randy.nextInt(array.length)];
        }
        stop = System.currentTimeMillis();
        System.out.println("Elapsed Primitive Array Sum Time: " + (stop - start));
        // Array List Populating
        start = System.currentTimeMillis();
        ArrayList<Integer> AL = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++){
            AL.add(i, randy.nextInt(100));
        }
        stop = System.currentTimeMillis();
        System.out.println("Elapsed Array List Populating Time: " + (stop - start));
        // Array List Sum
        sum = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++){
            int x = randy.nextInt(100000);
            sum += AL.get(x);
        }
        stop = System.currentTimeMillis();
        System.out.println("Elapsed Array List Sum Time: " + (stop - start));
        // Linked List Populating
        start = System.currentTimeMillis();
        LinkedList<Integer> LL = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++){
            LL.add(i, randy.nextInt(100));
        }
        stop = System.currentTimeMillis();
        System.out.println("Elapsed Linked List Populating Time: " + (stop - start));
        // Linked List Sum
        sum = 0;
        start = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++){
            int x = randy.nextInt(100000);
            sum += LL.get(x);
        }
        stop = System.currentTimeMillis();
        System.out.println("Elapsed Linked List Sum Time: " + (stop - start));
        }
}