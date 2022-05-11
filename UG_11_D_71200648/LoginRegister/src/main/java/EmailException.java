public class EmailException {
    private  String email;

    public EmailException(String email){
        this.email =email;
        if (email.isEmpty()){
            System.out.println("tidak boleh kosong");
        }else if (email.length()<6 || email.length()>25) {
            System.out.println("berhasil");
        }else {
            System.out.println("error");
        }
    }

}
