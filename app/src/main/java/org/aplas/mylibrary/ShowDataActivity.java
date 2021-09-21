package org.aplas.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import org.aplas.mylibrary.databinding.ActivityShowDataBinding;

import android.os.Bundle;

public class ShowDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityShowDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_show_data);
    }
}