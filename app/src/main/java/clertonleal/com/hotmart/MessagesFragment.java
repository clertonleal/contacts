package clertonleal.com.hotmart;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import clertonleal.com.hotmart.databinding.MessagesFragmentBinding;

public class MessagesFragment extends Fragment {

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
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}
