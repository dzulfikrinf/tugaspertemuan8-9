package tugaspertemuan8.dua;

public class Staff extends Employee {
    private String jabatan;

    public Staff(String nama, String alamat, String nomorTelepon,
            String alamatEmail, String kantor, double gaji,
            MyDate tanggalDipekerjakan, String jabatan) {
        super(nama, alamat, nomorTelepon, alamatEmail, kantor, gaji, tanggalDipekerjakan);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return "Staff" + "\n" + super.toString() + "\n" +
               "Jabatan: " + jabatan;
    }
}

