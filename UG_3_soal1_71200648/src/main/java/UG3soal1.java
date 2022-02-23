import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class UG3soal1 {
    public static void main(String[] args) {
        String Nama,tanggal;
        int jumlah,berat;

        Scanner input = new Scanner(System.in);
        System.out.println("=======Data Product========");
        System.out.print("Nama Makanan :");
        Nama = input.nextLine();
        System.out.print("Tanggal kadaluarsa :");
        tanggal=input.nextLine();
        System.out.print("jumlah :");
        jumlah=input.nextInt();
        System.out.print("Berat(gram) :");
        berat=input.nextInt();

        System.out.println("=======Data Product========");
        System.out.println("Nama makanan :"+Nama);
        System.out.println("Tanggal kadaluarsa :"+tanggal);
        System.out.println("jumlah :"+jumlah);
        System.out.println("Berat(gram) :"+berat);


    }
}
