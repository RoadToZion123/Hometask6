package epam.androidlab.com.hometask6.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import epam.androidlab.com.hometask6.R;
import epam.androidlab.com.hometask6.data.DogsEnum;
import epam.androidlab.com.hometask6.mRecycler.MyAdapter;

public class RecyclerView extends Fragment {

    private android.support.v7.widget.RecyclerView rv;

    public RecyclerView() {
        // Required empty public constructor
    }

    public static RecyclerView newInstance() {

        RecyclerView dogsFragment = new RecyclerView();
        return dogsFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView=inflater.inflate(R.layout.recycler_view,null);


        rv = (android.support.v7.widget.RecyclerView) rootView.findViewById(R.id.imageView);

        rv = (android.support.v7.widget.RecyclerView) rootView.findViewById(R.id.dogs_RV);

        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

        rv.setAdapter(new MyAdapter(getActivity(), DogsEnum.getDogs()));
        return rootView;
    }

}
