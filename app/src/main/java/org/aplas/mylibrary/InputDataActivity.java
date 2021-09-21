package org.aplas.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.aplas.mylibrary.databinding.ActivityInputDataBinding;

public class InputDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityInputDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_input_data);
    }
}