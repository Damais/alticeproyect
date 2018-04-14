package com.example.damaris.altice_proyect;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UserAdapter {
    public class UsersAdapter extends ArrayAdapter<User> {
        public UsersAdapter(Context context, ArrayList<User> objects) {
            super(context, 0, objects);
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            User user = getItem(position);
            if (convertView == null) {
                convertView =
                        LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);

            }
            TextView tvName = (TextView) convertView.findViewById(R.id.text1);
            TextView tvAddress = (TextView) convertView.findViewById(R.id.text2);
            tvName.setText(user.name);
            tvAddress.setText(user.lastname);
            return convertView;
        }
    }





  }




