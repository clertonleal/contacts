package clertonleal.com.hotmart.viewModel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.MenuAdapter;
import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.model.User;
import clertonleal.com.hotmart.view.activity.interfaces.MainView;

public class DrawerViewModel {

    private MainView mainView;

    public ObservableBoolean drawerIsOpened = new ObservableBoolean(false);
    private List<Menu> menus;
    private User user;
    private MenuAdapter menuAdapter;
    private ObservableInt counterVisibility = new ObservableInt(View.VISIBLE);
    public ObservableField<String> counterValue = new ObservableField<>("+10");

    public DrawerViewModel(MainView mainView, MenuAdapter menuAdapter, List<Menu> menus, User user) {
        this.mainView = mainView;
        this.menus = menus;
        this.user = user;
        this.menuAdapter = menuAdapter;
    }

    public MenuAdapter getAdapter() {
        menuAdapter.setList(menus);
        menuAdapter.setOnClick(this::onMenuClick);
        return menuAdapter;
    }

    public void onMenuClick(Menu menu) {
        mainView.openFragment(menu);
    }

    public void closeDrawer() {
        drawerIsOpened.set(false);
        drawerIsOpened.notifyChange();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ObservableInt getCounterVisibility() {
        return counterVisibility;
    }

    public void setCounterVisibility(ObservableInt counterVisibility) {
        this.counterVisibility = counterVisibility;
    }

    public void setCounterValue(String counterValue) {
        this.counterValue.set(counterValue);
    }

    public void setCounterVisible(boolean counterVisible) {
        if (counterVisible) {
            counterVisibility.set(View.VISIBLE);
        } else {
            counterVisibility.set(View.GONE);
        }

    }
}
