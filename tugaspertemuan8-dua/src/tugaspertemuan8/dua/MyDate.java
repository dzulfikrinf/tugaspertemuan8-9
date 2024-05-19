package tugaspertemuan8.dua;
import java.util.GregorianCalendar;

public class MyDate {
    private int tahun;
    private int bulan;
    private int hari;

    public MyDate(int tahun, int bulan, int hari) {
        this.tahun = tahun;
        this.bulan = bulan;
        this.hari = hari;
    }
    
     public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.tahun = calendar.get(GregorianCalendar.YEAR);
        this.bulan = calendar.get(GregorianCalendar.MONTH) + 1;
        this.hari = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        return tahun + "/" + bulan + "/" + hari;
    }
}



