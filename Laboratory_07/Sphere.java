package Laboratory_07;

public class Sphere implements GeometricBody {
    private float r;

    public Sphere(float r) {
        this.r = r;
    }

    public float getSurface() {
        return (float)Math.PI * (r * r) * 4;
    }

    public float getVolume() {
        return (float)Math.PI * (r * r * r) * (4/3);
    }
}
