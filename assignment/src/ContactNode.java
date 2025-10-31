public class ContactNode {
    protected String Name;
    protected String PhoneNumber;
    ContactNode next;
    public ContactNode(){ //a constructor doesn't point on anything
        this.Name=null;
        this.PhoneNumber=null;
        this.next=null;
    }
    public ContactNode(String Name,String PhoneNumber){ // a constructor receive values only
        this.Name= Name;
        this.PhoneNumber= PhoneNumber;
        this.next=null;
    }
    public ContactNode(String Name,String PhoneNumber,ContactNode next){ // a constructor receive values and point on next one
        this.Name= Name;
        this.PhoneNumber= PhoneNumber;
        this.next=next;
    }}