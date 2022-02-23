public class UG3soal2 {
    public static void main(String[] args) {
        int angka1=0,angka2=1,n3,i,hitung=10;
        System.out.print(angka1+" "+angka2);

        for(i=2;i<hitung;++i)
        {
            n3=angka1+angka2;
            System.out.print(" "+n3);
            angka1=angka2;
            angka2=n3;
        }
    }
}
