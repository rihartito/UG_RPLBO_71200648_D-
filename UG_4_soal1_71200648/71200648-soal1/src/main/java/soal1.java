

public class soal1 {
    String Bus,name,Driver,ROUTE,destiny;
    int CAPACITY,usedCapacity,Profit,Passanger,saldo;

    int getUsedcapacity(){return usedCapacity ;}

    void setCAPACITY(){
        if(Passanger<=  25){
            CAPACITY += Passanger;
            CAPACITY += usedCapacity;

        }
    }
    void dropPassanger(int jumlah){
        CAPACITY -= 1;
    }
    void getRoute(){
        System.out.println("1.Kampus UKDW");
        System.out.println("2.Asrama Omah Babadan");
        System.out.println("3.Asrama Teologi");
    }
    void setSaldo(int jumlahSaldo){
        if(saldo > jumlahSaldo){
            saldo -= jumlahSaldo;
        if(jumlahSaldo > saldo)
            System.out.println("kurang");

        }

    }

    private static void initiateMenu(){
        //menginisialisasikan object penumpang
        Passenger adit = new Passenger("Adit","adit@gmail.com",100000);
        Passenger surya = new Passenger("Surya","surya@gmail.com",20000);
        Passenger krismon = new Passenger("Krismon","krismon@gmail.com", 10000);
        Driver pakTole = new Driver("Pak Tole","pria",35);

        Bus dutaBus = new Bus("Duta Bus",pakTole);


        System.out.println("Duta Bus");

        menu(adit,dutaBus);

        menu(surya,dutaBus);

        menu(krismon,dutaBus);


        System.out.println("Pemberhentian pertama telah sampai pada Kampus Universitas Kristen Duta Wacana");
        dutaBus.dropPassengers(dutaBus.getRoute()[0],adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[0],surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[0],krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();


        System.out.println("Pemberhentian kedua telah sampai pada Asrama Omah Babadan");
        dutaBus.dropPassengers(dutaBus.getRoute()[1],adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[1],surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[1],krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();


        System.out.println("Pemberhentian ketiga telah sampai pada Asrama Teologi");
        dutaBus.dropPassengers(dutaBus.getRoute()[2],adit);
        dutaBus.dropPassengers(dutaBus.getRoute()[2],surya);
        dutaBus.dropPassengers(dutaBus.getRoute()[2],krismon);
        System.out.println("Sisa penumpang sebanyak " + dutaBus.getUsedCapacity() + " orang");
        System.out.println("============================================");
        System.out.println();
        System.out.println();


        System.out.println("Keuntungan hari ini");
        System.out.println("Keuntungan sebesar : Rp " +dutaBus.getProfit() + "0;-");
    }

    private static void menu(Passenger passenger, Bus bus){
        System.out.println("Selamat Datang Kak " + passenger.getName());
        System.out.println("============================================\n\n\n");
    }

    private static void showDestination(
            Bus bus,
            Passenger passenger
    ){
        String destiny;
        int i = 0;
        System.out.println("Pilihan rute perjalanan");
        for(String rute : bus.getRoute()){
            i++;
            System.out.print(i + ". " + rute + "\n");
        }
        System.out.print("masukan destinasi perjalanan anda : ");
        destiny = scanner.nextLine();
        scanner.reset();

        if(destiny.isEmpty()) {

        }
        else{
            for(String route: bus.getRoute()){

            }
        }
    }

    private static void topUpMenu(
            Bus bus,
            Passenger passenger
    ){
        String choice;
        double balance;
        System.out.println("Anda ingin top up ?");
        System.out.print("jawaban anda (ya/tidak): ");
        choice = scanner.nextLine();

        if(choice.equalsIgnoreCase("ya")) {
            System.out.print("Masukan nominal top up : ");

        }
        else if(choice.equalsIgnoreCase("tidak")){

        }
        else{
               }

    }
}



