package BinarySearchTree;
public class CountNodesOfBinarySearchTreeUsingCombinatorics{
    public static int countBST(int n){
        if(n==0||n==1) return 1;
        int total = 0;
        for(int i=1;i<=n;i++){
            total += countBST(i-1)*countBST(n-i);
        }
        return total;
    }
    public static void main(String[] args){
        int n = 3;
        System.out.println("The number of Binary Search Tree are possible with n value : "+countBST(n));
    }
}