package com.gdsc.signchatter.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gdsc.signchatter.R;
import com.gdsc.signchatter.databinding.FragmentHomeBinding;
import com.gdsc.signchatter.databinding.FragmentInstructionsBinding;

public class InstructionsFragment extends Fragment {

    FragmentInstructionsBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentInstructionsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}