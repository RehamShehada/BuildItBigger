package com.example.displayjokeslibrary;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokeActivityFragment extends Fragment {

    public JokeActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_joke_activity, container, false);

        String joke = getActivity().getIntent().getStringExtra(JokeActivity.JOKE_KEY);
        TextView textView = rootView.findViewById(R.id.jokeTV);
        textView.setText(joke);

        return rootView;
    }
}
