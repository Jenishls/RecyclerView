package adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.recyclerview.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class ContactsAdapter {
    public class ContactsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfie;
        TextView tvName, tvPhone;

        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfie = itemView.findViewById(R.id.imgView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPhone = itemView.findViewById(R.id.tvPhone);
        }
    }
}
