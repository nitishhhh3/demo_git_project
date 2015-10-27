package com.example.sahilkumar.sample.com.frag;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sahilkumar.sample.R;

/**
 * Created by SAHIL KUMAR on 27-10-2015.
 */
public class SampleFrag extends Fragment {

int a;
    String change ="helhjfchxchjxhcjhjchjxhcjhjjdhjhsdhsjdhj";
    int second = 0;
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_main,container);
        a=100;
        change = "code not changed this time";

        return rootView;


    }
}
