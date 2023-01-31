//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            out.println(ob.minRepeats(A,B));
        }
        out.close();
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here
        return repeatedStringMatch(A,B);
    }
    static int repeatedStringMatch(String A, String B)
    {
        int m = A.length();
        int n = B.length();
 
        int count;
        boolean found = false;
 
        for (int i = 0; i < m; ++i) {
            int j = i;
 
            int k = 0;
 
            count = 1;
 
            while (k < n && A.charAt(j) == B.charAt(k)) {
 
                if (k == n - 1) {
                    found = true;
                    break;
                }
 
                j = (j + 1) % m;
 
                // if j = 0, it means we have repeated the
                // string
                if (j == 0)
                    ++count;
 
                k += 1;
            }
 
            if (found)
                return count;
        }
 
        return -1;
    }
};