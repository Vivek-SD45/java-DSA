

public class arrey1 {
    public static int linear_search(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }

        }
        return-1;
    }


    
    public static void main(String args[]){
        int number[]={2,4,6,8,10,12,14};
        int key=5;
        int index=linear_search(number,key);
        if(index==-1){
            System.out.println("not found");

        }else{
            System.out.println(+index);
        }


    }
    
}
