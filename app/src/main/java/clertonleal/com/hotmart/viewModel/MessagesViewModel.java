package clertonleal.com.hotmart.viewModel;

import android.view.View;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.MessagesAdapter;
import clertonleal.com.hotmart.model.Message;

public class MessagesViewModel {

    private List<Message> messages = DataProvider.getMockMessages();

    public MessagesAdapter getAdapter() {
        MessagesAdapter messagesAdapter = new MessagesAdapter();
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
