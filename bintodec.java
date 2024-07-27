
public class bintodec{
    public static void binTodec(int binnum, Object system)
    {   int myNum=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0)
        {
            int lastDigit = binnum%10;
            decnum=decnum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("myNum="+decnum);
        
    }
    public static void main(String args[]){
    
     
            binTodec(110, args);
        
    }
    }