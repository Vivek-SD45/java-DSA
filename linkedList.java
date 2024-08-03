

public class linkedList {//creation of linklist
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
public static int size;

public static  void addfirst(int data){
    size++; // add a node in th first of link list
node newnode=new node(data);
if(head==null){

head=tail=newnode;
return;
}
newnode.next=head;//linking step
head=newnode;


}
public static void addlast(int data){
    size++;//add the node in the last of link list
node newnode= new node(data);

if(head==null){
head=tail=newnode;
return;

}
tail.next= newnode;
newnode=tail;





}
public static void add(int idx, int data){
    if(idx==0){
addfirst(data);
return;
    }
    node newnode=new node(data);
    size++;
    node temp=head;
    int i=0;
    while(i<idx-1){
        temp= temp.next;
        i++;
    }
    //i=idx-1;temp->prev
    newnode.next=temp.next;
    temp.next=newnode;


}


public static void print(){
    if(head==null){
        System.out.print("our link list is empty");
    }
node temp=head;
while(temp!=null){
System.out.print(temp.data);
temp=temp.next;
}
System.out.println();
}
public static int removefirst(){
if(size==0){
    System.out.print("LL is empty");
    return Integer.MAX_VALUE;
}
else if(size==1){
    int val=head.data;
    head=tail=null;
    size=0;//size km ho jaega
    return val;
}
    int val= head.data;
    head=head.next;
    size--;
    return val;
}
public static int removelast(){
    if(size==0){
        System.out.print("LL is empty");
        return Integer.MAX_VALUE;
    }
    else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;//size km ho jaega
        return val;
    }
      //prev  i=size-2;
      node prev=head;
      for(int i=0; i<size-2; i++){
prev=prev.next;

      }
    return size;
    
}
public int itrative (int key){

    node temp=head;
    int i=0;
    while (temp !=null){
if(temp.data==key){
return i;

    }
    temp=temp.next;
    i++;
    }
    //key not found
    return -1;
}
public int helper(node head, int key){
    if (head==null){
        return 1;

    }
    if (head.data==key){
        return 0;
    }
    int idx= helper(head.next,key);
    if(idx==-1){
        return -1;
    }
    return idx+1;

}
public int recSearch(int key)
{
return(helper(head, key));
}

public void reverse()
{
    node prev= null ;//head se phle to sb kuchh null hota h
    node curr= tail=head;//value assign always right to left
    node next;

    while(curr !=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    head=prev;

}
public void  deleteNthFromEnd(int n){
//calculate size
int sz=0;
node temp=head;
while (temp!=null){
    temp=temp.next;
    sz++;

}
if(n==sz){
    head=head.next;  //remove first
    return;

}
//sc-1
int i=1;
int itoFind=sz-1;
node prev=head;
while(i<itoFind){
    prev=prev.next;
    i++;

}
prev.next=prev.next.next;

}





public node findMid(node head){
    node slow= head;
    node fast=head;
    while (fast!= null && fast.next!=null){
slow= slow.next;
fast=fast.next.next;
    }
    return slow; //slow is my mid
} 



public boolean cheackpalidrome(){
    if (head==null && head.next==null){
      return true;  
    }
    //find mid
node midnode=findMid(head);


    //reverse 2nd half string
node prev =null;
node curr=midnode;
node next;
while(curr != null){
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
node right=prev;
node left=head;


    //cheak left and right  half
    while(right!=null){
while(left.data!=right.data){
    return false;
}
left=left.next;
right=right.next;

}
return true;
}
private node getMid(node head){
    node slow=head;
node fast=head.next;
while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
}
return slow;//mid
}



private node merge(node head1,node head2){
node mergedll=new node (-1);
node temp=mergedll;

while(head != null && head2 != null){
    if(head1.data <=head2.data){
temp.next=head1;
head1=head1.next;
temp=temp.next;
    } else{
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;

    }
}
while (head1 !=null){
    temp.next= head1;
    head1=head1.next;
    temp=temp.next;
}
while (head2 !=null){
    temp.next= head2;
    head2=head2.next;
    temp=temp.next;
}
return mergedll.next;
}

public node  mergeSort(node head){
if(head==null || head.next==null){
    return head;
}


//find mid
node mid = getMid(head);
node rightHead=mid.next;
mid.next=null;
node newleft=mergeSort(head);
node newright=mergeSort(rightHead);


//merge
return merge(newleft,newright);
}

//ZIG ZAG LINKED LIST
public void zigzag(){
//find mid
node slow= head;
node fast= head.next;
while(fast!=null && fast.next!=null)
{
slow=slow.next;
fast=fast.next.next;

}
node mid=slow;

//reverse
node curr = mid.next;
mid.next=null;
node prev=null;
node next;

while (curr!= null){

    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
}
node left=head;
node right=prev;
node nextL,nextR;




//alternate merging
while(left != null && right !=null){
    nextL=left.next;
    left.next=right;
    nextR=right.next;
    right.next=nextL;

    left=nextL;
    right=nextR;
}

}



/*public static void main(String args[]){
linkedList ll= new linkedList();
ll.addfirst(2);
ll.addfirst(1);
ll.addlast(4);
ll.addlast(5);
ll.add(2,3);
print();
System.out.println(size);
removefirst();
print();
System.out.println(ll.itrative(3));
System.out.println(ll.itrative(5));
System.out.println(ll.recSearch(3));
System.out.println(ll.recSearch(2));
ll.reverse();
ll.print();
ll.deleteNthFromEnd(2);
ll.print();
System.out.println(ll.cheackpalidrome());
}*/


public static void main(String args[]){

    linkedList ll= new linkedList();
    ll.addfirst(1);
    ll.addfirst(2);
    ll.addfirst(3);
    linkedList.addfirst(4);
    linkedList.addfirst(5);
    linkedList.print();
    ll.zigzag();
    linkedList.print();
    linkedList.head=ll.mergeSort(ll.head);
    linkedList.print();











}

}
