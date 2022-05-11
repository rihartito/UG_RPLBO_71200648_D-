public class PasswordException {
    private int password;

    public PasswordException(int password) {
        this.password = password;
        if (password == 0) {
            System.out.println("tidak boleh kosong");
        } else if (password < 7 || password > 25) {
            System.out.println("berhasil");
        } else {
            System.out.println("error");
        }
    }

}
