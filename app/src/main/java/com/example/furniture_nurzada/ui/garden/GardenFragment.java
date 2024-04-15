package com.example.furniture_nurzada.ui.garden;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.furniture_nurzada.R;
import com.example.furniture_nurzada.databinding.FragmentGardenBinding;
import com.example.furniture_nurzada.databinding.FragmentZalBinding;
import com.example.furniture_nurzada.models.FurnitureModel;
import com.example.furniture_nurzada.ui.MAdapter;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {
    private FragmentGardenBinding binding;

    List<FurnitureModel> list_garten = new ArrayList<>();

    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGardenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_garten);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_garten.add(new FurnitureModel("Садовый участок", "Садовая скамейка из дуба", "5000",
                "Высококачественное дерево, устойчивое к погодным условиям", R.drawable.s1));

        list_garten.add(new FurnitureModel("Садовый участок", "Складной стол для пикника", "3000",
                "Легкий и прочный, идеальный для отдыха на природе", R.drawable.s2));

        list_garten.add(new FurnitureModel("Садовый участок", "Лежак с зонтом", "4500",
                "Удобный лежак с защитой от солнца, идеальный для отдыха в саду", R.drawable.s3));

        list_garten.add(new FurnitureModel("Садовый участок", "Гамак", "3500",
                "Уютный гамак для отдыха на свежем воздухе", R.drawable.s4));

        list_garten.add(new FurnitureModel("Садовый участок", "Садовый качели", "6000",
                "Красивый и комфортный качели для вашего сада", R.drawable.s5));

        list_garten.add(new FurnitureModel("Садовый участок", "Кресло-качалка", "5500",
                "Мягкое и удобное кресло для релаксации в саду", R.drawable.s6));

        list_garten.add(new FurnitureModel("Садовый участок", "Столик для сада", "2500",
                "Компактный и стильный столик для вашего сада", R.drawable.s7));


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_zal_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}