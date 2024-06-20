package com.example.citycorpoaration.ui.renewlicense;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.citycorpoaration.databinding.FragmentRenewLicenseBinding;


public class RenewLicense extends Fragment {

    private FragmentRenewLicenseBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RenewLicenseViewModel renewLicenseViewModel =
                new ViewModelProvider(this).get(RenewLicenseViewModel.class);

        binding = FragmentRenewLicenseBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textRenewlicense;
        renewLicenseViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}