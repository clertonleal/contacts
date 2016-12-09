package clertonleal.com.hotmart;


import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import clertonleal.com.hotmart.databinding.RowMessageBinding;

public class MessagesAdapter extends RecyclerView.Adapter<DataBindingViewHolder<RowMessageBinding>> {

    private List<Message> messages = new ArrayList<>();

    @Override
    public DataBindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RowMessageBinding rowMessageBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_message, parent, false);
        return new DataBindingViewHolder<>(rowMessageBinding);
    }

    @Override
    public void onBindViewHolder(DataBindingViewHolder<RowMessageBinding> holder, int position) {
        Message message = messages.get(position);
        holder.binding.setMessage(message);

        if (message.getContactImage() == null) {
            holder.binding.profileImage.setImageResource(message.getContactColor());
        } else {
            Picasso.with(holder.binding.profileImage.getContext()).load(message.getContactImage()).error(R.drawable.profile_placeholder).into(holder.binding.profileImage);
        }
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
