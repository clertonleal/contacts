package clertonleal.com.hotmart.adapter;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import clertonleal.com.hotmart.adapter.viewHolder.DataBindingViewHolder;

public abstract class BaseDataBindingAdapter<M, B extends ViewDataBinding> extends RecyclerView.Adapter<DataBindingViewHolder<B>> {

    protected List<M> list = new ArrayList<>();
    protected OnClick<M> onClick;

    @Override
    public DataBindingViewHolder<B> onCreateViewHolder(ViewGroup parent, int viewType) {
        B binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), getLayout(), parent, false);
        return new DataBindingViewHolder<>(binding);
    }

    protected abstract int getLayout();

    @Override
    public void onBindViewHolder(DataBindingViewHolder<B> holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setList(List<M> list) {
        this.list = list;
    }

    public interface OnClick<M> {
        void onClick(M menu);
    }

    public void setOnClick(OnClick<M> onClick) {
        this.onClick = onClick;
    }
}
