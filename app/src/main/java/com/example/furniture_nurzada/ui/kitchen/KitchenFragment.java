package com.example.furniture_nurzada.ui.kitchen;

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

public class KitchenFragment extends Fragment {
    private FragmentGardenBinding binding;

    List<FurnitureModel> list_kitchen = new ArrayList<>();

    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentGardenBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_kitchen);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_kitchen.add(new FurnitureModel("Кухня", "Кухонный уголок из искусственной кожи", "5500",
                "Удобный и стильный уголок для вашей кухни", R.drawable.k1));

        list_kitchen.add(new FurnitureModel("Кухня", "Стул для кухни с текстильным сиденьем", "1500",
                "Эргономичный и удобный стул для приготовления пищи", R.drawable.k2));

        list_kitchen.add(new FurnitureModel("Кухня", "Пуфик для кухни", "1000",
                "Мягкий и компактный пуфик для дополнительных мест", R.drawable.k3));

        list_kitchen.add(new FurnitureModel("Кухня", "Барные стулья с металлической подставкой", "2500",
                "Современный дизайн и надежность", R.drawable.k4));

        list_kitchen.add(new FurnitureModel("Кухня", "Обеденный стол из массива дерева", "7000",
                "Прочный и красивый стол для семейных обедов", R.drawable.k5));

        list_kitchen.add(new FurnitureModel("Кухня", "Табуретки для кухни", "1200",
                "Компактные и функциональные табуретки для вашей кухни", R.drawable.k6));

        list_kitchen.add(new FurnitureModel("Кухня", "Кухонный гарнитур из натурального дерева", "12000",
                "Высококачественный гарнитур, прослужит долгие годы", R.drawable.k7));


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