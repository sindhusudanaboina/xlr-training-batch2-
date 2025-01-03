 public class Demo5 {
    public static void main(String[] args) {
        String username, password;
        username = "user001";
        password = "user_001";
        while((username == "user001") && (password == "user_001")) {
            System.out.println("username and password is correct");
            break;
        }
    }
}