public class Monitor{
    public String color;
    public int dimension;
    public String resolution;

    public Monitor(String color, int dimension, String resolution){
        this.color = color;
        this.dimension = dimension;
        this.resolution = resolution;
    }

    String showData() {
        return "Information about the 1st Monitor:" +
                "\ncolor: " + color +
                "\n" + "dimensions: " + dimension + " inch" +
                "\n" + "resolution: " + resolution + "\n";
    }
    String showData1() {
        return "Information about 2nd Monitor:" +
                "\ncolor: " + color +
                "\n" + "dimensions: " + dimension + " inch" +
                "\n" + "resolution: " + resolution + "\n";
    }
}