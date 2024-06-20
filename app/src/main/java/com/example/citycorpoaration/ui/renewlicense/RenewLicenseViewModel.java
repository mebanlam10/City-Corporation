package com.example.citycorpoaration.ui.renewlicense;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RenewLicenseViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public RenewLicenseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is renew license fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}