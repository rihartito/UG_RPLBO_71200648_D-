import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private double cosumerMoney;
    private ArrayList<Double> acceptanceBalance;
    private ArrayList<Goods> goods;

    public VendingMachines(String code,int capacity){
        this.code = code;
        this.capacity =capacity;
    }
    public VendingMachines(String code,int capacity,Goods goods,double acceptanceBalance){
        this.code = code;
        this.capacity = capacity;

    }
    public void proceedOrder(String goodsCode,int orderQuantity){
        if (orderQuantity < 0){
            System.out.println("masukkan jumlah barang");
        }
        usedCapacity -= orderQuantity;

    }
    public void takeMoney(double money){
        if (money < 0){
            System.out.println("uang tidak cukup");
        if(money > 0){
            System.out.println("berhasil");
            cosumerMoney += money;
        }
        }
    }
    public void withdrawMoney(int money){
        cosumerMoney -= money;
    }

}
