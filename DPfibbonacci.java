

public class DPfibbonacci {



    //O(n)---> ehich is much better then recursion 

    //bY MEMORIZATION 
public static int Fibbonacci(int n,int f[]){
if(n==1 || n==0)
{

    return 1;
}
if(f[n]!=0){

    
    return f[n];


}
f[n]= Fibbonacci(n-1,f)+Fibbonacci(n-2,f);
return f[n];

}


//BY TABULATION
public static int Fibtabulation(int n){

int dp[]= new int [n];
dp[0]=0;
dp[1]=1;
for(int i=2; i<n;i++){

dp[i]=dp[i-1]+dp[i-2];

}
return dp[n];


} 
public static void main (String args[]){
int n=5;
int f[]= new int [n+1];

System.out.println(Fibbonacci(5, f));
System.out.println(Fibtabulation(5));
}



    
}
