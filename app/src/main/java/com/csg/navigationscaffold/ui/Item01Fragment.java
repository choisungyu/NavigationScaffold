package com.csg.navigationscaffold.ui;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.csg.navigationscaffold.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Item01Fragment extends Fragment {


    public Item01Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item01, container, false);
        view.findViewById(R.id.text_view1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment);
                navController.navigate(R.id.action_bottomNavFragment_to_item01DetailFragment);

            }
        });
        return view;
    }

}
