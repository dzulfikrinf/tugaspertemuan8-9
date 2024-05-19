package tugaspertemuan8.dua;

public class Student extends Person {
    public static final String MARU = "Mahasiswa Baru";
    public static final String MAHASISWATAUN2 = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String nomorTelepon, String alamatEmail, String status) {
        super(nama, alamat, nomorTelepon, alamatEmail);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student" + "\n" + super.toString() + "\n" +
               "Status: " + status;
    }
}
