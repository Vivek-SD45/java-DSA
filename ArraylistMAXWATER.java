
//BRUTE FORCE APPROCH-O(n2)

import java.util.ArrayList;

public class ArraylistMAXWATER {

 static int maxwater=0;
    public static int MAXWATERCONTAIN(ArrayList<Integer>height){

for(int i=0; i<height.size();i++){
for(int j=i+1; j<height.size(); j++){
int ht=Math.min(height.get(i),height.get(j));

int width=j-i;
int currWter= ht*width;
maxwater=Math.max(maxwater,currWter);

}

}
return maxwater;


    }
public static void main (String args[]){

ArrayList<Integer>height= new ArrayList<>();
height.add(5);
height.add(7);
height.add(6);
height.add(9);
height.add(1);
height.add(8);
height.add(7);
height.add(2);
System.out.println(MAXWATERCONTAIN(height));

} 
    
    
}
