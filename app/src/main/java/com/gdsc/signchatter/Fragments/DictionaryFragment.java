package com.gdsc.signchatter.Fragments;

import android.content.Intent;
import android.net.Uri;
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
    private ArrayList<String> links;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentDictionaryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, itemsList());
        binding.list.setAdapter(itemsAdapter);
        linksList();
        clickListener();
    }
    public void clickListener(){
        binding.list.setOnItemClickListener((parent, view, position, id) -> launchVideo(position));
    }
    private void launchVideo(int position) {
        String videoUrl = links.get(position);
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(videoUrl));
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }
    private ArrayList<String> itemsList(){
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("Banana");
        wordsList.add("Bar");
        wordsList.add("Basement");
        wordsList.add("Basketball");
        wordsList.add("Bath");
        wordsList.add("Bathroom");
        wordsList.add("Bear");
        wordsList.add("Beard");
        wordsList.add("Bed");
        wordsList.add("Bedroom");
        return wordsList;
    }
    private void linksList(){
        links = new ArrayList<>();
        links.add("https://youtu.be/pGz34K-z9rM");
        links.add("https://youtu.be/9Zli7o-T3CU");
        links.add("https://youtu.be/C_TxYVsGywI");
        links.add("https://youtu.be/hMTxTnXCzOo");
        links.add("https://www.youtube.com/watch?v=r8wxFtDjU5Y");
        links.add("https://youtu.be/GSRwDBAFh70");
        links.add("https://youtu.be/aVfJRXtyS7U");
        links.add("https://www.youtube.com/watch?v=9wdWQUaR0lE");
        links.add("https://youtu.be/6lQwfs5E7lM");
        links.add("https://youtu.be/arBQREsWlUw");
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
        links = null;
    }
}