// You are given two arrays of integers, fruits and baskets, each of length n, where fruits[i] represents the quantity of the ith type of fruit, and baskets[j] represents the capacity of the jth basket.

// From left to right, place the fruits according to these rules:

// Each fruit type must be placed in the leftmost available basket with a capacity greater than or equal to the quantity of that fruit type.
// Each basket can hold only one type of fruit.
// If a fruit type cannot be placed in any basket, it remains unplaced.
// Return the number of fruit types that remain unplaced after all possible allocations are made.

 

// Example 1:

// Input: fruits = [4,2,5], baskets = [3,5,4]

// Output: 1

// Explanation:

// fruits[0] = 4 is placed in baskets[1] = 5.
// fruits[1] = 2 is placed in baskets[0] = 3.
// fruits[2] = 5 cannot be placed in baskets[2] = 4.
// Since one fruit type remains unplaced, we return 1.

// Example 2:

// Input: fruits = [3,6,1], baskets = [6,4,7]

// Output: 0

// Explanation:

// fruits[0] = 3 is placed in baskets[0] = 6.
// fruits[1] = 6 cannot be placed in baskets[1] = 4 (insufficient capacity) but can be placed in the next available basket, baskets[2] = 7.
// fruits[2] = 1 is placed in baskets[1] = 4.
// Since all fruits are successfully placed, we return 0.

 

// Constraints:

// n == fruits.length == baskets.length
// 1 <= n <= 100
// 1 <= fruits[i], baskets[i] <= 1000






public class FruitIntoBaskets {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) { 
        int res = 0;
        int i =0,j=0;
        for(i=0;i<fruits.length;i++){
            for(j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break;
                }else if(j==baskets.length-1 && fruits[i]>baskets[j]) {
                    res++;
                }
            }
        }
        // while(i<fruits.length){
        //     System.out.print("fruits:"+fruits[i]);
        //     if(j<baskets.length && fruits[i]<=baskets[j]){
        //         System.out.println(" basket:"+baskets[j]);
        //         // baskets[j]=0;
        //         j++;
        //     }else if(j==baskets.length && fruits[i]>baskets[j]){
        //         res++;
        //     }
        //     i++;
        // }
        System.out.println(java.util.Arrays.toString(baskets));
        return res;
    }
    public static void main(String[] args) {
        FruitIntoBaskets fb = new FruitIntoBaskets();
        int[] fruits =  {3,6,1};
        int[] baskets = {6,4,7};
        System.out.println(fb.numOfUnplacedFruits(fruits, baskets));
    }
}


// / int[] arr = new int[baskets.length];
        // int res=0;
        // for(int i = 0; i < fruits.length; i++){
        //     for(int j = 0; j < baskets.length; j++){
        //         int temp = 0;
        //         for(int k = 0; k < arr.length; k++){
        //             if(baskets[j]==arr[k]){
        //                 temp=1;
        //                 break;
        //             }
        //         }
        //         if(temp==0 && fruits[i]<=baskets[j]){
        //             arr[i] = baskets[j];
        //             res=0;
        //             break; 
        //         }else if(fruits[i]>baskets[j]){
        //             res += 1;
        //             break;
        //         }
        //     }
        // }     
        // return  res;
        // int res = 0;
        // int i =0,j=0;
        // while(i<fruits.length){
        //     if(j<baskets.length && fruits[i]<=baskets[j]){
        //         j++;
        //     }else{
        //         res++;
        //     }
        //     i++;
        // }
        // return res;