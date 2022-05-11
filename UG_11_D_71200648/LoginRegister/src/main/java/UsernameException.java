public class UsernameException extends User{
    private  String username;

    public UsernameException(String username){
        super();
        this.username = username;

            if (username.isEmpty()){
                System.out.println("tidak boleh kosong");
            }else if (username.length()<6 || username.length()>25) {
                System.out.println("berhasil");
            }else {
                System.out.println("error");
            }
        }
    }

