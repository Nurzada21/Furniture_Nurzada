package com.example.furniture_nurzada.ui.sale;

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
import com.example.furniture_nurzada.databinding.FragmentSaleBinding;

import com.example.furniture_nurzada.models.FurnitureModel;
import com.example.furniture_nurzada.ui.MAdapter;

import java.util.ArrayList;
import java.util.List;

public class SaleFragment extends Fragment {
    private FragmentSaleBinding binding;

    List<FurnitureModel> list_sale = new ArrayList<>();

    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentSaleBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_sale);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        // Гостинная
        list_sale.add(new FurnitureModel("Гостиная", "Мягкий диван", "8000",
                "Удобный диван для отдыха в гостиной", "10% скидка", R.drawable.g1));

        list_sale.add(new FurnitureModel("Гостиная", "Журнальный столик", "3000",
                "Столик для журналов и напитков в гостиной", "15% скидка", R.drawable.g2));

        list_sale.add(new FurnitureModel("Гостиная", "Телевизор", "15000",
                "Крупный экран для просмотра любимых фильмов и шоу","20% скидка", R.drawable.g3));

// Сад
        list_sale.add(new FurnitureModel("Сад", "Садовая скамейка из дуба", "5000",
                "Высококачественное дерево, устойчивое к погодным условиям", "5% скидка", R.drawable.s1));

        list_sale.add(new FurnitureModel("Сад", "Складной стол для пикника", "3000",
                "Легкий и прочный, идеальный для отдыха на природе", "8% скидка", R.drawable.s2));

        list_sale.add(new FurnitureModel("Сад", "Лежак с зонтом", "4500",
                "Удобный лежак с защитой от солнца, идеальный для отдыха в саду", "12% скидка", R.drawable.s3));

// Кухня
        list_sale.add(new FurnitureModel("Кухня", "Стол и стулья для кухни", "6000",
                "Компактный комплект мебели для кухни", "7% скидка", R.drawable.k1));

        list_sale.add(new FurnitureModel("Кухня", "Кухонный гарнитур", "12000",
                "Современный гарнитур для хранения посуды и продуктов", "10% скидка", R.drawable.k2));

        list_sale.add(new FurnitureModel("Кухня", "Встраиваемая плита", "8000",
                "Плита для приготовления вкусной пищи", "15% скидка", R.drawable.k3));



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