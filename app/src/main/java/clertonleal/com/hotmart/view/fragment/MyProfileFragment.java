package clertonleal.com.hotmart.view.fragment;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.databinding.MyProfileBinding;
import clertonleal.com.hotmart.viewModel.MessagesViewModel;
import clertonleal.com.hotmart.viewModel.ProfileViewModel;
import clertonleal.com.hotmart.viewModel.SellListViewModel;

public class MyProfileFragment extends BaseFragment {

    @Override
    protected int getTitle() {
        return R.string.my_account;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MyProfileBinding myProfileBinding = DataBindingUtil.inflate(inflater, R.layout.my_profile, container, false);
        myProfileBinding.setMessagesViewModel(new MessagesViewModel());
        myProfileBinding.setProfileViewModel(new ProfileViewModel());
        myProfileBinding.setSellViewModel(new SellListViewModel());
        return myProfileBinding.getRoot();
    }
}
