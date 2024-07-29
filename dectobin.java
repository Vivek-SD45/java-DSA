





public class dectobin {
    public static void dectobinry(int n){
        int bin =0;
        int pow=0;
        while(n>0)
{
    bin=bin+(int)Math.pow(10,pow);
    pow++;
    n=n/2;
}
System.out.println("my binary number is="+bin);

    }
    public static void main(String args[]){
        dectobinry(29);
    }
}
