// odd or even
import java.util.Scanner;

public class Find {
    
    public String oddoreven(int a){
        String res ="";
        if(a%2==0){
            res="Even";
        }else{
            res="odd";
        }
        return res ;
    }

    public static void main(String[] args) {
        Find fd = new Find();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println(fd.oddoreven(a));
    }
}
