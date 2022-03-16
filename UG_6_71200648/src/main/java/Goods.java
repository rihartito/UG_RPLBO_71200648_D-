public class Goods {
    private String code;
    private String name;
    private int quanity;
    private double price;

    public Goods(String code,String name){
        this.code = code;
        this.name = name;
    }
    public Goods(String code,String name,int quanity,double price){
        this.code = code;
        this.name = name;
        this.quanity =quanity;
        this.price = price;
    }

}
