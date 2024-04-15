package com.example.furniture_nurzada.ui.notifications;

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
import com.example.furniture_nurzada.databinding.FragmentZalBinding;
import com.example.furniture_nurzada.models.FurnitureModel;
import com.example.furniture_nurzada.ui.MAdapter;

import java.util.ArrayList;
import java.util.List;

public class ZalFragment extends Fragment {
    private FragmentZalBinding binding;

    List<FurnitureModel> list_zal = new ArrayList<>();

    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentZalBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_zal);
        binding.rvZalRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
        list_zal.add(new FurnitureModel("Гостиная", "Кожаный диван", "4000",
                "Изысканный кожаный диван для уютной гостиной", R.drawable.g1));

        list_zal.add(new FurnitureModel("Гостиная", "Телевизор LG 55 дюймов", "2500",
                "Современный телевизор для наслаждения любимыми фильмами", R.drawable.g2));

        list_zal.add(new FurnitureModel("Гостиная", "Стеклянный журнальный столик", "800",
                "Элегантный столик из закаленного стекла для вашей гостиной", R.drawable.g3));

        list_zal.add(new FurnitureModel("Гостиная", "Книжная полка", "1200",
                "Удобная и стильная полка для хранения книг и декора", R.drawable.g4));

        list_zal.add(new FurnitureModel("Гостиная", "Подставка для телевизора", "600",
                "Устойчивая и функциональная подставка для вашего телевизора", R.drawable.g5));

        list_zal.add(new FurnitureModel("Гостиная", "Кресло с пуфиком", "3000",
                "Мягкое кресло с удобным пуфиком для полного расслабления", R.drawable.g6));

        list_zal.add(new FurnitureModel("Гостиная", "Настольная лампа", "150",
                "Стильная настольная лампа для создания уютной атмосферы", R.drawable.g7));


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