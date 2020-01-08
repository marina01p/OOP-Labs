package Laboratory_02;

public class Queue{
    int capacity;
    int[] queue;
    int front;
    int back;
    int count;

    public Queue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        back = -1;
        count = 0;
    }

    public Queue(){
        capacity = 50;
        queue = new int[50];
        front = 0;
        back = 0;
        count = 0;

    }

    public void push(int addElement) {
        System.out.println("Insert: " + addElement);
        if (back == capacity - 1)
            back = -1;
        queue[++back] = addElement;
        count++;
    }


    public int pop() {
        int temp = queue[front++];
        if (front == capacity)
            front = 0;
        count--;
        return temp;
    }

    public void isEmpty() {

        if (count == 0){
            System.out.println("Queue is empty.");
        }
    }

    public void isFull() {

        if (capacity == size()) {
            System.out.println("Queue is full");
        } else {
            System.out.println("Queue has elements but it's not full");
        }

    }


    public int size() {
        return count;
    }
}