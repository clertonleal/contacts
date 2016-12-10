package clertonleal.com.hotmart.model;


public class User {

    public User(String name, String email, String photoUrl, float balance) {
        this.name = name;
        this.email = email;
        this.photoUrl = photoUrl;
        this.balance = balance;
    }

    private String name;
    private String email;
    private String photoUrl;
    private float balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
