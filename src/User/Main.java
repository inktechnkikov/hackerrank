package User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Stamat","123","Stambata","Stambata1","St@abv.bg");
        user.setName("Momo");
        user.setPassword("2356");
        user.printInfo();

        User user1 = new User("Gogo","pass","Georgi","Atanasov","mail.bg");
        user1.printInfo();
    }
}
