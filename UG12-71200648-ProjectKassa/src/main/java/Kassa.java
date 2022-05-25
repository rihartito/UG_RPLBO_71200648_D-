import java.util.ArrayList;
import java.util.HashMap;

public class Kassa {
    private HashMap<Produk, Integer> pesanan;
    private ArrayList<Kasir> arrKasir;
    private Kasir kasir;

    public Kassa(){

    }


    public void register(Kasir kasir) {
        arrKasir.add(kasir);
    }

    public void login(String username, String password) {
        if(arrKasir.contains(kasir.getUsername())){
           if (arrKasir.contains(kasir.getPassword())){
               System.out.println("login berhasil");
           }else System.out.println("login gagal");
       }
    }

    public void tambahPesanan(Produk produk, int jumlah) {
        pesanan.put(produk, jumlah);

    }

    public void printNota() {
        System.out.println("Sub total :"+ kasir.getTotalPenjualan() + pesanan);

    }

    public void printPenjualanKasir() {
        for (Kasir i : arrKasir) {
            System.out.println(i);

        }
    }
}
