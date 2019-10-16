public class Main{
    public static void main(String[] args){
        System.out.println("Basic Level:");

        Box b1 = new Box();
        Box b2 = new Box(22);
        Box b3 = new Box(14, 3, 11);

        System.out.println("The size of box is: "+ b3.showResult());
        System.out.println("The surface area of box is: " + b3.getSurfaceArea() + "cm2");
        System.out.println("The volume of box is: " + b3.getVolume() + "cm3");

        System.out.println("\nAdvanced Levels:");

        Queue q1 = new Queue(5);
        Queue q2 = new Queue();

        System.out.println("\nFirst queue:");
        q1.push(12);
        q1.push(230);
        q1.push(45);

        q1.pop();
        q1.isEmpty();
        q1.isFull();

        System.out.println("The queue has " + q1.size() + " elements.");

        System.out.println("\nSecond queue:");
        q2.push(63);
        q2.push(11);
        q2.push(54);

        q2.pop();
        q2.isEmpty();
        q2.isFull();

        System.out.println("The queue has " + q2.size() + " elements.");
        }


    }