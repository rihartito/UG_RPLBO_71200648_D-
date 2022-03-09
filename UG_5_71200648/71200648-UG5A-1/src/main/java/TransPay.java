
public class TransPay {
    private String nama;
    private long saldo;

    public void setNama(String name){
        nama =name;
    }
    public void setSaldo(long nominal){
        if (nominal > 0)
            saldo =nominal;

    }

    public String getNama() {
        return nama;
    }

    public long getSaldo() {
        return saldo;
    }
    public void topUp(long jumlah){
        if(jumlah>0 && saldo>=jumlah){
            saldo -= jumlah;
        }
    }
    public void  bayar(int jumlah,String mrk,long hrg){
        if (jumlah > 0){

        }
    }
    public TransPay(TransPay user){

    }

}

