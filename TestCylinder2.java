/* Nama  : Miftahul Husna
 * NIM   : 222313208
 * Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 3 - TUGAS 1
 */

public class TestCylinder2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2(7.0, "Blue");
        Cylinder2 cr2 = new Cylinder2(c1, 12.0);

        System.out.println(c1);

        System.out.println("Base Circle = " + cr2.getBase());
        System.out.println("Cylinder Height = " +cr2.getHeight());
        System.out.println("Cylinder Volume = " + cr2.getVolume());
    }
}
