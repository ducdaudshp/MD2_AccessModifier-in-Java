public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1=new Student(1,"Duong");
        Student s2=new Student(2,"Duc");
        Student s3=new Student(3,"Giang");
        s1.display();
        s2.display();
        s3.display();
    }
}
