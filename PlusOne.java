public class PlusOne {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length - 1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                break;
            }else{
                digits[i]=0;
            }
        }
        if(digits.length == 1 && digits[0] == 0 || digits[0]== 0){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        
        return digits;
    }
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
        int[] digits = {0};
        System.out.println(java.util.Arrays.toString(po.plusOne(digits)));
    }
}
