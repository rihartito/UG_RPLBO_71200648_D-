public class Dana extends  MobileWallet{
    private long danaFeeTransferBank = -1000;

    public Dana(String nama,long saldo,String noHp){
        super(nama, saldo, noHp);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
