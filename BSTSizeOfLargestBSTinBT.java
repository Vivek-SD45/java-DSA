public class BSTSizeOfLargestBSTinBT {


    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }

    }
    static class info{


        boolean isBSt;
        int size;
        int min;
        int max;
        info(boolean isBSt, int size, int min,int max){
this.isBSt=isBSt;
this.size=size;
this.min=min;
this.max=max;

        }
    }
public static int maxBST=0;
    public static info largestBST(Node root){

if(root==null){

    return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
}
info leftinfo=largestBST(root.left);
info rightinfo=largestBST(root.right);
int size=leftinfo.size+rightinfo.size+1;
int min= Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));    
int max= Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));   
//cheack is BST
if(root.data<=leftinfo.max|| root.data>+rightinfo.min){

    return new info(false,size,min,max);
}
if(leftinfo.isBSt && rightinfo.isBSt){
//cheacking is left and right subtree is BST or not
maxBST=Math.max(maxBST,size);
    return new info(true,size,min,max);
}
return new info(false,size,min,max);

}



    
}
