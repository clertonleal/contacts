package clertonleal.com.hotmart.adapter;


import android.content.Context;
import android.support.v4.content.ContextCompat;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.adapter.viewHolder.DataBindingViewHolder;
import clertonleal.com.hotmart.databinding.SellRowBinding;
import clertonleal.com.hotmart.model.Sell;
import clertonleal.com.hotmart.viewModel.SellViewModel;

public class SellAdapter extends BaseDataBindingAdapter<Sell, SellRowBinding> {

    @Override
    protected int getLayout() {
        return R.layout.sell_row;
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<SellRowBinding> holder, int position) {
        holder.binding.setViewModel(new SellViewModel(list.get(position)));

        Context context = holder.binding.container.getContext();
        if (position % 2 == 0) {
            holder.binding.container.setBackgroundColor(ContextCompat.getColor(context, android.R.color.white));
        } else {
            holder.binding.container.setBackgroundColor(ContextCompat.getColor(context, R.color.disabled));
        }
    }
}
