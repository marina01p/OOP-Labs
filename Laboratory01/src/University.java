public class University {

    public Student[] student;
    public String  name;
    public int  foundationYear;

    public University(Student[] student , String name , int foundationYearyear) {
        this.student = student;
        this.name = name;
        this.foundationYear = foundationYearyear;
    }

    public double getAverage() {
        double sum = 0 ;
        //average will have decimal point
        for (int i = 0 ; i < student.length; i++) {
            //parse string to double
            sum += student[i].show();
        }
        return sum/student.length;
    }

}