/* Nama  : Miftahul Husna
 * NIM   : 222313208
 * Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 3 - TUGAS 1
 */


public class Cylinder2 {
    private Circle2 base; //has a realtionship
    private double height;

    public Cylinder2() {
        height=1.0;
    }

    public Cylinder2(Circle2 base, double height) {
        this.base=base;
        this.height = height;
    }

    public Circle2 getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder[base = " + base + ", height = " + height + "]";
    }
}
