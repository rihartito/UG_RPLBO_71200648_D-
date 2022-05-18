import java.util.regex.Pattern;

public class InstaPost {
    private int totalMention;
    private String email;
    private String username;

    public InstaPost(int totalMention,String email,String username){
        this.totalMention = totalMention;
        this.email = email;
        this.username = username;
    }

    public InstaPost() {

    }

    public void login(String email){
        String[] arr = email.split("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@" + "[^-][A-Za-z0-9\\\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$");
        StringBuilder cb = new StringBuilder();
        if (email.equals(cb.toString())){
            this.email = email;
        }

    }

    public void post(String caption){
        String[] arr = caption.split("^@+[A-Za-z]");
        StringBuilder cb = new StringBuilder();
        if (caption.equals(cb.toString())){
            System.out.println(caption);
        }
    }
    public void printInfo(){
        System.out.println("username :" + username);
        System.out.println("Email :" + email);
        System.out.println("Total :" + totalMention);
    }

}
