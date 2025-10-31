public class Student {
    private String name;
    private String phonenumber;
    private Course[] enrolledcourses;
    public Student() {
        this.name = name;
        this.phonenumber=phonenumber;
        enrolledcourses=new Course[6];}
    public Student(String name, String phonenumber){
        this.name = name;
        this.phonenumber=phonenumber;
        this.enrolledcourses=enrolledcourses;}
    public void setName(String name) {this.name = name;}
    public void setPhonenumber(String phone_number) {this.phonenumber = phonenumber;}
    public void setEnrolledcourses(Course[] enrolledcourses) {this.enrolledcourses = enrolledcourses;}
    public String getName() {return name;}
    public String getPhonenumber() {return phonenumber;}
    public Course[] getEnrolledcourses() {return enrolledcourses;}
public void enrollCourse(int index,Course enrolled){
        //boolean already=false;
    int i;
    if(enrolledcourses[index]!=null&&enrolledcourses[index].equals(enrolled)){
        //already=true;
        System.out.println("you are already enrolled on this course!");}
        for(i=0;i<6;i++){
            if(enrolledcourses[index]==null){
                enrolledcourses[index]=enrolled;
                continue;}}
        if(index>=6)
            System.out.println("you have reached the maximum limit");}
public void printEnrolledCourses(){
   for (int i=0;i<6;i++){
    System.out.println("Course "+(i+1)+": "+enrolledcourses[i].name+","+enrolledcourses[i].credithour+","+enrolledcourses[i].id+","+enrolledcourses[i].lecturername);}}
public int printtotalcredithours() {
    int sum = 0;
    for (int i = 0; i < 6; i++){
     sum += enrolledcourses[i].credithour;}
    System.out.println("Total credit hours :" + sum);
     return sum;}
public void printLecturer(String lecturerName){
   boolean found=false;
    int i;
    System.out.println("Lecturer: "+lecturerName);
        if(enrolledcourses[i]!=null&&enrolledcourses[i].lecturername.equals(lecturerName)){
            System.out.println("Course "+(i+1)+": "+enrolledcourses[i].name+","+enrolledcourses[i].credithour+","+enrolledcourses[i].id+","+enrolledcourses[i].lecturername);
        found=true;
        }if(!enrolledcourses[i].lecturername.equals(lecturerName)&&enrolledcourses[i]==null){
            System.out.println("no courses for this lecturer");}}}