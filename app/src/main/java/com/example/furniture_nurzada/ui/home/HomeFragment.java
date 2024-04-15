package com.example.furniture_nurzada.ui.home;

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

import com.airbnb.lottie.LottieAnimationView;
import com.example.furniture_nurzada.R;
import com.example.furniture_nurzada.databinding.FragmentHomeBinding;
import com.example.furniture_nurzada.models.CategoryModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    List<CategoryModel> list_category = new ArrayList<>();

    CategoryAdapter adapter;

    LottieAnimationView lotty_sale, lotty_reclama;

    NavController navController;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        lotty_reclama = binding.lottyReclama;
        lotty_reclama.setAnimation(R.raw.home1);

        lotty_sale = binding.lottySale;
        lotty_sale.setAnimation(R.raw.home2);

        createList();
        adapter = new CategoryAdapter();
        adapter.setMain_list(list_category);
        binding.rvCatalogCategory.setAdapter(adapter);
        return root;

    }

    private void createList() {
        list_category.add(new CategoryModel("Для спальни", R.drawable.b1));
        list_category.add(new CategoryModel("Для гостиной", R.drawable.g4));
        list_category.add(new CategoryModel("Кухонная мебель", R.drawable.k5));
        list_category.add(new CategoryModel("Садовая мебель", R.drawable.s3));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.saleCardView.setOnClickListener(v -> {
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_home_to_saleFragment);
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}