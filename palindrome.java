// input: 121 output: Palindrome
// input: 123 output: Not Palindrome
public class palindrome {
    public static void main(String[] args) {
        int num = 1211;
        int temp = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            System.out.println("Remainder: " + rem);
            rev = rev * 10 + rem;
            System.out.println("Reverse: " + rev);
            num = num / 10;
            System.out.println("Number: " + num);
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}