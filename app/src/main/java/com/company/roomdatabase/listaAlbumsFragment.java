package com.company.roomdatabase;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.roomdatabase.databinding.FragmentListaAlbumsBinding;


public class listaAlbumsFragment extends Fragment {

    private FragmentListaAlbumsBinding binding;
    private NavController navController;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return (binding = FragmentListaAlbumsBinding.inflate(inflater, container, false)).getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        navController = Navigation.findNavController(view);

        binding.navegarAInsertar.setOnClickListener(v -> {
            navController.navigate(R.id.action_listaAlbumsFragment_to_insertarAlbumFragment);
        });
    }
}