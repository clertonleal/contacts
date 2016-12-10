package clertonleal.com.hotmart.viewModel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.view.View;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.adapter.MenuAdapter;
import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.model.User;
import clertonleal.com.hotmart.view.activity.MainView;

public class DrawerViewModel {

    public DrawerViewModel(MainView mainView) {
        this.mainView = mainView;
    }

    private MainView mainView;

    public ObservableBoolean drawerIsOpened = new ObservableBoolean(false);

    private List<Menu> menus = DataProvider.getMockMenu();
    private User user = DataProvider.getMockUser();
    private ObservableInt counterVisibility = new ObservableInt(View.VISIBLE);
    public ObservableField<String> counterValue = new ObservableField<>("+10");

    public MenuAdapter getAdapter() {
        MenuAdapter menuAdapter = new MenuAdapter();
        menuAdapter.setList(menus);
        menuAdapter.setOnClick(menu -> mainView.openFragment(menu));
        return menuAdapter;
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
