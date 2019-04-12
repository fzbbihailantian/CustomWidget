package com.fzb.customwidget;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.fzb.customwidget.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Presenter presenter;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        setContentView(R.layout.activity_main);
        presenter = new Presenter();
        binding.setPresenter(presenter);
    }


    public class Presenter {


        public void gotoMeasureSpec() {
            startActivity(new Intent(MainActivity.this, MeasureSpecActivity.class));
        }
         public void GoCompassViewActivity() {
            startActivity(new Intent(MainActivity.this, ClockViewActivity.class));
        }


    }
}
