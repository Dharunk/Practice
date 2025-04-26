public class SignoftheProductofanArray {
    public int arraySign(int[] nums) {
        // int a=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=0){
        //         // a=(nums[i] > 0) ? 1 : (nums[i] <= -1) ? -1 : 0;
        //         a=(nums[i] <= -1)?a+1:a+0;
        //     }else{
        //         return 0;
        //         // break;
        //     }
            
        // }
        // System.out.println(a);
        // return (a%2==0) ? 1 : -1;
        int n=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return 0;
            }
            else if(nums[i]<0){
                n++;
            }
        }
        if(n%2==0) return 1;
        else return -1;

    }

    public static void main(String[] args) {
        SignoftheProductofanArray sp= new SignoftheProductofanArray();
        int[] nums = {51,38,73,21,27,55,18,15,79,29,13,45,8,-73,-92,-20,-50,-60,-70};
        System.out.println(sp.arraySign(nums));
    }
}
