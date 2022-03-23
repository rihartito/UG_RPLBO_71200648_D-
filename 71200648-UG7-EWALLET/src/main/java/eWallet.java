
public class eWallet {
    private User user;
    private int saldo;

public eWallet(User user){
    user = new User(user.getNama(), user.getEmail(), user.getUang());

}

public void topup(int jumlah) {
    if (jumlah > 0 && user.getUang() > 0)
        saldo = user.getUang()- jumlah;

    }

    public int getSaldo() {
        return saldo;
    }

    public void transfer(eWallet eWallet, int jumlah){
    int ceksaldo = saldo -jumlah;
    if(ceksaldo > 0 && jumlah > 0)
        saldo = ceksaldo;
}
public void withdraw(int jumlah){
    int ceksaldo = saldo -jumlah;
    if(ceksaldo > 0 && jumlah > 0)
        saldo= user.getUang() + ceksaldo;
}
public void getInfo(){
    System.out.println("Nama" + user.getNama() + user.getPIN() + "Email" + user.getEmail() + "Uang cash" + user.getUang() + "saldo" + getSaldo());
}
}
