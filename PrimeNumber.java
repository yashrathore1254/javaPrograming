public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int num = i; num >=1; num--) {
                if (i % num == 0) {
                    counter++;
                }  
            }
            if (counter == 2) {
                System.out.print(i+" ");
             }
           

        }
    }
 }