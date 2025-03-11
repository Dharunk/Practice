
import java.util.Scanner;

public class RomToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman Number: ");
        String roman = sc.nextLine();
        int I = 1;
        int V = 5;
        int X = 10;
        int L = 50;
        int C = 100;
        int D = 500;
        int M = 1000;
        int sum = 0;
        for (int i = 0; i<roman.length(); i++){
            if(roman.charAt(i) == 'I'){
                sum += I;
            }else if(roman.charAt(i) == 'V'){
                sum += V;
            }else if(roman.charAt(i) == 'X'){
                sum += X;
            }else if(roman.charAt(i) == 'L'){
                sum += L;
            }else if(roman.charAt(i) == 'C'){
                sum += C;
            }else if(roman.charAt(i) == 'D'){
                sum += D;
            }else if(roman.charAt(i) == 'M'){
                sum += M;
            }
        }
        System.out.println("The Integer value of the Roman Number is: " + sum);
    }
}
// Output: Enter the Roman Number:
//         MCMXCIV
//         The Integer value of the Roman Number is: 1994 

