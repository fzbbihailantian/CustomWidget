package com.fzb.customwidget;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fzb.customwidget.databinding.ActivityMeasureSpecBinding;

public class MeasureSpecActivity extends AppCompatActivity {
    ActivityMeasureSpecBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure_spec);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_measure_spec);
    }
}
