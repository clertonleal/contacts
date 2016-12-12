package clertonleal.com.hotmart.viewModel;

import android.view.View;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.MessagesAdapter;
import clertonleal.com.hotmart.model.Message;

public class MessagesViewModel {

    private MessagesAdapter messagesAdapter;
    private List<Message> messages;

    public MessagesViewModel(List<Message> messages, MessagesAdapter messagesAdapter) {
        this.messages = messages;
        this.messagesAdapter = messagesAdapter;
    }

    public MessagesAdapter getAdapter() {
        messagesAdapter.setList(messages);
        return messagesAdapter;
    }

    public String counter() {
        return "+10";
    }

    public int counterVisibility() {
        return View.VISIBLE;
    }

}
