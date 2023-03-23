package com.example.fragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentapp.databinding.AboutLayoutBinding;


public class AboutFragment extends Fragment
{

    AboutLayoutBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=AboutLayoutBinding.inflate(LayoutInflater.from(getActivity().getApplicationContext()));
        return binding.getRoot();
    }
}
