package Laboratory_07;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        GeometricBody cube = new Cube(5);
        GeometricBody sphere = new Sphere(5);
        GeometricBody parallelepiped = new Parallelepiped(5, 15, 25);

        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();

        System.out.println("Basic Level:");

        System.out.println("\nCube:");
        System.out.println("Volume: " + cube.getVolume());
        System.out.println("Surface: " + cube.getSurface());

        System.out.println("\nSphere:");
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println("Surface: " + sphere.getSurface());

        System.out.println("\nParallelepiped:");
        System.out.println("Volume: " + parallelepiped.getVolume());
        System.out.println("Surface: " + parallelepiped.getSurface());


        bodies.add(cube);
        bodies.add(sphere);
        bodies.add(parallelepiped);

        System.out.println("\nAdvanced Level:\n");
        System.out.println("The biggest volume: " + GeometricBodyController.getBiggestSurfaceBody(bodies).getSurface());
        System.out.println("The biggest surface: " + GeometricBodyController.getBiggestVolumeBody(bodies).getVolume());

    }
}