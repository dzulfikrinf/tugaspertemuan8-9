package tugaspertemuan8;

public class GeometricObject {
    private String warna;
    private boolean terisi;

    public GeometricObject() {
        this.warna = "white";
        this.terisi = false;
    }

    public GeometricObject(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean diisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "GeometricObject{warna=" + warna + ", terisi=" + terisi + "}";
    }
}

