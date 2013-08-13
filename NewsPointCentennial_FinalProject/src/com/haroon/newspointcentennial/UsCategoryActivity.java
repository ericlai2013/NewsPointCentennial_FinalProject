package com.haroon.newspointcentennial;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.AdapterView.OnItemClickListener;

import java.util.ArrayList;

public class UsCategoryActivity extends M_Activity {

	private SchemaHelper sh;
	private Cursor c;

	private static ArrayList<String> arrUrl;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.us_category);

		initializeDatabase();

		getActionBar().setDisplayHomeAsUpEnabled(true);
		// getActionBar().setHomeButtonEnabled(true);
		GridView gridview = (GridView) findViewById(R.id.gridview_us);
		gridview.setAdapter(new ImageAdapterUs(this));

		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// TODO Auto-generated method stub
				Toast.makeText(UsCategoryActivity.this, "" + position,
						Toast.LENGTH_SHORT).show();

				int n = arrUrl.size();
				for (int k = 0; k < n; k++) {
					if (position == 0 && k == 0) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);

					} else if (position == 1 && k == 1) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 2 && k == 2) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 3 && k == 3) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 4 && k == 4) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 5 && k == 5) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 6 && k == 6) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 7 && k == 7) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 8 && k == 8) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 9 && k == 9) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 10 && k == 10) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else if (position == 11 && k == 11) {
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_BROWSABLE);
						intent.setData(Uri.parse(arrUrl.get(k)));
						startActivity(intent);
					} else {
					}
				}

			}
		});
	}

	private void initializeDatabase() {
		// TODO Auto-generated method stub
		// mydb = new NPDatabase(this);
		sh = new SchemaHelper(this);
		
		arrUrl = new ArrayList<String>();

		c = sh.getCategoryForCountry("us");
		while (c.moveToNext()) {
			String caUrl = c.getString(c
					.getColumnIndex(CategoryTable.CATEGORY_URL));
			arrUrl.add(caUrl);
			System.out.println("Category us information: " + caUrl);

		}
		
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		c.close();
		sh.close();
	}
}
