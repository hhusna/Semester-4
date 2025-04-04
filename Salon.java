/* Nama  : Miftahul Husna
 * NIM   : 222313208
 * Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 3 - TUGAS 1
 */


import java.time.LocalDate;

public class Salon {
    public static void main(String[] args) {
        // Membuat customer dengan status member yang benar
        Customer cs1 = new Customer("Husna");
        cs1.setMember(true);
        cs1.setMemberType("silver");

        Customer cs2 = new Customer("Syafa");
        cs2.setMember(true);
        cs2.setMemberType("gold");

        Customer cs3 = new Customer("Javu");
        cs3.setMember(false);

        // Gunakan customer yang sudah ada saat membuat Visit
        Visit v1 = new Visit(cs1, LocalDate.of(2023, 7, 12));
        v1.setProductExpense(12.5);
        v1.setServiceExpense(9.1);
        System.out.println(v1);

        Visit v2 = new Visit(cs2, LocalDate.of(2020, 12, 2));
        v2.setProductExpense(9.9);
        v2.setServiceExpense(7.8);
        System.out.println(v2);

        Visit v3 = new Visit(cs3, LocalDate.now());
        v3.setProductExpense(8.5);
        v3.setServiceExpense(7.7);
        System.out.println(v3);
    }
}
