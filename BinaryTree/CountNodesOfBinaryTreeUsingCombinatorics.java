package BinaryTree;

public class CountNodesOfBinaryTreeUsingCombinatorics {
    public static int countNodes(int n){
        if(n==0||n==1) return 1;
        int total=0;
        for(int left=0;left<=n-1;left++){
            int right = n-1-left;
            total+=countNodes(left)*countNodes(right);
        }
        return total;
    }
    public static void main(String[] args){
        int n=3;
        System.out.println("The number of Binary Tree possible with n value : "+countNodes(n));
    }
}
