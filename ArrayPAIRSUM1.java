import java.util.ArrayList;

//Brute force approch
// to find the pair sum wheather sum of the differt value in the list is equal to the our target vlue is avai;abale or not uin the list

public class ArrayPAIRSUM1 {

public static boolean SUMPAIR1(ArrayList<Integer>list,int target)
{
for(int i=0; i<list.size();i++){
for(int j=i+1; j<list.size(); j++){
if(list.get(i)+list.get(j)==target){
return true;
}

}
}

return false;



}

public static void main(String args[])
{


    ArrayList<Integer>list= new ArrayList<>();
    list.add(5);
    list.add(7);
    list.add(6);
    list.add(9);
    list.add(1);
    list.add(8);
    list.add(7);
    list.add(2);
    System.out.println( SUMPAIR1(list, 12) );

}



}

    

