//2 POINTER APPROCH
import java.util.*;
public class ArrayMAXWTERCONTAIN{
 
public static int storewater(ArrayList<Integer>height){
int maxwater=0;
int lp=0;
int rp=height.size()-1;
while(lp<rp){
int ht=Math.min(height.get(lp),height.get(rp));

int width=rp-lp;
int currwater=ht*width;
maxwater=Math.max(currwater,maxwater);
if(height.get(lp)<height.get(rp)){

    lp++;
}
else{rp--
;}


}

return maxwater;
    
}

    
public static void main(String args[]){
    ArrayList<Integer>height= new ArrayList<>();
    height.add(5);
    height.add(7);
    height.add(6);
    height.add(9);
    height.add(1);
    height.add(8);
    height.add(7);
    height.add(2);

System.out.println( storewater(height) );
}


}