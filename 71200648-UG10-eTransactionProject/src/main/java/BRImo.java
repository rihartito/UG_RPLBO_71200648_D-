public class BRImo extends MobileBanking{
    public BRImo(String nama,long saldo,String noRekening){
        super(nama, saldo, noRekening);
    }

    @Override
    public void transfer(DigitalPayment dp, long nominal) {
        super.transfer(dp, nominal);
    }
}
