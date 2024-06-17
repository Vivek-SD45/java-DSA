import javax.swing.GrayFilter;

public class BACKGRID {
public static int  gridways(int i, int j,int n,int m){
//base case
if(i==n-1 && j==m-1){//conditiom for the last cell
    return 1;
}
else if(i==n || j==m){//bpundry cross condition

return 0;


}
int w1=gridways(i+1,j,n,m);//for right
int w2=gridways(i,j+1,n,m);//for down
return w1+w2;//total way return

}
    
public static void main (String args[]){
int n=10,m=10;
System.out.println(gridways(0,0,n,m));


}




}
