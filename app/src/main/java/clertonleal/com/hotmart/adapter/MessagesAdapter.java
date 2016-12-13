package clertonleal.com.hotmart.adapter;

import com.squareup.picasso.Picasso;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.adapter.viewHolder.DataBindingViewHolder;
import clertonleal.com.hotmart.databinding.RowMessageBinding;
import clertonleal.com.hotmart.model.Message;
import clertonleal.com.hotmart.viewModel.MessageViewModel;

public class MessagesAdapter extends BaseDataBindingAdapter<Message, RowMessageBinding> {

    @Override
    protected int getLayout() {
        return R.layout.row_message;
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<RowMessageBinding> holder, int position) {
        Message message = list.get(position);
        holder.binding.setViewModel(new MessageViewModel(message));
        holder.binding.textInitial.setTag(String.valueOf(position));
        holder.binding.profileImage.setTag(String.valueOf(position));

        if (message.getContactImage() == null) {
            holder.binding.profileImage.setImageResource(message.getContactColor());
        } else {
            Picasso.with(holder.binding.profileImage.getContext()).load(message.getContactImage()).
                    error(R.drawable.profile_placeholder).
                    into(holder.binding.profileImage);
        }
    }

}
