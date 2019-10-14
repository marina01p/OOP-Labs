public class Main{

    public static void main(String[] args){

        System.out.println("Basic Level Task:\n");

        Monitor monitor = new Monitor("yellow", 11, "1080 x 1920");
        System.out.println(monitor.showData());

        Monitor monitor1 = new Monitor("green", 11, "2160 x 3840");
        System.out.println(monitor1.showData1());

        if (monitor.color.equals(monitor1.color)){
            System.out.println("Monitors have the same color.");
        }
        else {
            System.out.println("Monitors have diferent colors. First has " + monitor.color + " color, the second one has " + monitor1.color + " color.");
        }

        if (monitor.resolution.equals(monitor1.resolution)){
            System.out.println("Monitors have the same resolution.");
        }
        else {
            System.out.println("Monitors have diferent resolutions. First has " + monitor.resolution + " resolution, the second one has " + monitor1.resolution + " resolution.");
        }

        if(monitor.dimension > monitor1.dimension) {
            System.out.println("First monitor has bigger dimensions.");
        } else if(monitor.dimension < monitor1.dimension) {
            System.out.println("Second monitor has bigger dimensions.");
        } else if(monitor.dimension == monitor1.dimension){
            System.out.println("Dimensions are equal.");
        }

        System.out.println("\nAdvanced Level:\n");

        Student s1 = new Student("Walter White", 21, 9.99);
        Student s2 = new Student("Constance Langdon", 19, 7.91);
        Student s3 = new Student("Jerry Smith", 19, 6.01);
        Student s4 = new Student("Beth Sanchez", 20, 9.21);
        Student s5 = new Student("Rick Grimes", 23, 6.35);
        Student s6 = new Student("Thomas Shelby", 19, 8.16);
        Student s7 = new Student("Octavia Blake", 21, 7.27);
        Student s8 = new Student("Jesse Custer", 23, 6.14);
        Student s9 = new Student("Monty Green", 20, 9.65);

        Student[] UTM  = {s1,s2,s3};
        Student[] USM = {s4,s5,s6};
        Student[] USMF = {s7,s8,s9};

        University u1 = new University(UTM, "Technical University of Moldova", 1964);
        University u2 = new University(USM,"Moldova State University", 1946);
        University u3 = new University(USMF,"Moldova State University of Medicine and Pharmacy", 1945);

        System.out.println("Average mark of UTM's students: " + s1.name + ", " + s2.name + ", " + s3.name + " is: " + u1.getAverage());
        System.out.println("Average mark of USM's students is: " + s4.name + ", " + s5.name + ", " + s6.name + " is: " + u2.getAverage());
        System.out.println("Average mark of USMF's students is: " + s7.name + ", " + s8.name + ", " + s9.name + " is: " + u3.getAverage());

        double Avg, a = u1.getAverage(), b = u2.getAverage(), c = u3.getAverage();
        Avg = (a + b + c)/3;

        System.out.println("Average mark of UTM, USM and USMF is: " + Avg);
    }

}