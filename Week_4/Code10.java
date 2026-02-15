import java.io.*;

class ThreeDObject {
    double wholeSurfaceArea() {
        return 0;
    }

    double volume() {
        return 0;
    }
}

class Box extends ThreeDObject {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (l*w + l*h + w*h);
    }

    @Override
    double volume() {
        return l * w * h;
    }
}

class Cube extends ThreeDObject {
    double s;

    Cube(double s) {
        this.s = s;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * s * s;
    }

    @Override
    double volume() {
        return s * s * s;
    }
}

class Cuboid extends ThreeDObject {
    double l, b, h;

    Cuboid(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (l*b + b*h + l*h);
    }

    @Override
    double volume() {   // must be double
        return l * b * h;
    }
}

class Code10 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Box
        System.out.println("Enter Length, Width and Height for Box:");
        double l = Double.parseDouble(br.readLine());
        double w = Double.parseDouble(br.readLine());
        double h = Double.parseDouble(br.readLine());

        Box ob1 = new Box(l, w, h);
        System.out.println("Surface Area of Box: " + ob1.wholeSurfaceArea());
        System.out.println("Volume of Box: " + ob1.volume());

        // Cube
        System.out.println("Enter Side for Cube:");
        double s = Double.parseDouble(br.readLine());

        Cube ob2 = new Cube(s);
        System.out.println("Surface Area of Cube: " + ob2.wholeSurfaceArea());
        System.out.println("Volume of Cube: " + ob2.volume());

        // Cuboid
        System.out.println("Enter Length, Breadth and Height for Cuboid:");
        double l2 = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double h2 = Double.parseDouble(br.readLine());

        Cuboid ob3 = new Cuboid(l2, b, h2);
        System.out.println("Surface Area of Cuboid: " + ob3.wholeSurfaceArea());
        System.out.println("Volume of Cuboid: " + ob3.volume());
    }
}
