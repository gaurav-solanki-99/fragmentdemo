package com.example.fragmentapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.fragmentapp.databinding.ContactLayoutBinding;


public class ContactFragment  extends Fragment
{

    ContactLayoutBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding=ContactLayoutBinding.inflate(LayoutInflater.from(getActivity().getApplicationContext()));
        return binding.getRoot();

    }
}
