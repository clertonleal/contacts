package clertonleal.com.hotmart.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.databinding.MessagesFragmentBinding;
import clertonleal.com.hotmart.viewModel.MessagesViewModel;

public class MessagesFragment extends BaseFragment {

    private MessagesViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MessagesFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.messages_fragment, container, false);
        viewModel = new MessagesViewModel();
        binding.setViewModel(viewModel);
        return  binding.getRoot();
    }

    @Override
    protected int getTitle() {
        return R.string.messages;
    }

    public MessagesViewModel getViewModel() {
        return viewModel;
    }

    public void setViewModel(MessagesViewModel viewModel) {
        this.viewModel = viewModel;
    }
}
