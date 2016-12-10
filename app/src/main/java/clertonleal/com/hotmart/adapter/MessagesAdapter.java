package clertonleal.com.hotmart.adapter;

import com.squareup.picasso.Picasso;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.adapter.viewHolder.DataBindingViewHolder;
import clertonleal.com.hotmart.databinding.RowMessageBinding;
import clertonleal.com.hotmart.model.Message;

public class MessagesAdapter extends BaseDataBindingAdapter<Message, RowMessageBinding> {

    @Override
    protected int getLayout() {
        return R.layout.row_message;
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<RowMessageBinding> holder, int position) {
        Message message = list.get(position);
        holder.binding.setMessage(message);

        if (message.getContactImage() == null) {
            holder.binding.profileImage.setImageResource(message.getContactColor());
        } else {
            Picasso.with(holder.binding.profileImage.getContext()).load(message.getContactImage()).
                    error(R.drawable.profile_placeholder).
                    into(holder.binding.profileImage);
        }
    }

}
