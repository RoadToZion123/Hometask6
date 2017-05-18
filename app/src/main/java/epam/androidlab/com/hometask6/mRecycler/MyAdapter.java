package epam.androidlab.com.hometask6.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

import epam.androidlab.com.hometask6.R;
import epam.androidlab.com.hometask6.data.DogDescription;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.RecyclerVH> {

    Context c;
    ArrayList<DogDescription> dogs;

    public MyAdapter(Context c, ArrayList<DogDescription> dogs) {
        this.c = c;
        this.dogs = dogs;
    }

    @Override
    public RecyclerVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new RecyclerVH(v);
    }

    @Override
    public void onBindViewHolder(RecyclerVH holder, int position) {
        holder.nameTxt.setText(dogs.get(position).getName());

        holder.mImageView.setImageResource(dogs.get(position).getPicture());
    }

    @Override
    public int getItemCount() {
        return dogs.size();
    }


    public class RecyclerVH extends RecyclerView.ViewHolder
    {
        TextView nameTxt;
        ImageView mImageView;

        public RecyclerVH(View itemView) {
            super(itemView);

            nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
            mImageView = (ImageView) itemView.findViewById((R.id.imageView));
        }
    }
}

