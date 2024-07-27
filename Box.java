import java.util.*;

class Box {

    int l,b,h;
 Box(){
int l,b,h;
}
Box(int x,int y,int z){
    l=y;
    b=y;
h=z;

}
 Box(Box a){
l=a.l;
b=a.b;
h=a.h;
}

void volume(){

int v=l*b*h;

System.out.println("volume"+" -->"+v);


}
void area(){
int ar=l*b+b*h+h*l;

System.out.println("area"+" -->"+ar);

}




    public static void main (String args[]){
        System.out.println();
        System.out.println();
        System.out.println();

Box o1= new Box(3,2,3);
o1.volume();
o1.area();
System.out.println();
System.out.println();
System.out.println();
System.out.println("copy constructor-->");
Box o2= new Box(o1);
o2.volume();
o1.area();
System.out.println();
System.out.println();
System.out.println();
System.out.println("default constructor-->");
Box o3=new Box();
o3.volume();
o3.area();



    }
    
}
