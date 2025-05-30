// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

 

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d
 

// Constraints:

// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.



public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        int s1 = word1.length();
        int s2 = word2.length();
        String res = "";
        int i=0;
        System.out.println(s1+""+s2);
        if(s1==s2){
            while (i < s1) {
                res = res+word1.charAt(i)+word2.charAt(i);
                i++;
            }
        }else if(s1>s2){
            while(i<s2){
                res = res+word1.charAt(i)+word2.charAt(i);
                i++;
            }
            for(int j = s2; j < s1 ; j++){
                res = res + word1.charAt(j);
            }
        }else {
            while (i<s1) {
                res = res+word1.charAt(i)+word2.charAt(i);
                i++;
            }
            for(int j = s1; j < s2 ; j++){
                res = res + word2.charAt(j);
            }
        }

        return res;
    }
    public static void main(String[] args) {
        MergeString sol = new MergeString();
        String word1 = "cdf";
        String word2 = "a";
        System.out.println(sol.mergeAlternately(word1, word2));
    }
}
