package clertonleal.com.hotmart.adapter.viewHolder;


import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

public class DataBindingViewHolder <T extends ViewDataBinding> extends RecyclerView.ViewHolder {

    public T binding;

    public DataBindingViewHolder(T binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}
