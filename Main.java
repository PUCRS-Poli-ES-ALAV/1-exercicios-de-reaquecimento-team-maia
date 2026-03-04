public class Main {
    public static void main(String[] args) {
        // 1
        //System.out.println(multiply2naturalRec(10, 3));
        // 2
        //System.out.println(sum2Natural(5, 3,0));
        // 3
        //System.out.println(divRec(205));
        // 4
        //System.out.println(reverseString("Hello, World!"));
        // 5
        // System.out.println(sequence(3));
        // 6
        // System.out.println(ackermanSequence(3, 3));
        // 7
        // int vector[] = {2,2,3,4};
        // System.out.println(multiplyVector(vector, 0));
        // System.out.println(sumVector(vector, 0));
        // 8
        System.out.println(isPalindrome("ovosovo"));
    }

    public static int multiply2naturalRec(int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (m == 1) {
            return n;
        }
        return n + multiply2naturalRec(n, m - 1);
    }

    public static int sum2Natural(int n, int m, int sum) {
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        
        sum = 1 + sum2Natural(n - 1, m, sum); 
        sum = 1 + sum2Natural(n, m - 1, sum);
        return sum;
    }

    public static double divRec(int n){
        if (n == 0) {
            return 0;
        }
        return 1.0/n + divRec(n - 1);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static int sequence(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return 2 * sequence(n - 1) + 3 * sequence(n - 2);
    }

    public static int ackermanSequence(int m, int n) {
        if (m == 0) {
            return n + 1;
        }
        if (n == 0) {
            return ackermanSequence(m - 1, 1);
        }
        return ackermanSequence(m - 1, ackermanSequence(m, n - 1));
    }

    public static int sumVector(int[] vector, int index) {
        if (index == vector.length) {
            return 0;
        }
        return vector[index] + sumVector(vector, index + 1);
    }

    public static int multiplyVector(int[] vector, int index){
        if (index == vector.length) {
            return 1;
        }
        return vector[index] * multiplyVector(vector, index + 1);
    }
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

}