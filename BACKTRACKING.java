

public class BACKTRACKING{

public static void changedarr(int arr[],int i, int val)
{
//base case
if(i== arr.length){

    printarr(arr);
    return;
}


//recursion part
//sabse phle upar jate jate ith positon pr  value assign kar deni h
arr[i]=val;
changedarr(arr, i+1, val+1);
//when call come back
arr[i]=arr[i]-2;
    
}


public static void printarr( int arr[]){
for(int i=0; i<  arr.length;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
}

    public static void main (String args[]){
        int[] arr= new int[5];//size of arrey //in value is assigned by the recursive function
changedarr(arr, 0, 1);
printarr(arr);
        
        
        }

}