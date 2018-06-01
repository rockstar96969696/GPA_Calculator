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
import android.widget.Button;
import android.content.Context;
import android.os.Vibrator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;

public class SettingsActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private double click = 0;
	
	private LinearLayout linear1;
	private TextView textview1;
	private Button bug;
	private TextView textview2;
	private Button ideo;
	private TextView textview5;
	private Button night_on;
	private LinearLayout linear3;
	private Button night_off;
	private TextView textview4;
	private Button vib_on;
	private LinearLayout linear2;
	private Button vib_off;
	private LinearLayout linear4;
	private TextView textview3;
	
	private Vibrator vib;
	private SharedPreferences vibration;
	private Intent i = new Intent();
	private AlertDialog.Builder exit;
	private TimerTask time;
	private SharedPreferences share;
	private SharedPreferences file;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.settings);
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
		textview1 = (TextView) findViewById(R.id.textview1);
		bug = (Button) findViewById(R.id.bug);
		textview2 = (TextView) findViewById(R.id.textview2);
		ideo = (Button) findViewById(R.id.ideo);
		textview5 = (TextView) findViewById(R.id.textview5);
		night_on = (Button) findViewById(R.id.night_on);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		night_off = (Button) findViewById(R.id.night_off);
		textview4 = (TextView) findViewById(R.id.textview4);
		vib_on = (Button) findViewById(R.id.vib_on);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		vib_off = (Button) findViewById(R.id.vib_off);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		textview3 = (TextView) findViewById(R.id.textview3);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		vibration = getSharedPreferences("value", Activity.MODE_PRIVATE);
		exit = new AlertDialog.Builder(this);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
		file = getSharedPreferences("store", Activity.MODE_PRIVATE);
		
		bug.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("mailto:uafappdevelopers@gmail.com?subject=Report bug"));
				startActivity(i);
			}
		});
		
		ideo.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("mailto:uafappdevelopers@gmail.com?subject=Suggestion"));
				startActivity(i);
			}
		});
		
		night_on.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				share.edit().putString("mode", "1").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Night mode is ON");
				textview1.setTextColor(0xFFFFFFFF);
				textview2.setTextColor(0xFFFFFFFF);
				textview4.setTextColor(0xFFFFFFFF);
				textview5.setTextColor(0xFFFFFFFF);
			}
		});
		
		night_off.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				share.edit().putString("mode", "0").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Night mode is OFF");
				textview1.setTextColor(0xFF000000);
				textview2.setTextColor(0xFF000000);
				textview4.setTextColor(0xFF000000);
				textview5.setTextColor(0xFF000000);
			}
		});
		
		vib_on.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				vibration.edit().putString("click", "2").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Vibration is ON");
			}
		});
		
		vib_off.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				vibration.edit().putString("click", "1").commit();
				SketchwareUtil.showMessage(getApplicationContext(), "Vibration is OFF");
			}
		});
	}
	private void initializeLogic() {
		_toolbar.setTitle("Settings");
		if (share.getString("exit", "").equals("yes")) {
			finish();
		}
		_mode();
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		_iRound_corner_("#FFFFFF", 60, bug);
		_iRound_corner_("#FFFFFF", 60, ideo);
		_iRound_corner_("#FFFFFF", 60, night_on);
		_iRound_corner_("#FFFFFF", 60, night_off);
		_iRound_corner_("#FFFFFF", 60, vib_on);
		_iRound_corner_("#FFFFFF", 60, vib_off);
	}
	
	private void _iRound_corner_ (final String _color, final double _numb, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_numb);
		_view.setBackground(gd);
		
		// _color your color string
		// _numb Radious Number
		// _view to view
	}
	
	
	private void _mode () {
		if (share.getString("mode", "").equals("1")) {
			linear1.setBackgroundResource(R.drawable.setting);
		}
		else {
			if (share.getString("mode", "").equals("0")) {
				linear1.setBackgroundResource(R.drawable.setting);
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
