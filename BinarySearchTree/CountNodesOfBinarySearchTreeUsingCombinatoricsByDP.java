package BinarySearchTree;

public class CountNodesOfBinarySearchTreeUsingCombinatoricsByDP {
    public static int countBST(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int nodes= 2;nodes<=n;nodes++){
            dp[nodes]=0;
            for(int root=1;root<=nodes;root++){
                dp[nodes]+=dp[root-1]*dp[nodes-root];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        int n=3;
        System.out.println("The number of Binary Search Trees possible using n value : "+countBST(n));
    }
}
