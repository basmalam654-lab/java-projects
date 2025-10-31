public class PhoneList {
    protected ContactNode head;
    protected ContactNode tail;
    public void insert_at_tail(String Name,String PhoneNumber){ //to insert value from the back
        if((head==null)&&(tail==null)){ //if the 1st condition is met then the node is empty and this is 1st value
            head=tail=new ContactNode(Name,PhoneNumber);
        } else{ //if the 1st condition isn't met then let the pointer move from head until it find the tail and
            // make the pointer point on the new value to make it the new tail
            ContactNode temp =head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=new ContactNode(Name,PhoneNumber);}}
    public void print_list(){ //to print form head to tail and used while loop because size is unknown for me
        ContactNode temp=head;
        if(temp!=null){
        while (temp!=null){
            System.out.println("Name: "+temp.Name+",Phone: "+temp.PhoneNumber+" ");
            temp=temp.next;}
        System.out.println();
        }else
            System.out.println("Phone list is empty");}
    public String search(String value){ //search form head to tail of it was found return true if not return false
        ContactNode temp=head;
        while (temp!=null){
            if (temp.Name.equals(value)){
                return "Contact found:"+"Name: "+temp.Name+",Phone: "+temp.PhoneNumber;
            } else {
                temp=temp.next;
            }}
            return value + " not found";}
    public void delete_by_name(String name){
        ContactNode temp =head;
        while (true){
            if (temp == null) {
                System.out.println("the list is empty ,nothing to be removed");
                return ;
            } else if (head.Name.equals(name)) {
                head = head.next;
                System.out.println(name + " is deleted");
                return;
            } else if (temp.next == null) {
                    System.out.println(name + " not Found");
                    return;
                }
            else if (temp.next != null && !temp.next.Name.equals(name)) {
                temp = tail.next; //move to the next one
                System.out.println(name+" is Deleted");
                return;
        }
            temp.next = temp.next.next;}
    }}
//    public void delete_from_tail(){
//        if (head==null){ //if list is empty
//            System.out.println("the list is empty ,nothing to be removed");
//            return;}
//        if (head.next==null){ //if list has one value
//            head=null;
//            return;}
//        node temp=head; //to remove last value and make before the last tail
//        while (temp.next.next!=null){
//            temp=tail.next;}
//        temp.next=null;}