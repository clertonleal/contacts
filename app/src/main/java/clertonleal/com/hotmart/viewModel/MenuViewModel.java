package clertonleal.com.hotmart.viewModel;


import android.view.View;

import clertonleal.com.hotmart.model.Menu;

public class MenuViewModel {

    private Menu menu;

    public MenuViewModel(Menu menu) {
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String count() {
        return String.valueOf(menu.getCount());
    }

    public int counterVisibility() {
        return menu.getCount() == 0 ? View.GONE : View.VISIBLE;
    }
}
