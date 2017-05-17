package User;

public class User {
    static int count = 0;
    private String name;
    private String password;
    private String firstName;
    private String lastName;
    private String email;

    public User(String name, String password, String firstName, String lastName, String email){
        this.name = name;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printInfo(){
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append('<').append(this.getName()).append(" ").append(this.getFirstName()).append(" ")
                .append(this.getLastName()).append(" ").append(this.getEmail()).append(" ").append(this.getPassword())
                .append(">").append(" User number ").append(count));

    }
}
