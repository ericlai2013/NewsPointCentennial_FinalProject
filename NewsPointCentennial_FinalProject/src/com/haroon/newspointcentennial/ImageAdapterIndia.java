package com.haroon.newspointcentennial;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapterIndia extends BaseAdapter {

	private final Context mContext;

	public ImageAdapterIndia(Context c) {
		// TODO Auto-generated constructor stub
		mContext = c;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mThumbIds.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ImageView imageView;

		if (convertView == null) {
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(130, 130));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView) convertView;
		}

		imageView.setImageResource(mThumbIds[position]);
		return imageView;
	}

	private final Integer[] mThumbIds = { R.drawable.googleindia,
			R.drawable.hindi24, R.drawable.hindilive, R.drawable.hindustimes,
			R.drawable.indian, R.drawable.indiatv, R.drawable.ndtv,
			R.drawable.timesnow, R.drawable.total, R.drawable.zeenews,
			R.drawable.thestar, R.drawable.fox,

	};

}
