public class LabMethods {

    public static int getTotal(int a, int b){
        return a + b;
    }
    public static boolean isEven(int number){
        return number % 2 == 0;
    }
    public static boolean isVowel(char character) {
        return "aeiouAEIOU".indexOf(character) != -1;
    }
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPalindrome(int number) {
        String numberToString = Integer.toString(number);
        int l = 0;
        int r = numberToString.length() - 1;
        while (l < r) {
            if (numberToString.charAt(l) != numberToString.charAt(r)){
                return false;
            }
            l += 1;
            r -= 1;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("getTotal(5, 3): " + getTotal(5, 3));

        System.out.println("isEven(10): " + isEven(10));
        System.out.println("isEven(7): " + isEven(7));

        System.out.println("isVowel('a'): " + isVowel('a'));
        System.out.println("isVowel('z'): " + isVowel('z'));

        System.out.println("isPrime(7): " + isPrime(7));
        System.out.println("isPrime(10): " + isPrime(10));

        System.out.println("isPalindrome(121): " + isPalindrome(121));
        System.out.println("isPalindrome(123): " + isPalindrome(123));
    }



    


}