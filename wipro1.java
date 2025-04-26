
import java.util.Arrays;


// output: [abcd,1234]

public class wipro1 {
    
    public String[] arrayStings(String input){
        String letter = "";
        String number="";
        System.out.println(input);
        for(int i=0; i<input.length();i++){
            if(input.charAt(i)>= '0' && input.charAt(i) <= '9'){
                number=number+input.charAt(i);
            }else{
                letter=letter+input.charAt(i);
            }
        }
        return new String[]{letter,number};
    }

    public static void main(String[] args) {
        wipro1 wp =new wipro1();
        String  input = "a1b2c3d4";
        System.out.println(Arrays.toString(wp.arrayStings(input)));
    }
}
