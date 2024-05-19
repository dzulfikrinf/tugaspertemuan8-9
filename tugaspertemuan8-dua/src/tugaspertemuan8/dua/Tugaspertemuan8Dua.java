package tugaspertemuan8.dua;

public class Tugaspertemuan8Dua {

    public static void main(String[] args) {
        Person person = new Person("Fikri", "Jalan Merdeka 123",
                "081234567890", "fikri@example.com");
        Student student = new Student("Mul Falah", "Jalan Sudirman 456",
                "081298765432", "mulfal@example.com", Student.MARU);
        Employee employee = new Employee("Zulfikar", "Jalan Thamrin 789",
                "081376543210", "zul@example.com", "Kantor Pusat",
                7000000, new MyDate(2022, 1, 10)); // January is 0
        Faculty faculty = new Faculty("Udin Jalaludin", "Jalan Gatot Subroto 321",
                "081365478921", "jalaludin@example.com", "Kantor Fakultas",
                15000000, new MyDate(), "9am - 5pm", "Professor");
        Staff staff = new Staff("Falah Fikri", "Jalan Mangga 654",
                "081298764321", "falah@example.com", "Kantor Administrasi",
                5000000, new MyDate(2024, 5, 10), "Manager");

        System.out.println(person);
        System.out.println();
        System.out.println(student);
        System.out.println();
        System.out.println(employee);
        System.out.println();
        System.out.println(faculty);
        System.out.println();
        System.out.println(staff);
    }
    
}
