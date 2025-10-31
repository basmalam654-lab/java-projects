public class node {
    int data; //for the values
    node next; //this is the pointer for the next value
    public node(){ //a constructor doesn't point on anything
        this.data=0;
        this.next=null;
    }
    public node(int data){ // a constructor receive values only
        this.data=data;
        this.next=null;
    }
    public node(int data,node next){ // a constructor receive values and point on next one
        this.data=data;
        this.next=next;
    }
}
