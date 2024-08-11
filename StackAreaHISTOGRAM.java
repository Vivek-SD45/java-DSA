
import java.util.*;
public class StackAreaHISTOGRAM {

public static void AreaHisto(int arr[]){

int maxarea=0;
int nsr[]=new int[arr.length];
int nsl[]=new int[arr.length];
Stack<Integer> s= new Stack<>();
//nwxt smaller element
for(int i= arr.length-1; i>=0; i--){

    while(!s.isEmpty()  && arr[s.peek()]>=arr[i]  )
{
    s.pop();
}
if(s.isEmpty()){
nsr[i]=arr.length;
}else{ nsr[i]=s.peek();//TOP}


}
s.push(i);}
//next Smaller elment Left

 s= new Stack<>();

for(int i=0; i<arr.length;i++){

    while(!s.isEmpty()  && arr[s.peek()]>=arr[i]  )
{
    s.pop();
}
if(s.isEmpty()){
nsl[i]=-1;
}else{ nsl[i]=s.peek();}

s.push(i);
}
//AREA= width=i-j-1=nsr[i]-nsl[j-1]
s=new Stack<>();
for(int i=0; i<arr.length;i++){
int height= arr[i];
int width=nsr[i]-nsl[i]-1;
int currArea=height*width;
maxarea=Math.max(currArea,maxarea);
System.out.println("max area of the histogram="+ maxarea);


}

}




public static void main(String args[]){
int arr[]= {2,1,5,6,2,3};
AreaHisto(arr);


}



    
}
