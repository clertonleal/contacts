package clertonleal.com.hotmart.viewModel;

import android.view.View;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.adapter.MessagesAdapter;
import clertonleal.com.hotmart.model.Message;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MessagesViewModelTest {

    private MessagesViewModel messagesViewModel;
    private List<Message> messages = DataProvider.getMockMessages();
    private MessagesAdapter messagesAdapter;

    @Before
    public void setUp() {
        messagesAdapter = mock(MessagesAdapter.class);
        messagesViewModel = new MessagesViewModel(messages, messagesAdapter);
    }

    @Test
    public void counterShouldBe10() throws Exception {
        assertEquals("+10", messagesViewModel.counter());
    }

    @Test
    public void counterVisibilityShouldBeVisible() throws Exception {
        assertEquals(View.VISIBLE, messagesViewModel.counterVisibility());
    }

    @Test
    public void getAdapterShouldSetMessages() throws Exception {
        messagesViewModel.getAdapter();
        verify(messagesAdapter).setList(eq(messages));
    }
}
