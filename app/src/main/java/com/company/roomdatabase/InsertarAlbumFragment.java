package com.company.roomdatabase;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.roomdatabase.databinding.FragmentInsertarAlbumBinding;


public class InsertarAlbumFragment extends Fragment {

    private FragmentInsertarAlbumBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentInsertarAlbumBinding.inflate(inflater, container, false)).getRoot();
    }
}