package clertonleal.com.hotmart.viewModel;

import android.view.View;

import org.junit.Before;
import org.junit.Test;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.model.Sell;

import static junit.framework.Assert.assertEquals;

public class SellViewModelTest {

    private SellViewModel sellViewModel;
    private Sell sell;

    @Before
    public void setUp() {
        sell = DataProvider.getMockSells().get(0);
        sellViewModel = new SellViewModel(sell);
    }

    @Test
    public void idShouldBe30294080() throws Exception {
        assertEquals("id 30294080", sellViewModel.id());
    }

    @Test
    public void dateShouldBe12_12_2016() throws Exception {
        assertEquals("12/12/2016", sellViewModel.date());
    }

    @Test
    public void alertShouldBeVisible() throws Exception {
        assertEquals(View.VISIBLE, sellViewModel.alarmVisible());
    }

    @Test
    public void valueShouldBe30294080() throws Exception {
        assertEquals("R$ 1.035,00", sellViewModel.value());
    }
}
