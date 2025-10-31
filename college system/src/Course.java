public class Course {
    public Course(){
        this.name=name;
        this.credithour=credithour;
        this.id=id;
        this.lecturername=lecturername;}
    public Course(String name,int credithour,int id,String lecturername){
        this.name=name;
        this.credithour=credithour;
        this.id=id;
        this.lecturername=lecturername;}
    public String name;
    public int credithour;
    public int id;
    public String lecturername;
    public void setName(String name) {this.name=name;}
    public void setCredithour(int credithour) {this.credithour=credithour;}
    public void setId(int id) {this.id=id;}
    public void setLecturername(String lecturername) {this.lecturername=lecturername;}
    public int getid() {return id;}
    public String getName() {return name;}
    public int getcredithour() {return credithour;}
    public String getlecturername() {return lecturername;}}