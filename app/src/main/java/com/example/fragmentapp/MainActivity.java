package com.example.fragmentapp;


import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fragmentapp.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        binding=ActivityMainBinding.inflate(LayoutInflater.from(this));
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        loadFragment(new HomeFragment());

        binding.navBar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                switch (id)
                {
                    case R.id.nav_home:

                        loadFragment(new HomeFragment());
                        return true;
                    case R.id.nav_contact:

                        loadFragment(new AboutFragment());
                        return true;
                    case R.id.nav_about:

                        loadFragment(new ContactFragment());
                        return true;


                }
                return false;
               }
             }
        );





    }

    public void loadFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.ll_layout, fragment);
        //fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();



    }
}