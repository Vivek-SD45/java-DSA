
public class linklist2 {//creation of linklist
    public static class node {
int data;
node next;
public node (int data){
    this.data=data;
    this.next=null;//initialy no node is preasent
}
    } 
public static node head; //creation of of local variable
public static node tail;

//FLOYD CYCLE ALGORATHIM

public static boolean iscycle(){
    node slow=head;
    node fast=head;
    while (fast != null && fast.next !=null){
slow=slow.next;
fast=fast.next.next;

if(slow==fast){
return true;  //cycle exist

}
    
}
return false;
//cycle does not exist
}


public static void removeCycle(){
//detect cycle
node slow=head;
node fast=head;
boolean cycle=false;
while (fast != null && fast.next !=null){
slow=slow.next;
fast=fast.next.next;

if(slow==fast){
  //cycle exist
cycle =true;
break;
}

}
if(cycle==false){
    return;
}






//find meeting node again
slow=head;
node prev=null;
while(slow != fast)
{
    slow= slow.next;
    fast=fast.next;
}

//remove cycle
prev.next=null;

}
public static void main(String args[])
{
    head= new node(1);
    node temp = new node(2);

    head.next= temp;
    head.next.next= new node(3);
    head.next.next.next=temp;
System.out.println(iscycle());
removeCycle();
System.out.println(iscycle());
}

}

