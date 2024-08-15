import java.util.PriorityQueue;
import java.util.prefs.PreferenceChangeEvent;

public class Heapropes {
    
    public static void main (String args[]){
int rope[]={4,3,2,6};
PriorityQueue<Integer> pq=new PriorityQueue<>();
for(int i=0;i<rope.length;i++){

    pq.add(rope[i]);
}
int cost=0;
while(pq.size()>1){

   int min= pq.remove();
   int min2= pq.remove();
cost+=min+min2;
pq.add(cost);
    
}
System.out.println("cost of connecting n rope is ="+cost);



    }
}    

