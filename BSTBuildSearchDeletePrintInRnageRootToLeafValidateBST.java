import java.util.ArrayList;

public class BSTBuildSearchDeletePrintInRnageRootToLeafValidateBST {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }

    }

    // BUILD A BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // insert in left subtree
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;

        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);

    }

    // SEARCH IN BST FOR PARTICULAR KEY T= O(H)
    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {

            return true;
        }
        if (root.data > key) {
            return search(root.left, key);

        } else {
            return search(root.right, key);
        }
    }

    // DELETe THE NODE IN BST
    public static Node delete(Node root, int val) {
        if (root == null) {
            return root;
        }
        if (root.data < val) {

            root.right = delete(root.right, val);

        } else if (root.data > val) {

            root.left = delete(root.left, val);

        } else {
            // voila means we got the key where we got the key
            // case-1 leaf Node

            if (root.left == null && root.right == null) {
                return null;

            }

            // case-2 one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {

                return root.left;
            }
            // case-3 two child
            Node IS = findInorderSuccessor(root.right);// importent
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;// jab tak root ka left null nhi hon jata tab tk left jate rahenge jese hi null
                             // ho jata h return kar denge null ko
        }
        return root;
    }

    // PRINT IN RANGEOF BTEWEEN IVEN TWO NODE K1 & K2

    public static void PrintinRange(Node root, int k1, int k2) {
      
        if (root == null) {
            return;
        }
        if (root.data <= k2 && root.data >= k1) {

            PrintinRange(root.left, k1, k2);
            System.out.print(+root.data + " ");
            PrintinRange(root.right, k1, k2);
        } else if (root.data < k1) {
            PrintinRange(root.left, k1, k2);

        } else {
            PrintinRange(root.right, k1, k2);
        }
      
    }







    //path from root to leaf
public static void printPath(ArrayList<Integer>path){
for(int i=0; i<path.size();i++){
System.out.print(path.get(i)+"->");

}
System.out.println("Null");
}
    public static void Root2leaf(Node root,ArrayList<Integer>path){
if(root==null){

    return;
}
path.add(root.data);
if(root.left==null&& root.right==null){

    printPath(path);//function to print the path
}
Root2leaf(root.left, path);
Root2leaf(root.right, path);
path.remove(path.size()-1);



    }





    //VALIDATE BST

    public static boolean isValidate(Node root, Node min, Node max){

        if(root==null){

            return true;
        }
        if(min!=null &&  root.data<=min.data){

return false;
        }
        else if(max!= null && root.data>= max.data){

            return false;
        }// for left subtree min = min and maximum=root vice versa for right subtree
        return isValidate(root.left, min,root) && isValidate(root.right, root,max);
    }

    public static void main(String args[]) {

        int values[] = {8,5,3,6,10,11,14};
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);

        }
        inorder(root);
        System.out.println();

        root = delete(root, 1);
        System.out.println();
        inorder(root);

        System.out.println();
        int k1=5;
        int k2=12;
        System.out.println("Range between"  +"  "+k1+"  "+"and"    +"  "+k2+" ");
PrintinRange(root, 5, 12);
System.out.println();
System.out.println("print root to leaf path");
Root2leaf(root, new ArrayList<>());
System.out.println();

if (isValidate(root, null, null)){
    System.out.println ("VALID");}
    else{
        System.out.println ("not VALID");
    }

        if (search(root, 0)) {
            System.out.print("FOUND");
        } else {
            System.out.print("NOT FOUND");
        }
    }

}
