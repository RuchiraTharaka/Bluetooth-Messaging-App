package com.example.bluetooth_messaging_app.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bluetooth_messaging_app.Adapters.UserAdapter;
import com.example.bluetooth_messaging_app.Models.Users;
import com.example.bluetooth_messaging_app.R;
import com.example.bluetooth_messaging_app.databinding.FragmentDirectChatsBinding;
import com.example.bluetooth_messaging_app.databinding.FragmentGroupsBinding;

import java.util.ArrayList;


public class GroupsFragment extends Fragment {

    public GroupsFragment() {
        // Required empty public constructor
    }

    FragmentGroupsBinding binding;
    ArrayList<Users> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentGroupsBinding.inflate(inflater, container, false);

        Users u1 = new Users("a","Colombo","Hi");
        Users u2 = new Users("a","Kalutara","Hello");
        Users u3 = new Users("a","Jaffna","wrvw");
        Users u4 = new Users("a","Galle","brb");
        Users u6 = new Users("a","Matara",",ujm yh");
        Users u7 = new Users("a","Gampaha","ehth");
        Users u8 = new Users("a","Cricket","nerts");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u6);
        list.add(u7);
        list.add(u8);


        UserAdapter adapter = new UserAdapter(1,list,getContext());
        binding.GroupchatRecyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        binding.GroupchatRecyclerView.setLayoutManager(layoutManager);

        //2:18:09

        return binding.getRoot();
    }
}