package com.everywhere.trip.ui.my.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.everywhere.trip.R;
import com.everywhere.trip.bean.LikeBean;
import com.everywhere.trip.util.GlideUtil;

import java.util.ArrayList;
import java.util.List;


public class RecFollowAdapter extends RecyclerView.Adapter<RecFollowAdapter.ViewHolder> {

    private Context context;
    private List<LikeBean.ResultEntity.CollectedRoutesEntity> list;

    public RecFollowAdapter(Context context) {
        this.context = context;
        list = new ArrayList<>();
    }

    public void setList(List<LikeBean.ResultEntity.CollectedRoutesEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context, R.layout.item_follow, null));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GlideUtil.loadUrlRoundImg(6, R.mipmap.zhanweitu_home_kapian, R.mipmap.zhanweitu_home_kapian,
                list.get(position).getCardURL(), holder.img, context);
        holder.title.setText(list.get(position).getTitle());
        holder.intro.setText(list.get(position).getIntro());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView title;
        TextView intro;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            title = itemView.findViewById(R.id.title);
            intro = itemView.findViewById(R.id.intro);
        }
    }
}
