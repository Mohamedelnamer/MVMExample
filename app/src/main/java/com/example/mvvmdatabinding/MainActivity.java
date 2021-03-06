package com.example.mvvmdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.example.mvvmdatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ItemViewModel itemViewModel;
    AdapterItem adapterItem;
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        itemViewModel= ViewModelProviders.of(this).get(ItemViewModel.class);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        activityMainBinding.rec.setLayoutManager(layoutManager);
        activityMainBinding.rec.setHasFixedSize(true);
        ArrayList<Item>x=new ArrayList<>();
        adapterItem=new AdapterItem();
        activityMainBinding.rec.setAdapter(adapterItem);








    }
}
