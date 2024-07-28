import java.util.*;

//import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class BTHeightcountsumDiameterofnodeTOPVIEWofBT {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {

            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;

    }

    public static int count(Node root) {
        if (root == null) {

            return 0;
        }
        int lc = count(root.left);
        int rc = count(root.right);
        return lc + rc + 1;
    }

    public static int Sumofnode(Node root) {
        if (root == null) {

            return 0;
        }
        int ls = Sumofnode(root.left);
        int rs = Sumofnode(root.right);
        return ls + rs + root.data;
    }

    public static int diameter1(Node root) {
        if (root == null) {

            return 0;
        }
        int Ldiam = diameter1(root.left);
        int Rdiam = diameter1(root.right);
        int lh = Height(root.left);// left tree height
        int rh = Height(root.right);// right height
        int selfDiam = lh + rh + 1;

        return Math.max(selfDiam, Math.max(Ldiam, Rdiam));
    }

    static class info {

        int diam;
        int height;

        public info(int diam, int height) {
            this.diam = diam;
            this.height = height;
        }
    }

    public static info diameter2(Node root) {
        if (root == null) {

            return new info(0, 0);
        }
        info leftinfo = diameter2(root.left);
        info rightinfo = diameter2(root.right);
        int diam = Math.max(Math.max(leftinfo.diam, rightinfo.diam), leftinfo.height + rightinfo.height + 1);
        int height = Math.max(leftinfo.height, rightinfo.height) + 1;
        return new info(diam, height);

    }

    public static boolean isIdeantical(Node node, Node subroot) {
        if (node == null && subroot == null) {
            return true;

        } else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }
        if (!isIdeantical(node.left, subroot.left)) {
            return false;
        }
        if (!isIdeantical(node.right, subroot.right)) {

            return false;
        }
        return true;
    }

    public static boolean issubtree(Node root, Node subroot) {
        if (root == null) {

            return false;
        }
        if (root.data == subroot.data) {
            if (isIdeantical(root, subroot)) {
                return true;
            }

        }
        // boolean leftAns=issubtree(root.left, subroot);
        // boolean rightAns=issubtree(root.right, subroot);
        // return leftAns||rightAns;
        return issubtree(root.left, subroot) || issubtree(root.right, subroot);

    }

    static class infor {

        Node node;
        int hd;

        public infor(Node node, int hd) {

            this.node = node;
            this.hd = hd;
        }
    }

    public static void topview(Node root) {

        // Level order
        Queue<infor> q = new LinkedList<>();// Queue contain the information of my node
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0;
        int max = 0;
        q.add(new infor(root, 0));// initially
        q.add(null);
        while (!q.isEmpty()) {

            infor curr = q.remove();
            if (curr == null) {

                if (q.isEmpty()) {
                    break;

                } else {
                    q.add(null);

                }
            } else {
                if (!map.containsKey(curr.hd)) {// inbuilt function to cheack the wheather the current key is preasent
                                                // in
                    // the
                    // map or not
                    map.put(curr.hd, curr.node);// adding key and its vakue in the hash
                }

                if (curr.node.left != null) {
                    q.add(new infor(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);

                }
                if (curr.node.right != null) {
                    q.add(new infor(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);

                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");

        }
        System.out.println();
    }

    public static void kLevel(Node root, int level, int k) {

        if (root == null) {
            return;

        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    // APPROCH 1
    // LAST COMMAN ANCESTOR

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;

        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);
        if (foundLeft || foundRight) {// agar node hme left subtree ke andar mila ya phir right subtree ke andar mila
                                      // to retrn kar jana h true
            return true;

        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {

        // if(root == null){

        // return;
        // }
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);// Root node se n1 tk ka path path1 mai store kr kr dega
        getPath(root, n2, path2);// root to n2

        // last comman ANCESTOR
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }

        }
        // last equal node-->i-1
        Node lca = path1.get(i - 1);
        return lca;

    }

    // APPROCH 2 FOR FINDING THE LOWEST ANCESTOR
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;

        }
        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        // leftlca=valid rightlca= null
        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }
        return root;

    }






//MINIMUM DISTANCE BETWEEN THE NODE
public static int lcaDist(Node root,int n){
if(root==null){
    return -1;
}
if(root.data==n){
    return 0;
}
int leftDist=lcaDist(root.left, n);
int rightDist=lcaDist(root.right, n);
if(leftDist==-1 && rightDist==-1){
    return-1;
}else if(leftDist==-1){
    return rightDist+1;
}else{return leftDist+1;}
}

public static int minDist(Node root,int n1,int n2){

  Node lca=  lca2(root, n1, n2);
int dist1=lcaDist(lca,n1);
int dist2=lcaDist(lca,n2);
return dist1+dist2;

}









//Kth ancestor of the node

public static int KAncestor(Node root, int n,int k){
if(root==null){
    return -1;
}

    if(root.data==n){
    return 0;
}
int leftDist=KAncestor(root.right, n, k);
int rightDist=KAncestor(root.left, n, k);
if(leftDist==-1&&rightDist==-1){return -1;}
int max=Math.max(leftDist, rightDist);
if(max+1==k){
    System.out.println(root.data);
}return max+1;
}








//TRANSFORM TO SUM TREE
public static int transform(Node root){
    if(root==null){
        return 0;
    }
int leftchild=transform(root.left);
int rightchild=transform(root.right);
int data= root.data;
int newleft =root.left==null ? 0 : root.left.data;
int newright =root.right==null ? 0 : root.right.data;
root.data=newleft+leftchild+newright+rightchild;
return data;

}
public static void preorder(Node root){
if(root == null){
    return;
}
System.out.println(root.data+" ");
preorder(root.left);
preorder(root.right);

}
    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        /*
         * 1
         * / \
         * 2 3
         * / \ /\
         * 4 5 6 7
         */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        // subroot.right = new Node(5);

        /*
         * 2
         * /\
         * 4 5
         */
        System.out.println(Height(root));
        System.out.println(count(root));
        System.out.println(Sumofnode(root));
        System.out.println(diameter1(root));
        System.out.println(diameter2(root).diam);
        System.out.println(diameter2(root).height);
        System.out.println(issubtree(root, subroot));
        topview(root); // o/p=4 2 1 3 7
        int k = 3;
        kLevel(root, 1, k);
        int n1 = 4, n2 = 4;
        System.out.println();
        System.out.println("lca" + " " + lca(root, n1, n2).data);// T(c)=O(n) S(c)=O(n)
        System.out.println("lca by 2nd approch" + " " + lca2(root, n1, n2).data);// T(c)=O(n) S(c)=O(n)
        System.out.println();
        System.out.println("Minimum distance between the node"+ "  "+minDist(root, n1, n2));
        System.out.println("Kkth ancestor of given node"+KAncestor(root, n2, k));
        transform(root);
        preorder(root);
    }

}
