public class Ovo extends MobileWallet{
    private  long ovoTransferBank = -2000;

    public Ovo(String nama,long saldo,String noHp){
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
