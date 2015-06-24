package com.example.friendlist;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class ListFriend extends Activity {
	ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list_friend);
		ArrayList<Friend> arrFriend = new ArrayList<Friend>();
		arrFriend.add(new Friend("GIANG", "123455778", "images.jpg"));
		arrFriend.add(new Friend("GIAN1G", "123455778", "images.jpg"));
		arrFriend.add(new Friend("GIA2NG", "123455778", "images.jpg"));
		arrFriend.add(new Friend("GIAN3G", "123455778", "images.jpg"));
		listView = (ListView) findViewById(R.id.listFriend);

		CustomFriend cf = new CustomFriend(this, R.layout.row_friend, arrFriend);
		listView.setAdapter(cf);
	}
}
