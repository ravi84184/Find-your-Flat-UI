package devsnik.com.findyourflat;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import devsnik.com.findyourflat.customui.CustomTextView;
import devsnik.com.findyourflat.model.ApartmentModel;

public class ApartmentAdapter extends RecyclerView.Adapter<ApartmentAdapter.MyViewHolder> {

    Context context;
    private List<ApartmentModel> addressList;

    public ApartmentAdapter(Context context, ArrayList<ApartmentModel> addressList) {
        this.context = context;
        this.addressList = addressList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_appartment_view, viewGroup, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ApartmentModel model = addressList.get(position);

        holder.row_price.setText(model.getPrice()+"/");
        holder.row_review.setText(model.getReview() + " review");
        holder.row_name.setText(model.getApartmentName());

        holder.row_img.setImageDrawable(ContextCompat.getDrawable(context, model.getImg()));

        holder.root_ly.setOnClickListener(v -> {
            context.startActivity(new Intent(context, DetailsActivity.class).putExtra("model", (Serializable) model));
        });

    }


    @Override
    public int getItemCount() {
        return addressList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        RelativeLayout root_ly;
        CustomTextView row_price, row_review, row_name;
        ImageView row_img;

        MyViewHolder(View itemView) {
            super(itemView);
            root_ly = itemView.findViewById(R.id.root_ly);
            row_price = itemView.findViewById(R.id.row_price);
            row_review = itemView.findViewById(R.id.row_review);
            row_name = itemView.findViewById(R.id.row_name);
            row_img = itemView.findViewById(R.id.row_img);

        }
    }
}
