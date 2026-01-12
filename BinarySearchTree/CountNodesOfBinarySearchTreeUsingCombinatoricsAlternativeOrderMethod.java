package BinarySearchTree;

public class CountNodesOfBinarySearchTreeUsingCombinatoricsAlternativeOrderMethod {
    public static int countBST(int n){
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int nodes=2;nodes<=n;nodes++){
            dp[nodes]=0;
            for(int left=0;left<=nodes-1;left++){
                int right = nodes-1-left;
                dp[nodes]+=dp[left]*dp[right];
            }
        }        
        return dp[n];
    }
    public static void main(String[] agrs){
        int n = 3;
        System.out.println("The total number of Binary Search Trees are possible with n nodes :"+countBST(n));
    }
}
