public class MobileWallet extends DigitalPayment{
    private String noHp;
    private long feeTransferBank;

    public MobileWallet(String nama,long saldo,String noHp){
        super(nama,saldo,noHp);
    }

    public void setFeeTransferBank(long feeTransferBank) {
        this.feeTransferBank = feeTransferBank;
    }

    public String getNoHp() {
        return noHp;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (getSaldo() <= 0){
            System.out.println("input udak valid");
        }
        else if (getSaldo() <= nominal){
            System.out.println("saldo tidak cukup");

        }

    }
}
