package com.gdsc.signchatter.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.gdsc.signchatter.databinding.FragmentDictionaryBinding;

import java.util.ArrayList;

public class DictionaryFragment extends Fragment {

    private FragmentDictionaryBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDictionaryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Bar");
        list.add("Basement");
        list.add("Basketball");
        list.add("Bath");
        list.add("Bathroom");
        list.add("Bear");
        list.add("Beard");
        list.add("Bed");
        list.add("Bedroom");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, list);
        binding.list.setAdapter(itemsAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}