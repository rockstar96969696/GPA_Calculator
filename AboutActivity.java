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
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class AboutActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private String your_version = "";
	private String package_name = "";
	private String versionName = "";
	private double versionCode = 0;
	private HashMap<String, Object> map = new HashMap<>();
	
	private LinearLayout linear1;
	private ImageView imageview1;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private TextView textview17;
	private LinearLayout linear14;
	private TextView textview16;
	private LinearLayout linear15;
	private LinearLayout linear18;
	private TextView textview12;
	private TextView ver_;
	private TextView textview19;
	private ImageView imageview2;
	private LinearLayout linear17;
	private TextView textview;
	private TextView textview3;
	private ImageView imageview3;
	private TextView textview4;
	private TextView textview7;
	private ImageView imageview4;
	private TextView phone;
	private TextView textview14;
	private TextView textview20;
	
	private Intent i = new Intent();
	private SharedPreferences file;
	private SharedPreferences share;
	private TimerTask t;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.about);
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
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview17 = (TextView) findViewById(R.id.textview17);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		textview16 = (TextView) findViewById(R.id.textview16);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview12 = (TextView) findViewById(R.id.textview12);
		ver_ = (TextView) findViewById(R.id.ver_);
		textview19 = (TextView) findViewById(R.id.textview19);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview = (TextView) findViewById(R.id.textview);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		phone = (TextView) findViewById(R.id.phone);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview20 = (TextView) findViewById(R.id.textview20);
		file = getSharedPreferences("store", Activity.MODE_PRIVATE);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				textview7.setTextColor(0xFFF44336);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("mailto:uafappdevelopers?subject=Help"));
				startActivity(i);
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								textview7.setTextColor(0xFF607D8B);
							}
						});
					}
				};
				_timer.schedule(t, (int)(2000));
			}
		});
		
		textview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				textview14.setTextColor(0xFFF44336);
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("sms:+923452166807"));
				startActivity(i);
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								textview14.setTextColor(0xFF607D8B);
							}
						});
					}
				};
				_timer.schedule(t, (int)(2000));
			}
		});
	}
	private void initializeLogic() {
		package_name = "com.uafcgpa";
		_toolbar.setTitle("About");
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo( package_name, android.content.pm.PackageManager.GET_ACTIVITIES);
			your_version = pinfo.versionName; }catch (Exception e){ showMessage(e.toString()); }
		
		_mode();
		map = new HashMap<>();
		map.put("v", your_version);
		textview12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		ver_.setText("Version ".concat(your_version));
		map.clear();
	}
	
	private void _mode () {
		
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
