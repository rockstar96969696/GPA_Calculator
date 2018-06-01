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
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.Button;
import android.widget.ImageView;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.Context;
import android.os.Vibrator;
import java.util.Timer;
import java.util.TimerTask;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.view.View;
import android.graphics.Typeface;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private String your_version = "";
	private String latest_version = "";
	private String package_name = "";
	private boolean connected = false;
	private HashMap<String, Object> map = new HashMap<>();
	private String command = "";
	private String pkg = "";
	private HashMap<String, Object> map2 = new HashMap<>();
	
	private ArrayList<HashMap<String, Object>> map1 = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	
	private LinearLayout linear1_all;
	private TextView textview1;
	private WebView webview1;
	private TextView textview2;
	private TextView textview3;
	private LinearLayout linear2;
	private LinearLayout linear4;
	private LinearLayout linear3;
	private Button online;
	private Button offline;
	private TextView your_;
	private TextView textview8;
	private TextView textview6;
	private LinearLayout linear5;
	private Button update;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear2;
	private ImageView _drawer_imageview1;
	private LinearLayout _drawer_move1;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_move3;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_check_move;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_move2;
	private LinearLayout _drawer_linear10;
	private LinearLayout _drawer_linear11;
	private ImageView _drawer_imageview2;
	private TextView _drawer_share_text;
	private ImageView _drawer_imageview3;
	private TextView _drawer_settings_text;
	private ImageView _drawer_imageview5;
	private TextView _drawer_update_text;
	private ImageView _drawer_imageview4;
	private TextView _drawer_about_text;
	private TextView _drawer_textview1;
	
	private Intent i = new Intent();
	private AlertDialog.Builder dilog1;
	private SharedPreferences file;
	private AlertDialog.Builder dialog;
	private Intent iii = new Intent();
	private AlertDialog.Builder dilo3;
	private Vibrator vib;
	private SharedPreferences vibration;
	private SharedPreferences share;
	private TimerTask t;
	private Intent i4 = new Intent();
	private DatabaseReference Fdata = _firebase.getReference("fdata2");
	private ChildEventListener _Fdata_child_listener;
	private DatabaseReference Version = _firebase.getReference("ver");
	private ChildEventListener _Version_child_listener;
	private Intent intent = new Intent();
	private TimerTask time;
	private SharedPreferences share1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear1_all = (LinearLayout) findViewById(R.id.linear1_all);
		textview1 = (TextView) findViewById(R.id.textview1);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		online = (Button) findViewById(R.id.online);
		offline = (Button) findViewById(R.id.offline);
		your_ = (TextView) findViewById(R.id.your_);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		update = (Button) findViewById(R.id.update);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_move1 = (LinearLayout) _nav_view.findViewById(R.id.move1);
		_drawer_linear5 = (LinearLayout) _nav_view.findViewById(R.id.linear5);
		_drawer_move3 = (LinearLayout) _nav_view.findViewById(R.id.move3);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_check_move = (LinearLayout) _nav_view.findViewById(R.id.check_move);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_move2 = (LinearLayout) _nav_view.findViewById(R.id.move2);
		_drawer_linear10 = (LinearLayout) _nav_view.findViewById(R.id.linear10);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_share_text = (TextView) _nav_view.findViewById(R.id.share_text);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_settings_text = (TextView) _nav_view.findViewById(R.id.settings_text);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_update_text = (TextView) _nav_view.findViewById(R.id.update_text);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_about_text = (TextView) _nav_view.findViewById(R.id.about_text);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		dilog1 = new AlertDialog.Builder(this);
		file = getSharedPreferences("store", Activity.MODE_PRIVATE);
		dialog = new AlertDialog.Builder(this);
		dilo3 = new AlertDialog.Builder(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		vibration = getSharedPreferences("value", Activity.MODE_PRIVATE);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
		share1 = getSharedPreferences("share1", Activity.MODE_PRIVATE);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		online.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				webview1.loadUrl("google.com");
				final ProgressDialog prog = new ProgressDialog(MainActivity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Checking connection");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
				_Check_Connection();
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (connected) {
									
									_customToast2("Connected");
								}
								else {
									if (!connected) {
										prog.hide();
									}
									_customToast("Failed to establish a secure connection");
								}
								prog.hide();
								if (vibration.getString("click", "").equals("1")) {
									vib.vibrate((long)(0));
								}
								else {
									if (vibration.getString("click", "").equals("2")) {
										vib.vibrate((long)(100));
									}
								}
								intent.setClass(getApplicationContext(), LoginActivity.class);
								intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
								startActivity(intent);
								setTitle("Main");
								online.setAlpha((float)(Double.parseDouble(".2")));
								t = new TimerTask() {
									@Override
									public void run() {
										runOnUiThread(new Runnable() {
											@Override
											public void run() {
												online.setAlpha((float)(Double.parseDouble("1")));
											}
										});
									}
								};
								_timer.schedule(t, (int)(150));
							}
						});
					}
				};
				_timer.schedule(t, (int)(4000));
			}
		});
		
		offline.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
				}
				offline.setAlpha((float)(Double.parseDouble(".2")));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								offline.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(t, (int)(150));
				if (!share1.getString("email", "").equals("")) {
					i.setClass(getApplicationContext(), WelcomeActivity.class);
					startActivity(i);
					finish();
				}
				else {
					i.setClass(getApplicationContext(), LoginActivity.class);
					startActivity(i);
				}
			}
		});
		
		update.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final ProgressDialog prog = new ProgressDialog(MainActivity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Checking for update");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
				_Check_Connection();
				if (connected) {
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									Version.addListenerForSingleValueEvent(new ValueEventListener() {
										@Override
										public void onDataChange(DataSnapshot _dataSnapshot) {
											map1 = new ArrayList<>();
											try {
												GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
												for (DataSnapshot _data : _dataSnapshot.getChildren()) {
													HashMap<String, Object> _map = _data.getValue(_ind);
													map1.add(_map);
												}
											}
											catch (Exception _e) {
												_e.printStackTrace();
											}
											latest_version = map1.get((int)0).get("v").toString();
											if (Double.parseDouble(latest_version) > Double.parseDouble(your_version)) {
												dilo3.setTitle("Update available");
												dilo3.setMessage("You are using older version of app please update to latest version");
												dilo3.setNegativeButton("Later", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														MyUtil.showMessage(getApplicationContext(), "You need to update");
													}
												});
												dilo3.setPositiveButton("Update", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														iii.setAction(Intent.ACTION_VIEW);
														iii.setData(Uri.parse("https://docs.google.com/spreadsheets/d/1Fe0wsUQiGMX3dX9hKfnWexTf0aICcpOZURwBG6s6NS0/edit?usp=drivesdk"));
														startActivity(iii);
														finish();
													}
												});
												dilo3.create().show();
											}
											else {
												MyUtil.showMessage(getApplicationContext(), "You are using the latest version");
											}
										}
										@Override
										public void onCancelled(DatabaseError _databaseError) {
										}
									});
								}
							});
						}
					};
					_timer.schedule(time, (int)(3000));
				}
				else {
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									MyUtil.showMessage(getApplicationContext(), "Please connect to internet");
								}
							});
						}
					};
					_timer.schedule(time, (int)(4000));
				}
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
				}
				update.setAlpha((float)(Double.parseDouble(".2")));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								update.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(t, (int)(150));
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
				}
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				
			}
		});
		
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
		
		_Version_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Version.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						map1 = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								map1.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						latest_version = map1.get((int)0).get("v").toString();
						if (Double.parseDouble(latest_version) > Double.parseDouble(your_version)) {
							dilo3.setTitle("Update available");
							dilo3.setMessage("You are using older version of app please update to latest version");
							dilo3.setNegativeButton("Later", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									MyUtil.showMessage(getApplicationContext(), "You need to update");
									update.setVisibility(View.VISIBLE);
								}
							});
							dilo3.setPositiveButton("Update", new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface _dialog, int _which) {
									update.setVisibility(View.VISIBLE);
									iii.setAction(Intent.ACTION_VIEW);
									iii.setData(Uri.parse("https://docs.google.com/spreadsheets/d/1uO3-bzpsGURW6FCFhmYD-KQDpkwcWfD1Y622wonUODs/edit?usp=drivesdk"));
									startActivity(iii);
									finish();
								}
							});
							dilo3.create().show();
						}
						else {
							MyUtil.showMessage(getApplicationContext(), "You are using the latest version");
						}
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
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
		Version.addChildEventListener(_Version_child_listener);
		
		_drawer_move1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move1();
			}
		});
		
		_drawer_move3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move3();
			}
		});
		
		_drawer_check_move.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final ProgressDialog prog = new ProgressDialog(MainActivity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Checking for update");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
				_Check_Connection();
				if (connected) {
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									Version.addListenerForSingleValueEvent(new ValueEventListener() {
										@Override
										public void onDataChange(DataSnapshot _dataSnapshot) {
											map1 = new ArrayList<>();
											try {
												GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
												for (DataSnapshot _data : _dataSnapshot.getChildren()) {
													HashMap<String, Object> _map = _data.getValue(_ind);
													map1.add(_map);
												}
											}
											catch (Exception _e) {
												_e.printStackTrace();
											}
											latest_version = map1.get((int)0).get("v").toString();
											if (Double.parseDouble(latest_version) > Double.parseDouble(your_version)) {
												dilo3.setTitle("Update available");
												dilo3.setMessage("You are using older version of app please update to latest version");
												dilo3.setNegativeButton("Later", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														MyUtil.showMessage(getApplicationContext(), "You need to update");
													}
												});
												dilo3.setPositiveButton("Update", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														iii.setAction(Intent.ACTION_VIEW);
														iii.setData(Uri.parse("https://docs.google.com/spreadsheets/d/1Fe0wsUQiGMX3dX9hKfnWexTf0aICcpOZURwBG6s6NS0/edit?usp=drivesdk"));
														startActivity(iii);
														finish();
													}
												});
												dilo3.create().show();
											}
											else {
												MyUtil.showMessage(getApplicationContext(), "You are using the latest version");
											}
										}
										@Override
										public void onCancelled(DatabaseError _databaseError) {
										}
									});
								}
							});
						}
					};
					_timer.schedule(time, (int)(3000));
				}
				else {
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									MyUtil.showMessage(getApplicationContext(), "Please connect to internet");
								}
							});
						}
					};
					_timer.schedule(time, (int)(4000));
				}
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
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
			}
		});
		
		_drawer_move2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move2();
			}
		});
		
		_drawer_share_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move1();
			}
		});
		
		_drawer_settings_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move3();
			}
		});
		
		_drawer_update_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final ProgressDialog prog = new ProgressDialog(MainActivity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Checking for update");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
				_Check_Connection();
				if (connected) {
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									Version.addListenerForSingleValueEvent(new ValueEventListener() {
										@Override
										public void onDataChange(DataSnapshot _dataSnapshot) {
											map1 = new ArrayList<>();
											try {
												GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
												for (DataSnapshot _data : _dataSnapshot.getChildren()) {
													HashMap<String, Object> _map = _data.getValue(_ind);
													map1.add(_map);
												}
											}
											catch (Exception _e) {
												_e.printStackTrace();
											}
											latest_version = map1.get((int)0).get("v").toString();
											if (Double.parseDouble(latest_version) > Double.parseDouble(your_version)) {
												dilo3.setTitle("Update available");
												dilo3.setMessage("You are using older version of app please update to latest version");
												dilo3.setNegativeButton("Later", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														MyUtil.showMessage(getApplicationContext(), "You need to update");
													}
												});
												dilo3.setPositiveButton("Update", new DialogInterface.OnClickListener() {
													@Override
													public void onClick(DialogInterface _dialog, int _which) {
														iii.setAction(Intent.ACTION_VIEW);
														iii.setData(Uri.parse("https://docs.google.com/spreadsheets/d/1Fe0wsUQiGMX3dX9hKfnWexTf0aICcpOZURwBG6s6NS0/edit?usp=drivesdk"));
														startActivity(iii);
														finish();
													}
												});
												dilo3.create().show();
											}
											else {
												MyUtil.showMessage(getApplicationContext(), "You are using the latest version");
											}
										}
										@Override
										public void onCancelled(DatabaseError _databaseError) {
										}
									});
								}
							});
						}
					};
					_timer.schedule(time, (int)(3000));
				}
				else {
					time = new TimerTask() {
						@Override
						public void run() {
							runOnUiThread(new Runnable() {
								@Override
								public void run() {
									prog.hide();
									MyUtil.showMessage(getApplicationContext(), "Please connect to internet");
								}
							});
						}
					};
					_timer.schedule(time, (int)(4000));
				}
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
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
			}
		});
		
		_drawer_about_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move2();
			}
		});
	}
	private void initializeLogic() {
		online.setVisibility(View.GONE);
		webview1.loadUrl("google.com");
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 0);
		package_name = "com.uafcgpa";
		try {
			android.content.pm.PackageInfo pinfo = getPackageManager().getPackageInfo( package_name, android.content.pm.PackageManager.GET_ACTIVITIES);
			your_version = pinfo.versionName; }catch (Exception e){ showMessage(e.toString()); }
		
		DatabaseReference rootRef = _firebase.getReference(); rootRef.child("version").addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot snapshot) {
				if (snapshot.exists()) { } else {
					_mode();
					map = new HashMap<>();
					map.put("v", your_version);
					Version.child("app").updateChildren(map);
				} }
			@Override
			public void onCancelled(DatabaseError _error) { } });
		map.clear();
		if (file.getString("visible", "").equals("")) {
			dialog.setTitle("What's new?");
			dialog.setMessage("●Bug fixes and stability improvements\n●Support subjects 1~6\n●Wrong data input restrictions\n●Logout option added");
			dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			dialog.setNegativeButton("Don't show again", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					file.edit().putString("visible", "a").commit();
				}
			});
			dialog.create().show();
		}
		if (file.getString("close", "").equals("3")) {
			finish();
		}
		share.edit().putString("pop", "3").commit();
		if (share.getString("swipe", "").equals("")) {
			iii.setClass(getApplicationContext(), SwipeActivity.class);
			startActivity(iii);
		}
		if (share.getString("mode", "").equals("")) {
			share.edit().putString("mode", "0").commit();
		}
		your_.setText("Your_Version ".concat(your_version));
		setTitle("Welcome");
	}
	@Override
	public boolean onCreateOptionsMenu (Menu menu){
		menu.add(0, 0, 0, "Share app");
		menu.add(0, 1, 1, "About app");
		menu.add(0, 2, 2, "Settings");
		menu.add(0, 3, 3, "help");
		return true;
	}
	 @Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
			case 0:
			_move1();
			break;
			case 1:
			_move2();
			break;
			case 2:
			_move3();
			break;
			case 3:
			_move4();
			break;
			case android.R.id.home:
			showMessage("Home Button Clicked");
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onBackPressed() {
		dilog1.setTitle("Exit");
		dilog1.setMessage("Do you really want to exit?");
		dilog1.setPositiveButton("YES", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finishAffinity ();
			}
		});
		dilog1.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dilog1.create().show();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
	}
	
	@Override
	public void onResume() {
		super.onResume();
		if (share.getString("pop", "").equals("1")) {
			i.setClass(getApplicationContext(), Main2Activity.class);
			startActivity(i);
			finish();
		}
		else {
			if (share.getString("pop", "").equals("2")) {
				i.setClass(getApplicationContext(), WelcomeActivity.class);
				startActivity(i);
				finish();
			}
		}
		_mode();
	}
	private void _Check_Connection () {
		try {
			command = "ping -c 1 google.com";
			connected = (Runtime.getRuntime().exec (command).waitFor() == 0); } catch (Exception e){ showMessage(e.toString());}
	}
	
	
	private void _mode () {
		if (share.getString("mode", "").equals("1")) {
			linear1_all.setBackgroundResource(R.drawable.main);
			linear1_all.setBackgroundColor(0xFF000000);
			textview6.setTextColor(0xFFFFFFFF);
			your_.setTextColor(0xFFFFFFFF);
			textview1.setTextColor(0xFFFFFFFF);
		}
		else {
			if (share.getString("mode", "").equals("0")) {
				linear1_all.setBackgroundColor(0xFFFFFFFF);
				linear1_all.setBackgroundResource(R.drawable.shsh);
				textview6.setTextColor(0xFF000000);
				your_.setTextColor(0xFF000000);
				textview1.setTextColor(0xFF000000);
			}
		}
	}
	
	
	private void _move1 () {
		MyUtil.showMessage(getApplicationContext(), "Sharing app");
		
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
		i4.setClass(getApplicationContext(), AboutActivity.class);
		startActivity(i4);
	}
	
	
	private void _move3 () {
		i4.setClass(getApplicationContext(), SettingsActivity.class);
		startActivity(i4);
	}
	
	
	private void _move4 () {
		i4.setClass(getApplicationContext(), HelpActivity.class);
		startActivity(i4);
	}
	
	
	private void _customToast (final String _text) {
		LayoutInflater inflater = getLayoutInflater(); View toastLayout = inflater.inflate(R.layout.custom1, null);
		
		TextView textview1 = (TextView) toastLayout.findViewById(R.id.textview1);
		textview1.setText(_text);
		LinearLayout linear1 = (LinearLayout) toastLayout.findViewById(R.id.linear1);
		
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor("#ef5350"));
		gd.setCornerRadius(40);
		gd.setStroke(2, Color.parseColor("#000000"));
		linear1.setBackground(gd);
		
		Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
		toast.setView(toastLayout);
		toast.show();
	}
	
	
	private void _customToast2 (final String _text) {
		LayoutInflater inflater = getLayoutInflater(); View toastLayout = inflater.inflate(R.layout.custom2, null);
		
		TextView textview1 = (TextView) toastLayout.findViewById(R.id.textview1);
		textview1.setText(_text);
		LinearLayout linear1 = (LinearLayout) toastLayout.findViewById(R.id.linear1);
		
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
		gd.setColor(Color.parseColor("#4faf50"));
		gd.setCornerRadius(40);
		gd.setStroke(2, Color.parseColor("#000000"));
		linear1.setBackground(gd);
		
		Toast toast = new Toast(getApplicationContext()); toast.setDuration(Toast.LENGTH_SHORT);
		toast.setView(toastLayout);
		toast.show();
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
