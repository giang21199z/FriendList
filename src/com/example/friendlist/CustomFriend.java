package com.example.friendlist;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomFriend extends ArrayAdapter<Friend> {

	private ArrayList<Friend> listFriend;
	private Activity context;
	private int idLayout;

	public CustomFriend(Context context, int textViewResourceId,
			ArrayList<Friend> objects) {
		super(context, textViewResourceId, objects);
		//
		this.context = (Activity) context;
		this.idLayout = textViewResourceId;
		this.listFriend = objects;
	}

	@Override
	public int getCount() {
		return listFriend.size();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = ((Activity) context).getLayoutInflater();
		convertView = inflater.inflate(idLayout, null);

		if (listFriend.size() > 0 && position >= 0) {

			final TextView name = (TextView) convertView
					.findViewById(R.id.name);
			// lấy ra nhân viên thứ position
			final Friend friend = listFriend.get(position);

			name.setText(friend.getName());

			final TextView phone = (TextView) convertView
					.findViewById(R.id.phone);
			phone.setText(friend.getPhone());
			ImageView imageView = (ImageView) convertView
					.findViewById(R.id.imageView);
			File imgFile = new File("/sdcard0/images/image.jpg");
			if (imgFile.exists()) {

				Bitmap myBitmap = BitmapFactory.decodeFile(imgFile
						.getAbsolutePath());

				imageView = (ImageView) convertView
						.findViewById(R.id.imageView);

				imageView.setImageBitmap(myBitmap);

			}
		}
		return convertView;
	}

}
