public class identifikasiRupiah {


    static void indentifikasi(String input){
        String[] id = input.split("[^[+-]?[0-9]{1,3}(?:,?[0-9]{3})*(?:\\.[0-9]{2})?Rp]");
        StringBuilder baru = new StringBuilder();
        for(int i=0; i< id.length;i++){
            baru.append(id[i]);
        }
        System.out.println(baru);
    }

    public static void main(String[] args) {
        String coba ="harganya adalah Rp200.500,00 Rp200.500,00 Rp200.500,00";
        indentifikasi(coba);
    }
}
