package clertonleal.com.hotmart.view.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import clertonleal.com.hotmart.R;
import clertonleal.com.hotmart.databinding.MySellsFragmentBinding;
import clertonleal.com.hotmart.viewModel.SellListViewModel;


public class MySellsFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        MySellsFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.my_sells_fragment, container, false);
        binding.setViewModel(new SellListViewModel());
        return binding.getRoot();
    }

    @Override
    protected int getTitle() {
        return R.string.my_sells;
    }
}
