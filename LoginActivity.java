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
import android.support.design.widget.FloatingActionButton;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.text.Editable;
import android.text.TextWatcher;

public class LoginActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private FloatingActionButton _fab;
	private HashMap<String, Object> map = new HashMap<>();
	private String uid = "";
	private boolean veryfied = false;
	private String command = "";
	private boolean connected = false;
	
	private LinearLayout linear1_main_all;
	private LinearLayout register_linear_all;
	private LinearLayout linear26;
	private LinearLayout linear28;
	private LinearLayout name_linear;
	private LinearLayout linear17;
	private LinearLayout email_linear;
	private LinearLayout linear18;
	private LinearLayout pass_linear;
	private LinearLayout linear19;
	private LinearLayout conf_pass_linear;
	private LinearLayout linear20;
	private Button signup_button;
	private LinearLayout linear21;
	private LinearLayout verification_linear;
	private LinearLayout login_linear;
	private TextView textview4;
	private ImageView imageview1;
	private EditText signupname;
	private ImageView imageview2;
	private EditText signupemail;
	private ImageView imageview3;
	private EditText signuppassword;
	private ImageView imageview4;
	private EditText confirm_password;
	private TextView textview1;
	private Button veri_button;
	private LinearLayout linear23;
	private LinearLayout linear6;
	private LinearLayout linear25;
	private LinearLayout linear10;
	private LinearLayout linear_veri_em_all;
	private LinearLayout linear27;
	private Button signin_button;
	private ImageView imageview5;
	private EditText login_email;
	private ImageView imageview6;
	private EditText login_pass;
	private LinearLayout email_linear_all;
	private LinearLayout verifi_linear;
	private TextView textview2;
	private TextView textview3;
	private TextView status;
	private TextView get_verified;
	
	private DatabaseReference fbdb = _firebase.getReference("users");
	private ChildEventListener _fbdb_child_listener;
	private FirebaseAuth login;
	private OnCompleteListener<AuthResult> _login_create_user_listener;
	private OnCompleteListener<AuthResult> _login_sign_in_listener;
	private AlertDialog.Builder dialog;
	private Intent intent = new Intent();
	private SharedPreferences file;
	private SharedPreferences share;
	private SharedPreferences vibration;
	private Vibrator vib;
	private TimerTask timer;
	private Intent i = new Intent();
	private TimerTask t;
	private AlertDialog.Builder sorry;
	private TimerTask t2;
	private SharedPreferences share1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.login);
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
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		linear1_main_all = (LinearLayout) findViewById(R.id.linear1_main_all);
		register_linear_all = (LinearLayout) findViewById(R.id.register_linear_all);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		name_linear = (LinearLayout) findViewById(R.id.name_linear);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		email_linear = (LinearLayout) findViewById(R.id.email_linear);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		pass_linear = (LinearLayout) findViewById(R.id.pass_linear);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		conf_pass_linear = (LinearLayout) findViewById(R.id.conf_pass_linear);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		signup_button = (Button) findViewById(R.id.signup_button);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		verification_linear = (LinearLayout) findViewById(R.id.verification_linear);
		login_linear = (LinearLayout) findViewById(R.id.login_linear);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		signupname = (EditText) findViewById(R.id.signupname);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		signupemail = (EditText) findViewById(R.id.signupemail);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		signuppassword = (EditText) findViewById(R.id.signuppassword);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		confirm_password = (EditText) findViewById(R.id.confirm_password);
		textview1 = (TextView) findViewById(R.id.textview1);
		veri_button = (Button) findViewById(R.id.veri_button);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear_veri_em_all = (LinearLayout) findViewById(R.id.linear_veri_em_all);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		signin_button = (Button) findViewById(R.id.signin_button);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		login_email = (EditText) findViewById(R.id.login_email);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		login_pass = (EditText) findViewById(R.id.login_pass);
		email_linear_all = (LinearLayout) findViewById(R.id.email_linear_all);
		verifi_linear = (LinearLayout) findViewById(R.id.verifi_linear);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		status = (TextView) findViewById(R.id.status);
		get_verified = (TextView) findViewById(R.id.get_verified);
		login = FirebaseAuth.getInstance();
		dialog = new AlertDialog.Builder(this);
		file = getSharedPreferences("file", Activity.MODE_PRIVATE);
		share = getSharedPreferences("share", Activity.MODE_PRIVATE);
		vibration = getSharedPreferences("value", Activity.MODE_PRIVATE);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		sorry = new AlertDialog.Builder(this);
		share1 = getSharedPreferences("share1", Activity.MODE_PRIVATE);
		
		signup_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (!(signupname.getText().toString().equals("") || (signupemail.getText().toString().equals("") || (signuppassword.getText().toString().equals("") || confirm_password.getText().toString().equals(""))))) {
					if (signuppassword.getText().toString().equals(confirm_password.getText().toString())) {
						login.createUserWithEmailAndPassword(signupemail.getText().toString(), signuppassword.getText().toString()).addOnCompleteListener(LoginActivity.this, _login_create_user_listener);
						MyUtil.showMessage(getApplicationContext(), "Please Wait");
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "Possword does not match");
					}
				}
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
				}
				signup_button.setAlpha((float)(Double.parseDouble(".2")));
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								signup_button.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(timer, (int)(150));
			}
		});
		
		signupname.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!signupname.getText().toString().equals("")) {
					if (signupname.getText().toString().contains(" @Developer") || (signupname.getText().toString().contains(" @") || _charSeq.contains("Developer"))) {
						signupname.setText("");
						MyUtil.showMessage(getApplicationContext(), "Sorry you're not developer");
					}
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		veri_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final ProgressDialog prog = new ProgressDialog(LoginActivity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Working");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
				timer = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								prog.hide();
								dialog.setCancelable(false);
								FirebaseAuth.getInstance().getCurrentUser().sendEmailVerification();
								dialog.setTitle("Verification");
								dialog.setMessage("Verification link has been send.\nCheck you email account and verify you account ");
								dialog.setPositiveButton("Check Email", new DialogInterface.OnClickListener() {
									@Override
									public void onClick(DialogInterface _dialog, int _which) {
										 Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.google.android.gm"); 
										if (launchIntent != null) { startActivity(launchIntent);}
									}
								});
								dialog.create().show();
							}
						});
					}
				};
				_timer.schedule(timer, (int)(2000));
			}
		});
		
		signin_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (login_email.getText().toString().equals("") || login_pass.getText().toString().equals("")) {
					MyUtil.showMessage(getApplicationContext(), "Fill all data");
				}
				else {
					textview3.setText(login_email.getText().toString());
					login.signInWithEmailAndPassword(login_email.getText().toString(), login_pass.getText().toString()).addOnCompleteListener(LoginActivity.this, _login_sign_in_listener);
				}
				signin_button.setAlpha((float)(Double.parseDouble(".2")));
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									signin_button.setAlpha((float)(Double.parseDouble("1")));
								}
							});
						}
					};
					_timer.schedule(timer, (int)(150));
				}
			}
		});
		
		_fbdb_child_listener = new ChildEventListener() {
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
		fbdb.addChildEventListener(_fbdb_child_listener);
		
		_login_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				if (_success) {
					file.edit().putString("email", signupemail.getText().toString()).commit();
					share1.edit().putString("name", signupname.getText().toString()).commit();
					file.edit().putString("password", signupemail.getText().toString()).commit();
					file.edit().putString("uid", FirebaseAuth.getInstance().getCurrentUser().getUid()).commit();
					uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
					map = new HashMap<>();
					map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
					map.put("email", signupemail.getText().toString());
					map.put("name", signupname.getText().toString());
					fbdb.child(uid).updateChildren(map);
					MyUtil.showMessage(getApplicationContext(), "Account successfully created");
					verification_linear.setVisibility(View.VISIBLE);
				}
				else {
					MyUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
		
		_login_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				final ProgressDialog prog = new ProgressDialog(LoginActivity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Signing in");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
				if (_success) {
					file.edit().putString("email", login_email.getText().toString()).commit();
					share1.edit().putString("email", login_email.getText().toString()).commit();
					file.edit().putString("password", login_pass.getText().toString()).commit();
					file.edit().putString("uid", FirebaseAuth.getInstance().getCurrentUser().getUid()).commit();
					veryfied=FirebaseAuth.getInstance().getCurrentUser().isEmailVerified();
					t = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									if (get_verified.getText().toString().contains("Yes")) {
										intent.setClass(getApplicationContext(), WelcomeActivity.class);
										startActivity(intent);
										MyUtil.showMessage(getApplicationContext(), "Successfully logged in");
									}
									else {
										MyUtil.showMessage(getApplicationContext(), "Verification failed");
									}
								}
							});
						}
					};
					_timer.schedule(t, (int)(4000));
					MyUtil.showMessage(getApplicationContext(), "Please wait");
					timer = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									if (veryfied) {
										get_verified.setText("Yes");
										get_verified.setTextColor(0xFF4CAF50);
										MyUtil.showMessage(getApplicationContext(), "Verification successful");
									}
									else {
										if (!veryfied) {
											get_verified.setText("No");
											get_verified.setTextColor(0xFFF44336);
										}
										get_verified.setText("No");
										get_verified.setTextColor(0xFFF44336);
									}
								}
							});
						}
					};
					_timer.schedule(timer, (int)(3000));
				}
				else {
					prog.hide();
					MyUtil.showMessage(getApplicationContext(), _errorMessage);
				}
			}
		};
	}
	private void initializeLogic() {
		linear26.setVisibility(View.GONE);
		sorry.setTitle("We Apologize");
		sorry.setMessage("For the first time using the app you need to create a new account or login with your account.");
		sorry.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		sorry.create().show();
		setTitle("Main");
		_iRound_Corner("#000000", 40, signupname);
		_iRound_Corner("#000000", 40, signuppassword);
		_iRound_Corner("#000000", 40, signupemail);
		_iRound_Corner("#000000", 40, confirm_password);
		_iRound_Corner("#fdd835", 60, veri_button);
		_iRound_Corner("#000000", 40, login_email);
		_iRound_Corner("#000000", 40, login_pass);
		_iRound_Corner("#2196f3", 60, signin_button);
		_iRound_Corner("#000000", 40, get_verified);
		_iRound_Corner("#4caf50", 60, signup_button);
		_iRound_Corner("#000000", 40, verification_linear);
		verification_linear.setVisibility(View.GONE);
		_iRound_Corner("#000000", 40, email_linear);
		_iRound_Corner("#000000", 40, pass_linear);
		_iRound_Corner("#000000", 40, conf_pass_linear);
		_iRound_Corner("#000000", 40, login_pass);
		_iRound_Corner("#000000", 40, get_verified);
		_iRound_Corner("#000000", 40, textview3);
		_iRound_Corner("#000000", 40, linear23);
		_iRound_Corner("#000000", 40, linear25);
		_iRound_Corner("#000000", 40, verifi_linear);
		_iRound_Corner("#000000", 40, email_linear_all);
		_iRound_Corner("#000000", 45, linear_veri_em_all);
		_iRound_Corner("#000000", 40, name_linear);
		_iRound_Corner("#fff44336", 40, linear26);
		_fab.setVisibility(View.GONE);
	}
	
	private void _move1 () {
		
		String apk = "";
		String uri = ("com.uafcgpa");
		
		try {
			android.content.pm.PackageInfo pi = getPackageManager().getPackageInfo(uri, android.content.pm.PackageManager.GET_ACTIVITIES);
			
			apk = pi.applicationInfo.publicSourceDir;
		} catch (Exception e) {
			showMessage(e.toString());
		}
		Intent iten = new Intent(Intent.ACTION_SEND);
		iten.setType("*/*");
		iten.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new java.io.File(apk)));
		
		startActivity(Intent.createChooser(iten, "Send APK"));
	}
	
	
	private void _move2 () {
		i.setClass(getApplicationContext(), AboutActivity.class);
		startActivity(i);
	}
	
	
	private void _move3 () {
		i.setClass(getApplicationContext(), SettingsActivity.class);
		startActivity(i);
	}
	
	
	private void _move4 () {
		i.setClass(getApplicationContext(), HelpActivity.class);
		startActivity(i);
	}
	
	
	private void _iRound_Corner (final String _color, final double _numb, final View _view) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor(_color));
		gd.setCornerRadius((int)_numb);
		_view.setBackground(gd);
		
		// _color your color string
		// _numb Radious Number
		// _view to view
	}
	
	
	private void _checkConnection () {
		try {
			command = "ping -c 1 google.com";
			connected = (Runtime.getRuntime().exec (command).waitFor() == 0); } catch (Exception e){ showMessage(e.toString());}
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
