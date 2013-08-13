package com.haroon.newspointcentennial;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ArrayAdapter;
import android.view.View.OnClickListener;
import android.widget.Spinner;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends M_Activity implements OnItemSelectedListener{ 

	private Spinner spinner1;
	private Spinner spinner2;
	private Spinner spinner3;
	private Spinner spinner4;
	private Spinner spinner5;
	private Spinner spinner6;
	private Spinner spinner7;
	private Spinner spinner8;
	private Spinner spinner9;
	private Spinner spinner10;
	private Spinner spinner11;
	private Spinner spinner12;
	private Spinner spinner13;
	private Spinner spinner14;
	private Spinner spinner15;
	private Spinner spinner16;
	
	private SchemaHelper sh;
	private SchemaHelper shspinner;
	private Cursor c;
	private Cursor cspinner;
	
	private static ArrayList<String> arrUrl;	
	private static ArrayList<String> arrUrlspinner;
	
		
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		/*MenuItem menuList = (MenuItem) findViewById(R.id.menu0);
		
		OnMenuItemClickListener menuItemClickListener;
		menuList.setOnMenuItemClickListener(menuItemClickListener){
			
		}*/
		
		initializeDatabase();

		ImageButton img = (ImageButton)findViewById(R.id.imageButton13);
		ImageButton img1 = (ImageButton)findViewById(R.id.imageButton1);
		ImageButton img2 = (ImageButton)findViewById(R.id.imageButton2);
		ImageButton img3 = (ImageButton)findViewById(R.id.imageButton3);
		ImageButton img14 = (ImageButton)findViewById(R.id.imageButton14);
		ImageButton img4 = (ImageButton)findViewById(R.id.imageButton4);
		ImageButton img5 = (ImageButton)findViewById(R.id.imageButton5);
		ImageButton img6 = (ImageButton)findViewById(R.id.imageButton6);
		ImageButton img15 = (ImageButton)findViewById(R.id.imageButton15);
		ImageButton img7 = (ImageButton)findViewById(R.id.imageButton7);
		ImageButton img8 = (ImageButton)findViewById(R.id.imageButton8);
		ImageButton img9 = (ImageButton)findViewById(R.id.imageButton9);
		ImageButton img16 = (ImageButton)findViewById(R.id.imageButton16);
		ImageButton img10 = (ImageButton)findViewById(R.id.imageButton10);
		ImageButton img11 = (ImageButton)findViewById(R.id.imageButton11);
		ImageButton img12 = (ImageButton)findViewById(R.id.imageButton12);


		img.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(0)));
				startActivity(intent);
			}
		});

		img1.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(1)));
				startActivity(intent);
			}
		});

		img2.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(2)));
				startActivity(intent);
			}
		});

		img3.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(3)));
				startActivity(intent);
			}
		});

		img14.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(4)));
				startActivity(intent);
			}
		});

		img4.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(5)));
				startActivity(intent);
			}
		});

		img5.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(6)));
				startActivity(intent);
			}
		});

		img6.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(7)));
				startActivity(intent);
			}
		});

		img15.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(8)));
				startActivity(intent);
			}
		});

		img7.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(9)));
				startActivity(intent);
			}
		});

		img8.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(10)));
				startActivity(intent);
			}
		});

		img9.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(11)));
				startActivity(intent);
			}
		});

		img16.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(12)));
				startActivity(intent);
			}
		});

		img10.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(13)));
				startActivity(intent);
			}
		});

		img11.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(14)));
				startActivity(intent);
			}
		});

		img12.setOnClickListener(new View.OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrl.get(15)));
				startActivity(intent);
			}
		});

		addListenerOnSpinnerItemSelection_NYT();
	}

	private void addListenerOnSpinnerItemSelection_NYT(){
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner1.setOnItemSelectedListener(this);
		
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner2.setOnItemSelectedListener(this);
		
		spinner3 = (Spinner) findViewById(R.id.spinner3);
		spinner3.setOnItemSelectedListener(this);
		
		spinner4 = (Spinner) findViewById(R.id.spinner4);
		spinner4.setOnItemSelectedListener(this);
		
		spinner5 = (Spinner) findViewById(R.id.spinner5);
		spinner5.setOnItemSelectedListener(this);
		
		spinner6 = (Spinner) findViewById(R.id.spinner6);
		spinner6.setOnItemSelectedListener(this);
		
		spinner7 = (Spinner) findViewById(R.id.spinner7);
		spinner7.setOnItemSelectedListener(this);
		
		spinner8 = (Spinner) findViewById(R.id.spinner8);
		spinner8.setOnItemSelectedListener(this);
		
		spinner9 = (Spinner) findViewById(R.id.spinner9);
		spinner9.setOnItemSelectedListener(this);
		
		spinner10 = (Spinner) findViewById(R.id.spinner10);
		spinner10.setOnItemSelectedListener(this);
		
		spinner11 = (Spinner) findViewById(R.id.spinner11);
		spinner11.setOnItemSelectedListener(this);
		
		spinner12 = (Spinner) findViewById(R.id.spinner12);
		spinner12.setOnItemSelectedListener(this);
		
		spinner13 = (Spinner) findViewById(R.id.spinner13);
		spinner13.setOnItemSelectedListener(this);
		
		spinner14 = (Spinner) findViewById(R.id.spinner14);
		spinner14.setOnItemSelectedListener(this);
		
		spinner15 = (Spinner) findViewById(R.id.spinner15);
		spinner15.setOnItemSelectedListener(this);
		
		spinner16 = (Spinner) findViewById(R.id.spinner16);
		spinner16.setOnItemSelectedListener(this);
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
		// TODO Auto-generated method stub
			/*	Toast.makeText(parent.getContext(), 
					"OnItemSelectedListener : " + parent.getItemAtPosition(pos) + "\nparent.getId() : " + parent.getId(), 
					Toast.LENGTH_SHORT).show();*/
		
		int n = arrUrlspinner.size();
		for (int k = 0; k < n; k++){
			if (parent.getId() == R.id.spinner1 && parent.getItemAtPosition(pos).equals("News") && k == 0){
				Toast.makeText(parent.getContext(), 
				"arrUrlspinner 0 : " + arrUrlspinner.get(k), Toast.LENGTH_SHORT).show();
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner1 && parent.getItemAtPosition(pos).equals("Sports") && k == 1){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner1 && parent.getItemAtPosition(pos).equals("World") && k == 2){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner2 && parent.getItemAtPosition(pos).equals("News") && k == 3 ){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner2 && parent.getItemAtPosition(pos).equals("Sports") && k == 4){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner2 && parent.getItemAtPosition(pos).equals("Travel") && k == 5){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner3 && parent.getItemAtPosition(pos).equals("News") && k == 6){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner3 && parent.getItemAtPosition(pos).equals("Autos") && k == 7){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner3 && parent.getItemAtPosition(pos).equals("Health") && k == 8){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner4 && parent.getItemAtPosition(pos).equals("News") && k == 9){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner4 && parent.getItemAtPosition(pos).equals("Politics") && k == 10){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner4 && parent.getItemAtPosition(pos).equals("Business") && k == 11){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner5 && parent.getItemAtPosition(pos).equals("Business") && k == 12 ){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner5 && parent.getItemAtPosition(pos).equals("World") && k == 13){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner5 && parent.getItemAtPosition(pos).equals("Living") && k == 14){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner6 && parent.getItemAtPosition(pos).equals("Justice") && k == 15 ){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner6 && parent.getItemAtPosition(pos).equals("Tech") && k == 16){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner6 && parent.getItemAtPosition(pos).equals("Travel") && k == 17){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner7 && parent.getItemAtPosition(pos).equals("News") && k == 18){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner7 && parent.getItemAtPosition(pos).equals("Weather") && k == 19){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
			}else if(parent.getId() == R.id.spinner7 && parent.getItemAtPosition(pos).equals("Travel") && k == 20){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner8 && parent.getItemAtPosition(pos).equals("News") && k == 21 ){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner8 && parent.getItemAtPosition(pos).equals("Lifestyle") && k == 22){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner8 && parent.getItemAtPosition(pos).equals("Entertainment") && k == 23){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner9 && parent.getItemAtPosition(pos).equals("Life")  && k == 24){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner9 && parent.getItemAtPosition(pos).equals("Sports") && k == 25){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner9 && parent.getItemAtPosition(pos).equals("Business") && k == 26){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner10 && parent.getItemAtPosition(pos).equals("News") && k == 27){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner10 && parent.getItemAtPosition(pos).equals("Sports") && k == 28){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner10 && parent.getItemAtPosition(pos).equals("Blogs") && k == 29){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner11 && parent.getItemAtPosition(pos).equals("News") && k == 30){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner11 && parent.getItemAtPosition(pos).equals("Politics") && k == 31){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner11 && parent.getItemAtPosition(pos).equals("Science") && k == 32){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner12 && parent.getItemAtPosition(pos).equals("News") && k == 33){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner12 && parent.getItemAtPosition(pos).equals("Investing") && k == 34){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner12 && parent.getItemAtPosition(pos).equals("Arts") && k == 35){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner13 && parent.getItemAtPosition(pos).equals("News") && k == 36 ){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner13 && parent.getItemAtPosition(pos).equals("Money") && k == 37){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner13 && parent.getItemAtPosition(pos).equals("Opinion") && k == 38){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner14 && parent.getItemAtPosition(pos).equals("News") && k == 39){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner14 && parent.getItemAtPosition(pos).equals("Maps") && k == 40){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner14 && parent.getItemAtPosition(pos).equals("Finance") && k == 41){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner15 && parent.getItemAtPosition(pos).equals("News") && k == 42){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner15 && parent.getItemAtPosition(pos).equals("Life") && k == 43){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner15 && parent.getItemAtPosition(pos).equals("Driving") && k == 44){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if (parent.getId() == R.id.spinner16 && parent.getItemAtPosition(pos).equals("Shows") && k == 45){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner16 && parent.getItemAtPosition(pos).equals("Shop") && k == 46){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else if(parent.getId() == R.id.spinner16 && parent.getItemAtPosition(pos).equals("Schedule") && k == 47){
				Intent intent = new Intent();
				intent.setAction(Intent.ACTION_VIEW);
				intent.addCategory(Intent.CATEGORY_BROWSABLE);
				intent.setData(Uri.parse(arrUrlspinner.get(k)));
				startActivity(intent);
			}else {}
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		//getMenuInflater().inflate(R.menu.main, menu);
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.main, menu);
		
		return true;
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		
		switch(item.getItemId())
		{
		case R.id.menu11:
			Toast.makeText(this, "Canada News", Toast.LENGTH_LONG).show();
			startActivity(new Intent(MainActivity.this, CanadaCategoryActivity.class));
			return true;
			
		case R.id.menu12:
			Toast.makeText(this, "US News", Toast.LENGTH_LONG).show();
			startActivity(new Intent(MainActivity.this, UsCategoryActivity.class));
			return true;
			
		case R.id.menu13:
			Toast.makeText(this, "India News", Toast.LENGTH_LONG).show();
			startActivity(new Intent(MainActivity.this, IndiaCategoryActivity.class));
			return true;
			
		case R.id.menu0:
			//Toast.makeText(this, "Search Media", Toast.LENGTH_LONG).show();
			startActivity(new Intent(MainActivity.this, SearchMediaActivity.class));
			return true;
		case R.id.createDB:
			//Toast.makeText(this, "Update or Create Database 0", Toast.LENGTH_LONG).show();
			startActivity(new Intent(MainActivity.this, SchemaActivity.class));
			return true;
			
	     // added by Harry for admin		
		case R.id.menuHarry:
			Toast.makeText(this, "Harry", Toast.LENGTH_LONG).show();
			startActivity(new Intent(MainActivity.this, HarryActivity.class));
			return true;
			
		// begin: added by ClauQ for Login Functionality
		case R.id.settingsMenuItem:
		{
			// TODO for Harry: Add a *REAL* Activity for User Settings here
			startActivity(new Intent(MainActivity.this, UserPreferenceActivity.class));
			return true;
		}		
		case R.id.loginMenuItem:
		{
			if (loggedIn == false) {
				Intent intent = new Intent(MainActivity.this, LoginActivity.class);
				startActivityForResult(intent, LOGIN_REQUEST_CODE);
			}
			else {
				loggedIn = false;
			}
			
			invalidateOptionsMenu();
			return true;
		}
		default:
			//Log.e("NewsPoint", "Unknown Menu Item");
			return super.onOptionsItemSelected(item);
		}
		


	}
	
	private void initializeDatabase() {
		// TODO Auto-generated method stub
		//mydb = new NPDatabase(this);
		sh = new SchemaHelper(this);
		shspinner = new SchemaHelper(this);
		
		arrUrl = new ArrayList<String>();
		
		int i = 0;
		//Cursor c = db.getUrlByCountry("canada");

		c = sh.getCategoryForCountry("main");
		while(c.moveToNext()){
			String caUrl = c.getString(c.getColumnIndex(CategoryTable.CATEGORY_URL));
			arrUrl.add(caUrl);					
			System.out.println("Category  main information: " + caUrl);
		
		}
		
		arrUrlspinner = new ArrayList<String>();
		

		cspinner = shspinner.getCategoryForCountry("spinner");
		while(cspinner.moveToNext()){
			String caUrlspinner = cspinner.getString(cspinner.getColumnIndex(CategoryTable.CATEGORY_URL));
			arrUrlspinner.add(caUrlspinner);					
			System.out.println("Category  spinner information: " + caUrlspinner);
		
		}
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		c.close();
		cspinner.close();
		sh.close();
		shspinner.close();
	}

	///////////////// Login Functionality ///////////////
	
	private final int LOGIN_REQUEST_CODE = 1;
	private boolean loggedIn = false;
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		if (requestCode == LOGIN_REQUEST_CODE) {
			if (resultCode == RESULT_OK) {
				loggedIn = true;
				invalidateOptionsMenu(); // make onPrepareOptionsMenu() to be fired
				
				// String userName = data.getStringExtra("userName");
				// TextView loginStatus = (TextView) findViewById(R.id.loginStatus);
				// loginStatus.setText("Logged in as  " + userName);
			}
		}
		
		super.onActivityResult(requestCode, resultCode, data);
	}
	

	@Override
	public boolean onPrepareOptionsMenu (Menu menu) {
		
		MenuItem loginMenuItem = menu.findItem(R.id.loginMenuItem);
		MenuItem settingsMenuItem = menu.findItem(R.id.settingsMenuItem);
		
		if (loggedIn) {
			loginMenuItem.setTitle("Log out");
			settingsMenuItem.setEnabled(true);
	    }
		else {
			loginMenuItem.setTitle("Log in");
			settingsMenuItem.setEnabled(false);
		}
		
		return true;
	}	


}
