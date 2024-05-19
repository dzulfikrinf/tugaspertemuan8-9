package tugaspertemuan8;

import java.util.Scanner;

public class Tugaspertemuan8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi 1 dari segitiga: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi 2 dari segitiga: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi 3 dari segitiga: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna dari segitiga: ");
        String warna = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean terisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println("\nDetail segitiga:");
        System.out.println(segitiga);
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.diisi());
    }
}
    

