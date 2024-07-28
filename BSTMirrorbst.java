public class BSTMirrorbst {


    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }

    }

public static Node Mirrorbst(Node root){
if(root==null){

    return root;
}
Node leftSubMirror=Mirrorbst(root.left);
Node rightSubMirror=Mirrorbst(root.right);

root.left=rightSubMirror;
root.right=leftSubMirror;
return root;
}
public static void preorder(Node root){
if(root==null){

    return;
}
System.out.print(root.data+" ");
preorder(root.left);

preorder(root.right);


}

    public static void main(String args[]){
/*
 
       8
      / \
     5   10
    / \   \
   3  6   11

 */
Node root= new Node(8);
root.left=new Node(5);
root.right=new Node(10);
root.left.left=new Node(3);
root.left.right=new Node(6);
root.right.right=new Node(11);

root=Mirrorbst(root);
preorder(root);
    }


    
}
