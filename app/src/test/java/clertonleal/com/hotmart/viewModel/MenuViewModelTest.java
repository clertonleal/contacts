package clertonleal.com.hotmart.viewModel;

import android.view.View;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.model.Menu;

import static junit.framework.Assert.*;

public class MenuViewModelTest {

    private MenuViewModel menuViewModel;
    private Menu menu = DataProvider.getMockMenu().get(0);

    @Before
    public void setUp() {
        menuViewModel = new MenuViewModel(menu);
    }

    @Test
    public void menuCountShouldBe0() throws Exception {
        assertEquals("0", menuViewModel.count());
    }

    @Test
    public void counterVisibilityShouldBeGone() throws Exception {
        assertEquals(View.GONE, menuViewModel.counterVisibility());
    }
}
