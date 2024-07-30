public class FriendsPairproblem {

    public static int fp(int n){
if(n==1 || n==2){
    return n;
}
return fp(n-1)+(n-1)*fp(n-2);

    }
    public static void main(String args[]){
        System.out.println(fp(3));
    }
    
}
