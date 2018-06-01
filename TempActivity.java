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

public class TempActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private TextView no2;
	private TextView no1;
	private TextView no3;
	private TextView no5;
	private TextView no6;
	private TextView no4;
	private TextView ch_sub1;
	private TextView ch_sub2;
	private TextView ch_sub3;
	private TextView ch_sub4;
	private TextView ch_sub5;
	private TextView ch_sub6;
	private TextView points1;
	private TextView points2;
	private TextView points3;
	private TextView points4;
	private TextView points5;
	private TextView points6;
	private TextView grade1;
	private TextView grade2;
	private TextView grade3;
	private TextView grade4;
	private TextView grade5;
	private TextView grade6;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.temp);
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
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		no2 = (TextView) findViewById(R.id.no2);
		no1 = (TextView) findViewById(R.id.no1);
		no3 = (TextView) findViewById(R.id.no3);
		no5 = (TextView) findViewById(R.id.no5);
		no6 = (TextView) findViewById(R.id.no6);
		no4 = (TextView) findViewById(R.id.no4);
		ch_sub1 = (TextView) findViewById(R.id.ch_sub1);
		ch_sub2 = (TextView) findViewById(R.id.ch_sub2);
		ch_sub3 = (TextView) findViewById(R.id.ch_sub3);
		ch_sub4 = (TextView) findViewById(R.id.ch_sub4);
		ch_sub5 = (TextView) findViewById(R.id.ch_sub5);
		ch_sub6 = (TextView) findViewById(R.id.ch_sub6);
		points1 = (TextView) findViewById(R.id.points1);
		points2 = (TextView) findViewById(R.id.points2);
		points3 = (TextView) findViewById(R.id.points3);
		points4 = (TextView) findViewById(R.id.points4);
		points5 = (TextView) findViewById(R.id.points5);
		points6 = (TextView) findViewById(R.id.points6);
		grade1 = (TextView) findViewById(R.id.grade1);
		grade2 = (TextView) findViewById(R.id.grade2);
		grade3 = (TextView) findViewById(R.id.grade3);
		grade4 = (TextView) findViewById(R.id.grade4);
		grade5 = (TextView) findViewById(R.id.grade5);
		grade6 = (TextView) findViewById(R.id.grade6);
	}
	private void initializeLogic() {
	}
	
	private void _ch1 () {
		_toolbar.setBackgroundColor(0xFF000000);
		_toolbar.setTitle(Html.fromHtml("<b><font color='#FFFFFFFF'>Welcome</font></b>"));
		_toolbar.setTitle(Html.fromHtml("<b><font color='#00000000'>Welcome</font></b>"));
		
		_toolbar.setDisplayHomeAsUpEnabled(true);
		/* */} 
	@Override 
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		int itemId = item.getItemId(); 
		switch (itemId) {
			case android.R.id.home:
			finish();
			break;
		}
		return true;
		
		if ("".equals("") || "".equals("")) {
			
			
			
		}
		
		android.graphics.drawable.GradientDrawable gd1 = new android.graphics.drawable.GradientDrawable();
		gd1.setColor(Color.parseColor("#FFFFFF"));
		gd1.setCornerRadius(40);
		signupname.setBackground(gd1);
		
		android.graphics.drawable.GradientDrawable gd2 = new android.graphics.drawable.GradientDrawable();
		gd2.setColor(Color.parseColor("#FFFFFF"));
		gd2.setCornerRadius(50);
		signupemail.setBackground(gd2);
		
		android.graphics.drawable.GradientDrawable gd3 = new android.graphics.drawable.GradientDrawable();
		gd3.setColor(Color.parseColor("#FFFFFF"));
		gd3.setCornerRadius(60);
		signuppassword.setBackground(gd3);
		
		android.graphics.drawable.GradientDrawable gd4= new android.graphics.drawable.GradientDrawable();
		gd4.setColor(Color.parseColor("#FFFFFF"));
		gd4.setCornerRadius(70);
		confirm_password.setBackground(gd4);
		
		android.graphics.drawable.GradientDrawable gd5 = new android.graphics.drawable.GradientDrawable();
		gd5.setColor(Color.parseColor("#FFFFFF"));
		gd5.setCornerRadius(80);
		login_email.setBackground(gd5);
		
		android.graphics.drawable.GradientDrawable gd6 = new android.graphics.drawable.GradientDrawable();
		gd6.setColor(Color.parseColor("#FFFFFF"));
		gd6.setCornerRadius(30);
		login_pass.setBackground(gd6);
		
		android.graphics.drawable.GradientDrawable gd7= new android.graphics.drawable.GradientDrawable();
		gd7.setColor(Color.parseColor("#FFFFFF"));
		gd7.setCornerRadius(90);
		imageview1.setBackground(gd7);
		 }
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		menu.add("Share App").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		
		
		menu.add("About us").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		
		menu.add("Settings").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		menu.add("Help").setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER);
		return true;
	}
	
	@Override 
	public boolean onOptionsItemSelected(final MenuItem item) {
		switch (item.getTitle().toString()) {
			case "Share App":
			showMessage("Sharing App");
			
			
			pkg="com.uafcgpa";
			 String apk = "";
			String uri = (pkg);
			try {
				android.content.pm.PackageInfo pi = getPackageManager().getPackageInfo(uri, android.content.pm.PackageManager.GET_ACTIVITIES);
				apk = pi.applicationInfo.publicSourceDir;
			} catch (Exception e) { showMessage(e.toString());}
			Intent iten = new Intent(Intent.ACTION_SEND);
			iten.setType("*/*");
			iten.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new java.io.File(apk)));
			startActivity(Intent.createChooser(iten, "Share App")); 
			return true;
			case "Settings":
			showMessage("Settings");
			i4.setClass(getApplicationContext(),SettingsActivity.class);
			startActivity (i4);
			
			return true;
			case "Help":
			showMessage("Help");
			i.setClass(getApplicationContext(),HelpActivity.class);
			startActivity (i);
			return true;
			case "About us":
			showMessage("UAF Developers");
			i.setClass(getApplicationContext(),AboutActivity.class);
			startActivity (i);
			return true;
			default:
			return super.onOptionsItemSelected(item);
		}
	}
	
	
	private void _ch2 () {
		
	}
	
	
	private void _ch3 () {
		
	}
	
	
	private void _ch4 () {
		
	}
	
	
	private void _ch5 () {
		
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
