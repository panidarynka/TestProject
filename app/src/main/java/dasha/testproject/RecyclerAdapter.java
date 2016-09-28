package dasha.testproject;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import dasha.testproject.pojo.Building;

/**
 * Created by dasha on 28.09.16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BuildingViewHolder> {
    List<Building> buildingList;
    Context mContext;

    public RecyclerAdapter(List<Building> buildingList, Context context){
        this.buildingList = buildingList;
        this.mContext = context;
    }
    @Override
    public BuildingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        BuildingViewHolder vh = new BuildingViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(BuildingViewHolder holder, int position) {
        Picasso.with(mContext).load(mContext.getString(R.string.URL)+buildingList.get(position).getImage()).into(holder.imageView);
        holder.textViewTitle.setText(buildingList.get(position).getTitle());
        holder.textViewAddress.setText(buildingList.get(position).getAddress());

    }

    @Override
    public int getItemCount() {
        return buildingList.size();
    }

    public static class BuildingViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        ImageView imageView;
        TextView textViewTitle;
        TextView textViewAddress;

        BuildingViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            imageView = (ImageView)itemView.findViewById(R.id.icon_cv);
            textViewTitle = (TextView)itemView.findViewById(R.id.title_tv);
            textViewAddress = (TextView)itemView.findViewById(R.id.address_tv);
        }
    }
}
