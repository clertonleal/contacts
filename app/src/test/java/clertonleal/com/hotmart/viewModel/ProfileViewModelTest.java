package clertonleal.com.hotmart.viewModel;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import clertonleal.com.hotmart.DataProvider;
import clertonleal.com.hotmart.model.User;

public class ProfileViewModelTest {

    private ProfileViewModel profileViewModel;

    @Before
    public void setUp() {
        User mockUser = DataProvider.getMockUser();
        profileViewModel = new ProfileViewModel(mockUser);
    }

    @Test
    public void userBalanceShouldBe215223() throws Exception {
        Assert.assertEquals("R$ 2.152,23", profileViewModel.balance());
    }
}
