public class Student{
    public String name;
    public int age;
    public double mark;

    public Student(String name, int age, double mark){
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public double show() {

        return mark;
    }
}