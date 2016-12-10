package clertonleal.com.hotmart.viewModel;


import android.view.View;

import clertonleal.com.hotmart.model.Message;

public class MessageViewModel {

    private Message message;

    public MessageViewModel(Message message) {
        this.message = message;
    }

    public int initialVisibility() {
        return message.getContactImage() == null ? View.VISIBLE : View.INVISIBLE;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}
