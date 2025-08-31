public class Student {
    String name;
    int marks;
    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }
    public static void main(String[] args) {
        Student s1=new Student("Anu",89);
        Student s2=new Student("Khushi", 99);
        System.out.println(s1.name+" "+s1.marks);
        System.out.println(s2.name+" "+s2.marks);
    }
}
