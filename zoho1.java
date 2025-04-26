
// - - - 1 2 3 4
// - - 8 7 6 5
// - 9 10 11 12
// 16 15 14 13  

public class zoho1 {
    public static void main(String[] args) {
        int n =4;
        int m=1;
        for (int i =n; i>=1; i--){
            for(int j=i-1; j>=1; j--){
                System.out.print("- ");
            }
            if(n%2==0 && i%2==0 || n%2!=0 && i%2!=0){
                for(int k=1; k<=n ; k++){
                    System.out.print(m+" ");
                    m++;
                }
            }else if(n%2==0 && i%2!=0 || n%2!=0 && i%2==0){
                for(int l=n-1;l>=0;l--){
                    System.out.print(m+l+" ");
                }
                m=m+n;
            }
            System.out.print("\n");
        }

    }

}
