public class MainPerson {
    public static void main(String[] args) {
        Student student1 = new Student("Zahwa", "Jl Kaliurang", "Tata Boga", 2023, 1500000);
        System.out.println(student1);
        Student student2 = new Student("Desy", "Jl Cik Di Tiro", "Kecantikan", 2022, 2000000);
        System.out.println(student2);

        Staff staff1 = new Staff("Nurma", "Jl Magelang", "Kecantikan", 2700000);
        System.out.println(staff1);
    }
}
