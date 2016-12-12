package clertonleal.com.hotmart.viewModel;


import java.util.List;

import clertonleal.com.hotmart.adapter.SellAdapter;
import clertonleal.com.hotmart.model.Sell;

public class SellListViewModel {

    private SellAdapter sellAdapter;
    private List<Sell> sells;

    public SellListViewModel(List<Sell> sells, SellAdapter sellAdapter) {
        this.sellAdapter = sellAdapter;
        this.sells = sells;
    }

    public SellAdapter getAdapter() {
        sellAdapter.setList(sells);
        return sellAdapter;
    }

}
