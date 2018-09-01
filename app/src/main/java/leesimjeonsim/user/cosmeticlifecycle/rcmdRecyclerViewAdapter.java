package leesimjeonsim.user.cosmeticlifecycle;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class rcmdRecyclerViewAdapter extends RecyclerView.Adapter<rcmdRecyclerViewAdapter.ViewHolder> {
    @NonNull

    private final List<rcmdItemData> mValues;
    private final rcmdFragmend.OnListFragmentInteractionListener mListener;

    public rcmdRecyclerViewAdapter(List<rcmdItemData> items, rcmdFragmend.OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_rcmditem, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.name.setText(mValues.get(position).name);
        holder.rcmd_dday.setText(mValues.get(position).rcmd_dday);

        Glide.with(holder.imageView1.getContext()).load(mValues.get(position).item_id1).into(holder.imageView1);
        holder.item_name1.setText(mValues.get(position).item_name1);
        holder.item_brand1.setText(mValues.get(position).item_brand1);

        Glide.with(holder.imageView2.getContext()).load(mValues.get(position).item_id2).into(holder.imageView2);
        holder.item_name2.setText(mValues.get(position).item_name2);
        holder.item_brand2.setText(mValues.get(position).item_brand2);

        Glide.with(holder.imageView3.getContext()).load(mValues.get(position).item_id3).into(holder.imageView3);
        holder.item_name3.setText(mValues.get(position).item_name3);
        holder.item_brand3.setText(mValues.get(position).item_brand3);


       /* holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    System.out.println(holder.mItem.item_brand1);
            }
        });
        */
        holder.LL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(holder.mItem.item_name1);
            }
        });
        holder.LL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(holder.mItem.item_name2);
            }
        });
        holder.LL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(holder.mItem.item_name3);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView name;
        public final TextView rcmd_dday;
        public final LinearLayout LL1;
        public final ImageView imageView1;
        public final TextView item_name1;
        public final TextView item_brand1;
        public final LinearLayout LL2;
        public final ImageView imageView2;
        public final TextView item_name2;
        public final TextView item_brand2;
        public final LinearLayout LL3;
        public final ImageView imageView3;
        public final TextView item_name3;
        public final TextView item_brand3;
        public rcmdItemData mItem;
        public ViewHolder(@NonNull View view) {
            super(view);
            mView = view;
            name = (TextView) view.findViewById(R.id.name);
            rcmd_dday = (TextView) view.findViewById(R.id.rcmd_dday);

            LL1 = (LinearLayout) view.findViewById(R.id.LL1);
            imageView1 =(ImageView) view.findViewById(R.id.imageView1);
            item_name1 = (TextView) view.findViewById(R.id.item_name1);
            item_brand1 = (TextView) view.findViewById(R.id. item_brand1);

            LL2 = (LinearLayout) view.findViewById(R.id.LL2);
            imageView2 =(ImageView) view.findViewById(R.id.imageView2);
            item_name2 = (TextView) view.findViewById(R.id.item_name2);
            item_brand2 = (TextView) view.findViewById(R.id. item_brand2);

            LL3 = (LinearLayout) view.findViewById(R.id.LL3);
            imageView3 =(ImageView) view.findViewById(R.id.imageView3);
            item_name3 = (TextView) view.findViewById(R.id.item_name3);
            item_brand3 = (TextView) view.findViewById(R.id. item_brand3);
        }
    }

}
