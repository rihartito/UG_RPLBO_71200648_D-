import java.util.Scanner;

public class Main {
    String Mobil;
        public void setMobil(String M_71200648) {
            Mobil = M_71200648;


        }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Kode lampu lalu lintas saat ini:");
        int kodeLampu = inp.nextInt();


        if (kodeLampu == 1){System.out.println("Mobil akan jalan dan pejalan kaki akan menunggu");
            if(kodeLampu == 2){
               System.out.println("Mobil akan mengurangi kecepatan dan pejalan kaki akan bersiap untuk menyebrang jalan");
            if (kodeLampu == 3){
                System.out.println("mobil akan berhenti dan pejalan kaki akan menyebrangi jalan");

            }
           }
        }
    }



}
