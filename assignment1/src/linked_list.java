public class linked_list {
    node head;
    node tail;
    public void insert_at_head(int data){ //to insert value from the front
    if((head==null)&&(tail==null)){ //if the 1st condition is met then the node is empty and this is 1st value
        head=tail=new node(data);
    }else{ //if the 1st condition isn't met then the node isn't empty and make the new value point to old value
        head=new node(data,head);}}

    public void insert_at_tail(int data){ //to insert value from the back
        if((head==null)&&(tail==null)){ //if the 1st condition is met then the node is empty and this is 1st value
            head=tail=new node(data);
        } else{ //if the 1st condition isn't met then let the pointer move from head until it find the tail and
            // make the pointer point on the new value to make it the new tail
        node temp =head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=new node(data);}}
    public void insert_at_position(int data,int position){
        if(position==1){
            head=new node(data,head);
        }else {
            node temp=head;
            for (int i=1;i<position-1;i++){
                if(temp==null){
                    throw new IndexOutOfBoundsException("invalid position");
                }
                temp=temp.next;
            }
            /*new node.next=temp.next;
            temp.next=new node;*/ }}
    public void delete_from_head(){
        if(head==tail){
           head=tail=null;
        }else {
            head=head.next;}}
    public void delete_from_tail(){
        if (head==null){ //if list is empty
            System.out.println("the list is empty ,nothing to be removed");
        return;}
        if (head.next==null){ //if list has one value
            head=null;
            return;}
        node temp=head; //to remove last value and make before the last tail
        while (temp.next.next!=null){
            temp=tail.next;}
        temp.next=null;}
    public void delete_from_position(int position){
        if(head==null){ //to delete 1st value and make the next one head or to the list empty or not
            throw new IllegalStateException("the list is empty ,nothing to be removed");
        }else if(position==1) {
            head=head.next;
            return;}
       node temp =head; //to move the pointer from head to the node before the one I want to delete
        for (int i=1;i<position-1;i++){
            if(temp.next==null){
                throw new IndexOutOfBoundsException("invalid position");}
                temp=temp.next;}
        if(temp.next==null){
            throw new IndexOutOfBoundsException("invalid position");}
        temp.next=temp.next.next; //to connect two nodes around the one was deleted
    }
    public void delete_by_value(int value){
        if(head==null){ //to delete 1st value and make the next one head or to check if the list empty or not
            throw new IllegalStateException("the list is empty ,nothing to be removed");
        }else if(head.data==value) {
            head=head.next;
            return;}
        node temp =head; //to move the pointer from head to the node before the one I want to delete
        while (temp.next!=null&&temp.next.data!=value){
            temp=tail.next; //move to the next one
            }
        if(temp.next==null){ //this is the part where I delete the node I want
            throw new IllegalArgumentException("this value not in the list");}
        temp.next=temp.next.next; //to connect two nodes around the one was deleted
    }
    public boolean search(int value){ //search form head to tail of it was found return true if not return false
        node temp=head;
        while (temp!=null){
            if (temp.data==value){
                return true;}
            temp=temp.next;}
        return false;}
    public void print_list(){ //to print form head to tail and used while loop because size is unknown for me
        node temp=head;
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;}
        System.out.println();}
    public boolean is_empty(){ //this one to check if list is empty return true if not return false
        return head==null;
    }
    public int size(){ // a counter to calculate the size from head to tail
        int count= 0;
        node temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;}
        return count;}}