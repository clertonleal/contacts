package clertonleal.com.hotmart.viewModel;


import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.SellAdapter;
import clertonleal.com.hotmart.model.Sell;

public class SellListViewModel {

    private List<Sell> sells = DataProvider.getMockSells();

    public SellAdapter getAdapter() {
        SellAdapter sellAdapter = new SellAdapter();
        sellAdapter.setList(sells);
        return sellAdapter;
    }

}
