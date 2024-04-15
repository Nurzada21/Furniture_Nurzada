package com.example.furniture_nurzada.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
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

import com.example.furniture_nurzada.databinding.FragmentBedRoomBinding;
import com.example.furniture_nurzada.databinding.ItemFurnitureBinding;
import com.example.furniture_nurzada.models.FurnitureModel;
import com.example.furniture_nurzada.ui.MAdapter;

import java.util.ArrayList;
import java.util.List;

public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    private ItemFurnitureBinding itemFurnitureBinding;

    List<FurnitureModel> list_bedroom = new ArrayList<>();

    MAdapter adapter;

    NavController navController;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvZalRoom.setAdapter(adapter);
//        itemFurnitureBinding = ItemFurnitureBinding.inflate(inflater, container, false);
//        itemFurnitureBinding.btnDone.setOnClickListener(v -> {
//            navController = Navigation.findNavController(requireActivity(),
//                    R.id.navigation_bed_room);
//            navController.navigate(R.id.action_navigation_bed_room_to_description_fragment);
//        });
        return root;
    }

    private void createList() {
        list_bedroom.add(new FurnitureModel("bedroom", "Кровать из массива", "2820",
                "деревянный, массив сосны", R.drawable.b1));

        list_bedroom.add(new FurnitureModel("bedroom", "Шкаф для одежды Сканди", "2820",
                "деревянный, ЛДСП", R.drawable.b2));

        list_bedroom.add(new FurnitureModel("bedroom", "Тумба для прикроватной тумбочки", "2820",
                "деревянный, ЛДСП", R.drawable.b3));

        list_bedroom.add(new FurnitureModel("bedroom", "Комод Марсель", "2820",
                "деревянный, массив сосны", R.drawable.b4));
        list_bedroom.add(new FurnitureModel("bedroom", "Зеркало в раме", "2820",
                "стекло, дерево", R.drawable.b5));
        list_bedroom.add(new FurnitureModel("bedroom", "Стеллаж для книг и декора", "2820",
                "деревянный, ЛДСП", R.drawable.b6));
        list_bedroom.add(new FurnitureModel("bedroom", "Письменный стол Юниор", "2820",
                "деревянный, ЛДСП", R.drawable.b7));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        itemFurnitureBinding.btnDone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                NavController navController = Navigation.findNavController(view);
//                navController.navigate(R.id.action_navigation_bed_room_to_description_fragment);
//            }
//        });


        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}