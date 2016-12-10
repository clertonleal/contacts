package clertonleal.com.hotmart.viewModel;


import java.text.NumberFormat;
import java.util.Locale;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.model.User;

public class ProfileViewModel {

    private User user = DataProvider.getMockUser();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String balance() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return numberFormat.format(user.getBalance());
    }
}
