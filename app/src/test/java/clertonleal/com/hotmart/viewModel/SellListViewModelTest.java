package clertonleal.com.hotmart.viewModel;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.SellAdapter;
import clertonleal.com.hotmart.model.Sell;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;


public class SellListViewModelTest {

    private SellListViewModel sellListViewModel;
    private SellAdapter sellAdapter;
    private List<Sell> mockSells;

    @Before
    public void setUp() {
        sellAdapter = Mockito.mock(SellAdapter.class);
        mockSells = DataProvider.getMockSells();
        sellListViewModel = new SellListViewModel(mockSells, sellAdapter);
    }

    @Test
    public void getAdapterShouldSetSells() throws Exception {
        sellListViewModel.getAdapter();
        verify(sellAdapter).setList(eq(mockSells));
    }
}
