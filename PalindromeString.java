public class PalindromeString {
 
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

// public class test {
//     public static void main(String arg[]){
//         String Str = "nayan";
//         int j = 0;
//         boolean flag = true;
//         for(int i=Str.length()-1;i>=0;i--){
//             if(Str.charAt(i) != Str.charAt(j)){
//                 flag = false;
//                 break;
//             }
//             j++;
//         }

//         if(flag){
//             System.out.println("String is palindrome");
//         }
//         else{
//             System.out.println("String is not palindrome");
//         }
//     }


