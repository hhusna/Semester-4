/* Nama  : Miftahul Husna
 * NIM   : 222313208
 * Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 3 - TUGAS 1
 */


public class Customer {
    private String name;
    private boolean isMember = false;   //cek member
    private String memberType;          //cek tipe member

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    //apakah customer => member?
    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean isMember) {
        this.isMember = isMember;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String toString() {
        return "[name = " + name + ", member = " + isMember + ", member type = " + memberType + "]";
    }
}
