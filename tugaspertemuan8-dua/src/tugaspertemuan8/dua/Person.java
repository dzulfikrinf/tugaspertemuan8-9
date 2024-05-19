package tugaspertemuan8.dua;

public class Person {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String alamatEmail;

    public Person(String nama, String alamat, String nomorTelepon, String alamatEmail) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.alamatEmail = alamatEmail;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public String getAlamatEmail() {
        return alamatEmail;
    }

    // Setters
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void setAlamatEmail(String alamatEmail) {
        this.alamatEmail = alamatEmail;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\n" +
               "Alamat: " + alamat + "\n" +
               "Nomor Telepon: " + nomorTelepon + "\n" +
               "Alamat Email: " + alamatEmail;
    }
}


