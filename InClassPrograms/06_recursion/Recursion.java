public class Recursion{
    public static void main(String[] args){
        System.out.println(isPalindrome("RACECAR"));
    }
    public static int factorial(int n){
        if (n==1){
            return 1;
        }else{
            return n * factorial(n - 1);
        }
    }
    public static void hooray(int nHips){
        if (nHips == 0){
            System.out.println( "Hooray!");
        } else {
            System.out.print("Hip ");
            hooray(nHips - 1);
        }
    }
    public static int addMeUp(int max){
        if (max == 1){
            return 1;
        }else{
            return max + addMeUp(max - 1);
        }
    }
    private static boolean isPalindrome(String word){
        System.out.println("Recieved "  + word);
        if (word.length() < 2){
            return true;
        }
        if (word.charAt(0) != word.charAt(word.length() - 1)){
            return false;
        }
        return isPalindrome(word.substring(1, word.length() - 1));
    }
}