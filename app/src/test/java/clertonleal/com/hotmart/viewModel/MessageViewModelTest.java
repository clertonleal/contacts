package clertonleal.com.hotmart.viewModel;

import android.view.View;

import org.junit.Before;
import org.junit.Test;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.model.Message;

import static junit.framework.Assert.assertEquals;

public class MessageViewModelTest {

    private MessageViewModel messageViewModel;

    @Before
    public void setUp() {
        Message message = DataProvider.getMockMessages().get(0);
        messageViewModel = new MessageViewModel(message);
    }

    @Test
    public void initialVisibilityShouldBeInvisible() throws Exception {
        assertEquals(View.INVISIBLE, messageViewModel.initialVisibility());
    }
}
