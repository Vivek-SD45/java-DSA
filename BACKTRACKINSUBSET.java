public class BACKTRACKINSUBSET {

//ans is the strig in which we store the the answer 
//int i is the the index by which you ask  wheather it want to come in the my subset or not
public static void findSubset(String str,String ans, int i){
//base case

if (i==str.length()){
    if(ans.length()==0){

        System.out.println("null");
    }
System.out.println(ans);
return;

}
//yes
findSubset(str, ans+str.charAt(i), i+1);

//no
findSubset(str, ans, i+1);



//recursion


}

public static void main( String args[]){

String str="abc";
findSubset(str, "", 0);

}    
}
