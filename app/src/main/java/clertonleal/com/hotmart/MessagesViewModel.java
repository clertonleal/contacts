package clertonleal.com.hotmart;

import java.util.List;

public class MessagesViewModel {

    private List<Message> messages = DataProvider.getMockMessages();

    public MessagesAdapter getAdapter() {
        MessagesAdapter messagesAdapter = new MessagesAdapter();
        messagesAdapter.setMessages(messages);
        return messagesAdapter;
    }

}
