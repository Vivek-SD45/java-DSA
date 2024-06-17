

public class arrey{
    public static void update(int mark[]){
for(int i=0;i<mark.length;i++){
    mark[i]=mark[i]+1;
}
    }
    public static void main(String args[]){
        int mark[]={98,56,76};
        update (mark);
        for(int i=0;i<mark.length;i++){
            System.out.print( "your mark is");
            System.out.print( mark[i]+" ");

        }
System.out.println();

    }

}

