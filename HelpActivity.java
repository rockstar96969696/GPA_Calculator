package com.uafcgpa;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Typeface;

public class HelpActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private LinearLayout color_linear;
	private LinearLayout linear8;
	private LinearLayout linear1;
	private LinearLayout linear4;
	private LinearLayout linear6;
	private LinearLayout linear9;
	private TextView textview3;
	private TextView textview2;
	private TextView textview13;
	private TextView textview14;
	private TextView textview12;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear5;
	private LinearLayout linear7;
	private TextView textview4;
	private TextView textview7;
	private TextView textview17;
	private TextView textview18;
	private TextView textview19;
	private TextView textview8;
	private TextView textview20;
	
	private Intent i = new Intent();
	private SharedPreferences share;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.help);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		color_linear = (LinearLayout) findViewById(R.id.color_linear);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview20 = (TextView) findViewById(R.id.textview20);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
	}
	private void initializeLogic() {
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		_mode();
	}
	
	private void _mode () {
		if (share.getString("mode", "").equals("1")) {
			color_linear.setBackgroundColor(0xFF000000);
		}
		else {
			if (share.getString("mode", "").equals("0")) {
				color_linear.setBackgroundColor(0xFFFFFFFF);
			}
		}
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
