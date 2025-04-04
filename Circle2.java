/* Nama  : Miftahul Husna
 * NIM   : 222313208
 * Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 3 - TUGAS 1
 */


public class Circle2 {
    private double radius;
    private String color;

    public Circle2() {
        radius=1.0;
    }

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius = " + radius + ", color = " + color + "]";
    }
}
