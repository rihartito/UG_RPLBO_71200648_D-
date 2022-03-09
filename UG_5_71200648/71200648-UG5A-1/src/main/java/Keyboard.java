public class Keyboard {
    private String merkModel;
    private long harga;

    public void setMerkModel(String merek){
        merkModel = merek;
    }
    public void setHarga(long hrg){
        if (hrg > 0){
            harga =hrg;
        }
    }

    public String getMerkModel() {
        return merkModel;
    }

    public long getHarga() {
        return harga;
    }
}
