package clertonleal.com.hotmart.adapter;


import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.adapter.viewHolder.DataBindingViewHolder;
import clertonleal.com.hotmart.databinding.RowDrawerMenuBinding;
import clertonleal.com.hotmart.model.Menu;

public class MenuAdapter extends RecyclerView.Adapter<DataBindingViewHolder<RowDrawerMenuBinding>> {

    private List<Menu> menus = new ArrayList<>();

    @Override
    public DataBindingViewHolder<RowDrawerMenuBinding> onCreateViewHolder(ViewGroup parent, int viewType) {
        RowDrawerMenuBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_drawer_menu, parent, false);
        return new DataBindingViewHolder<>(binding);
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<RowDrawerMenuBinding> holder, int position) {
        holder.binding.setMenu(menus.get(position));
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}
