import  java.util.*;
public class Strings {

public static void printLetter(String str){
for(int i=0; i<=str.length();i++){
System.out.println(str.charAt(i));
}
System.out.println();
}

public static void main(String args[]){




/*char arr[]={ 'a','b','c'};
String str="abc";
//other mathod to declare the string
String str2= new String("xyz");
//strigs are immutable
 
Scanner sc = new Scanner (System.in);
String name;
//name=sc.next();
name=sc.nextLine();
System.out.println(name);*/


 /*String name = "Tony stark";
 System.out.println(name.length());

//CONCATENATION
String firstname="vivek";
String lastname="kumar";
String fullname=firstname+" "+lastname;
System.out.println(fullname);
//System.out.println(fullname.charAt(1));
printLetter(fullname);













*/
//PALIDROME
/* 
String str= "racecar";
System.out.println(isPalidrome(str));
String path="WNEENESENNN";
System.out.println(getshortestPath(path));

String s1="TONY";
String s2="TONY";
String s3=new String("TONY");
if(s1==s2){
    System.out.println("String are equal");
}else{
    System.out.println("String are not equal");
}
if(s1==s3){
    System.out.println("String are equal");
}else{
    System.out.println("String are not equal");
}
//HERE S1 AND S3 ARE UNEQUAL IN OUTPUT  BECAUSE STRING CREATE BY THE NEW KEYWORD ARE CREATE NEW TONY 
//SO avoid that problem we use the function ive below
if(s1.equals(s3)){
    System.out.println("String are equal");
}else{
    System.out.println("String are not equal");*/






    //substring 
String sttr = "halloWorld";

//inbuilt function in java to print substring
System.out.println(sttr.substring(0,5));
System.out.println(substring(sttr,0,5));








//FOR GIVEN STRING PRINT THE LARGEST STRING

String fruit[]= {"apple","mango","banana"  };
String largest= fruit[0];
for (int i=1; i<fruit.length;i++){
//inbuilt function compareTo which use to compare the string DXICOGRAPHICALLY
    if(largest.compareTo(fruit[i])< 0){
largest=fruit[i];

    }
}
System.out.println(largest);








//STRINGBUILDER
//TIMECOPLEXITY=O(26);

StringBuilder sb= new StringBuilder("");
for(char ch='a'; ch<='z'; ch++){
sb.append(ch);
}

System.out.print(sb);





//string compression main function
String str="aaaabbbbbvvvvffff";
System.out.println(compress(str));





}




public static boolean isPalidrome(String str){
for(int i=0; i<str.length()/2;i++){
    int n=str.length();
    if(str.charAt(i)!=str.charAt(n-i-1)){
        return false;
    }

}
return true;

}

public static float getshortestPath(String path){


    int x=0,y=0;
    for(int i=0; i<path.length();i++){
char dir=path.charAt(i);
//south
if(dir=='S'){
y--;

}
//north
else if(dir=='N'){
y++;
}
else if(dir=='W'){
x--;
}
else{
x++;
}
}
int X2=x*x;
int Y2=y*y;
return (float)Math.sqrt(X2+Y2);
    
} 
public static String substring(String sttr,int si,int ei){
String substr="";
for(int i=si; i<ei; i++){
substr +=sttr.charAt(i);


}
return substr;

}
public static String  toUpperCase(String str){
StringBuilder sb= new StringBuilder("");
char ch=Character.toUpperCase(str.charAt(0));
sb.append(ch);
for (int i=0; i<=str.length() ; i++ ){

    if(str.charAt(i)==' ' && i<str.length()-1){
        sb.append(str.charAt(i));
        i++;
        sb.append (Character.toUpperCase(str.charAt(i)));
    }
    else{

        sb.append(str.charAt(i));

    }
}
return sb.toString();
}


//STRING COMPRESSION


public static String compress( String sttr )
{
StringBuilder newstr= new StringBuilder("");
 for(int i =0; i<sttr.length(); i++){

Integer count=1;

while(i<sttr.length()-1 && sttr.charAt(i)== sttr.charAt(i+1)){

    count++;
    i++;
}
newstr.append(sttr.charAt(i));
if(count>1){
    newstr.append(count.toString());
}
 }
 return newstr.toString();
}


}
 
