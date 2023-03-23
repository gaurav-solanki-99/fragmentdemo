package com.example.fragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentapp.databinding.HomeLayoutBinding;


public class HomeFragment extends Fragment {

    public HomeFragment(){
        // require a empty public constructor
    }
    HomeLayoutBinding binding;



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       binding=HomeLayoutBinding.inflate(LayoutInflater.from(getActivity().getApplicationContext()),container,false);
        return binding.getRoot();
    }
}
