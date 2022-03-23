public class GoPay extends eWallet{
    private int feeTopup;
    private int feeTransfer;
    private int feeWithdraw;

    public GoPay(User user) {
        super(user);
    }

    @Override
    public void topup(int jumlah) {
        super.topup(jumlah + 1000);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    @Override
    public void withdraw(int jumlah) {
        super.withdraw(jumlah + 2500);
    }

    @Override
    public void transfer(eWallet eWallet, int jumlah) {
        super.transfer(eWallet, jumlah + 500);
    }
}
