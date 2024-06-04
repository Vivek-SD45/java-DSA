

public class adPattern {
    public static void hollow_ractangle(int totrow,int totcol){//making a function
        //outer loop
        for(int i=1; i<=totrow;i++){
            //inner loop
            for(int j=1;j<=totcol;j++){
                if(i==totrow||i==1||j==1||j==totcol){
                    System.out.print("*");


                }
                else{System .out.print(" ");}

            }
            System.out.println();
        }


}
   public static void main(String args[]){
    hollow_ractangle(4,5);//calling of function
   } 
}
