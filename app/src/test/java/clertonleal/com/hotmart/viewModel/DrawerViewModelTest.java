package clertonleal.com.hotmart.viewModel;

import android.databinding.ObservableBoolean;
import android.view.View;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.BaseDataBindingAdapter;
import clertonleal.com.hotmart.adapter.MenuAdapter;
import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.model.User;
import clertonleal.com.hotmart.view.activity.interfaces.MainView;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class DrawerViewModelTest {

    private MainView mainView;
    private DrawerViewModel drawerViewModel;
    private List<Menu> menu;
    private User user;
    private MenuAdapter adapter;

    @Before
    public void setUp() {
        mainView = mock(MainView.class);
        menu = DataProvider.getMockMenu();
        user = DataProvider.getMockUser();
        adapter = mock(MenuAdapter.class);
        drawerViewModel = new DrawerViewModel(mainView, adapter, menu, user);
    }

    @Test
    public void closeDrawerShouldNotify() throws Exception {
        drawerViewModel.drawerIsOpened = mock(ObservableBoolean.class);
        drawerViewModel.closeDrawer();
        verify(drawerViewModel.drawerIsOpened).set(eq(false));
    }

    @Test
    public void getUserShouldReturnCorrectUser() throws Exception {
        assertEquals(user, drawerViewModel.getUser());
    }

    @Test
    public void onSetContainerVisibilityToTrueVisibilityShouldBeVisible() throws Exception {
        drawerViewModel.setCounterVisible(true);
        assertEquals(View.VISIBLE, drawerViewModel.getCounterVisibility().get());
    }

    @Test
    public void onSetContainerVisibilityToFalseVisibilityShouldBeGone() throws Exception {
        drawerViewModel.setCounterVisible(false);
        assertEquals(View.GONE, drawerViewModel.getCounterVisibility().get());
    }

    @Test
    public void getAdapterShouldSetMenusAndClickListener() throws Exception {
        drawerViewModel.getAdapter();
        verify(adapter).setList(eq(menu));
        verify(adapter).setOnClick(any(BaseDataBindingAdapter.OnClick.class));
    }

    @Test
    public void onMenuClickShouldOpenFragment() throws Exception {
        drawerViewModel.onMenuClick(mock(Menu.class));
        mainView.openFragment(any(Menu.class));
    }
}
