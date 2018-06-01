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
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.graphics.Typeface;

public class SwipeActivity extends AppCompatActivity {
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private double detect_swipe = 0;
	private double f = 0;
	private double t = 0;
	private HashMap<String, Object> map2 = new HashMap<>();
	
	private LinearLayout linear1;
	private EditText edittext1;
	private LinearLayout whatsgpaall;
	private LinearLayout howwork;
	private LinearLayout whatsgpa;
	private TextView what_gpa_text;
	private LinearLayout linear6;
	private TextView textview3;
	private LinearLayout linear2;
	private LinearLayout swipe2;
	private TextView textview4;
	private TextView textview5;
	private TextView swipe1;
	private LinearLayout linear5;
	private TextView textview8;
	private LinearLayout linear8;
	private LinearLayout swipeto;
	private LinearLayout linear4;
	private LinearLayout linear9;
	private TextView how_text;
	private TextView textview11;
	private TextView textview12;
	private TextView swipe;
	
	private Intent i = new Intent();
	private SharedPreferences share;
	private DatabaseReference Fdata = _firebase.getReference("fdata2");
	private ChildEventListener _Fdata_child_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.swipe);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		whatsgpaall = (LinearLayout) findViewById(R.id.whatsgpaall);
		howwork = (LinearLayout) findViewById(R.id.howwork);
		whatsgpa = (LinearLayout) findViewById(R.id.whatsgpa);
		what_gpa_text = (TextView) findViewById(R.id.what_gpa_text);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		swipe2 = (LinearLayout) findViewById(R.id.swipe2);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		swipe1 = (TextView) findViewById(R.id.swipe1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		textview8 = (TextView) findViewById(R.id.textview8);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		swipeto = (LinearLayout) findViewById(R.id.swipeto);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		how_text = (TextView) findViewById(R.id.how_text);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		swipe = (TextView) findViewById(R.id.swipe);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
		
		_Fdata_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final String _errorCode = String.valueOf(_param1.getCode());
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Fdata.addChildEventListener(_Fdata_child_listener);
	}
	private void initializeLogic() {
		linear1.setOnTouchListener(new View.OnTouchListener() {@Override public boolean onTouch(View p1, MotionEvent p2){ switch(p2.getAction()) { case MotionEvent.ACTION_DOWN: f = p2.getX();break; case MotionEvent.ACTION_UP: t = p2.getX();if (((f - t) < -250)) {_swipeLeft();} if (((t - f) < -250)) {_swipeRight();}break;}return true;}});
		what_gpa_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		whatsgpaall.setVisibility(View.VISIBLE);
		howwork.setVisibility(View.GONE);
		how_text.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		share.edit().putString("swipe", "").commit();
		swipe.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		swipe1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		
	}
	
	private void _swipeLeft () {
		detect_swipe--;
		whatsgpaall.setVisibility(View.VISIBLE);
		howwork.setVisibility(View.GONE);
	}
	
	
	private void _swipeRight () {
		detect_swipe++;
		if (detect_swipe == 1) {
			whatsgpaall.setVisibility(View.GONE);
			howwork.setVisibility(View.VISIBLE);
			MyUtil.showMessage(getApplicationContext(), "Swipe to start");
			map2 = new HashMap<>();
			map2.put("newuser", "New User install the app");
			Fdata.push().updateChildren(map2);
		}
		else {
			if (detect_swipe == 2) {
				share.edit().putString("swipe", "1").commit();
				i.setClass(getApplicationContext(), MainActivity.class);
				startActivity(i);
				finish();
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
