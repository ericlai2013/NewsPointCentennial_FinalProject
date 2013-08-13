package com.haroon.newspointcentennial;

import java.util.ArrayList;
import java.util.List;
import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SearchMediaActivity extends M_Activity implements
		OnItemSelectedListener {

	Spinner spinnersearch1;
	Spinner spinnersearch2;
	Spinner spinnersearch3;
	String mediaSelected;

	// String searchselected;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search);

		Button bsearch = (Button) findViewById(R.id.buttonsearch);

		bsearch.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				final EditText input = (EditText) findViewById(R.id.txtsearch);

				final String searchselected = input.getText().toString();

				if (mediaSelected.equals("CNN")) {
					Intent intent = new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					intent.addCategory(Intent.CATEGORY_BROWSABLE);
					intent.setData(Uri.parse("http://www." + mediaSelected
							+ ".com/search/?query=" + searchselected));
					startActivity(intent);
				} else if (mediaSelected.equals("BBC")) {
					Intent intent = new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					intent.addCategory(Intent.CATEGORY_BROWSABLE);
					intent.setData(Uri.parse("http://www." + mediaSelected
							+ ".co.uk/search/?q=" + searchselected));
					startActivity(intent);
				} else if (mediaSelected.equals("NBC")) {
					Intent intent = new Intent();
					intent.setAction(Intent.ACTION_VIEW);
					intent.addCategory(Intent.CATEGORY_BROWSABLE);
					intent.setData(Uri.parse("http://www." + mediaSelected
							+ ".com/search/?q=" + searchselected));
					startActivity(intent);
				} else {
				}

				input.setText("");
			}
		});

		addListenerOnSpinnerItemSelection_Search1();

		getActionBar().setDisplayHomeAsUpEnabled(true);
		// getActionBar().setHomeButtonEnabled(true)

	}

	private void addListenerOnSpinnerItemSelection_Search1() {

		spinnersearch1 = (Spinner) findViewById(R.id.spinnersearch);
		spinnersearch1.setOnItemSelectedListener(this);

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos,
			long id) {

		/*
		 * Toast.makeText(parent.getContext(), "OnItemSelectedListener : " +
		 * parent.getItemAtPosition(pos), Toast.LENGTH_SHORT).show();
		 */
		mediaSelected = parent.getItemAtPosition(pos).toString();

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

	/*
	 * private Spinner setOnItemSelectedListener( SearchMediaActivity
	 * searchMediaActivity) { // TODO Auto-generated method stub return null; }
	 */
}
