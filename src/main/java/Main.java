import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(reverseString("Hello"));
        checkPalindrome("madam");
        checkPalindrome("hello");
        System.out.println(getFirstNPrimes(10));
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void checkPalindrome(String str) {
        String reverseStr = reverseString(str);
        if (str.equals(reverseStr)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> getFirstNPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        int num = 2;
        while (primes.size() < n) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }
}