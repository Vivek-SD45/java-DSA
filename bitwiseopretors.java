public class bitwiseopretors {



    public static void oddOreven ( int n){
int bitmask =1;
if((n & bitmask)==0){
//even
System.out.println("even number");

}
else{
System.out.println("odd number");
    
}

    }

    public static int setithwidth( int n,int i){

        int bitmask= 1<<i;
return n | bitmask;

    }
    public static int getithwidth( int n,int i){

        int bitmask= 1<<i;
if((n & bitmask)==0){
    return 0;
}else{
    return i;
}

    }
    
    public static int clearithwidth( int n,int i){

        int bitmask= ~(1<<i);
return n & bitmask;

    }


    public static void main( String args[]){

System.out.println(5&6);//BINARY AND
System.out.println(5|6);//BINARY or
System.out.println(5^6);//BINARY X-OR
System.out.println(~5);//NOT
System.out.println(~0);
System.out.println(5<<2);//BINARY LEFT SHIFT
System.out.println(5>>2);//BINARY RIGHT SHFT

oddOreven(3);
oddOreven(4);

System.out.println (setithwidth(5, 2));
System.out.println (getithwidth(5, 2));
System.out.println (clearithwidth(5, 2));

    }
    
}
