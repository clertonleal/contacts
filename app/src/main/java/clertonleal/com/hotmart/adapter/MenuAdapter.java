package clertonleal.com.hotmart.adapter;

import android.content.Context;
import android.support.v4.content.ContextCompat;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.adapter.viewHolder.DataBindingViewHolder;
import clertonleal.com.hotmart.databinding.RowDrawerMenuBinding;
import clertonleal.com.hotmart.model.Menu;
import clertonleal.com.hotmart.viewModel.MenuViewModel;

public class MenuAdapter extends BaseDataBindingAdapter<Menu, RowDrawerMenuBinding> {

    @Override
    protected int getLayout() {
        return R.layout.row_drawer_menu;
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<RowDrawerMenuBinding> holder, int position) {
        Menu menu = list.get(position);
        holder.binding.setViewModel(new MenuViewModel(menu));
        Context context = holder.binding.background.getContext();

        if (menu.isEnabled()) {
            holder.binding.background.setBackgroundColor(ContextCompat.getColor(context, android.R.color.white));
            holder.binding.textMenu.setTextColor(ContextCompat.getColor(context, android.R.color.black));
        } else {
            holder.binding.background.setBackgroundColor(ContextCompat.getColor(context, R.color.disabled));
            holder.binding.textMenu.setTextColor(ContextCompat.getColor(context, R.color.gray));
        }

        if (onClick != null) {
            holder.binding.background.setOnClickListener(view -> onClick.onClick(list.get(position)));
        }
    }
}
