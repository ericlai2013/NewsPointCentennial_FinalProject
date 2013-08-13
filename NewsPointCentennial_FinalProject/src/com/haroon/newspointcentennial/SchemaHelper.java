package com.haroon.newspointcentennial;

import java.util.HashSet;
import java.util.Set;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class SchemaHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "NewPDB.db";

	// TOGGLE THIS NUMBER FOR UPDATING TABLES AND DATABASE
	private static final int DATABASE_VERSION = 1;

	SchemaHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {

		// CREATE CATEGORIES TABLE
		db.execSQL("CREATE TABLE " + CategoryTable.TABLE_NAME + " ("
				+ CategoryTable.ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ CategoryTable.NAME + " TEXT," + CategoryTable.CATEGORY_URL
				+ " TEXT);");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

		Log.w("LOG_TAG", "Upgrading database from version " + oldVersion
				+ " to " + newVersion
				+ ". This will destroy all old data from database.");

		db.execSQL("DROP TABLE IF EXISTS " + CategoryTable.TABLE_NAME);
		// db.execSQL("DROP TABLE IF EXISTS " + CountryTable.TABLE_NAME);

		onCreate(db);
	}

	public long addCountry(String name) {
		ContentValues cv = new ContentValues();
		cv.put(CountryTable.NAME, name);

		SQLiteDatabase sd = getWritableDatabase();
		long result = sd.insert(CountryTable.TABLE_NAME, CountryTable.NAME, cv);
		return result;
	}

	public long addCategory(String name, String url) {
		ContentValues cv = new ContentValues();
		cv.put(CategoryTable.NAME, name);
		cv.put(CategoryTable.CATEGORY_URL, url);
		// cv.put(CategoryTable.Media, media);

		SQLiteDatabase sd = getWritableDatabase();
		// return category automatic increment id
		long result = sd.insert(CategoryTable.TABLE_NAME, CategoryTable.NAME,
				cv);

		return result;
	}

	public boolean addCategoryToCountryClass(int categoryId, int countryId) {
		ContentValues cv = new ContentValues();
		cv.put(ClassMappingTable.CATEGORY_ID, categoryId);
		cv.put(ClassMappingTable.COUNTRY_ID, countryId);

		SQLiteDatabase sd = getWritableDatabase();
		long result = sd.insert(ClassMappingTable.TABLE_NAME,
				ClassMappingTable.CATEGORY_ID, cv);
		return (result > 0);
	}

	public Cursor getCategoryForCountry(String country) {
		SQLiteDatabase sd = getWritableDatabase();

		// String[] cols = new String[] { ClassMappingTable.CATEGORY_ID };

		// String[] selectionArgs = new String[] { String.valueOf(countryId)};

		Cursor c = sd.rawQuery(
				"SELECT category_url FROM categories WHERE category_country='"
						+ country + "'", null);

		/*
		 * Cursor c = sd.query(ClassMappingTable.TABLE_NAME, cols,
		 * ClassMappingTable.COUNTRY_ID + "=?", selectionArgs, null, null,
		 * null);
		 */

		return c;
	}



	public Set<Integer> getCategorysByNameForCountry(int countryId, String name) {
		SQLiteDatabase sd = getWritableDatabase();

		String[] cols = new String[] { ClassMappingTable.CATEGORY_ID };

		String[] selectionArgs = new String[] { String.valueOf(countryId) };

		Cursor c = sd.query(ClassMappingTable.TABLE_NAME, cols,
				ClassMappingTable.COUNTRY_ID + "=?", selectionArgs, null, null,
				null);

		Set<Integer> returnIds = new HashSet<Integer>();
		while (c.moveToNext()) {
			int id = c.getInt(c.getColumnIndex(ClassMappingTable.CATEGORY_ID));
			returnIds.add(id);
		}

		// make second query

		cols = new String[] { CategoryTable.ID };
		selectionArgs = new String[] { name };

		c = sd.query(CategoryTable.TABLE_NAME, cols,
				CategoryTable.NAME + "= ?", selectionArgs, null, null, null);
		Set<Integer> nameIds = new HashSet<Integer>();
		while (c.moveToNext()) {
			int id = c.getInt(c.getColumnIndex(CategoryTable.ID));
			nameIds.add(id);
		}

		returnIds.retainAll(nameIds);

		return returnIds;
	}

	public Cursor getCountryForCategory(int categoryId) {
		SQLiteDatabase sd = getWritableDatabase();

		String[] cols = new String[] { ClassMappingTable.COUNTRY_ID };

		String[] selectionArgs = new String[] { String.valueOf(categoryId) };

		Cursor c = sd.query(ClassMappingTable.TABLE_NAME, cols,
				ClassMappingTable.CATEGORY_ID + "=?", selectionArgs, null,
				null, null);

		return c;
	}


	public boolean removeCountry(int countryId) {
		SQLiteDatabase sd = getWritableDatabase();
		String[] whereArgs = new String[] { String.valueOf(countryId) };

		sd.delete(ClassMappingTable.TABLE_NAME, ClassMappingTable.COUNTRY_ID
				+ "=?", whereArgs);

		int result = sd.delete(CountryTable.TABLE_NAME, CountryTable.ID + "=?",
				whereArgs);

		return (result > 0);
	}

	public boolean removeCategory(int categoryId) {
		SQLiteDatabase sd = getWritableDatabase();
		String[] whereArgs = new String[] { String.valueOf(categoryId) };

		sd.delete(ClassMappingTable.TABLE_NAME, ClassMappingTable.CATEGORY_ID
				+ "=?", whereArgs);

		int result = sd.delete(CategoryTable.TABLE_NAME, CategoryTable.ID
				+ "=?", whereArgs);

		return (result > 0);
	}


	public Cursor getUrlByCountry(String country) {

		SQLiteDatabase db = getReadableDatabase();
		String sql = "SELECT url FROM category WHERE country ='" + country
				+ "'";
		Cursor c = db.rawQuery(sql, null);
		/*
		 * if (c != null){ c.moveToFirst(); }
		 */
		return c;
	}

	public Cursor getOneUrl() {
		SQLiteDatabase db = getReadableDatabase();
		String sql = "SELECT * FROM category WHERE id = 1";
		Cursor c = db.rawQuery(sql, null);
		return c;
	}
}
