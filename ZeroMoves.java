

public class ZeroMoves {
    public void moveZeroes(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[a]=nums[i];
                a++;
            }
        }
        while(a<nums.length){
            nums[a]=0;
            a++;
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
    public static void main(String[] args) {
        ZeroMoves zm = new ZeroMoves();
        int[] nums = {0,1,0,3,12};
        zm.moveZeroes(nums);
    }
}
