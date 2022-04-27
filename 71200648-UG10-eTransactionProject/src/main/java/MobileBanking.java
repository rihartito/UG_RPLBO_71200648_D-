public class MobileBanking extends DigitalPayment {
    private boolean checkFee;
    private long feeAntarBank = -6000;
    private String noRekening;


    public MobileBanking(String nama, long saldo, String noRekening){
        super(nama,saldo,noRekening);

    }

    public String getNoRekening() {
        return noRekening;
    }

    public boolean isCheckFee() {
        return checkFee;
    }

    public void setCheckFee(boolean checkFee) {
        this.checkFee = checkFee;
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        if (getSaldo() <= 0){
            System.out.println("input tidak valid");
        }
        else if (getSaldo() <= nominal){
            System.out.println("saldo tidak cukup");

        }
        else if (checkFee == true){
            long hitung = this.getSaldo() + -nominal + feeAntarBank;
            this.setSaldo(nominal);
        }


    }
}
