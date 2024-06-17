
import java.util.*;
public class Arreylistt {
    
public static void main(String args[]){

ArrayList<Integer> list=new  ArrayList<>();

list.add(3);
list.add(7);
list.add(4);
list.add(6);
list.add(9);
list.add(2);
list.add(1);
System.out.println(list);
System.out.println(list.size());

// System.out.println(list.get(2));

// System.out.println(list.remove(2));
// System.out.println(list);
// System.out.println(list.contains(2));
// // list.add(4,9);
// System.out.println(list);
for (int i=list.size()-1; i<=0;i--){

    System.out.println(list.get(i));

}

}




}
