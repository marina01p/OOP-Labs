public class Box {

    int height;
    int width;
    int depth;

    public Box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    public Box(int value){
        height = value;
        width = value;
        depth = value;
    }

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double getSurfaceArea(){
        return (2*depth*width + 2*depth*height + 2*height*width);
    }

    double getVolume(){
        return (height*width*depth);
    }

    public String showResult() {
        return ("\nHeight: " + height+"\nWidth: " + width + "\nDepth: " + depth);
    }

}

