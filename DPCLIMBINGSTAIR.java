public class DPCLIMBINGSTAIR {


public static int ClimbingStair(int n , int f[]){

if (n<=0)
{

    return 0;
}
if(n==0){

    return 1;
}
// if(f[n]!=0){

    
//     return f[n];


// }
f[n]= ClimbingStair(n-1, f)+ClimbingStair(n-2, f);
return f[n];
}




    public static void main(String args[]){
int n=2;

int f[]=new int[n+1];
System.out.println("step"+ClimbingStair(n, f));


    }




    
}
