package clertonleal.com.hotmart.viewModel;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.MenuAdapter;
import clertonleal.com.hotmart.model.Menu;

public class DrawerViewModel {

    public ObservableBoolean drawerIsOpened = new ObservableBoolean(false);
    public ObservableField<String> toolbarTitle = new ObservableField<>();

    private List<Menu> menus = DataProvider.getMockMenu();

    public MenuAdapter getAdapter() {
        MenuAdapter menuAdapter = new MenuAdapter();
        menuAdapter.setMenus(menus);
        return menuAdapter;
    }

    private void openDrawer() {
        drawerIsOpened.set(true);
        drawerIsOpened.notifyChange();
    }

    private void closeDrawer() {
        drawerIsOpened.set(false);
        drawerIsOpened.notifyChange();
    }

}
