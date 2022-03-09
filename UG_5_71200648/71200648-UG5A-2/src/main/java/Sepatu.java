public class Sepatu {
    private String kode;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;
    private static int nextNum = 20 ;

    public String getKode(){
        return kode + nextNum++;
    }
    public String getMerkModel(){
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }
    public int getStok(){
        return stok;
    }
    public Sepatu(String merk,int ukr,int hrg,int stk ){
        merkModel = merk;

        ukuran = ukr;
        harga = hrg;
        stok = stk;
    }
}
