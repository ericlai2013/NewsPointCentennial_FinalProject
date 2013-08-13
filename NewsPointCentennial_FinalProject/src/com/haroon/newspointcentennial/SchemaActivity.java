package com.haroon.newspointcentennial;

import java.util.Set;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SchemaActivity extends M_Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.database_createnotice);

		getActionBar().setDisplayHomeAsUpEnabled(true);

		SchemaHelper sh = new SchemaHelper(this);

		sh.addCategory("canada", "http://www.ctvnews.ca/");
		sh.addCategory("canada", "http://www.cbc.ca/news");
		sh.addCategory("canada", "http://www.cp24.com");
		sh.addCategory("canada", "http://www.huffingtonpost.ca/");
		sh.addCategory("canada", "http://www.thestar.com/news.html");
		sh.addCategory("canada", "http://www.nbcnews.com/");
		sh.addCategory("canada", "http://news.google.ca/");
		sh.addCategory("canada", "http://www.dailymail.co.uk/news/");
		sh.addCategory("canada", "http://www.nytimes.com");
		sh.addCategory("canada", "http://www.totaltv.in/National/");
		sh.addCategory("canada", "http://zeenews.india.com/");
		sh.addCategory("canada", "http://www.google.com");
		sh.addCategory("us", "http://www.cnn.com");
		sh.addCategory("us", "http://www.nbcnews.com");
		sh.addCategory("us", "http://www.nationalpost.com");
		sh.addCategory("us", "http://www.news.google.com");
		sh.addCategory("us", "http://www.usatoday.com");
		sh.addCategory("us", "http://www.nytimes.com");
		sh.addCategory("us", "http://www.foxnews.com");
		sh.addCategory("us", "http://www.dailymail.co.uk/news");
		sh.addCategory("us", "http://www.totaltv.in/National/");
		sh.addCategory("us", "http://zeenews.india.com/");
		sh.addCategory("us", "http://www.hotmail.com");
		sh.addCategory("us", "http://www.google.com");
		sh.addCategory("india", "http://news.google.co.in/nwshp?hl=en&tab=wn");
		sh.addCategory("india", "http://news24online.com/");
		sh.addCategory("india", "http://ibnlive.in.com/");
		sh.addCategory("india", "http://www.hindustantimes.com/");
		sh.addCategory("india", "http://headlinesindia.mapsofindia.com/");
		sh.addCategory("india", "http://www.indiatvnews.com/livetv/");
		sh.addCategory("india", "http://www.ndtv.com/");
		sh.addCategory("india", "http://www.timesnow.tv/");
		sh.addCategory("india", "http://www.totaltv.in/National/");
		sh.addCategory("india", "http://zeenews.india.com/");
		sh.addCategory("india", "http://www.hotmail.com");
		sh.addCategory("india", "http://www.google.com");

		sh.addCategory("main", "http://www.nytimes.com");
		sh.addCategory("main", "http://www.bbc.com");
		sh.addCategory("main", "http://cnews.canoe.ca");
		sh.addCategory("main", "http://www.cbc.ca/news/");
		sh.addCategory("main", "http://www.huffingtonpost.ca");
		sh.addCategory("main", "http://www.cnn.com");
		sh.addCategory("main", "http://www.cp24.com");
		sh.addCategory("main", "http://www.ctvnews.ca");
		sh.addCategory("main", "http://www.thestar.com/news.html");
		sh.addCategory("main", "http://www.dailymail.co.uk/news/index.html");
		sh.addCategory("main", "http://www.foxnews.com");
		sh.addCategory("main", "http://www.theglobeandmail.com/news/");
		sh.addCategory("main", "http://www.usatoday.com");
		sh.addCategory("main", "https://news.google.ca");
		sh.addCategory("main", "http://www.nationalpost.com/index.html");
		sh.addCategory("main", "http://www.nbcnews.com");

		sh.addCategory("spinner",
				"http://www.nytimes.com/?adxnnl=1&adxnnlx=1373171248-wHx1wZfb+ITTzoe1kJ1/MA");
		sh.addCategory("spinner",
				"http://www.nytimes.com/pages/sports/index.html");
		sh.addCategory("spinner",
				"http://www.nytimes.com/pages/world/index.html");
		sh.addCategory("spinner", "http://www.bbc.com/news/");
		sh.addCategory("spinner", "http://www.bbc.co.uk/sport/0/");
		sh.addCategory("spinner", "http://www.bbc.com/travel");
		sh.addCategory("spinner", "http://cnews.canoe.ca/");
		sh.addCategory("spinner", "http://www.autonet.ca/");
		sh.addCategory("spinner", "http://chealth.canoe.ca/");
		sh.addCategory("spinner", "http://www.cbc.ca/news/");
		sh.addCategory("spinner", "http://www.cbc.ca/news/politics/");
		sh.addCategory("spinner", "http://www.cbc.ca/news/business/");
		sh.addCategory("spinner", "http://www.huffingtonpost.ca/business/");
		sh.addCategory("spinner", "http://www.huffingtonpost.com/world/");
		sh.addCategory("spinner", "http://www.huffingtonpost.ca/living/");
		sh.addCategory("spinner", "http://www.cnn.com/JUSTICE/?hpt=sitenav");
		sh.addCategory("spinner", "http://www.cnn.com/TECH/?hpt=sitenav");
		sh.addCategory("spinner", "http://www.cnn.com/TRAVEL/?hpt=sitenav");
		sh.addCategory("spinner", "http://www.cp24.com/news");
		sh.addCategory("spinner", "http://www.cp24.com/weather/toronto-weather");
		sh.addCategory("spinner", "http://www.cp24.com/traffic/travel-times");
		sh.addCategory("spinner", "http://www.ctvnews.ca/canada");
		sh.addCategory("spinner", "http://www.ctvnews.ca/video?binId=1.811496");
		sh.addCategory("spinner", "http://www.ctvnews.ca/entertainment");
		sh.addCategory("spinner", "http://www.thestar.com/life.html");
		sh.addCategory("spinner", "http://www.thestar.com/sports.html");
		sh.addCategory("spinner", "http://www.thestar.com/business.html");
		sh.addCategory("spinner",
				"http://www.dailynews.com/news/?source=Nav_News");
		sh.addCategory("spinner",
				"http://www.dailynews.com/sports/?source=Nav_Sports");
		sh.addCategory("spinner",
				"http://www.dailynews.com/blogs?source=nav_blogs");
		sh.addCategory("spinner", "http://www.foxnews.com/");
		sh.addCategory("spinner", "http://www.foxnews.com/politics/index.html");
		sh.addCategory("spinner", "http://www.foxnews.com/science/index.html");
		sh.addCategory("spinner", "http://www.theglobeandmail.com/");
		sh.addCategory("spinner",
				"http://www.theglobeandmail.com/globe-investor/");
		sh.addCategory("spinner", "http://www.theglobeandmail.com/arts/");
		sh.addCategory("spinner", "http://www.usatoday.com/");
		sh.addCategory("spinner", "http://www.usatoday.com/money/");
		sh.addCategory("spinner", "http://www.usatoday.com/opinion/");
		sh.addCategory("spinner", "http://news.google.ca/");
		sh.addCategory("spinner", "https://maps.google.ca/maps?hl=en");
		sh.addCategory("spinner", "http://www.google.ca/finance?tab=ne");
		sh.addCategory("spinner", "http://news.nationalpost.com/category/news/");
		sh.addCategory("spinner", "http://life.nationalpost.com/category/life/");
		sh.addCategory("spinner",
				"http://life.nationalpost.com/category/driving/");
		sh.addCategory("spinner", "http://www.nbc.com/shows");
		sh.addCategory("spinner", "http://www.nbc.com/shows");
		sh.addCategory("spinner", "http://www.nbc.com/schedule");

		/*
		 * long ctid1 = sh.addCountry("CANADA"); long ctid2 =
		 * sh.addCountry("UK"); long ctid3 = sh.addCountry("INDIA");
		 * 
		 * sh.addCategoryToCountryClass((int) caid1, (int) ctid3);
		 * sh.addCategoryToCountryClass((int) caid2, (int) ctid3);
		 * sh.addCategoryToCountryClass((int) caid3, (int) ctid3);
		 * sh.addCategoryToCountryClass((int) caid4, (int) ctid3);
		 * sh.addCategoryToCountryClass((int) caid5, (int) ctid3);
		 */

		Cursor c = sh.getCategoryForCountry("canada");
		while (c.moveToNext()) {
			String caUrl = c.getString(c
					.getColumnIndex(CategoryTable.CATEGORY_URL));
			// int caid =
			// c.getInt(c.getColumnIndex(ClassMappingTable.CATEGORY_ID));
			// System.out.println("Category " + caid + " is added in Country " +
			// ctid3);
			// Toast.makeText(this, "Category " + caid + " is added in Country "
			// + ctid3, Toast.LENGTH_LONG).show();
			Toast.makeText(this, "Category info: " + caUrl, Toast.LENGTH_LONG)
					.show();
		}

	}

	public void showMessage() {
		Toast.makeText(this, "Update or Create Database 0", Toast.LENGTH_LONG)
				.show();
	}
}
