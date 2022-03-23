public class ShopeePay extends eWallet {
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public ShopeePay(User user){
        super(user);
    }

    @Override
    public void topup(int jumlah) {
        super.topup(jumlah + 500);
    }

    @Override
    public void transfer(eWallet eWallet, int jumlah) {
        super.transfer(eWallet, jumlah);
    }

    @Override
    public void withdraw(int jumlah) {
        super.withdraw(jumlah + 1000);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
