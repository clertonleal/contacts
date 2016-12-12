package clertonleal.com.hotmart.model;


import com.google.common.base.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Float.compare(user.balance, balance) == 0 &&
                Objects.equal(name, user.name) &&
                Objects.equal(email, user.email) &&
                Objects.equal(photoUrl, user.photoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, email, photoUrl, balance);
    }
}
