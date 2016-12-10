package clertonleal.com.hotmart.viewModel;


import android.view.View;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

import clertonleal.com.hotmart.model.Sell;

public class SellViewModel {

    public SellViewModel(Sell sell) {
        this.sell = sell;
    }

    private Sell sell = new Sell();

    public Sell getSell() {
        return sell;
    }

    public String id() {
        return "id " + sell.getId();
    }

    public String date() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        return simpleDateFormat.format(sell.getDate());
    }

    public int alarmVisible() {
        return sell.isAlert() ? View.VISIBLE : View.GONE;
    }

    public String value() {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return numberFormat.format(sell.getValue());
    }
}
