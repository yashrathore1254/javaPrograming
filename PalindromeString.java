public class PalindromeString {
    // public static void main(String[] args) {
    //     String str = "madam";
    //     String originalStr = str;
    //     String reversedStr = "";

    //     for (int i = str.length() - 1; i >= 0; i--) {
    //         reversedStr += str.charAt(i);
    //     }

    //     if (originalStr.equals(reversedStr)) {
    //         System.out.println(originalStr + " is a palindrome.");
    //     } else {
    //         System.out.println(originalStr + " is not a palindrome.");
    //     }
    // }
    public static void main(String arg[]){
        String Str = "nayan";
        String originalString = Str;
        String rev = "" ;

        for(int i=Str.length()-1;i>=0;i--){
            rev = rev + Str.charAt(i);
        }

        if(originalString.equals(rev)){
            System.out.println(originalString + " is a palindrome.");
        }else{
            System.out.println(originalString + " is not a palindrome.");
        }

    
    }
}
