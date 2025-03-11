// number pattern
// input: 6
// output:
// 1 
// 2 4 
// 3 5 7 
// 6 8 10 12 
// 9 11 13 15 17 
// 14 16 18 20 22 24 


public class NumberPattern {
    public static void main(String[] args) {
        int n = 6;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            int num = m;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
            if (i % 2 == 0) {
                m = m -1 + i;
            }else{
                m += i;
            }
        }
    }
}
