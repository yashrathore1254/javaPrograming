public class PalindromeNumber{    
    public static void main(String[] args) {
        int number = 221; 
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            
            reversedNumber = reversedNumber*10;
            reversedNumber = reversedNumber + number % 10;
            number /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}