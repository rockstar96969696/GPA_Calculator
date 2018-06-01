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
import android.widget.ScrollView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
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
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
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
import android.view.View;
import android.widget.AdapterView;
import android.text.Editable;
import android.text.TextWatcher;
import java.text.DecimalFormat;
import android.graphics.Typeface;

public class Main2Activity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private FloatingActionButton _fab;
	private DrawerLayout _drawer;
	private String CrH2 = "";
	private String pkg = "";
	private String set = "";
	private double p1 = 0;
	private double p2 = 0;
	private double p4 = 0;
	private double p5 = 0;
	private double p6 = 0;
	private String set2 = "";
	private double subj1 = 0;
	private double subj2 = 0;
	private double subj3 = 0;
	private double subj4 = 0;
	private double subj5 = 0;
	private double subj6 = 0;
	private HashMap<String, Object> map = new HashMap<>();
	private String your_version = "";
	private String package_name = "";
	private String latest_version = "";
	private boolean connected = false;
	private String command = "";
	private double p3 = 0;
	private String a = "";
	private double rotate = 0;
	private double no_8 = 0;
	private double no_9 = 0;
	private double no_10 = 0;
	private double no_11 = 0;
	private double no_12 = 0;
	private double no_13 = 0;
	private double no_14 = 0;
	private double no_15 = 0;
	private double no_16 = 0;
	private double no_17 = 0;
	private double no_18 = 0;
	private double no_19 = 0;
	private double no_20 = 0;
	private double no_21 = 0;
	private double no_22 = 0;
	private double no_23 = 0;
	private double no_24 = 0;
	private double no_25 = 0;
	private double no_26 = 0;
	private double no_27 = 0;
	private double no_28 = 0;
	private double no_29 = 0;
	private double no_30 = 0;
	private double no_31 = 0;
	private double no_32 = 0;
	private double no_33 = 0;
	private double no_34 = 0;
	private double no_35 = 0;
	private double no_36 = 0;
	private double no_37 = 0;
	private double no_38 = 0;
	private double no_39 = 0;
	private double no_40 = 0;
	private double no_41 = 0;
	private double no_42 = 0;
	private double no_43 = 0;
	private double no_44 = 0;
	private double no_45 = 0;
	private double no_46 = 0;
	private double no_47 = 0;
	private double no_48 = 0;
	private double no_49 = 0;
	private double no_50 = 0;
	
	private ArrayList<HashMap<String, Object>> map1 = new ArrayList<>();
	private ArrayList<String> list = new ArrayList<>();
	
	private LinearLayout linear_al_expt_welcm;
	private LinearLayout linear_spinner;
	private LinearLayout headings_linear;
	private LinearLayout linear84;
	private ScrollView vscrol_all_data;
	private LinearLayout allign_gpa_message;
	private Button submitdata;
	private LinearLayout allign_reset_calcula;
	private TextView textview15;
	private Spinner spinner1;
	private Button button7;
	private LinearLayout linear13;
	private Button button8;
	private LinearLayout linear14;
	private Button button9;
	private LinearLayout linear15;
	private Button button10;
	private LinearLayout linear16;
	private Button button11;
	private LinearLayout linear_subject_all;
	private LinearLayout sub1_row;
	private LinearLayout sub2_row;
	private LinearLayout sub3_row;
	private LinearLayout sub4_row;
	private LinearLayout sub5_row;
	private LinearLayout sub6_row;
	private LinearLayout sub8_row;
	private LinearLayout sub7_row;
	private LinearLayout sub9_row;
	private LinearLayout sub10_row;
	private LinearLayout sub11_row;
	private LinearLayout sub12_row;
	private LinearLayout sub13_row;
	private LinearLayout sub14_row;
	private LinearLayout sub15_row;
	private LinearLayout sub16_row;
	private Button subject1;
	private LinearLayout linear19;
	private EditText ch_sub1;
	private LinearLayout linear27;
	private EditText no1;
	private LinearLayout linear31;
	private EditText points1;
	private EditText grade1;
	private Button subject2;
	private LinearLayout linear24;
	private EditText ch_sub2;
	private LinearLayout linear28;
	private EditText no2;
	private LinearLayout linear32;
	private EditText points2;
	private EditText grade2;
	private Button subject3;
	private LinearLayout linear25;
	private EditText ch_sub3;
	private LinearLayout linear29;
	private EditText no3;
	private LinearLayout linear33;
	private EditText points3;
	private EditText grade3;
	private Button subject4;
	private LinearLayout linear26;
	private EditText ch_sub4;
	private LinearLayout linear30;
	private EditText no4;
	private LinearLayout linear34;
	private EditText points4;
	private EditText grade4;
	private Button subject5;
	private LinearLayout linear35;
	private EditText ch_sub5;
	private LinearLayout linear36;
	private EditText no5;
	private LinearLayout linear37;
	private EditText points5;
	private EditText grade5;
	private Button subject6;
	private LinearLayout linear39;
	private EditText ch_sub6;
	private LinearLayout linear40;
	private EditText no6;
	private LinearLayout linear41;
	private EditText points6;
	private EditText grade6;
	private Button subject7;
	private LinearLayout linear49;
	private EditText ch_sub7;
	private LinearLayout linear65;
	private EditText no7;
	private LinearLayout linear75;
	private EditText points7;
	private EditText grade7;
	private Button subject8;
	private LinearLayout linear48;
	private EditText ch_sub8;
	private LinearLayout linear64;
	private EditText no8;
	private LinearLayout linear74;
	private EditText points8;
	private EditText grade8;
	private Button subject9;
	private LinearLayout linear50;
	private EditText ch_sub9;
	private LinearLayout linear66;
	private EditText no9;
	private LinearLayout linear76;
	private EditText points9;
	private EditText grade9;
	private Button subject10;
	private LinearLayout linear52;
	private EditText ch_sub10;
	private LinearLayout linear67;
	private EditText no10;
	private LinearLayout linear77;
	private EditText points10;
	private EditText grade10;
	private Button subject11;
	private LinearLayout linear53;
	private EditText ch_sub11;
	private LinearLayout linear68;
	private EditText no11;
	private LinearLayout linear78;
	private EditText points11;
	private EditText grade11;
	private Button subject12;
	private LinearLayout linear54;
	private EditText ch_sub12;
	private LinearLayout linear69;
	private EditText no12;
	private LinearLayout linear79;
	private EditText points12;
	private EditText grade12;
	private Button subject13;
	private LinearLayout linear57;
	private EditText ch_sub13;
	private LinearLayout linear70;
	private EditText no13;
	private LinearLayout linear80;
	private EditText points13;
	private EditText grade13;
	private Button subject14;
	private LinearLayout linear61;
	private EditText ch_sub14;
	private LinearLayout linear71;
	private EditText no14;
	private LinearLayout linear81;
	private EditText points14;
	private EditText grade14;
	private Button subject15;
	private LinearLayout linear62;
	private EditText ch_sub15;
	private LinearLayout linear72;
	private EditText no15;
	private LinearLayout linear82;
	private EditText points15;
	private EditText grade15;
	private Button subject16;
	private LinearLayout linear63;
	private EditText ch_sub16;
	private LinearLayout linear73;
	private EditText no16;
	private LinearLayout linear83;
	private EditText points16;
	private EditText grade16;
	private TextView textview11;
	private TextView gpa;
	private Button reset;
	private TextView textview13;
	private Button calculate;
	private TextView textview14;
	private Button share_result;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear2;
	private ImageView _drawer_imageview1;
	private LinearLayout _drawer_move1;
	private LinearLayout _drawer_linear6;
	private LinearLayout _drawer_move3;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_check_lin;
	private LinearLayout _drawer_linear10;
	private LinearLayout _drawer_move2;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_logout_linear;
	private LinearLayout _drawer_linear12;
	private ImageView _drawer_imageview2;
	private TextView _drawer_shre_text;
	private ImageView _drawer_imageview3;
	private TextView _drawer_settings_text;
	private ImageView _drawer_imageview4;
	private TextView _drawer_check_text;
	private ImageView _drawer_imageview5;
	private TextView _drawer_about_text;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview1;
	private TextView _drawer_textview2;
	
	private AlertDialog.Builder dilog1;
	private Intent i = new Intent();
	private AlertDialog.Builder dilog2;
	private SharedPreferences file;
	private AlertDialog.Builder dilog3;
	private SharedPreferences file2;
	private Intent i2 = new Intent();
	private AlertDialog.Builder info;
	private Intent whatsappgroup = new Intent();
	private AlertDialog.Builder dialog;
	private SharedPreferences File;
	private AlertDialog.Builder dilo3;
	private Intent iii = new Intent();
	private Vibrator vib;
	private SharedPreferences vibration;
	private Intent i4 = new Intent();
	private AlertDialog.Builder exit;
	private SharedPreferences gpa_file;
	private SharedPreferences share;
	private SharedPreferences back;
	private TimerTask t;
	private TimerTask time;
	private AlertDialog.Builder help;
	private ObjectAnimator blink = new ObjectAnimator();
	private ObjectAnimator blink2 = new ObjectAnimator();
	private SharedPreferences grade;
	private SharedPreferences grade_2;
	private SharedPreferences grade_3;
	private SharedPreferences grade_4;
	private SharedPreferences grade_5;
	private SharedPreferences grade_6;
	private DatabaseReference Version = _firebase.getReference("ver");
	private ChildEventListener _Version_child_listener;
	private FirebaseAuth login;
	private OnCompleteListener<AuthResult> _login_create_user_listener;
	private OnCompleteListener<AuthResult> _login_sign_in_listener;
	private SharedPreferences share1;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main2);
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
		
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(Main2Activity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear_al_expt_welcm = (LinearLayout) findViewById(R.id.linear_al_expt_welcm);
		linear_spinner = (LinearLayout) findViewById(R.id.linear_spinner);
		headings_linear = (LinearLayout) findViewById(R.id.headings_linear);
		linear84 = (LinearLayout) findViewById(R.id.linear84);
		vscrol_all_data = (ScrollView) findViewById(R.id.vscrol_all_data);
		allign_gpa_message = (LinearLayout) findViewById(R.id.allign_gpa_message);
		submitdata = (Button) findViewById(R.id.submitdata);
		allign_reset_calcula = (LinearLayout) findViewById(R.id.allign_reset_calcula);
		textview15 = (TextView) findViewById(R.id.textview15);
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		button7 = (Button) findViewById(R.id.button7);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		button8 = (Button) findViewById(R.id.button8);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		button9 = (Button) findViewById(R.id.button9);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		button10 = (Button) findViewById(R.id.button10);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		button11 = (Button) findViewById(R.id.button11);
		linear_subject_all = (LinearLayout) findViewById(R.id.linear_subject_all);
		sub1_row = (LinearLayout) findViewById(R.id.sub1_row);
		sub2_row = (LinearLayout) findViewById(R.id.sub2_row);
		sub3_row = (LinearLayout) findViewById(R.id.sub3_row);
		sub4_row = (LinearLayout) findViewById(R.id.sub4_row);
		sub5_row = (LinearLayout) findViewById(R.id.sub5_row);
		sub6_row = (LinearLayout) findViewById(R.id.sub6_row);
		sub8_row = (LinearLayout) findViewById(R.id.sub8_row);
		sub7_row = (LinearLayout) findViewById(R.id.sub7_row);
		sub9_row = (LinearLayout) findViewById(R.id.sub9_row);
		sub10_row = (LinearLayout) findViewById(R.id.sub10_row);
		sub11_row = (LinearLayout) findViewById(R.id.sub11_row);
		sub12_row = (LinearLayout) findViewById(R.id.sub12_row);
		sub13_row = (LinearLayout) findViewById(R.id.sub13_row);
		sub14_row = (LinearLayout) findViewById(R.id.sub14_row);
		sub15_row = (LinearLayout) findViewById(R.id.sub15_row);
		sub16_row = (LinearLayout) findViewById(R.id.sub16_row);
		subject1 = (Button) findViewById(R.id.subject1);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		ch_sub1 = (EditText) findViewById(R.id.ch_sub1);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		no1 = (EditText) findViewById(R.id.no1);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		points1 = (EditText) findViewById(R.id.points1);
		grade1 = (EditText) findViewById(R.id.grade1);
		subject2 = (Button) findViewById(R.id.subject2);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		ch_sub2 = (EditText) findViewById(R.id.ch_sub2);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		no2 = (EditText) findViewById(R.id.no2);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		points2 = (EditText) findViewById(R.id.points2);
		grade2 = (EditText) findViewById(R.id.grade2);
		subject3 = (Button) findViewById(R.id.subject3);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		ch_sub3 = (EditText) findViewById(R.id.ch_sub3);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		no3 = (EditText) findViewById(R.id.no3);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		points3 = (EditText) findViewById(R.id.points3);
		grade3 = (EditText) findViewById(R.id.grade3);
		subject4 = (Button) findViewById(R.id.subject4);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		ch_sub4 = (EditText) findViewById(R.id.ch_sub4);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		no4 = (EditText) findViewById(R.id.no4);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		points4 = (EditText) findViewById(R.id.points4);
		grade4 = (EditText) findViewById(R.id.grade4);
		subject5 = (Button) findViewById(R.id.subject5);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		ch_sub5 = (EditText) findViewById(R.id.ch_sub5);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		no5 = (EditText) findViewById(R.id.no5);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		points5 = (EditText) findViewById(R.id.points5);
		grade5 = (EditText) findViewById(R.id.grade5);
		subject6 = (Button) findViewById(R.id.subject6);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		ch_sub6 = (EditText) findViewById(R.id.ch_sub6);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		no6 = (EditText) findViewById(R.id.no6);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		points6 = (EditText) findViewById(R.id.points6);
		grade6 = (EditText) findViewById(R.id.grade6);
		subject7 = (Button) findViewById(R.id.subject7);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		ch_sub7 = (EditText) findViewById(R.id.ch_sub7);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		no7 = (EditText) findViewById(R.id.no7);
		linear75 = (LinearLayout) findViewById(R.id.linear75);
		points7 = (EditText) findViewById(R.id.points7);
		grade7 = (EditText) findViewById(R.id.grade7);
		subject8 = (Button) findViewById(R.id.subject8);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		ch_sub8 = (EditText) findViewById(R.id.ch_sub8);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		no8 = (EditText) findViewById(R.id.no8);
		linear74 = (LinearLayout) findViewById(R.id.linear74);
		points8 = (EditText) findViewById(R.id.points8);
		grade8 = (EditText) findViewById(R.id.grade8);
		subject9 = (Button) findViewById(R.id.subject9);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		ch_sub9 = (EditText) findViewById(R.id.ch_sub9);
		linear66 = (LinearLayout) findViewById(R.id.linear66);
		no9 = (EditText) findViewById(R.id.no9);
		linear76 = (LinearLayout) findViewById(R.id.linear76);
		points9 = (EditText) findViewById(R.id.points9);
		grade9 = (EditText) findViewById(R.id.grade9);
		subject10 = (Button) findViewById(R.id.subject10);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		ch_sub10 = (EditText) findViewById(R.id.ch_sub10);
		linear67 = (LinearLayout) findViewById(R.id.linear67);
		no10 = (EditText) findViewById(R.id.no10);
		linear77 = (LinearLayout) findViewById(R.id.linear77);
		points10 = (EditText) findViewById(R.id.points10);
		grade10 = (EditText) findViewById(R.id.grade10);
		subject11 = (Button) findViewById(R.id.subject11);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		ch_sub11 = (EditText) findViewById(R.id.ch_sub11);
		linear68 = (LinearLayout) findViewById(R.id.linear68);
		no11 = (EditText) findViewById(R.id.no11);
		linear78 = (LinearLayout) findViewById(R.id.linear78);
		points11 = (EditText) findViewById(R.id.points11);
		grade11 = (EditText) findViewById(R.id.grade11);
		subject12 = (Button) findViewById(R.id.subject12);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		ch_sub12 = (EditText) findViewById(R.id.ch_sub12);
		linear69 = (LinearLayout) findViewById(R.id.linear69);
		no12 = (EditText) findViewById(R.id.no12);
		linear79 = (LinearLayout) findViewById(R.id.linear79);
		points12 = (EditText) findViewById(R.id.points12);
		grade12 = (EditText) findViewById(R.id.grade12);
		subject13 = (Button) findViewById(R.id.subject13);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		ch_sub13 = (EditText) findViewById(R.id.ch_sub13);
		linear70 = (LinearLayout) findViewById(R.id.linear70);
		no13 = (EditText) findViewById(R.id.no13);
		linear80 = (LinearLayout) findViewById(R.id.linear80);
		points13 = (EditText) findViewById(R.id.points13);
		grade13 = (EditText) findViewById(R.id.grade13);
		subject14 = (Button) findViewById(R.id.subject14);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		ch_sub14 = (EditText) findViewById(R.id.ch_sub14);
		linear71 = (LinearLayout) findViewById(R.id.linear71);
		no14 = (EditText) findViewById(R.id.no14);
		linear81 = (LinearLayout) findViewById(R.id.linear81);
		points14 = (EditText) findViewById(R.id.points14);
		grade14 = (EditText) findViewById(R.id.grade14);
		subject15 = (Button) findViewById(R.id.subject15);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		ch_sub15 = (EditText) findViewById(R.id.ch_sub15);
		linear72 = (LinearLayout) findViewById(R.id.linear72);
		no15 = (EditText) findViewById(R.id.no15);
		linear82 = (LinearLayout) findViewById(R.id.linear82);
		points15 = (EditText) findViewById(R.id.points15);
		grade15 = (EditText) findViewById(R.id.grade15);
		subject16 = (Button) findViewById(R.id.subject16);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		ch_sub16 = (EditText) findViewById(R.id.ch_sub16);
		linear73 = (LinearLayout) findViewById(R.id.linear73);
		no16 = (EditText) findViewById(R.id.no16);
		linear83 = (LinearLayout) findViewById(R.id.linear83);
		points16 = (EditText) findViewById(R.id.points16);
		grade16 = (EditText) findViewById(R.id.grade16);
		textview11 = (TextView) findViewById(R.id.textview11);
		gpa = (TextView) findViewById(R.id.gpa);
		reset = (Button) findViewById(R.id.reset);
		textview13 = (TextView) findViewById(R.id.textview13);
		calculate = (Button) findViewById(R.id.calculate);
		textview14 = (TextView) findViewById(R.id.textview14);
		share_result = (Button) findViewById(R.id.share_result);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_linear3 = (LinearLayout) _nav_view.findViewById(R.id.linear3);
		_drawer_linear2 = (LinearLayout) _nav_view.findViewById(R.id.linear2);
		_drawer_imageview1 = (ImageView) _nav_view.findViewById(R.id.imageview1);
		_drawer_move1 = (LinearLayout) _nav_view.findViewById(R.id.move1);
		_drawer_linear6 = (LinearLayout) _nav_view.findViewById(R.id.linear6);
		_drawer_move3 = (LinearLayout) _nav_view.findViewById(R.id.move3);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_check_lin = (LinearLayout) _nav_view.findViewById(R.id.check_lin);
		_drawer_linear10 = (LinearLayout) _nav_view.findViewById(R.id.linear10);
		_drawer_move2 = (LinearLayout) _nav_view.findViewById(R.id.move2);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_logout_linear = (LinearLayout) _nav_view.findViewById(R.id.logout_linear);
		_drawer_linear12 = (LinearLayout) _nav_view.findViewById(R.id.linear12);
		_drawer_imageview2 = (ImageView) _nav_view.findViewById(R.id.imageview2);
		_drawer_shre_text = (TextView) _nav_view.findViewById(R.id.shre_text);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_settings_text = (TextView) _nav_view.findViewById(R.id.settings_text);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_check_text = (TextView) _nav_view.findViewById(R.id.check_text);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_about_text = (TextView) _nav_view.findViewById(R.id.about_text);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		dilog1 = new AlertDialog.Builder(this);
		dilog2 = new AlertDialog.Builder(this);
		file = getSharedPreferences("store", Activity.MODE_PRIVATE);
		dilog3 = new AlertDialog.Builder(this);
		file2 = getSharedPreferences("store", Activity.MODE_PRIVATE);
		info = new AlertDialog.Builder(this);
		dialog = new AlertDialog.Builder(this);
		File = getSharedPreferences("file", Activity.MODE_PRIVATE);
		dilo3 = new AlertDialog.Builder(this);
		vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		vibration = getSharedPreferences("value", Activity.MODE_PRIVATE);
		exit = new AlertDialog.Builder(this);
		gpa_file = getSharedPreferences("gpa", Activity.MODE_PRIVATE);
		share = getSharedPreferences("activity", Activity.MODE_PRIVATE);
		back = getSharedPreferences("stop", Activity.MODE_PRIVATE);
		help = new AlertDialog.Builder(this);
		grade = getSharedPreferences("grade1", Activity.MODE_PRIVATE);
		grade_2 = getSharedPreferences("grade2", Activity.MODE_PRIVATE);
		grade_3 = getSharedPreferences("grade3", Activity.MODE_PRIVATE);
		grade_4 = getSharedPreferences("grade4", Activity.MODE_PRIVATE);
		grade_5 = getSharedPreferences("grade5", Activity.MODE_PRIVATE);
		grade_6 = getSharedPreferences("grade6", Activity.MODE_PRIVATE);
		login = FirebaseAuth.getInstance();
		share1 = getSharedPreferences("share1", Activity.MODE_PRIVATE);
		
		submitdata.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_check_colors();
				submitdata.setAlpha((float)(Double.parseDouble(".2")));
				calculate.setRotation((float)(rotate));
				_rotation();
				share_result.setVisibility(View.INVISIBLE);
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								submitdata.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(t, (int)(150));
				gpa_file.edit().putString("gpa", "1").commit();
				if (file.getString("subject", "").equals("1") && !(ch_sub1.getText().toString().equals("") || no1.getText().toString().equals(""))) {
					points1.setVisibility(View.VISIBLE);
					points2.setVisibility(View.VISIBLE);
					points3.setVisibility(View.GONE);
					points4.setVisibility(View.GONE);
					points5.setVisibility(View.GONE);
					points6.setVisibility(View.GONE);
					_check_colors();
					_check_all();
					_disabla_input();
					_check_ch1();
				}
				else {
					if (ch_sub1.getText().toString().equals("") || no1.getText().toString().equals("")) {
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
					}
					if (file.getString("subject", "").equals("2") && !(ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || (no1.getText().toString().equals("") || no2.getText().toString().equals(""))))) {
						points1.setVisibility(View.VISIBLE);
						points2.setVisibility(View.VISIBLE);
						points3.setVisibility(View.GONE);
						points4.setVisibility(View.GONE);
						points5.setVisibility(View.GONE);
						points6.setVisibility(View.GONE);
						_check_colors();
						_check_all();
						_disabla_input();
						_check_ch1();
						_check_ch2();
					}
					else {
						if (ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || (no1.getText().toString().equals("") || no2.getText().toString().equals("")))) {
							submitdata.setVisibility(View.VISIBLE);
							allign_reset_calcula.setVisibility(View.GONE);
							MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
						}
						if (file.getString("subject", "").equals("3") && !(ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || (ch_sub3.getText().toString().equals("") || (no1.getText().toString().equals("") || (no2.getText().toString().equals("") || no3.getText().toString().equals(""))))))) {
							points1.setVisibility(View.VISIBLE);
							points2.setVisibility(View.VISIBLE);
							points3.setVisibility(View.VISIBLE);
							points4.setVisibility(View.GONE);
							points5.setVisibility(View.GONE);
							points6.setVisibility(View.GONE);
							_check_colors();
							_check_all();
							_disabla_input();
							_check_ch1();
							_check_ch2();
							_check_ch3();
						}
						else {
							if (ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || (ch_sub3.getText().toString().equals("") || (no1.getText().toString().equals("") || (no2.getText().toString().equals("") || no3.getText().toString().equals("")))))) {
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
							}
							if (file.getString("subject", "").equals("4") && !(ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || ch_sub4.getText().toString().equals("")) || (no1.getText().toString().equals("") || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || no4.getText().toString().equals("")))))))) {
								points1.setVisibility(View.VISIBLE);
								points2.setVisibility(View.VISIBLE);
								points3.setVisibility(View.VISIBLE);
								points4.setVisibility(View.VISIBLE);
								points5.setVisibility(View.GONE);
								points6.setVisibility(View.GONE);
								_check_colors();
								_check_all();
								_disabla_input();
								_check_ch1();
								_check_ch2();
								_check_ch3();
								_check_ch4();
							}
							else {
								if (ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || ch_sub4.getText().toString().equals("")) || (no1.getText().toString().equals("") || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || no4.getText().toString().equals(""))))))) {
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
								}
								if (file.getString("subject", "").equals("5") && !(ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || (ch_sub4.getText().toString().equals("") || ch_sub5.getText().toString().equals(""))) || (no1.getText().toString().equals("") || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || (no4.getText().toString().equals("") || no5.getText().toString().equals("")))))))) {
									points1.setVisibility(View.VISIBLE);
									points2.setVisibility(View.VISIBLE);
									points3.setVisibility(View.VISIBLE);
									points4.setVisibility(View.VISIBLE);
									points5.setVisibility(View.VISIBLE);
									points6.setVisibility(View.GONE);
									_check_colors();
									_check_all();
									_disabla_input();
									_check_ch1();
									_check_ch2();
									_check_ch3();
									_check_ch4();
									_check_ch5();
								}
								else {
									if (ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || ch_sub4.getText().toString().equals("")) || ((ch_sub5.getText().toString().equals("") || no1.getText().toString().equals("")) || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || (no4.getText().toString().equals("") || no5.getText().toString().equals("")))))))) {
										submitdata.setVisibility(View.VISIBLE);
										allign_reset_calcula.setVisibility(View.GONE);
										MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
									}
									if (file.getString("subject", "").equals("6") && !(ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || (ch_sub4.getText().toString().equals("") || (ch_sub5.getText().toString().equals("") || ch_sub6.getText().toString().equals("")))) || (no1.getText().toString().equals("") || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || (no4.getText().toString().equals("") || (no5.getText().toString().equals("") || no6.getText().toString().equals(""))))))))) {
										points1.setVisibility(View.VISIBLE);
										points2.setVisibility(View.VISIBLE);
										points3.setVisibility(View.VISIBLE);
										points4.setVisibility(View.VISIBLE);
										points5.setVisibility(View.VISIBLE);
										points6.setVisibility(View.VISIBLE);
										grade5.setVisibility(View.VISIBLE);
										grade6.setVisibility(View.VISIBLE);
										_check_colors();
										_check_all();
										_disabla_input();
										_check_ch1();
										_check_ch2();
										_check_ch3();
										_check_ch4();
										_check_ch5();
										_check_ch6();
									}
									else {
										if (ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || ch_sub4.getText().toString().equals("")) || (((ch_sub5.getText().toString().equals("") || ch_sub6.getText().toString().equals("")) || no1.getText().toString().equals("")) || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || (no4.getText().toString().equals("") || (no5.getText().toString().equals("") || no6.getText().toString().equals(""))))))))) {
											submitdata.setVisibility(View.VISIBLE);
											allign_reset_calcula.setVisibility(View.GONE);
											MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
										}
										if (spinner1.getSelectedItemPosition() == 2) {
											if (ch_sub1.getText().toString().equals("") || (ch_sub2.getText().toString().equals("") || ((ch_sub3.getText().toString().equals("") || ch_sub4.getText().toString().equals("")) || (((ch_sub5.getText().toString().equals("") || ch_sub6.getText().toString().equals("")) || no1.getText().toString().equals("")) || (no2.getText().toString().equals("") || (no3.getText().toString().equals("") || (no4.getText().toString().equals("") || (no5.getText().toString().equals("") || no6.getText().toString().equals(""))))))))) {
												submitdata.setVisibility(View.VISIBLE);
												allign_reset_calcula.setVisibility(View.GONE);
												MyUtil.showMessage(getApplicationContext(), "Fill all subjects data");
											}
										}
									}
								}
							}
						}
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
				blink.setTarget(calculate);
				blink.setPropertyName("alpha");
				blink.setFloatValues((float)(0), (float)(1));
				blink.setRepeatMode(ValueAnimator.REVERSE);
				blink.setDuration((int)(1000));
				blink.setRepeatCount((int)(500));
				blink.start();
				_numbers();
			}
		});
		
		spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
			@Override
			public void onItemSelected(AdapterView<?> _param1, View _param2, int _param3, long _param4) {
				final int _position = _param3;
				_Enter_Subject_Number();
				_check_colors();
				if (_position == 0) {
					file.edit().putString("subject", share.getString("subject", "")).commit();
					if (vibration.getString("click", "").equals("1")) {
						vib.vibrate((long)(0));
					}
					else {
						if (vibration.getString("click", "").equals("2")) {
							vib.vibrate((long)(100));
						}
					}
					_Reset();
					ch_sub1.setText("");
					ch_sub2.setText("");
					ch_sub3.setText("");
					ch_sub4.setText("");
					ch_sub5.setText("");
					ch_sub6.setText("");
					no1.setText("");
					no2.setText("");
					no3.setText("");
					no4.setText("");
					no5.setText("");
					no6.setText("");
					subject1.setBackgroundResource(R.drawable.sub1);
					subject3.setBackgroundResource(R.drawable.sub3);
					subject2.setBackgroundResource(R.drawable.sub2);
					subject4.setBackgroundResource(R.drawable.sub4);
					subject5.setBackgroundResource(R.drawable.sub5);
					subject6.setBackgroundResource(R.drawable.sub6);
					((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
					_Enter_Subject_Number();
					_check_colors();
					_enable_input();
					_check_all();
					_mode();
					grade1.setTextColor(0xFF2196F3);
					grade2.setTextColor(0xFF2196F3);
					grade3.setTextColor(0xFF2196F3);
					grade4.setTextColor(0xFF2196F3);
					grade5.setTextColor(0xFF2196F3);
					grade6.setTextColor(0xFF2196F3);
					points1.setTextColor(0xFF2196F3);
					points2.setTextColor(0xFF2196F3);
					points3.setTextColor(0xFF2196F3);
					points4.setTextColor(0xFF2196F3);
					points5.setTextColor(0xFF2196F3);
					points6.setTextColor(0xFF2196F3);
				}
				if (_position == 1) {
					if (vibration.getString("click", "").equals("1")) {
						vib.vibrate((long)(0));
					}
					else {
						if (vibration.getString("click", "").equals("2")) {
							vib.vibrate((long)(100));
						}
					}
					file.edit().putString("subject", "").commit();
					subject1.setBackgroundResource(R.drawable.sub1);
					subject3.setBackgroundResource(R.drawable.sub3);
					subject2.setBackgroundResource(R.drawable.sub2);
					subject4.setBackgroundResource(R.drawable.sub4);
					subject5.setBackgroundResource(R.drawable.sub5);
					subject6.setBackgroundResource(R.drawable.sub6);
					points1.setVisibility(View.VISIBLE);
					points2.setVisibility(View.VISIBLE);
					points3.setVisibility(View.VISIBLE);
					points4.setVisibility(View.VISIBLE);
					points5.setVisibility(View.VISIBLE);
					points6.setVisibility(View.VISIBLE);
					((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
					_enable_input();
					i4.setClass(getApplicationContext(), WelcomeActivity.class);
					startActivity(i4);
					finish();
				}
				if (_position == 2) {
					file.edit().putString("subject", "6").commit();
					if (vibration.getString("click", "").equals("1")) {
						vib.vibrate((long)(0));
					}
					else {
						if (vibration.getString("click", "").equals("2")) {
							vib.vibrate((long)(100));
						}
					}
					no1.setEnabled(true);
					no2.setEnabled(true);
					no3.setEnabled(true);
					no4.setEnabled(true);
					no5.setEnabled(true);
					no6.setEnabled(true);
					ch_sub1.setEnabled(false);
					ch_sub2.setEnabled(false);
					ch_sub3.setEnabled(false);
					ch_sub4.setEnabled(false);
					ch_sub5.setEnabled(false);
					ch_sub6.setEnabled(false);
					subject1.setBackgroundResource(R.drawable.se402);
					subject2.setBackgroundResource(R.drawable.cs402);
					subject3.setBackgroundResource(R.drawable.stat402);
					subject4.setBackgroundResource(R.drawable.cs408);
					subject5.setBackgroundResource(R.drawable.math402);
					subject6.setBackgroundResource(R.drawable.ssh302);
					((ArrayAdapter)spinner1.getAdapter()).notifyDataSetChanged();
					ch_sub1.setText("3");
					ch_sub2.setText("3");
					ch_sub3.setText("3");
					ch_sub4.setText("3");
					ch_sub5.setText("3");
					ch_sub6.setText("2");
					linear_al_expt_welcm.setVisibility(View.VISIBLE);
					allign_gpa_message.setVisibility(View.GONE);
					no1.setText("");
					no2.setText("");
					no3.setText("");
					no4.setText("");
					no5.setText("");
					no6.setText("");
					grade1.setText("null");
					grade2.setText("null");
					grade3.setText("null");
					grade4.setText("null");
					grade5.setText("null");
					grade6.setText("null");
					points1.setText("0");
					points2.setText("0");
					points3.setText("0");
					points4.setText("0");
					points5.setText("0");
					points6.setText("0");
					_visible_all();
					if (gpa_file.getString("gpa", "").equals("0")) {
						MyUtil.showMessage(getApplicationContext(), "Reset data first");
					}
					_mode();
					_check_all();
					_check_colors();
					_Enter_Subject_Number();
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
			
			@Override
			public void onNothingSelected(AdapterView<?> _param1) {
				
			}
		});
		
		ch_sub1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub1.getText().toString().equals("")) {
					if (ch_sub1.getText().toString().contains("0") || (ch_sub1.getText().toString().contains("1") || (ch_sub1.getText().toString().contains("2") || (ch_sub1.getText().toString().contains("3") || (ch_sub1.getText().toString().contains("4") || (ch_sub1.getText().toString().contains("5") || (ch_sub1.getText().toString().contains("6") || (ch_sub1.getText().toString().contains("7") || (ch_sub1.getText().toString().contains("8") || ch_sub1.getText().toString().contains("9")))))))))) {
						if (ch_sub1.getText().toString().length() > 1) {
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
							ch_sub1.setText("");
						}
						else {
							if ((!ch_sub1.getText().toString().equals("") && (Double.parseDouble(ch_sub1.getText().toString()) < 1)) && (Double.parseDouble(ch_sub1.getText().toString()) > 4)) {
								MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
								ch_sub1.setText("");
							}
						}
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "invalid input !");
						ch_sub1.setText("");
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
		
		no1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (no1.getText().toString().length() > 2) {
					MyUtil.showMessage(getApplicationContext(), "invalid! Enter 2-digit data only");
					no1.setText("");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		points1.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_check_colors();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub2.getText().toString().equals("")) {
					if (ch_sub2.getText().toString().contains("0") || (ch_sub2.getText().toString().contains("1") || (ch_sub2.getText().toString().contains("2") || (ch_sub2.getText().toString().contains("3") || (ch_sub2.getText().toString().contains("4") || (ch_sub2.getText().toString().contains("5") || (ch_sub2.getText().toString().contains("6") || (ch_sub2.getText().toString().contains("7") || (ch_sub2.getText().toString().contains("8") || ch_sub2.getText().toString().contains("9")))))))))) {
						if (ch_sub2.getText().toString().length() > 1) {
							ch_sub2.setText("");
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
						}
						else {
							if ((!ch_sub2.getText().toString().equals("") && (Double.parseDouble(ch_sub2.getText().toString()) < 1)) && (Double.parseDouble(ch_sub2.getText().toString()) > 4)) {
								MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
								ch_sub2.setText("");
							}
						}
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "invalid input !");
						ch_sub2.setText("");
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
		
		no2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (no2.getText().toString().length() > 2) {
					no2.setText("");
					MyUtil.showMessage(getApplicationContext(), "invalid! Enter 2-digit data only");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		points2.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_check_colors();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub3.getText().toString().equals("")) {
					if (ch_sub3.getText().toString().contains("0") || (ch_sub3.getText().toString().contains("1") || (ch_sub3.getText().toString().contains("2") || (ch_sub3.getText().toString().contains("3") || (ch_sub3.getText().toString().contains("4") || (ch_sub3.getText().toString().contains("5") || (ch_sub3.getText().toString().contains("6") || (ch_sub3.getText().toString().contains("7") || (ch_sub3.getText().toString().contains("8") || ch_sub3.getText().toString().contains("9")))))))))) {
						if (ch_sub3.getText().toString().length() > 1) {
							ch_sub3.setText("");
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
						}
						else {
							if ((!ch_sub3.getText().toString().equals("") && (Double.parseDouble(ch_sub3.getText().toString()) < 1)) && (Double.parseDouble(subject3.getText().toString()) > 4)) {
								MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
								ch_sub3.setText("");
							}
						}
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "invalid input !");
						ch_sub3.setText("");
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
		
		no3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (no3.getText().toString().length() > 2) {
					no3.setText("");
					MyUtil.showMessage(getApplicationContext(), "invalid! Enter 2-digit data only");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		points3.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_check_colors();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub4.getText().toString().equals("")) {
					if (ch_sub4.getText().toString().contains("0") || (ch_sub4.getText().toString().contains("1") || (ch_sub4.getText().toString().contains("2") || (ch_sub4.getText().toString().contains("3") || (ch_sub4.getText().toString().contains("4") || (ch_sub4.getText().toString().contains("5") || (ch_sub4.getText().toString().contains("6") || (ch_sub4.getText().toString().contains("7") || (ch_sub4.getText().toString().contains("8") || ch_sub4.getText().toString().contains("9")))))))))) {
						if (ch_sub4.getText().toString().length() > 1) {
							ch_sub4.setText("");
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
						}
						else {
							if ((!ch_sub4.getText().toString().equals("") && (Double.parseDouble(ch_sub4.getText().toString()) < 1)) && (Double.parseDouble(ch_sub4.getText().toString()) > 4)) {
								MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
								ch_sub4.setText("");
							}
						}
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "invalid input !");
						ch_sub4.setText("");
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
		
		no4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (no4.getText().toString().length() > 2) {
					no4.setText("");
					MyUtil.showMessage(getApplicationContext(), "invalid! Enter 2-digit data only");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		points4.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_check_colors();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub5.getText().toString().equals("")) {
					if (ch_sub5.getText().toString().contains("0") || (ch_sub5.getText().toString().contains("1") || (ch_sub5.getText().toString().contains("2") || (ch_sub5.getText().toString().contains("3") || (ch_sub5.getText().toString().contains("4") || (ch_sub5.getText().toString().contains("5") || (ch_sub5.getText().toString().contains("6") || (ch_sub5.getText().toString().contains("7") || (ch_sub5.getText().toString().contains("8") || ch_sub5.getText().toString().contains("9")))))))))) {
						if (ch_sub5.getText().toString().length() > 1) {
							ch_sub5.setText("");
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
						}
						else {
							if ((!ch_sub5.getText().toString().equals("") && (Double.parseDouble(ch_sub5.getText().toString()) < 1)) && (Double.parseDouble(ch_sub5.getText().toString()) > 4)) {
								MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
								ch_sub5.setText("");
							}
						}
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "invalid input !");
						ch_sub5.setText("");
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
		
		no5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (no5.getText().toString().length() > 2) {
					no5.setText("");
					MyUtil.showMessage(getApplicationContext(), "invalid! Enter 2-digit data only");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		points5.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_check_colors();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub6.getText().toString().equals("")) {
					if (ch_sub6.getText().toString().contains("0") || (ch_sub6.getText().toString().contains("1") || (ch_sub6.getText().toString().contains("2") || (ch_sub6.getText().toString().contains("3") || (ch_sub6.getText().toString().contains("4") || (ch_sub6.getText().toString().contains("5") || (ch_sub6.getText().toString().contains("6") || (ch_sub6.getText().toString().contains("7") || (ch_sub6.getText().toString().contains("8") || ch_sub6.getText().toString().contains("9")))))))))) {
						if (ch_sub6.getText().toString().length() > 1) {
							ch_sub6.setText("");
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
						}
						else {
							if ((!ch_sub6.getText().toString().equals("") && (Double.parseDouble(ch_sub6.getText().toString()) < 1)) && (Double.parseDouble(ch_sub6.getText().toString()) > 4)) {
								ch_sub6.setText("");
								MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
							}
						}
					}
					else {
						MyUtil.showMessage(getApplicationContext(), "invalid input !");
						ch_sub6.setText("");
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
		
		no6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (no6.getText().toString().length() > 2) {
					no6.setText("");
					MyUtil.showMessage(getApplicationContext(), "invalid! Enter 2-digit data only");
				}
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		points6.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				_check_colors();
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub7.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				if (!ch_sub7.getText().toString().equals("")) {
					if ((ch_sub7.getText().toString().length() > 1) || ((Double.parseDouble(_charSeq) < 1) || (Double.parseDouble(_charSeq) > 5))) {
						if ((Double.parseDouble(ch_sub7.getText().toString()) < 1) || (Double.parseDouble(ch_sub7.getText().toString()) > 5)) {
							MyUtil.showMessage(getApplicationContext(), "Valid Credit Hours 1~5");
						}
						else {
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data only");
						}
						ch_sub7.setText("");
					}
					else {
						if ((!ch_sub7.getText().toString().equals("") && (Double.parseDouble(ch_sub7.getText().toString()) < 1)) && (Double.parseDouble(ch_sub7.getText().toString()) > 5)) {
							MyUtil.showMessage(getApplicationContext(), "invalid! Enter 1-digit data onlyhbsbs");
							ch_sub7.setText("");
						}
						else {
							
						}
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
		
		ch_sub8.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub9.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub10.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub11.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub12.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub13.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub14.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub15.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		ch_sub16.addTextChangedListener(new TextWatcher() {
			@Override
			public void onTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				final String _charSeq = _param1.toString();
				
			}
			
			@Override
			public void beforeTextChanged(CharSequence _param1, int _param2, int _param3, int _param4) {
				
			}
			
			@Override
			public void afterTextChanged(Editable _param1) {
				
			}
		});
		
		reset.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_mode();
				reset.setAlpha((float)(Double.parseDouble(".2")));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								reset.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(t, (int)(150));
				gpa_file.edit().putString("gpa", "1").commit();
				file.edit().putString("reset", "0").commit();
				back.edit().putString("reset", "0").commit();
				_check_colors();
				_Reset();
				_enable_input();
				if (vibration.getString("click", "").equals("1")) {
					vib.vibrate((long)(0));
				}
				else {
					if (vibration.getString("click", "").equals("2")) {
						vib.vibrate((long)(100));
					}
				}
				grade1.setTextColor(0xFF2196F3);
				grade2.setTextColor(0xFF2196F3);
				grade3.setTextColor(0xFF2196F3);
				grade4.setTextColor(0xFF2196F3);
				grade5.setTextColor(0xFF2196F3);
				grade6.setTextColor(0xFF2196F3);
				points1.setTextColor(0xFF2196F3);
				points2.setTextColor(0xFF2196F3);
				points3.setTextColor(0xFF2196F3);
				points4.setTextColor(0xFF2196F3);
				points5.setTextColor(0xFF2196F3);
				points6.setTextColor(0xFF2196F3);
			}
		});
		
		calculate.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				share_result.setVisibility(View.VISIBLE);
				allign_gpa_message.setVisibility(View.VISIBLE);
				calculate.setAlpha((float)(Double.parseDouble(".2")));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								calculate.setAlpha((float)(Double.parseDouble("1")));
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
				if (gpa_file.getString("gpa", "").equals("0")) {
					_disabla_input();
					blink2.setTarget(reset);
					blink2.setPropertyName("alpha");
					blink2.setFloatValues((float)(0), (float)(1));
					blink2.setRepeatMode(ValueAnimator.REVERSE);
					blink2.setDuration((int)(1000));
					blink2.setRepeatCount((int)(500));
					blink2.start();
					MyUtil.showMessage(getApplicationContext(), "Reset data first");
				}
				if (gpa_file.getString("gpa", "").equals("1")) {
					if (file.getString("subject", "").equals("6")) {
						if (!(points2.getText().toString().equals("") && (points3.getText().toString().equals("") && (points4.getText().toString().equals("") && (points5.getText().toString().equals("") && (points1.getText().toString().equals("") && points6.getText().toString().equals(""))))))) {
							_calculate_subject6();
						}
						else {
							if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || (points4.getText().toString().equals("") || (points5.getText().toString().equals("") || (points1.getText().toString().equals("") || points6.getText().toString().equals("")))))) {
								MyUtil.showMessage(getApplicationContext(), "Enter valid data");
							}
						}
					}
					else {
						if (file.getString("subject", "").equals("5")) {
							if (!(points2.getText().toString().equals("") && (points3.getText().toString().equals("") && (points4.getText().toString().equals("") && (points5.getText().toString().equals("") && points1.getText().toString().equals("")))))) {
								_calculate_subject5();
							}
							else {
								if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || (points4.getText().toString().equals("") || (points5.getText().toString().equals("") || points1.getText().toString().equals(""))))) {
									MyUtil.showMessage(getApplicationContext(), "Enter valid data");
								}
							}
						}
						else {
							if (file.getString("subject", "").equals("4")) {
								if (!(points2.getText().toString().equals("") && (points3.getText().toString().equals("") && (points4.getText().toString().equals("") && points1.getText().toString().equals(""))))) {
									_calculate_subject4();
								}
								else {
									if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || (points4.getText().toString().equals("") || points1.getText().toString().equals("")))) {
										MyUtil.showMessage(getApplicationContext(), "Enter valid data");
									}
								}
							}
							else {
								if (file.getString("subject", "").equals("3")) {
									if (!(points2.getText().toString().equals("") && (points3.getText().toString().equals("") && points1.getText().toString().equals("")))) {
										_calculate_subject3();
									}
									else {
										if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || points1.getText().toString().equals(""))) {
											MyUtil.showMessage(getApplicationContext(), "Enter valid data");
										}
									}
								}
								else {
									if (file.getString("subject", "").equals("2")) {
										if (!(points2.getText().toString().equals("") && points1.getText().toString().equals(""))) {
											_calculate_subject2();
										}
										else {
											if (points2.getText().toString().equals("") || points1.getText().toString().equals("")) {
												MyUtil.showMessage(getApplicationContext(), "Enter valid data");
											}
										}
									}
									else {
										if (file.getString("subject", "").equals("1")) {
											if (!points1.getText().toString().equals("")) {
												_calculate_subject1();
											}
											else {
												if (points1.getText().toString().equals("")) {
													MyUtil.showMessage(getApplicationContext(), "Enter valid data");
												}
											}
										}
										else {
											
										}
									}
								}
							}
						}
					}
				}
				dilog3.setTitle("Congratulation!");
				dilog3.setMessage("  Your GPA is ".concat(gpa.getText().toString()));
				dilog3.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						
					}
				});
				dilog3.create().show();
				gpa_file.edit().putString("gpa", "0").commit();
				blink.cancel();
			}
		});
		
		share_result.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				MyUtil.showMessage(getApplicationContext(), "Sharing result");
				share_result.setAlpha((float)(Double.parseDouble(".2")));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								share_result.setAlpha((float)(Double.parseDouble("1")));
							}
						});
					}
				};
				_timer.schedule(t, (int)(150));
				a = "Hey! My GPA is ".concat(gpa.getText().toString());
				Intent i = new Intent(android.content.Intent.ACTION_SEND); i.setType("text/plain");  i.putExtra(android.content.Intent.EXTRA_TEXT, a); startActivity(Intent.createChooser(i,"Share using"));
			}
		});
		
		_Version_child_listener = new ChildEventListener() {
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
		
		_drawer_check_lin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final ProgressDialog prog = new ProgressDialog(Main2Activity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Checking for update");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
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
		
		_drawer_logout_linear.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				FirebaseAuth.getInstance().signOut();
				i4.setClass(getApplicationContext(), MainActivity.class);
				startActivity(i4);
				share1.edit().putString("email", "").commit();
				finish();
			}
		});
		
		_drawer_shre_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_move1();
			}
		});
		
		_drawer_settings_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				_ch3();
			}
		});
		
		_drawer_check_text.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				final ProgressDialog prog = new ProgressDialog(Main2Activity.this);prog.setMax(100);prog.setTitle("Please wait");prog.setMessage("Checking for update");prog.setIndeterminate(true);prog.setCancelable(false);prog.show();
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
				_ch2();
			}
		});
		
		_login_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_login_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
	}
	private void initializeLogic() {
		_toolbar.setTitle("GPA Calculator");
		
		_mode();
		_all_view_setting();
		textview15.setVisibility(View.INVISIBLE);
		android.graphics.drawable.GradientDrawable gd1 = new android.graphics.drawable.GradientDrawable(); 
		gd1.setColor(Color.parseColor("#B0BEC5")); /* color */
		gd1.setCornerRadius(50); /* radius */
		gd1.setStroke(2, Color.parseColor("#B0BEC5")); /* stroke heigth and color */
		linear_subject_all.setBackground(gd1); //TODO: replace view with your
		if (share.getString("mode", "").equals("")) {
			share.edit().putString("mode", "0").commit();
		}
		if (share.getString("close", "").equals("1")) {
			finish();
		}
		share.edit().putString("pop", "1").commit();
		if (file.getString("subject", "").equals("")) {
			i4.setClass(getApplicationContext(), WelcomeActivity.class);
			startActivity(i4);
		}
		else {
			if (file.getString("subject", "").equals("4") || (file.getString("subject", "").equals("5") || file.getString("subject", "").equals("6"))) {
				_Enter_Subject_Number();
				share.edit().putString("main", "1").commit();
			}
		}
		list.add("No degree selected");
		list.add("Select subjects");
		list.add("BS (Software Engineering)");
		spinner1.setAdapter(new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_dropdown_item, list));
		allign_reset_calcula.setVisibility(View.GONE);
		share_result.setVisibility(View.GONE);
		help.setTitle("Valid data input");
		help.setMessage("■Credit Hours 1~4\n□Credit Hour 1: Numbers 8~20\n□Credit Hour 2: Numbers 16~40\n□Credit Hour 3: Numbers 24~60\n□Credit Hour 4: Numbers 32~80\n■Wrong input will lead to wrong result");
		help.setPositiveButton("ok", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		help.setNegativeButton("contact us", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				whatsappgroup.setAction(Intent.ACTION_VIEW);
				whatsappgroup.setData(Uri.parse("https://chat.whatsapp.com/7mWDfkHrDab24WYtMUqCZt"));
				startActivity(whatsappgroup);
			}
		});
		help.create().show();
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						textview15.setText("");
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(time, (int)(1000), (int)(1500));
		sub7_row.setVisibility(View.GONE);
		sub8_row.setVisibility(View.GONE);
		sub9_row.setVisibility(View.GONE);
		sub10_row.setVisibility(View.GONE);
		sub11_row.setVisibility(View.GONE);
		sub12_row.setVisibility(View.GONE);
		sub13_row.setVisibility(View.GONE);
		sub14_row.setVisibility(View.GONE);
		sub15_row.setVisibility(View.GONE);
		sub16_row.setVisibility(View.GONE);
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
				share.edit().putString("pop", "").commit();
				finishAffinity ();
			}
		});
		dilog1.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		dilog1.setNeutralButton("Home", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				i.setClass(getApplicationContext(), MainActivity.class);
				startActivity(i);
				finish();
			}
		});
		dilog1.create().show();
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
	}
	
	@Override
	public void onStop() {
		super.onStop();
		
	}
	
	@Override
	public void onResume() {
		super.onResume();
		_mode();
	}
	private void _ch1 () {
		if (ch_sub1.getText().toString().equals("") || no1.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 8)) {
				points1.setText("1");
				grade1.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 9)) {
					points1.setText("1.5");
					grade1.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 10)) {
						points1.setText("2");
						grade1.setText("C");
					}
					else {
						if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 11)) {
							points1.setText("2.33");
							grade1.setText("C");
						}
						else {
							if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 12)) {
								points1.setText("2.67");
								grade1.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 13)) {
									points1.setText("3");
									grade1.setText("B");
								}
								else {
									if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 14)) {
										points1.setText("3.33");
										grade1.setText("B");
									}
									else {
										if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 15)) {
											points1.setText("3.67");
											grade1.setText("B");
										}
										else {
											if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 16)) {
												points1.setText("4");
												grade1.setText("A");
											}
											else {
												if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 17)) {
													points1.setText("4");
													grade1.setText("A");
												}
												else {
													if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 18)) {
														points1.setText("4");
														grade1.setText("A");
													}
													else {
														if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 19)) {
															points1.setText("4");
															grade1.setText("A");
														}
														else {
															if ((Double.parseDouble(ch_sub1.getText().toString()) == 1) && (Double.parseDouble(no1.getText().toString()) == 20)) {
																points1.setText("4");
																grade1.setText("A");
															}
															else {
																_check_colors();
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _ch2 () {
		if (ch_sub1.getText().toString().equals("") || no1.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 16)) {
				points1.setText("2");
				grade1.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 17)) {
					points1.setText("2.5");
					grade1.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 18)) {
						points1.setText("3");
						grade1.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 19)) {
							points1.setText("3.5");
							grade1.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 20)) {
								points1.setText("4");
								grade1.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 21)) {
									points1.setText("4.33");
									grade1.setText("C");
								}
								else {
									if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 22)) {
										points1.setText("4.67");
										grade1.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 23)) {
											points1.setText("5");
											grade1.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 24)) {
												points1.setText("5.33");
												grade1.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 25)) {
													points1.setText("5.67");
													grade1.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 26)) {
														points1.setText("6");
														grade1.setText("B");
													}
													else {
														if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 27)) {
															points1.setText("6.33");
															grade1.setText("B");
														}
														else {
															if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 28)) {
																points1.setText("6.67");
																grade1.setText("B");
															}
															else {
																if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 29)) {
																	points1.setText("7");
																	grade1.setText("B");
																}
																else {
																	if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 30)) {
																		points1.setText("7.33");
																		grade1.setText("B");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 31)) {
																			points1.setText("7.67");
																			grade1.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 32)) {
																				points1.setText("8");
																				grade1.setText("A");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 33)) {
																					points1.setText("8");
																					grade1.setText("A");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 34)) {
																						points1.setText("8");
																						grade1.setText("A");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 35)) {
																							points1.setText("8");
																							grade1.setText("A");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 36)) {
																								points1.setText("8");
																								grade1.setText("A");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 37)) {
																									points1.setText("8");
																									grade1.setText("A");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 38)) {
																										points1.setText("8");
																										grade1.setText("A");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 39)) {
																											points1.setText("8");
																											grade1.setText("A");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub1.getText().toString()) == 2) && (Double.parseDouble(no1.getText().toString()) == 40)) {
																												points1.setText("8");
																												grade1.setText("A");
																											}
																											else {
																												_check_colors();
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		_check_colors();
	}
	
	
	private void _ch3 () {
		if (ch_sub1.getText().toString().equals("") || no1.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 24)) {
				points1.setText("3");
				grade1.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 25)) {
					points1.setText("3.5");
					grade1.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 26)) {
						points1.setText("4");
						grade1.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 27)) {
							points1.setText("4.5");
							grade1.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 28)) {
								points1.setText("5");
								grade1.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 29)) {
									points1.setText("5.5");
									grade1.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 30)) {
										points1.setText("6");
										grade1.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 31)) {
											points1.setText("6.33");
											grade1.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 32)) {
												points1.setText("6.67");
												grade1.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 33)) {
													points1.setText("7");
													grade1.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 34)) {
														points1.setText("7.33");
														grade1.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 35)) {
															points1.setText("7.67");
															grade1.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 36)) {
																points1.setText("8");
																grade1.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 37)) {
																	points1.setText("8.33");
																	grade1.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 38)) {
																		points1.setText("8.67");
																		grade1.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 39)) {
																			points1.setText("9");
																			grade1.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 40)) {
																				points1.setText("9.33");
																				grade1.setText("B");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 41)) {
																					points1.setText("9.67");
																					grade1.setText("B");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 42)) {
																						points1.setText("10");
																						grade1.setText("B");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 43)) {
																							points1.setText("10.33");
																							grade1.setText("B");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 44)) {
																								points1.setText("10.67");
																								grade1.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 45)) {
																									points1.setText("11");
																									grade1.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 46)) {
																										points1.setText("11.33");
																										grade1.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 47)) {
																											points1.setText("11.67");
																											grade1.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 48)) {
																												points1.setText("12");
																												grade1.setText("A");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 49)) {
																													points1.setText("12");
																													grade1.setText("A");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 50)) {
																														points1.setText("12");
																														grade1.setText("A");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 51)) {
																															points1.setText("12");
																															grade1.setText("A");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 52)) {
																																points1.setText("12");
																																grade1.setText("A");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 53)) {
																																	points1.setText("12");
																																	grade1.setText("A");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 54)) {
																																		points1.setText("12");
																																		grade1.setText("A");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 55)) {
																																			points1.setText("12");
																																			grade1.setText("A");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 56)) {
																																				points1.setText("12");
																																				grade1.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 57)) {
																																					points1.setText("12");
																																					grade1.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 58)) {
																																						points1.setText("12");
																																						grade1.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 59)) {
																																							points1.setText("12");
																																							grade1.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub1.getText().toString()) == 3) && (Double.parseDouble(no1.getText().toString()) == 60)) {
																																								points1.setText("12");
																																								grade1.setText("A");
																																							}
																																							else {
																																								_check_colors();
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _ch4 () {
		if (ch_sub1.getText().toString().equals("") || no1.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 32)) {
				points1.setText("4");
				grade1.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 33)) {
					points1.setText("4.5");
					grade1.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 34)) {
						points1.setText("5");
						grade1.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 35)) {
							points1.setText("5.5");
							grade1.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 36)) {
								points1.setText("6");
								grade1.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 37)) {
									points1.setText("6.5");
									grade1.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 38)) {
										points1.setText("7");
										grade1.setText("D");
									}
									else {
										if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 39)) {
											points1.setText("7.5");
											grade1.setText("D");
										}
										else {
											if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 40)) {
												points1.setText("8");
												grade1.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 41)) {
													points1.setText("8.33");
													grade1.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 42)) {
														points1.setText("8.67");
														grade1.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 43)) {
															points1.setText("9");
															grade1.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 44)) {
																points1.setText("9.33");
																grade1.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 45)) {
																	points1.setText("9.67");
																	grade1.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 46)) {
																		points1.setText("10");
																		grade1.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 47)) {
																			points1.setText("10.33");
																			grade1.setText("C");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 48)) {
																				points1.setText("10.67");
																				grade1.setText("C");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 49)) {
																					points1.setText("11");
																					grade1.setText("C");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 50)) {
																						points1.setText("11.33");
																						grade1.setText("C");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 51)) {
																							points1.setText("11.67");
																							grade1.setText("C");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 52)) {
																								points1.setText("12");
																								grade1.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 53)) {
																									points1.setText("12.33");
																									grade1.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 54)) {
																										points1.setText("12.67");
																										grade1.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 55)) {
																											points1.setText("13");
																											grade1.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 56)) {
																												points1.setText("13.33");
																												grade1.setText("B");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 57)) {
																													points1.setText("13.67");
																													grade1.setText("B");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 58)) {
																														points1.setText("14");
																														grade1.setText("B");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 59)) {
																															points1.setText("14.33");
																															grade1.setText("B");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 60)) {
																																points1.setText("14.67");
																																grade1.setText("B");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 61)) {
																																	points1.setText("15");
																																	grade1.setText("B");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 62)) {
																																		points1.setText("15.33");
																																		grade1.setText("B");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 63)) {
																																			points1.setText("15.67");
																																			grade1.setText("B");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 64)) {
																																				points1.setText("16");
																																				grade1.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 65)) {
																																					points1.setText("16");
																																					grade1.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 66)) {
																																						points1.setText("16");
																																						grade1.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 67)) {
																																							points1.setText("16");
																																							grade1.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 68)) {
																																								points1.setText("16");
																																								grade1.setText("A");
																																							}
																																							else {
																																								if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 69)) {
																																									points1.setText("16");
																																									grade1.setText("A");
																																								}
																																								else {
																																									if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 70)) {
																																										points1.setText("16");
																																										grade1.setText("A");
																																									}
																																									else {
																																										if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 71)) {
																																											points1.setText("16");
																																											grade1.setText("A");
																																										}
																																										else {
																																											if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 72)) {
																																												points1.setText("16");
																																												grade1.setText("A");
																																											}
																																											else {
																																												if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 73)) {
																																													points1.setText("16");
																																													grade1.setText("A");
																																												}
																																												else {
																																													if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 74)) {
																																														points1.setText("16");
																																														grade1.setText("A");
																																													}
																																													else {
																																														if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 75)) {
																																															points1.setText("16");
																																															grade1.setText("A");
																																														}
																																														else {
																																															if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 76)) {
																																																points1.setText("16");
																																																grade1.setText("A");
																																															}
																																															else {
																																																if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 77)) {
																																																	points1.setText("16");
																																																	grade1.setText("A");
																																																}
																																																else {
																																																	if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 78)) {
																																																		points1.setText("16");
																																																		grade1.setText("A");
																																																	}
																																																	else {
																																																		if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 79)) {
																																																			points1.setText("16");
																																																			grade1.setText("A");
																																																		}
																																																		else {
																																																			if ((Double.parseDouble(ch_sub1.getText().toString()) == 4) && (Double.parseDouble(no1.getText().toString()) == 80)) {
																																																				points1.setText("16");
																																																				grade1.setText("A");
																																																			}
																																																			else {
																																																				_check_colors();
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _ch5 () {
		
	}
	
	
	private void _check_General () {
		if ((Double.parseDouble(ch_sub1.getText().toString()) > 5) || ((Double.parseDouble(ch_sub1.getText().toString()) == 0) || (ch_sub1.getText().toString().equals("") || no1.getText().toString().equals("")))) {
			ch_sub1.setText("");
			dilog1.setTitle("Invalid data");
			dilog1.setMessage("Valid Credits data 1~5");
			dilog1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
				@Override
				public void onClick(DialogInterface _dialog, int _which) {
					
				}
			});
			dilog1.create().show();
		}
	}
	
	
	private void _check_ch1 () {
		if (ch_sub1.getText().toString().equals("1") && (!no1.getText().toString().equals("") && ((Double.parseDouble(no1.getText().toString()) > 7) && (Double.parseDouble(no1.getText().toString()) < 21)))) {
			if (!textview15.getText().toString().equals("error")) {
				submitdata.setVisibility(View.GONE);
				allign_reset_calcula.setVisibility(View.VISIBLE);
			}
		}
		else {
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			_enable_input();
			if (ch_sub1.getText().toString().equals("1")) {
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				MyUtil.showMessage(getApplicationContext(), "Subject 1: Credit Hour-1 valid data is 8~18");
				no1.setText("");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				textview15.setText("error");
			}
			else {
				if (ch_sub1.getText().toString().equals("2") && (!no1.getText().toString().equals("") && ((Double.parseDouble(no1.getText().toString()) > 15) && (Double.parseDouble(no1.getText().toString()) < 41)))) {
					submitdata.setVisibility(View.GONE);
					allign_reset_calcula.setVisibility(View.VISIBLE);
				}
				else {
					if (ch_sub1.getText().toString().equals("2")) {
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						MyUtil.showMessage(getApplicationContext(), "Subject 1: Credit Hour-2 valid data is 16~40");
						no1.setText("");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						textview15.setText("error");
					}
					else {
						if (ch_sub1.getText().toString().equals("3") && (!no1.getText().toString().equals("") && ((Double.parseDouble(no1.getText().toString()) > 23) && (Double.parseDouble(no1.getText().toString()) < 61)))) {
							submitdata.setVisibility(View.GONE);
							allign_reset_calcula.setVisibility(View.VISIBLE);
							submitdata.setVisibility(View.VISIBLE);
							allign_reset_calcula.setVisibility(View.GONE);
						}
						else {
							if (ch_sub1.getText().toString().equals("3")) {
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								MyUtil.showMessage(getApplicationContext(), "Subject 1: Credit Hour-3 valid data is 24~60");
								no1.setText("");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								textview15.setText("error");
							}
							else {
								if (ch_sub1.getText().toString().equals("4") && (!no1.getText().toString().equals("") && ((Double.parseDouble(no1.getText().toString()) > 31) && (Double.parseDouble(no1.getText().toString()) < 81)))) {
									submitdata.setVisibility(View.GONE);
									allign_reset_calcula.setVisibility(View.VISIBLE);
								}
								else {
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									MyUtil.showMessage(getApplicationContext(), "Subject 1: Credit Hour-4 valid data is 32~80");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									no1.setText("");
									textview15.setText("error");
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _check_ch2 () {
		if (ch_sub2.getText().toString().equals("1") && (!no2.getText().toString().equals("") && ((Double.parseDouble(no2.getText().toString()) > 7) && (Double.parseDouble(no2.getText().toString()) < 21)))) {
			if (!textview15.getText().toString().equals("error")) {
				submitdata.setVisibility(View.GONE);
				allign_reset_calcula.setVisibility(View.VISIBLE);
			}
		}
		else {
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			_enable_input();
			if (ch_sub2.getText().toString().equals("1")) {
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				no2.setText("");
				MyUtil.showMessage(getApplicationContext(), "Subject 2: Credit Hour-1 valid data is 8~18");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				textview15.setText("error");
			}
			else {
				if (ch_sub2.getText().toString().equals("2") && (!no2.getText().toString().equals("") && ((Double.parseDouble(no2.getText().toString()) > 15) && (Double.parseDouble(no2.getText().toString()) < 41)))) {
					submitdata.setVisibility(View.GONE);
					allign_reset_calcula.setVisibility(View.VISIBLE);
				}
				else {
					if (ch_sub2.getText().toString().equals("2")) {
						MyUtil.showMessage(getApplicationContext(), "Subject 2: Credit Hour-2 valid data is 16~40");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						no2.setText("");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						textview15.setText("error");
					}
					else {
						if (ch_sub2.getText().toString().equals("3") && (!no2.getText().toString().equals("") && ((Double.parseDouble(no2.getText().toString()) > 23) && (Double.parseDouble(no2.getText().toString()) < 61)))) {
							submitdata.setVisibility(View.GONE);
							allign_reset_calcula.setVisibility(View.VISIBLE);
						}
						else {
							if (ch_sub2.getText().toString().equals("3")) {
								MyUtil.showMessage(getApplicationContext(), "Subject 2: Credit Hour-3 valid data is 24~60");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								no2.setText("");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								textview15.setText("error");
							}
							else {
								if (ch_sub2.getText().toString().equals("4") && (!no2.getText().toString().equals("") && ((Double.parseDouble(no2.getText().toString()) > 31) && (Double.parseDouble(no2.getText().toString()) < 81)))) {
									submitdata.setVisibility(View.GONE);
									allign_reset_calcula.setVisibility(View.VISIBLE);
								}
								else {
									MyUtil.showMessage(getApplicationContext(), "Subject 2: Credit Hour-4 valid data is 32~80");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									no2.setText("");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									textview15.setText("error");
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _check_ch3 () {
		if (ch_sub3.getText().toString().equals("1") && (!no3.getText().toString().equals("") && ((Double.parseDouble(no3.getText().toString()) > 7) && (Double.parseDouble(no3.getText().toString()) < 21)))) {
			if (!textview15.getText().toString().equals("error")) {
				submitdata.setVisibility(View.GONE);
				allign_reset_calcula.setVisibility(View.VISIBLE);
			}
		}
		else {
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			_enable_input();
			if (ch_sub3.getText().toString().equals("1")) {
				MyUtil.showMessage(getApplicationContext(), "Subject 3: Credit Hour-1 valid data is 8~18");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				no3.setText("");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				textview15.setText("error");
			}
			else {
				if (ch_sub3.getText().toString().equals("2") && (!no3.getText().toString().equals("") && ((Double.parseDouble(no3.getText().toString()) > 15) && (Double.parseDouble(no3.getText().toString()) < 41)))) {
					submitdata.setVisibility(View.GONE);
					allign_reset_calcula.setVisibility(View.VISIBLE);
					submitdata.setVisibility(View.VISIBLE);
					allign_reset_calcula.setVisibility(View.GONE);
				}
				else {
					if (ch_sub3.getText().toString().equals("2")) {
						MyUtil.showMessage(getApplicationContext(), "Subject 3: Credit Hour-2 valid data is 16~40");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						no3.setText("");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						textview15.setText("error");
					}
					else {
						if (ch_sub3.getText().toString().equals("3") && (!no3.getText().toString().equals("") && ((Double.parseDouble(no3.getText().toString()) > 23) && (Double.parseDouble(no3.getText().toString()) < 61)))) {
							submitdata.setVisibility(View.GONE);
							allign_reset_calcula.setVisibility(View.VISIBLE);
						}
						else {
							if (ch_sub3.getText().toString().equals("3")) {
								MyUtil.showMessage(getApplicationContext(), "Subject 3: Credit Hour-3 valid data is 24~60");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								no3.setText("");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								textview15.setText("error");
							}
							else {
								if (ch_sub3.getText().toString().equals("4") && (!no3.getText().toString().equals("") && ((Double.parseDouble(no3.getText().toString()) > 31) && (Double.parseDouble(no3.getText().toString()) < 81)))) {
									submitdata.setVisibility(View.GONE);
									allign_reset_calcula.setVisibility(View.VISIBLE);
								}
								else {
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									MyUtil.showMessage(getApplicationContext(), "Subject 3: Credit Hour-4 valid data is 32~80");
									no3.setText("");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									textview15.setText("error");
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _check_ch4 () {
		if (ch_sub4.getText().toString().equals("1") && (!no4.getText().toString().equals("") && ((Double.parseDouble(no4.getText().toString()) > 7) && (Double.parseDouble(no4.getText().toString()) < 21)))) {
			if (!textview15.getText().toString().equals("error")) {
				submitdata.setVisibility(View.GONE);
				allign_reset_calcula.setVisibility(View.VISIBLE);
			}
		}
		else {
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			_enable_input();
			if (ch_sub4.getText().toString().equals("1")) {
				MyUtil.showMessage(getApplicationContext(), "Subject 4: Credit Hour-1 valid data is 8~18");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				no4.setText("");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				textview15.setText("error");
			}
			else {
				if (ch_sub4.getText().toString().equals("2") && (!no4.getText().toString().equals("") && ((Double.parseDouble(no4.getText().toString()) > 15) && (Double.parseDouble(no4.getText().toString()) < 41)))) {
					submitdata.setVisibility(View.GONE);
					allign_reset_calcula.setVisibility(View.VISIBLE);
				}
				else {
					if (ch_sub4.getText().toString().equals("2")) {
						MyUtil.showMessage(getApplicationContext(), "Subject 4: Credit Hour-2 valid data is 16~40");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						no4.setText("");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						textview15.setText("error");
					}
					else {
						if (ch_sub4.getText().toString().equals("3") && (!no4.getText().toString().equals("") && ((Double.parseDouble(no4.getText().toString()) > 23) && (Double.parseDouble(no4.getText().toString()) < 61)))) {
							submitdata.setVisibility(View.GONE);
							allign_reset_calcula.setVisibility(View.VISIBLE);
						}
						else {
							if (ch_sub4.getText().toString().equals("3")) {
								MyUtil.showMessage(getApplicationContext(), "Subject 4: Credit Hour-3 valid data is 24~60");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								no4.setText("");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								textview15.setText("error");
							}
							else {
								if (ch_sub4.getText().toString().equals("4") && (!no4.getText().toString().equals("") && ((Double.parseDouble(no4.getText().toString()) > 31) && (Double.parseDouble(no4.getText().toString()) < 81)))) {
									submitdata.setVisibility(View.GONE);
									allign_reset_calcula.setVisibility(View.VISIBLE);
								}
								else {
									MyUtil.showMessage(getApplicationContext(), "Subject 4: Credit Hour-4 valid data is 32~80");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									no4.setText("");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									textview15.setText("error");
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _check_ch5 () {
		if (ch_sub5.getText().toString().equals("1") && (!no5.getText().toString().equals("") && ((Double.parseDouble(no5.getText().toString()) > 7) && (Double.parseDouble(no5.getText().toString()) < 21)))) {
			if (!textview15.getText().toString().equals("error")) {
				submitdata.setVisibility(View.GONE);
				allign_reset_calcula.setVisibility(View.VISIBLE);
			}
		}
		else {
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			_enable_input();
			if (ch_sub5.getText().toString().equals("1")) {
				MyUtil.showMessage(getApplicationContext(), "Subject 5: Credit Hour-1 valid data is 8~18");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				no5.setText("");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				textview15.setText("error");
			}
			else {
				if (ch_sub5.getText().toString().equals("2") && (!no5.getText().toString().equals("") && ((Double.parseDouble(no5.getText().toString()) > 15) && (Double.parseDouble(no5.getText().toString()) < 41)))) {
					submitdata.setVisibility(View.GONE);
					allign_reset_calcula.setVisibility(View.VISIBLE);
				}
				else {
					if (ch_sub5.getText().toString().equals("2")) {
						MyUtil.showMessage(getApplicationContext(), "Subject 5: Credit Hour-2 valid data is 16~40");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						no5.setText("");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						textview15.setText("error");
					}
					else {
						if (ch_sub5.getText().toString().equals("3") && (!no5.getText().toString().equals("") && ((Double.parseDouble(no5.getText().toString()) > 23) && (Double.parseDouble(no5.getText().toString()) < 61)))) {
							submitdata.setVisibility(View.GONE);
							allign_reset_calcula.setVisibility(View.VISIBLE);
						}
						else {
							if (ch_sub5.getText().toString().equals("3")) {
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								MyUtil.showMessage(getApplicationContext(), "Subject 5: Credit Hour-3 valid data is 24~60");
								no5.setText("");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								textview15.setText("error");
							}
							else {
								if (ch_sub5.getText().toString().equals("4") && (!no5.getText().toString().equals("") && ((Double.parseDouble(no5.getText().toString()) > 31) && (Double.parseDouble(no5.getText().toString()) < 81)))) {
									submitdata.setVisibility(View.GONE);
									allign_reset_calcula.setVisibility(View.VISIBLE);
								}
								else {
									MyUtil.showMessage(getApplicationContext(), "Subject 5: Credit Hour-4 valid data is 32~80");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									no5.setText("");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									textview15.setText("error");
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _check_ch6 () {
		if (ch_sub6.getText().toString().equals("1") && (!no6.getText().toString().equals("") && ((Double.parseDouble(no6.getText().toString()) > 7) && (Double.parseDouble(no6.getText().toString()) < 21)))) {
			if (!textview15.getText().toString().equals("error")) {
				submitdata.setVisibility(View.GONE);
				allign_reset_calcula.setVisibility(View.VISIBLE);
			}
		}
		else {
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			_enable_input();
			if (ch_sub6.getText().toString().equals("1")) {
				MyUtil.showMessage(getApplicationContext(), "Subject 6: Credit Hour-1 valid data is 8~18");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				no6.setText("");
				submitdata.setVisibility(View.VISIBLE);
				allign_reset_calcula.setVisibility(View.GONE);
				textview15.setText("error");
			}
			else {
				if (ch_sub6.getText().toString().equals("2") && (!no6.getText().toString().equals("") && ((Double.parseDouble(no6.getText().toString()) > 15) && (Double.parseDouble(no6.getText().toString()) < 41)))) {
					submitdata.setVisibility(View.GONE);
					allign_reset_calcula.setVisibility(View.VISIBLE);
				}
				else {
					if (ch_sub5.getText().toString().equals("2")) {
						MyUtil.showMessage(getApplicationContext(), "Subject 6: Credit Hour-2 valid data is 16~40");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						no6.setText("");
						submitdata.setVisibility(View.VISIBLE);
						allign_reset_calcula.setVisibility(View.GONE);
						textview15.setText("error");
					}
					else {
						if (ch_sub6.getText().toString().equals("3") && (!no6.getText().toString().equals("") && ((Double.parseDouble(no6.getText().toString()) > 23) && (Double.parseDouble(no6.getText().toString()) < 61)))) {
							submitdata.setVisibility(View.GONE);
							allign_reset_calcula.setVisibility(View.VISIBLE);
						}
						else {
							if (ch_sub5.getText().toString().equals("3")) {
								MyUtil.showMessage(getApplicationContext(), "Subject 6: Credit Hour-3 valid data is 24~60");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								no6.setText("");
								submitdata.setVisibility(View.VISIBLE);
								allign_reset_calcula.setVisibility(View.GONE);
								textview15.setText("error");
							}
							else {
								if (ch_sub6.getText().toString().equals("4") && (!no6.getText().toString().equals("") && ((Double.parseDouble(no6.getText().toString()) > 31) && (Double.parseDouble(no6.getText().toString()) < 81)))) {
									submitdata.setVisibility(View.GONE);
									allign_reset_calcula.setVisibility(View.VISIBLE);
								}
								else {
									MyUtil.showMessage(getApplicationContext(), "Subject 6: Credit Hour-4 valid data is 32~80");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									no6.setText("");
									submitdata.setVisibility(View.VISIBLE);
									allign_reset_calcula.setVisibility(View.GONE);
									textview15.setText("error");
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub2 () {
		if (ch_sub2.getText().toString().equals("") || no2.getText().toString().equals("")) {
			
		}
		else {
			points2.setTextColor(0xFFFFFFFF);
			if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 8)) {
				points2.setText("1");
				grade2.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 9)) {
					points2.setText("1.5");
					grade2.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 10)) {
						points2.setText("2");
						grade2.setText("C");
					}
					else {
						if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 11)) {
							points2.setText("2.33");
							grade2.setText("C");
						}
						else {
							if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 12)) {
								points2.setText("2.67");
								grade2.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 13)) {
									points2.setText("3");
									grade2.setText("B");
								}
								else {
									if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 14)) {
										points2.setText("3.33");
										grade2.setText("B");
									}
									else {
										if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 15)) {
											points2.setText("3.67");
											grade2.setText("B");
										}
										else {
											if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 16)) {
												points2.setText("4");
												grade2.setText("A");
											}
											else {
												if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 17)) {
													points2.setText("4");
													grade2.setText("A");
												}
												else {
													if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 18)) {
														points2.setText("4");
														grade2.setText("A");
													}
													else {
														if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 19)) {
															points2.setText("4");
															grade2.setText("A");
														}
														else {
															if ((Double.parseDouble(ch_sub2.getText().toString()) == 1) && (Double.parseDouble(no2.getText().toString()) == 20)) {
																points2.setText("4");
																grade2.setText("A");
															}
															else {
																_check_colors();
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub2_ch2 () {
		if (ch_sub2.getText().toString().equals("") || no2.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 16)) {
				points2.setText("2");
				grade2.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 17)) {
					points2.setText("2.5");
					grade2.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 18)) {
						points2.setText("3");
						grade2.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 19)) {
							points2.setText("3.5");
							grade2.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 20)) {
								points2.setText("4");
								grade2.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 21)) {
									points2.setText("4.33");
									grade2.setText("C");
								}
								else {
									if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 22)) {
										points2.setText("4.67");
										grade2.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 23)) {
											points2.setText("5");
											grade2.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 24)) {
												points2.setText("5.33");
												grade2.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 25)) {
													points2.setText("5.67");
													grade2.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 26)) {
														points2.setText("6");
														grade2.setText("B");
													}
													else {
														if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 27)) {
															points2.setText("6.33");
															grade2.setText("B");
														}
														else {
															if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 28)) {
																points2.setText("6.67");
																grade2.setText("B");
															}
															else {
																if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 29)) {
																	points2.setText("7");
																	grade2.setText("B");
																}
																else {
																	if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 30)) {
																		points2.setText("7.33");
																		grade2.setText("B");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 31)) {
																			points2.setText("7.67");
																			grade2.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 32)) {
																				points2.setText("8");
																				grade2.setText("A");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 33)) {
																					points2.setText("8");
																					grade2.setText("A");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 34)) {
																						points2.setText("8");
																						grade2.setText("A");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 35)) {
																							points2.setText("8");
																							grade2.setText("A");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 36)) {
																								points2.setText("8");
																								grade2.setText("A");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 37)) {
																									points2.setText("8");
																									grade2.setText("A");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 38)) {
																										points2.setText("8");
																										grade2.setText("A");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 39)) {
																											points2.setText("8");
																											grade2.setText("A");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub2.getText().toString()) == 2) && (Double.parseDouble(no2.getText().toString()) == 40)) {
																												points2.setText("8");
																												grade2.setText("A");
																											}
																											else {
																												_check_colors();
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub2_ch3 () {
		if (ch_sub2.getText().toString().equals("") || no2.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 24)) {
				points2.setText("3");
				grade2.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 25)) {
					points2.setText("3.5");
					grade2.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 26)) {
						points2.setText("4");
						grade2.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 27)) {
							points2.setText("4.5");
							grade2.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 28)) {
								points2.setText("5");
								grade2.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 29)) {
									points2.setText("5.5");
									grade2.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 30)) {
										points2.setText("6");
										grade2.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 31)) {
											points2.setText("6.33");
											grade2.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 32)) {
												points2.setText("6.67");
												grade2.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 33)) {
													points2.setText("7");
													grade2.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 34)) {
														points2.setText("7.33");
														grade2.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 35)) {
															points2.setText("7.67");
															grade2.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 36)) {
																points2.setText("8");
																grade2.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 37)) {
																	points2.setText("8.33");
																	grade2.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 38)) {
																		points2.setText("8.67");
																		grade2.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 39)) {
																			points2.setText("9");
																			grade2.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 40)) {
																				points2.setText("9.33");
																				grade2.setText("B");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 41)) {
																					points2.setText("9.67");
																					grade2.setText("B");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 42)) {
																						points2.setText("10");
																						grade2.setText("B");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 43)) {
																							points2.setText("10.33");
																							grade2.setText("B");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 44)) {
																								points2.setText("10.67");
																								grade2.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 45)) {
																									points2.setText("11");
																									grade2.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 46)) {
																										points2.setText("11.33");
																										grade2.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 47)) {
																											points2.setText("11.67");
																											grade2.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 48)) {
																												points2.setText("12");
																												grade2.setText("A");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 49)) {
																													points2.setText("12");
																													grade2.setText("A");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 50)) {
																														points2.setText("12");
																														grade2.setText("A");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 51)) {
																															points2.setText("12");
																															grade2.setText("A");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 52)) {
																																points2.setText("12");
																																grade2.setText("A");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 53)) {
																																	points2.setText("12");
																																	grade2.setText("A");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 54)) {
																																		points2.setText("12");
																																		grade2.setText("A");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 55)) {
																																			points2.setText("12");
																																			grade2.setText("A");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 56)) {
																																				points2.setText("12");
																																				grade2.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 57)) {
																																					points2.setText("12");
																																					grade2.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 58)) {
																																						points2.setText("12");
																																						grade2.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 59)) {
																																							points2.setText("12");
																																							grade2.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub2.getText().toString()) == 3) && (Double.parseDouble(no2.getText().toString()) == 60)) {
																																								points2.setText("12");
																																								grade2.setText("A");
																																							}
																																							else {
																																								_check_colors();
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub2_ch4 () {
		if (ch_sub2.getText().toString().equals("") || no2.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 32)) {
				points2.setText("4");
				grade2.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 33)) {
					points2.setText("4.5");
					grade2.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 34)) {
						points2.setText("5");
						grade2.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 35)) {
							points2.setText("5.5");
							grade2.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 36)) {
								points2.setText("6");
								grade2.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 37)) {
									points2.setText("6.5");
									grade2.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 38)) {
										points2.setText("7");
										grade2.setText("D");
									}
									else {
										if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 39)) {
											points2.setText("7.5");
											grade2.setText("D");
										}
										else {
											if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 40)) {
												points2.setText("8");
												grade2.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 41)) {
													points2.setText("8.33");
													grade2.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 42)) {
														points2.setText("8.67");
														grade2.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 43)) {
															points2.setText("9");
															grade2.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 44)) {
																points2.setText("9.33");
																grade2.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 45)) {
																	points2.setText("9.67");
																	grade2.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 46)) {
																		points2.setText("10");
																		grade2.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 47)) {
																			points2.setText("10.33");
																			grade2.setText("C");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 48)) {
																				points2.setText("10.67");
																				grade2.setText("C");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 49)) {
																					points2.setText("11");
																					grade2.setText("C");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 50)) {
																						points2.setText("11.33");
																						grade2.setText("C");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 51)) {
																							points2.setText("11.67");
																							grade2.setText("C");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 52)) {
																								points2.setText("12");
																								grade2.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 53)) {
																									points2.setText("12.33");
																									grade2.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 54)) {
																										points2.setText("12.67");
																										grade2.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 55)) {
																											points2.setText("13");
																											grade2.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 56)) {
																												points2.setText("13.33");
																												grade2.setText("B");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 57)) {
																													points2.setText("13.67");
																													grade2.setText("B");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 58)) {
																														points2.setText("14");
																														grade2.setText("B");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 59)) {
																															points2.setText("14.33");
																															grade2.setText("B");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 60)) {
																																points2.setText("14.67");
																																grade2.setText("B");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 61)) {
																																	points2.setText("15");
																																	grade2.setText("B");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 62)) {
																																		points2.setText("15.33");
																																		grade2.setText("B");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 63)) {
																																			points2.setText("15.67");
																																			grade2.setText("B");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 64)) {
																																				points2.setText("16");
																																				grade2.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 65)) {
																																					points2.setText("16");
																																					grade2.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 66)) {
																																						points2.setText("16");
																																						grade2.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 67)) {
																																							points2.setText("16");
																																							grade2.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 68)) {
																																								points2.setText("16");
																																								grade2.setText("A");
																																							}
																																							else {
																																								if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 69)) {
																																									points2.setText("16");
																																									grade2.setText("A");
																																								}
																																								else {
																																									if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 70)) {
																																										points2.setText("16");
																																										grade2.setText("A");
																																									}
																																									else {
																																										if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 71)) {
																																											points2.setText("16");
																																											grade2.setText("A");
																																										}
																																										else {
																																											if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 72)) {
																																												points2.setText("16");
																																												grade2.setText("A");
																																											}
																																											else {
																																												if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 73)) {
																																													points2.setText("16");
																																													grade2.setText("A");
																																												}
																																												else {
																																													if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 74)) {
																																														points2.setText("16");
																																														grade2.setText("A");
																																													}
																																													else {
																																														if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 75)) {
																																															points2.setText("16");
																																															grade2.setText("A");
																																														}
																																														else {
																																															if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 76)) {
																																																points2.setText("16");
																																																grade2.setText("A");
																																															}
																																															else {
																																																if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 77)) {
																																																	points2.setText("16");
																																																	grade2.setText("A");
																																																}
																																																else {
																																																	if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 78)) {
																																																		points2.setText("16");
																																																		grade2.setText("A");
																																																	}
																																																	else {
																																																		if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 79)) {
																																																			points2.setText("16");
																																																			grade2.setText("A");
																																																		}
																																																		else {
																																																			if ((Double.parseDouble(ch_sub2.getText().toString()) == 4) && (Double.parseDouble(no2.getText().toString()) == 80)) {
																																																				points2.setText("16");
																																																				grade2.setText("A");
																																																			}
																																																			else {
																																																				_check_colors();
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																							points2.setTextColor(0xFFF44336);
																							grade2.setTextColor(0xFFF44336);
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub2_ch5 () {
		
	}
	
	
	private void _sub3_ch1 () {
		if (ch_sub3.getText().toString().equals("") || no3.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 8)) {
				points3.setText("1");
				grade3.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 9)) {
					points3.setText("1.5");
					grade3.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 10)) {
						points3.setText("2");
						grade3.setText("C");
					}
					else {
						if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 11)) {
							points3.setText("2.33");
							grade3.setText("C");
						}
						else {
							if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 12)) {
								points3.setText("2.67");
								grade3.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 13)) {
									points3.setText("3");
									grade3.setText("B");
								}
								else {
									if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 14)) {
										points3.setText("3.33");
										grade3.setText("B");
									}
									else {
										if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 15)) {
											points3.setText("3.67");
											grade3.setText("B");
										}
										else {
											if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 16)) {
												points3.setText("4");
												grade3.setText("A");
											}
											else {
												if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 17)) {
													points3.setText("4");
													grade3.setText("A");
												}
												else {
													if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 18)) {
														points3.setText("4");
														grade3.setText("A");
													}
													else {
														if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 19)) {
															points3.setText("4");
															grade3.setText("A");
														}
														else {
															if ((Double.parseDouble(ch_sub3.getText().toString()) == 1) && (Double.parseDouble(no3.getText().toString()) == 20)) {
																points3.setText("4");
																grade3.setText("A");
															}
															else {
																_check_colors();
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub3_ch2 () {
		if (ch_sub3.getText().toString().equals("") || no3.getText().toString().equals("")) {
			MyUtil.showMessage(getApplicationContext(), "Enter valid data");
		}
		else {
			if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 16)) {
				points3.setText("2");
				grade3.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 17)) {
					points3.setText("2.5");
					grade3.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 18)) {
						points3.setText("3");
						grade3.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 19)) {
							points3.setText("3.5");
							grade3.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 20)) {
								points3.setText("4");
								grade3.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 21)) {
									points3.setText("4.33");
									grade3.setText("C");
								}
								else {
									if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 22)) {
										points3.setText("4.67");
										grade3.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 23)) {
											points3.setText("5");
											grade3.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 24)) {
												points3.setText("5.33");
												grade3.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 25)) {
													points3.setText("5.67");
													grade3.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 26)) {
														points3.setText("6");
														grade3.setText("B");
													}
													else {
														if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 27)) {
															points3.setText("6.33");
															grade3.setText("B");
														}
														else {
															if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 28)) {
																points3.setText("6.67");
																grade3.setText("B");
															}
															else {
																if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 29)) {
																	points3.setText("7");
																	grade3.setText("B");
																}
																else {
																	if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 30)) {
																		points3.setText("7.33");
																		grade3.setText("B");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 31)) {
																			points3.setText("7.67");
																			grade3.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 32)) {
																				points3.setText("8");
																				grade3.setText("A");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 33)) {
																					points3.setText("8");
																					grade3.setText("A");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 34)) {
																						points3.setText("8");
																						grade3.setText("A");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 35)) {
																							points3.setText("8");
																							grade3.setText("A");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 36)) {
																								points3.setText("8");
																								grade3.setText("A");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 37)) {
																									points3.setText("8");
																									grade3.setText("A");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 38)) {
																										points3.setText("8");
																										grade3.setText("A");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 39)) {
																											points3.setText("8");
																											grade3.setText("A");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub3.getText().toString()) == 2) && (Double.parseDouble(no3.getText().toString()) == 40)) {
																												points3.setText("8");
																												grade3.setText("A");
																											}
																											else {
																												_check_colors();
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub3_ch3 () {
		if (ch_sub3.getText().toString().equals("") || no3.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 24)) {
				points3.setText("3");
				grade3.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 25)) {
					points3.setText("3.5");
					grade3.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 26)) {
						points3.setText("4");
						grade3.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 27)) {
							points3.setText("4.5");
							grade3.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 28)) {
								points3.setText("5");
								grade3.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 29)) {
									points3.setText("5.5");
									grade3.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 30)) {
										points3.setText("6");
										grade3.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 31)) {
											points3.setText("6.33");
											grade3.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 32)) {
												points3.setText("6.67");
												grade3.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 33)) {
													points3.setText("7");
													grade3.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 34)) {
														points3.setText("7.33");
														grade3.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 35)) {
															points3.setText("7.67");
															grade3.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 36)) {
																points3.setText("8");
																grade3.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 37)) {
																	points3.setText("8.33");
																	grade3.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 38)) {
																		points3.setText("8.67");
																		grade3.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 39)) {
																			points3.setText("9");
																			grade3.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 40)) {
																				points3.setText("9.33");
																				grade3.setText("B");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 41)) {
																					points3.setText("9.67");
																					grade3.setText("B");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 42)) {
																						points3.setText("10");
																						grade3.setText("B");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 43)) {
																							points3.setText("10.33");
																							grade3.setText("B");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 44)) {
																								points3.setText("10.67");
																								grade3.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 45)) {
																									points3.setText("11");
																									grade3.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 46)) {
																										points3.setText("11.33");
																										grade3.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 47)) {
																											points3.setText("11.67");
																											grade3.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 48)) {
																												points3.setText("12");
																												grade3.setText("A");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 49)) {
																													points3.setText("12");
																													grade3.setText("A");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 50)) {
																														points3.setText("12");
																														grade3.setText("A");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 51)) {
																															points3.setText("12");
																															grade3.setText("A");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 52)) {
																																points3.setText("12");
																																grade3.setText("A");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 53)) {
																																	points3.setText("12");
																																	grade3.setText("A");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 54)) {
																																		points3.setText("12");
																																		grade3.setText("A");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 55)) {
																																			points3.setText("12");
																																			grade3.setText("A");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 56)) {
																																				points3.setText("12");
																																				grade3.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 57)) {
																																					points3.setText("12");
																																					grade3.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 58)) {
																																						points3.setText("12");
																																						grade3.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 59)) {
																																							points3.setText("12");
																																							grade3.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub3.getText().toString()) == 3) && (Double.parseDouble(no3.getText().toString()) == 60)) {
																																								points3.setText("12");
																																								grade3.setText("A");
																																							}
																																							else {
																																								_check_colors();
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub3_ch4 () {
		if (ch_sub3.getText().toString().equals("") || no3.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 32)) {
				points3.setText("4");
				grade3.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 33)) {
					points3.setText("4.5");
					grade3.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 34)) {
						points3.setText("5");
						grade3.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 35)) {
							points3.setText("5.5");
							grade3.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 36)) {
								points3.setText("6");
								grade3.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 37)) {
									points3.setText("6.5");
									grade3.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 38)) {
										points3.setText("7");
										grade3.setText("D");
									}
									else {
										if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 39)) {
											points3.setText("7.5");
											grade3.setText("D");
										}
										else {
											if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 40)) {
												points3.setText("8");
												grade3.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 41)) {
													points3.setText("8.33");
													grade3.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 42)) {
														points3.setText("8.67");
														grade3.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 43)) {
															points3.setText("9");
															grade3.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 44)) {
																points3.setText("9.33");
																grade3.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 45)) {
																	points3.setText("9.67");
																	grade3.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 46)) {
																		points3.setText("10");
																		grade3.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 47)) {
																			points3.setText("10.33");
																			grade3.setText("C");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 48)) {
																				points3.setText("10.67");
																				grade3.setText("C");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 49)) {
																					points3.setText("11");
																					grade3.setText("C");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 50)) {
																						points3.setText("11.33");
																						grade3.setText("C");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 51)) {
																							points3.setText("11.67");
																							grade3.setText("C");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 52)) {
																								points3.setText("12");
																								grade3.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 53)) {
																									points3.setText("12.33");
																									grade3.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 54)) {
																										points3.setText("12.67");
																										grade3.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 55)) {
																											points3.setText("13");
																											grade3.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 56)) {
																												points3.setText("13.33");
																												grade3.setText("B");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 57)) {
																													points3.setText("13.67");
																													grade3.setText("B");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 58)) {
																														points3.setText("14");
																														grade3.setText("B");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 59)) {
																															points3.setText("14.33");
																															grade3.setText("B");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 60)) {
																																points3.setText("14.67");
																																grade3.setText("B");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 61)) {
																																	points3.setText("15");
																																	grade3.setText("B");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 62)) {
																																		points3.setText("15.33");
																																		grade3.setText("B");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 63)) {
																																			points3.setText("15.67");
																																			grade3.setText("B");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 64)) {
																																				points3.setText("16");
																																				grade3.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 65)) {
																																					points3.setText("16");
																																					grade3.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 66)) {
																																						points3.setText("16");
																																						grade3.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 67)) {
																																							points3.setText("16");
																																							grade3.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 68)) {
																																								points3.setText("16");
																																								grade3.setText("A");
																																							}
																																							else {
																																								if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 69)) {
																																									points3.setText("16");
																																									grade3.setText("A");
																																								}
																																								else {
																																									if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 70)) {
																																										points3.setText("16");
																																										grade3.setText("A");
																																									}
																																									else {
																																										if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 71)) {
																																											points3.setText("16");
																																											grade3.setText("A");
																																										}
																																										else {
																																											if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 72)) {
																																												points3.setText("16");
																																												grade3.setText("A");
																																											}
																																											else {
																																												if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 73)) {
																																													points3.setText("16");
																																													grade3.setText("A");
																																												}
																																												else {
																																													if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 74)) {
																																														points3.setText("16");
																																														grade3.setText("A");
																																													}
																																													else {
																																														if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 75)) {
																																															points3.setText("16");
																																															grade3.setText("A");
																																														}
																																														else {
																																															if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 76)) {
																																																points3.setText("16");
																																																grade3.setText("A");
																																															}
																																															else {
																																																if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 77)) {
																																																	points3.setText("16");
																																																	grade3.setText("A");
																																																}
																																																else {
																																																	if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 78)) {
																																																		points3.setText("16");
																																																		grade3.setText("A");
																																																	}
																																																	else {
																																																		if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 79)) {
																																																			points3.setText("16");
																																																			grade3.setText("A");
																																																		}
																																																		else {
																																																			if ((Double.parseDouble(ch_sub3.getText().toString()) == 4) && (Double.parseDouble(no3.getText().toString()) == 80)) {
																																																				points3.setText("16");
																																																				grade3.setText("A");
																																																			}
																																																			else {
																																																				_check_colors();
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub3_ch5 () {
		
	}
	
	
	private void _check_colors () {
		grade.edit().putString("grade", grade1.getText().toString()).commit();
		grade_2.edit().putString("grade", grade2.getText().toString()).commit();
		grade_3.edit().putString("grade", grade3.getText().toString()).commit();
		grade_4.edit().putString("grade", grade4.getText().toString()).commit();
		grade_5.edit().putString("grade", grade5.getText().toString()).commit();
		grade_6.edit().putString("grade", grade6.getText().toString()).commit();
		if (grade_2.getString("grade", "").equals("A")) {
			grade2.setTextColor(0xFF4CAF50);
			points2.setTextColor(0xFF4CAF50);
		}
		else {
			if (grade_2.getString("grade", "").equals("B")) {
				grade2.setTextColor(0xFF9C27B0);
				points2.setTextColor(0xFF9C27B0);
			}
			else {
				if (grade_2.getString("grade", "").equals("C")) {
					grade2.setTextColor(0xFF2196F3);
					points2.setTextColor(0xFF2196F3);
				}
				else {
					if (grade_2.getString("grade", "").equals("D")) {
						grade2.setTextColor(0xFFF44336);
						points2.setTextColor(0xFFF44336);
					}
					else {
						_mode();
					}
				}
			}
		}
		if (grade.getString("grade", "").equals("A")) {
			grade1.setTextColor(0xFF4CAF50);
			points1.setTextColor(0xFF4CAF50);
		}
		else {
			if (grade.getString("grade", "").equals("B")) {
				grade1.setTextColor(0xFF9C27B0);
				points1.setTextColor(0xFF9C27B0);
			}
			else {
				if (grade.getString("grade", "").equals("C")) {
					grade1.setTextColor(0xFF2196F3);
					points1.setTextColor(0xFF2196F3);
				}
				else {
					if (grade.getString("grade", "").equals("D")) {
						grade1.setTextColor(0xFFF44336);
						points1.setTextColor(0xFFF44336);
					}
					else {
						_mode();
					}
				}
			}
		}
		if (grade_3.getString("grade", "").equals("A")) {
			grade3.setTextColor(0xFF4CAF50);
			points3.setTextColor(0xFF4CAF50);
		}
		else {
			if (grade_3.getString("grade", "").equals("B")) {
				grade3.setTextColor(0xFF9C27B0);
				points3.setTextColor(0xFF9C27B0);
			}
			else {
				if (grade_3.getString("grade", "").equals("C")) {
					grade3.setTextColor(0xFF2196F3);
					points3.setTextColor(0xFF2196F3);
				}
				else {
					if (grade_3.getString("grade", "").equals("D")) {
						grade3.setTextColor(0xFFF44336);
						points3.setTextColor(0xFFF44336);
					}
					else {
						_mode();
					}
				}
			}
		}
		if (grade_4.getString("grade", "").equals("A")) {
			grade4.setTextColor(0xFF4CAF50);
			points4.setTextColor(0xFF4CAF50);
		}
		else {
			if (grade_4.getString("grade", "").equals("B")) {
				grade4.setTextColor(0xFF9C27B0);
				points4.setTextColor(0xFF9C27B0);
			}
			else {
				if (grade_4.getString("grade", "").equals("C")) {
					grade4.setTextColor(0xFF2196F3);
					points4.setTextColor(0xFF2196F3);
				}
				else {
					if (grade_4.getString("grade", "").equals("D")) {
						grade4.setTextColor(0xFFF44336);
						points4.setTextColor(0xFFF44336);
					}
					else {
						_mode();
					}
				}
			}
		}
		if (grade_5.getString("grade", "").equals("A")) {
			grade5.setTextColor(0xFF4CAF50);
			points5.setTextColor(0xFF4CAF50);
		}
		else {
			if (grade_5.getString("grade", "").equals(" B")) {
				grade5.setTextColor(0xFF9C27B0);
				points5.setTextColor(0xFF9C27B0);
			}
			else {
				if (grade_5.getString("grade", "").equals("C")) {
					grade5.setTextColor(0xFF2196F3);
					points5.setTextColor(0xFF2196F3);
				}
				else {
					if (grade_5.getString("grade", "").equals("D")) {
						grade5.setTextColor(0xFFF44336);
						points5.setTextColor(0xFFF44336);
					}
					else {
						_mode();
					}
				}
			}
		}
		if (grade_6.getString("grade", "").equals("A")) {
			grade6.setTextColor(0xFF4CAF50);
			points6.setTextColor(0xFF4CAF50);
		}
		else {
			if (grade_6.getString("grade", "").equals("B")) {
				grade6.setTextColor(0xFF9C27B0);
				points6.setTextColor(0xFF9C27B0);
			}
			else {
				if (grade_6.getString("grade", "").equals("C")) {
					grade6.setTextColor(0xFF2196F3);
					points6.setTextColor(0xFF2196F3);
				}
				else {
					if (grade_6.getString("grade", "").equals("D")) {
						grade6.setTextColor(0xFFF44336);
						points6.setTextColor(0xFFF44336);
					}
					else {
						_mode();
					}
				}
			}
		}
	}
	
	
	private void _Enter_Subject_Number () {
		share.edit().putString("ok", "1").commit();
		if (file.getString("subject", "").equals("1")) {
			sub1_row.setVisibility(View.VISIBLE);
			sub2_row.setVisibility(View.GONE);
			sub3_row.setVisibility(View.GONE);
			sub4_row.setVisibility(View.GONE);
			sub5_row.setVisibility(View.GONE);
			sub6_row.setVisibility(View.GONE);
			file.edit().putString("subject", "1").commit();
			share.edit().putString("share", "1").commit();
			_check_colors();
		}
		else {
			if (file.getString("subject", "").equals("2")) {
				sub1_row.setVisibility(View.VISIBLE);
				sub2_row.setVisibility(View.VISIBLE);
				sub3_row.setVisibility(View.GONE);
				sub4_row.setVisibility(View.GONE);
				sub5_row.setVisibility(View.GONE);
				sub6_row.setVisibility(View.GONE);
				file.edit().putString("subject", "2").commit();
				share.edit().putString("share", "2").commit();
				_check_colors();
			}
			else {
				if (file.getString("subject", "").equals("3")) {
					sub1_row.setVisibility(View.VISIBLE);
					sub2_row.setVisibility(View.VISIBLE);
					sub3_row.setVisibility(View.VISIBLE);
					sub4_row.setVisibility(View.GONE);
					sub5_row.setVisibility(View.GONE);
					sub6_row.setVisibility(View.GONE);
					file.edit().putString("subject", "3").commit();
					share.edit().putString("share", "3").commit();
					_check_colors();
				}
				else {
					if (file.getString("subject", "").equals("4")) {
						file.edit().putString("subject", "4").commit();
						share.edit().putString("share", "4").commit();
						_check_colors();
						sub1_row.setVisibility(View.VISIBLE);
						sub2_row.setVisibility(View.VISIBLE);
						sub3_row.setVisibility(View.VISIBLE);
						sub4_row.setVisibility(View.VISIBLE);
						sub5_row.setVisibility(View.GONE);
						sub6_row.setVisibility(View.GONE);
					}
					else {
						if (file.getString("subject", "").equals("5")) {
							file.edit().putString("subject", "5").commit();
							share.edit().putString("share", "5").commit();
							_check_colors();
							sub1_row.setVisibility(View.VISIBLE);
							sub2_row.setVisibility(View.VISIBLE);
							sub3_row.setVisibility(View.VISIBLE);
							sub4_row.setVisibility(View.VISIBLE);
							sub5_row.setVisibility(View.VISIBLE);
							sub6_row.setVisibility(View.GONE);
						}
						else {
							if (file.getString("subject", "").equals("6")) {
								file.edit().putString("subject", "6").commit();
								share.edit().putString("share", "6").commit();
								_visible_all();
								_check_colors();
								sub1_row.setVisibility(View.VISIBLE);
								sub2_row.setVisibility(View.VISIBLE);
								sub3_row.setVisibility(View.VISIBLE);
								sub4_row.setVisibility(View.VISIBLE);
								sub5_row.setVisibility(View.VISIBLE);
								sub6_row.setVisibility(View.VISIBLE);
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub4_ch1 () {
		if (ch_sub4.getText().toString().equals("") || no4.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 8)) {
				points4.setText("1");
				grade4.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 9)) {
					points4.setText("1.5");
					grade4.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 10)) {
						points4.setText("2");
						grade4.setText("C");
					}
					else {
						if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 11)) {
							points4.setText("2.33");
							grade4.setText("C");
						}
						else {
							if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 12)) {
								points4.setText("2.67");
								grade4.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 13)) {
									points4.setText("3");
									grade4.setText("B");
								}
								else {
									if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 14)) {
										points4.setText("3.33");
										grade4.setText("B");
									}
									else {
										if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 15)) {
											points4.setText("3.67");
											grade4.setText("B");
										}
										else {
											if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 16)) {
												points4.setText("4");
												grade4.setText("A");
											}
											else {
												if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 17)) {
													points4.setText("4");
													grade4.setText("A");
												}
												else {
													if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 18)) {
														points4.setText("4");
														grade4.setText("A");
													}
													else {
														if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 19)) {
															points4.setText("4");
															grade4.setText("A");
														}
														else {
															if ((Double.parseDouble(ch_sub4.getText().toString()) == 1) && (Double.parseDouble(no4.getText().toString()) == 20)) {
																points4.setText("4");
																grade4.setText("A");
															}
															else {
																_check_colors();
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub4_ch2 () {
		if (ch_sub4.getText().toString().equals("") || no4.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 16)) {
				points4.setText("2");
				grade4.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 17)) {
					points4.setText("2.5");
					grade4.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 18)) {
						points4.setText("3");
						grade4.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 19)) {
							points4.setText("3.5");
							grade4.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 20)) {
								points4.setText("4");
								grade4.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 21)) {
									points4.setText("4.33");
									grade4.setText("C");
								}
								else {
									if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 22)) {
										points4.setText("4.67");
										grade4.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 23)) {
											points4.setText("5");
											grade4.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 24)) {
												points4.setText("5.33");
												grade4.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 25)) {
													points4.setText("5.67");
													grade4.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 26)) {
														points4.setText("6");
														grade4.setText("B");
													}
													else {
														if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 27)) {
															points4.setText("6.33");
															grade4.setText("B");
														}
														else {
															if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 28)) {
																points4.setText("6.67");
																grade4.setText("B");
															}
															else {
																if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 29)) {
																	points4.setText("7");
																	grade4.setText("B");
																}
																else {
																	if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 30)) {
																		points4.setText("7.33");
																		grade4.setText("B");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 31)) {
																			points4.setText("7.67");
																			grade4.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 32)) {
																				points4.setText("8");
																				grade4.setText("A");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 33)) {
																					points4.setText("8");
																					grade4.setText("A");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 34)) {
																						points4.setText("8");
																						grade4.setText("A");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 35)) {
																							points4.setText("8");
																							grade4.setText("A");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 36)) {
																								points4.setText("8");
																								grade4.setText("A");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 37)) {
																									points4.setText("8");
																									grade4.setText("A");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 38)) {
																										points4.setText("8");
																										grade4.setText("A");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 39)) {
																											points4.setText("8");
																											grade4.setText("A");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub4.getText().toString()) == 2) && (Double.parseDouble(no4.getText().toString()) == 40)) {
																												points4.setText("8");
																												grade4.setText("A");
																											}
																											else {
																												_check_colors();
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub4_ch3 () {
		if (ch_sub4.getText().toString().equals("") || no4.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 24)) {
				points4.setText("3");
				grade4.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 25)) {
					points4.setText("3.5");
					grade4.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 26)) {
						points4.setText("4");
						grade4.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 27)) {
							points4.setText("4.5");
							grade4.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 28)) {
								points4.setText("5");
								grade4.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 29)) {
									points4.setText("5.5");
									grade4.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 30)) {
										points4.setText("6");
										grade4.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 31)) {
											points4.setText("6.33");
											grade4.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 32)) {
												points4.setText("6.67");
												grade4.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 33)) {
													points4.setText("7");
													grade4.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 34)) {
														points4.setText("7.33");
														grade4.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 35)) {
															points4.setText("7.67");
															grade4.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 36)) {
																points4.setText("8");
																grade4.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 37)) {
																	points4.setText("8.33");
																	grade4.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 38)) {
																		points4.setText("8.67");
																		grade4.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 39)) {
																			points4.setText("9");
																			grade4.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 40)) {
																				points4.setText("9.33");
																				grade4.setText("B");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 41)) {
																					points4.setText("9.67");
																					grade4.setText("B");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 42)) {
																						points4.setText("10");
																						grade4.setText("B");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 43)) {
																							points4.setText("10.33");
																							grade4.setText("B");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 44)) {
																								points4.setText("10.67");
																								grade4.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 45)) {
																									points4.setText("11");
																									grade4.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 46)) {
																										points4.setText("11.33");
																										grade4.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 47)) {
																											points4.setText("11.67");
																											grade4.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 48)) {
																												points4.setText("12");
																												grade4.setText("A");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 49)) {
																													points4.setText("12");
																													grade4.setText("A");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 50)) {
																														points4.setText("12");
																														grade4.setText("A");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 51)) {
																															points4.setText("12");
																															grade4.setText("A");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 52)) {
																																points4.setText("12");
																																grade4.setText("A");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 53)) {
																																	points4.setText("12");
																																	grade4.setText("A");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 54)) {
																																		points4.setText("12");
																																		grade4.setText("A");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 55)) {
																																			points4.setText("12");
																																			grade4.setText("A");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 56)) {
																																				points4.setText("12");
																																				grade4.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 57)) {
																																					points4.setText("12");
																																					grade4.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 58)) {
																																						points4.setText("12");
																																						grade4.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 59)) {
																																							points4.setText("12");
																																							grade4.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub4.getText().toString()) == 3) && (Double.parseDouble(no4.getText().toString()) == 60)) {
																																								points4.setText("12");
																																								grade4.setText("A");
																																							}
																																							else {
																																								_check_colors();
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub4_ch4 () {
		if (ch_sub4.getText().toString().equals("") || no4.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 32)) {
				points4.setText("4");
				grade4.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 33)) {
					points4.setText("4.5");
					grade4.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 34)) {
						points4.setText("5");
						grade4.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 35)) {
							points4.setText("5.5");
							grade4.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 36)) {
								points4.setText("6");
								grade4.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 37)) {
									points4.setText("6.5");
									grade4.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 38)) {
										points4.setText("7");
										grade4.setText("D");
									}
									else {
										if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 39)) {
											points4.setText("7.5");
											grade4.setText("D");
										}
										else {
											if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 40)) {
												points4.setText("8");
												grade4.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 41)) {
													points4.setText("8.33");
													grade4.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 42)) {
														points4.setText("8.67");
														grade4.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 43)) {
															points4.setText("9");
															grade4.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 44)) {
																points4.setText("9.33");
																grade4.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 45)) {
																	points4.setText("9.67");
																	grade4.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 46)) {
																		points4.setText("10");
																		grade4.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 47)) {
																			points4.setText("10.33");
																			grade4.setText("C");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 48)) {
																				points4.setText("10.67");
																				grade4.setText("C");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 49)) {
																					points4.setText("11");
																					grade4.setText("C");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 50)) {
																						points4.setText("11.33");
																						grade4.setText("C");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 51)) {
																							points4.setText("11.67");
																							grade4.setText("C");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 52)) {
																								points4.setText("12");
																								grade4.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 53)) {
																									points4.setText("12.33");
																									grade4.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 54)) {
																										points4.setText("12.67");
																										grade4.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 55)) {
																											points4.setText("13");
																											grade4.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 56)) {
																												points4.setText("13.33");
																												grade4.setText("B");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 57)) {
																													points4.setText("13.67");
																													grade4.setText("B");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 58)) {
																														points4.setText("14");
																														grade4.setText("B");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 59)) {
																															points4.setText("14.33");
																															grade4.setText("B");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 60)) {
																																points4.setText("14.67");
																																grade4.setText("B");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 61)) {
																																	points4.setText("15");
																																	grade4.setText("B");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 62)) {
																																		points4.setText("15.33");
																																		grade4.setText("B");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 63)) {
																																			points4.setText("15.67");
																																			grade4.setText("B");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 64)) {
																																				points4.setText("16");
																																				grade4.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 65)) {
																																					points4.setText("16");
																																					grade4.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 66)) {
																																						points4.setText("16");
																																						grade4.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 67)) {
																																							points4.setText("16");
																																							grade4.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 68)) {
																																								points4.setText("16");
																																								grade4.setText("A");
																																							}
																																							else {
																																								if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 69)) {
																																									points4.setText("16");
																																									grade4.setText("A");
																																								}
																																								else {
																																									if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 70)) {
																																										points4.setText("16");
																																										grade4.setText("A");
																																									}
																																									else {
																																										if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 71)) {
																																											points4.setText("16");
																																											grade4.setText("A");
																																										}
																																										else {
																																											if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 72)) {
																																												points4.setText("16");
																																												grade4.setText("A");
																																											}
																																											else {
																																												if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 73)) {
																																													points4.setText("16");
																																													grade4.setText("A");
																																												}
																																												else {
																																													if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 74)) {
																																														points4.setText("16");
																																														grade4.setText("A");
																																													}
																																													else {
																																														if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 75)) {
																																															points4.setText("16");
																																															grade4.setText("A");
																																														}
																																														else {
																																															if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 76)) {
																																																points4.setText("16");
																																																grade4.setText("A");
																																															}
																																															else {
																																																if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 77)) {
																																																	points4.setText("16");
																																																	grade4.setText("A");
																																																}
																																																else {
																																																	if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 78)) {
																																																		points4.setText("16");
																																																		grade4.setText("A");
																																																	}
																																																	else {
																																																		if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 79)) {
																																																			points4.setText("16");
																																																			grade4.setText("A");
																																																		}
																																																		else {
																																																			if ((Double.parseDouble(ch_sub4.getText().toString()) == 4) && (Double.parseDouble(no4.getText().toString()) == 80)) {
																																																				points4.setText("16");
																																																				grade4.setText("A");
																																																			}
																																																			else {
																																																				_check_colors();
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub4_ch5 () {
		
	}
	
	
	private void _sub5_ch1 () {
		if (ch_sub5.getText().toString().equals("") || no5.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 8)) {
				points5.setText("1");
				grade5.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 9)) {
					points5.setText("1.5");
					grade5.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 10)) {
						points5.setText("2");
						grade5.setText("C");
					}
					else {
						if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 11)) {
							points5.setText("2.33");
							grade5.setText("C");
						}
						else {
							if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 12)) {
								points5.setText("2.67");
								grade5.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 13)) {
									points5.setText("3");
									grade5.setText("B");
								}
								else {
									if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 14)) {
										points5.setText("3.33");
										grade5.setText("B");
									}
									else {
										if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 15)) {
											points5.setText("3.67");
											grade5.setText("B");
										}
										else {
											if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 16)) {
												points5.setText("4");
												grade5.setText("A");
											}
											else {
												if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 17)) {
													points5.setText("4");
													grade5.setText("A");
												}
												else {
													if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 18)) {
														points5.setText("4");
														grade5.setText("A");
													}
													else {
														if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 19)) {
															points5.setText("4");
															grade5.setText("A");
														}
														else {
															if ((Double.parseDouble(ch_sub5.getText().toString()) == 1) && (Double.parseDouble(no5.getText().toString()) == 20)) {
																points5.setText("4");
																grade5.setText("A");
															}
															else {
																_check_colors();
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub5_ch2 () {
		if (ch_sub5.getText().toString().equals("") || no5.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 16)) {
				points5.setText("2");
				grade5.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 17)) {
					points5.setText("2.5");
					grade5.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 18)) {
						points5.setText("3");
						grade5.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 19)) {
							points5.setText("3.5");
							grade5.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 20)) {
								points5.setText("4");
								grade5.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 21)) {
									points5.setText("4.33");
									grade5.setText("C");
								}
								else {
									if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 22)) {
										points5.setText("4.67");
										grade5.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 23)) {
											points5.setText("5");
											grade5.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 24)) {
												points5.setText("5.33");
												grade5.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 25)) {
													points5.setText("5.67");
													grade5.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 26)) {
														points5.setText("6");
														grade5.setText("B");
													}
													else {
														if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 27)) {
															points5.setText("6.33");
															grade5.setText("B");
														}
														else {
															if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 28)) {
																points5.setText("6.67");
																grade5.setText("B");
																points5.setTextColor(0xFF4CAF50);
																grade5.setTextColor(0xFF4CAF50);
															}
															else {
																if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 29)) {
																	points5.setText("7");
																	grade5.setText("B");
																	points5.setTextColor(0xFF4CAF50);
																	grade5.setTextColor(0xFF4CAF50);
																}
																else {
																	if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 30)) {
																		points5.setText("7.33");
																		grade5.setText("B");
																		points5.setTextColor(0xFF4CAF50);
																		grade5.setTextColor(0xFF4CAF50);
																	}
																	else {
																		if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 31)) {
																			points5.setText("7.67");
																			grade5.setText("B");
																			points5.setTextColor(0xFF4CAF50);
																			grade5.setTextColor(0xFF4CAF50);
																		}
																		else {
																			if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 32)) {
																				points5.setText("8");
																				grade5.setText("A");
																				points5.setTextColor(0xFF4CAF50);
																				grade5.setTextColor(0xFF4CAF50);
																			}
																			else {
																				if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 33)) {
																					points5.setText("8");
																					grade5.setText("A");
																					points5.setTextColor(0xFF4CAF50);
																					grade5.setTextColor(0xFF4CAF50);
																				}
																				else {
																					if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 34)) {
																						points5.setText("8");
																						grade5.setText("A");
																						points5.setTextColor(0xFF4CAF50);
																						grade5.setTextColor(0xFF4CAF50);
																					}
																					else {
																						if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 35)) {
																							points5.setText("8");
																							grade5.setText("A");
																							points5.setTextColor(0xFF4CAF50);
																							grade5.setTextColor(0xFF4CAF50);
																						}
																						else {
																							if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 36)) {
																								points5.setText("8");
																								grade5.setText("A");
																								points5.setTextColor(0xFF4CAF50);
																								grade5.setTextColor(0xFF4CAF50);
																							}
																							else {
																								if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 37)) {
																									points5.setText("8");
																									grade5.setText("A");
																									points5.setTextColor(0xFF4CAF50);
																									grade5.setTextColor(0xFF4CAF50);
																								}
																								else {
																									if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 38)) {
																										points5.setText("8");
																										grade5.setText("A");
																										points5.setTextColor(0xFF4CAF50);
																										grade5.setTextColor(0xFF4CAF50);
																									}
																									else {
																										if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 39)) {
																											points5.setText("8");
																											grade5.setText("A");
																											points5.setTextColor(0xFF4CAF50);
																											grade5.setTextColor(0xFF4CAF50);
																										}
																										else {
																											if ((Double.parseDouble(ch_sub5.getText().toString()) == 2) && (Double.parseDouble(no5.getText().toString()) == 40)) {
																												points5.setText("8");
																												grade5.setText("A");
																												points5.setTextColor(0xFF4CAF50);
																												grade5.setTextColor(0xFF4CAF50);
																											}
																											else {
																												_check_colors();
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub5_ch3 () {
		if (ch_sub5.getText().toString().equals("") || no5.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 24)) {
				points5.setText("3");
				grade5.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 25)) {
					points5.setText("3.5");
					grade5.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 26)) {
						points5.setText("4");
						grade5.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 27)) {
							points5.setText("4.5");
							grade5.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 28)) {
								points5.setText("5");
								grade5.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 29)) {
									points5.setText("5.5");
									grade5.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 30)) {
										points5.setText("6");
										grade5.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 31)) {
											points5.setText("6.33");
											grade5.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 32)) {
												points5.setText("6.67");
												grade5.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 33)) {
													points5.setText("7");
													grade5.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 34)) {
														points5.setText("7.33");
														grade5.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 35)) {
															points5.setText("7.67");
															grade5.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 36)) {
																points5.setText("8");
																grade5.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 37)) {
																	points5.setText("8.33");
																	grade5.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 38)) {
																		points5.setText("8.67");
																		grade5.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 39)) {
																			points5.setText("9");
																			grade5.setText("B");
																			grade5.setTextColor(0xFF9C27B0);
																			points5.setTextColor(0xFF9C27B0);
																		}
																		else {
																			if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 40)) {
																				points5.setText("9.33");
																				grade5.setText("B");
																				grade5.setTextColor(0xFF9C27B0);
																				points5.setTextColor(0xFF9C27B0);
																			}
																			else {
																				if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 41)) {
																					points5.setText("9.67");
																					grade5.setText("B");
																					grade5.setTextColor(0xFF9C27B0);
																				}
																				else {
																					if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 42)) {
																						points5.setText("10");
																						grade5.setText("B");
																						grade5.setTextColor(0xFF9C27B0);
																						points5.setTextColor(0xFF9C27B0);
																					}
																					else {
																						if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 43)) {
																							points5.setText("10.33");
																							grade5.setText("B");
																							grade5.setTextColor(0xFF9C27B0);
																						}
																						else {
																							if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 44)) {
																								points5.setText("10.67");
																								grade5.setText("B");
																								grade5.setTextColor(0xFF9C27B0);
																								points5.setTextColor(0xFF9C27B0);
																							}
																							else {
																								if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 45)) {
																									points5.setText("11");
																									grade5.setText("B");
																									grade5.setTextColor(0xFF9C27B0);
																									points5.setTextColor(0xFF9C27B0);
																								}
																								else {
																									if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 46)) {
																										points5.setText("11.33");
																										grade5.setText("B");
																										grade5.setTextColor(0xFF9C27B0);
																										points5.setTextColor(0xFF9C27B0);
																									}
																									else {
																										if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 47)) {
																											points5.setText("11.67");
																											grade5.setText("B");
																											grade5.setTextColor(0xFF9C27B0);
																											points5.setTextColor(0xFF9C27B0);
																										}
																										else {
																											if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 48)) {
																												points5.setText("12");
																												grade5.setText("A");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 49)) {
																													points5.setText("12");
																													grade5.setText("A");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 50)) {
																														points5.setText("12");
																														grade5.setText("A");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 51)) {
																															points5.setText("12");
																															grade5.setText("A");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 52)) {
																																points5.setText("12");
																																grade5.setText("A");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 53)) {
																																	points5.setText("12");
																																	grade5.setText("A");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 54)) {
																																		points5.setText("12");
																																		grade5.setText("A");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 55)) {
																																			points5.setText("12");
																																			grade5.setText("A");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 56)) {
																																				points5.setText("12");
																																				grade5.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 57)) {
																																					points5.setText("12");
																																					grade5.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 58)) {
																																						points5.setText("12");
																																						grade5.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 59)) {
																																							points5.setText("12");
																																							grade5.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub5.getText().toString()) == 3) && (Double.parseDouble(no5.getText().toString()) == 60)) {
																																								points5.setText("12");
																																								grade5.setText("A");
																																							}
																																							else {
																																								_check_colors();
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub5_ch4 () {
		if (ch_sub5.getText().toString().equals("") || no5.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 32)) {
				points5.setText("4");
				grade5.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 33)) {
					points5.setText("4.5");
					grade5.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 34)) {
						points5.setText("5");
						grade5.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 35)) {
							points5.setText("5.5");
							grade5.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 36)) {
								points5.setText("6");
								grade5.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 37)) {
									points5.setText("6.5");
									grade5.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 38)) {
										points5.setText("7");
										grade5.setText("D");
									}
									else {
										if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 39)) {
											points5.setText("7.5");
											grade5.setText("D");
										}
										else {
											if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 40)) {
												points5.setText("8");
												grade5.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 41)) {
													points5.setText("8.33");
													grade5.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 42)) {
														points5.setText("8.67");
														grade5.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 43)) {
															points5.setText("9");
															grade5.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 44)) {
																points5.setText("9.33");
																grade5.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 45)) {
																	points5.setText("9.67");
																	grade5.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 46)) {
																		points5.setText("10");
																		grade5.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 47)) {
																			points5.setText("10.33");
																			grade5.setText("C");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 48)) {
																				points5.setText("10.67");
																				grade5.setText("C");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 49)) {
																					points5.setText("11");
																					grade5.setText("C");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 50)) {
																						points5.setText("11.33");
																						grade5.setText("C");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 51)) {
																							points5.setText("11.67");
																							grade5.setText("C");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 52)) {
																								points5.setText("12");
																								grade5.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 53)) {
																									points5.setText("12.33");
																									grade5.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 54)) {
																										points5.setText("12.67");
																										grade5.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 55)) {
																											points5.setText("13");
																											grade5.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 56)) {
																												points5.setText("13.33");
																												grade5.setText("B");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 57)) {
																													points5.setText("13.67");
																													grade5.setText("B");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 58)) {
																														points5.setText("14");
																														grade5.setText("B");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 59)) {
																															points5.setText("14.33");
																															grade5.setText("B");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 60)) {
																																points5.setText("14.67");
																																grade5.setText("B");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 61)) {
																																	points5.setText("15");
																																	grade5.setText("B");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 62)) {
																																		points5.setText("15.33");
																																		grade5.setText("B");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 63)) {
																																			points5.setText("15.67");
																																			grade5.setText("B");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 64)) {
																																				points5.setText("16");
																																				grade5.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 65)) {
																																					points5.setText("16");
																																					grade5.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 66)) {
																																						points5.setText("16");
																																						grade5.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 67)) {
																																							points5.setText("16");
																																							grade5.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 68)) {
																																								points5.setText("16");
																																								grade5.setText("A");
																																							}
																																							else {
																																								if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 69)) {
																																									points5.setText("16");
																																									grade5.setText("A");
																																								}
																																								else {
																																									if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 70)) {
																																										points5.setText("16");
																																										grade5.setText("A");
																																									}
																																									else {
																																										if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 71)) {
																																											points5.setText("16");
																																											grade5.setText("A");
																																										}
																																										else {
																																											if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 72)) {
																																												points5.setText("16");
																																												grade5.setText("A");
																																											}
																																											else {
																																												if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 73)) {
																																													points5.setText("16");
																																													grade5.setText("A");
																																												}
																																												else {
																																													if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 74)) {
																																														points5.setText("16");
																																														grade5.setText("A");
																																													}
																																													else {
																																														if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 75)) {
																																															points5.setText("16");
																																															grade5.setText("A");
																																														}
																																														else {
																																															if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 76)) {
																																																points5.setText("16");
																																																grade5.setText("A");
																																															}
																																															else {
																																																if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 77)) {
																																																	points5.setText("16");
																																																	grade5.setText("A");
																																																}
																																																else {
																																																	if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 78)) {
																																																		points5.setText("16");
																																																		grade5.setText("A");
																																																	}
																																																	else {
																																																		if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 79)) {
																																																			points5.setText("16");
																																																			grade5.setText("A");
																																																		}
																																																		else {
																																																			if ((Double.parseDouble(ch_sub5.getText().toString()) == 4) && (Double.parseDouble(no5.getText().toString()) == 80)) {
																																																				points5.setText("16");
																																																				grade5.setText("A");
																																																			}
																																																			else {
																																																				_check_colors();
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub5_ch5 () {
		
	}
	
	
	private void _sub6_ch1 () {
		if (ch_sub6.getText().toString().equals("") || no6.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 8)) {
				points6.setText("1");
				grade6.setText("D");
				grade6.setTextColor(0xFFF44336);
			}
			else {
				if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 9)) {
					points6.setText("1.5");
					grade6.setText("D");
					grade6.setTextColor(0xFFF44336);
				}
				else {
					if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 10)) {
						points6.setText("2");
						grade6.setText("C");
						grade6.setTextColor(0xFFFF5722);
					}
					else {
						if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 11)) {
							points6.setText("2.33");
							grade6.setText("C");
							grade6.setTextColor(0xFFFF5722);
						}
						else {
							if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 12)) {
								points6.setText("2.67");
								grade6.setText("C");
								grade6.setTextColor(0xFFFF5722);
							}
							else {
								if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 13)) {
									points6.setText("3");
									grade6.setText("B");
									grade6.setTextColor(0xFFFFC107);
								}
								else {
									if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 14)) {
										points6.setText("3.33");
										grade6.setText("B");
										grade6.setTextColor(0xFFFFC107);
									}
									else {
										if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 15)) {
											points6.setText("3.67");
											grade6.setText("B");
											grade6.setTextColor(0xFFFFC107);
										}
										else {
											if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 16)) {
												points6.setText("4");
												grade6.setText("A");
												grade6.setTextColor(0xFF4CAF50);
											}
											else {
												if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 17)) {
													points6.setText("4");
													grade6.setText("A");
													grade6.setTextColor(0xFF4CAF50);
												}
												else {
													if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 18)) {
														points6.setText("4");
														grade6.setText("A");
														grade6.setTextColor(0xFF4CAF50);
													}
													else {
														if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 19)) {
															points6.setText("4");
															grade6.setText("A");
															grade6.setTextColor(0xFF4CAF50);
														}
														else {
															if ((Double.parseDouble(ch_sub6.getText().toString()) == 1) && (Double.parseDouble(no6.getText().toString()) == 20)) {
																points6.setText("4");
																grade6.setText("A");
																grade6.setTextColor(0xFF4CAF50);
															}
															else {
																_check_colors();
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub6_ch2 () {
		if (ch_sub6.getText().toString().equals("") || no6.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 16)) {
				points6.setText("2");
				grade6.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 17)) {
					points6.setText("2.5");
					grade6.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 18)) {
						points6.setText("3");
						grade6.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 19)) {
							points6.setText("3.5");
							grade6.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 20)) {
								points6.setText("4");
								grade6.setText("C");
							}
							else {
								if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 21)) {
									points6.setText("4.33");
									grade6.setText("C");
								}
								else {
									if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 22)) {
										points6.setText("4.67");
										grade6.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 23)) {
											points6.setText("5");
											grade6.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 24)) {
												points6.setText("5.33");
												grade6.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 25)) {
													points6.setText("5.67");
													grade6.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 26)) {
														points6.setText("6");
														grade6.setText("B");
													}
													else {
														if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 27)) {
															points6.setText("6.33");
															grade6.setText("B");
														}
														else {
															if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 28)) {
																points6.setText("6.67");
																grade6.setText("B");
															}
															else {
																if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 29)) {
																	points6.setText("7");
																	grade6.setText("B");
																}
																else {
																	if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 30)) {
																		points6.setText("7.33");
																		grade6.setText("B");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 31)) {
																			points6.setText("7.67");
																			grade6.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 32)) {
																				points6.setText("8");
																				grade6.setText("A");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 33)) {
																					points6.setText("8");
																					grade6.setText("A");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 34)) {
																						points6.setText("8");
																						grade6.setText("A");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 35)) {
																							points6.setText("8");
																							grade6.setText("A");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 36)) {
																								points6.setText("8");
																								grade6.setText("A");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 37)) {
																									points6.setText("8");
																									grade6.setText("A");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 38)) {
																										points6.setText("8");
																										grade6.setText("A");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 39)) {
																											points6.setText("8");
																											grade6.setText("A");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub6.getText().toString()) == 2) && (Double.parseDouble(no6.getText().toString()) == 40)) {
																												points6.setText("8");
																												grade6.setText("A");
																											}
																											else {
																												_check_colors();
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		_check_colors();
	}
	
	
	private void _sub6_ch3 () {
		if (ch_sub6.getText().toString().equals("") || no6.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 24)) {
				points6.setText("3");
				grade6.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 25)) {
					points6.setText("3.5");
					grade6.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 26)) {
						points6.setText("4");
						grade6.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 27)) {
							points6.setText("4.5");
							grade6.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 28)) {
								points6.setText("5");
								grade6.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 29)) {
									points6.setText("5.5");
									grade6.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 30)) {
										points6.setText("6");
										grade6.setText("C");
									}
									else {
										if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 31)) {
											points6.setText("6.33");
											grade6.setText("C");
										}
										else {
											if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 32)) {
												points6.setText("6.67");
												grade6.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 33)) {
													points6.setText("7");
													grade6.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 34)) {
														points6.setText("7.33");
														grade6.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 35)) {
															points6.setText("7.67");
															grade6.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 36)) {
																points6.setText("8");
																grade6.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 37)) {
																	points6.setText("8.33");
																	grade6.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 38)) {
																		points6.setText("8.67");
																		grade6.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 39)) {
																			points6.setText("9");
																			grade6.setText("B");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 40)) {
																				points6.setText("9.33");
																				grade6.setText("B");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 41)) {
																					points6.setText("9.67");
																					grade6.setText("B");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 42)) {
																						points6.setText("10");
																						grade6.setText("B");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 43)) {
																							points6.setText("10.33");
																							grade6.setText("B");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 44)) {
																								points6.setText("10.67");
																								grade6.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 45)) {
																									points6.setText("11");
																									grade6.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 46)) {
																										points6.setText("11.33");
																										grade6.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 47)) {
																											points6.setText("11.67");
																											grade6.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 48)) {
																												points6.setText("12");
																												grade6.setText("A");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 49)) {
																													points6.setText("12");
																													grade6.setText("A");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 50)) {
																														points6.setText("12");
																														grade6.setText("A");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 51)) {
																															points6.setText("12");
																															grade6.setText("A");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 52)) {
																																points6.setText("12");
																																grade6.setText("A");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 53)) {
																																	points6.setText("12");
																																	grade6.setText("A");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 54)) {
																																		points6.setText("12");
																																		grade6.setText("A");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 55)) {
																																			points6.setText("12");
																																			grade6.setText("A");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 56)) {
																																				points6.setText("12");
																																				grade6.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 57)) {
																																					points6.setText("12");
																																					grade6.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 58)) {
																																						points6.setText("12");
																																						grade6.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 59)) {
																																							points6.setText("12");
																																							grade6.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub6.getText().toString()) == 3) && (Double.parseDouble(no6.getText().toString()) == 60)) {
																																								points6.setText("12");
																																								grade6.setText("A");
																																							}
																																							else {
																																								_check_colors();
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub6_ch4 () {
		if (ch_sub6.getText().toString().equals("") || no6.getText().toString().equals("")) {
			
		}
		else {
			if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 32)) {
				points6.setText("4");
				grade6.setText("D");
			}
			else {
				if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 33)) {
					points6.setText("4.5");
					grade6.setText("D");
				}
				else {
					if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 34)) {
						points6.setText("5");
						grade6.setText("D");
					}
					else {
						if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 35)) {
							points6.setText("5.5");
							grade6.setText("D");
						}
						else {
							if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 36)) {
								points6.setText("6");
								grade6.setText("D");
							}
							else {
								if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 37)) {
									points6.setText("6.5");
									grade6.setText("D");
								}
								else {
									if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 38)) {
										points6.setText("7");
										grade6.setText("D");
									}
									else {
										if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 39)) {
											points6.setText("7.5");
											grade6.setText("D");
										}
										else {
											if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 40)) {
												points6.setText("8");
												grade6.setText("C");
											}
											else {
												if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 41)) {
													points6.setText("8.33");
													grade6.setText("C");
												}
												else {
													if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 42)) {
														points6.setText("8.67");
														grade6.setText("C");
													}
													else {
														if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 43)) {
															points6.setText("9");
															grade6.setText("C");
														}
														else {
															if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 44)) {
																points6.setText("9.33");
																grade6.setText("C");
															}
															else {
																if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 45)) {
																	points6.setText("9.67");
																	grade6.setText("C");
																}
																else {
																	if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 46)) {
																		points6.setText("10");
																		grade6.setText("C");
																	}
																	else {
																		if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 47)) {
																			points6.setText("10.33");
																			grade6.setText("C");
																		}
																		else {
																			if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 48)) {
																				points6.setText("10.67");
																				grade6.setText("C");
																			}
																			else {
																				if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 49)) {
																					points6.setText("11");
																					grade6.setText("C");
																				}
																				else {
																					if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 50)) {
																						points6.setText("11.33");
																						grade6.setText("C");
																					}
																					else {
																						if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 51)) {
																							points6.setText("11.67");
																							grade6.setText("C");
																						}
																						else {
																							if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 52)) {
																								points6.setText("12");
																								grade6.setText("B");
																							}
																							else {
																								if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 53)) {
																									points6.setText("12.33");
																									grade6.setText("B");
																								}
																								else {
																									if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 54)) {
																										points6.setText("12.67");
																										grade6.setText("B");
																									}
																									else {
																										if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 55)) {
																											points6.setText("13");
																											grade6.setText("B");
																										}
																										else {
																											if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 56)) {
																												points6.setText("13.33");
																												grade6.setText("B");
																											}
																											else {
																												if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 57)) {
																													points6.setText("13.67");
																													grade6.setText("B");
																												}
																												else {
																													if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 58)) {
																														points6.setText("14");
																														grade6.setText("B");
																													}
																													else {
																														if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 59)) {
																															points6.setText("14.33");
																															grade6.setText("B");
																														}
																														else {
																															if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 60)) {
																																points6.setText("14.67");
																																grade6.setText("B");
																															}
																															else {
																																if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 61)) {
																																	points6.setText("15");
																																	grade6.setText("B");
																																}
																																else {
																																	if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 62)) {
																																		points6.setText("15.33");
																																		grade6.setText("B");
																																	}
																																	else {
																																		if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 63)) {
																																			points6.setText("15.67");
																																			grade6.setText("B");
																																		}
																																		else {
																																			if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 64)) {
																																				points6.setText("16");
																																				grade6.setText("A");
																																			}
																																			else {
																																				if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 65)) {
																																					points6.setText("16");
																																					grade6.setText("A");
																																				}
																																				else {
																																					if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 66)) {
																																						points6.setText("16");
																																						grade6.setText("A");
																																					}
																																					else {
																																						if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 67)) {
																																							points6.setText("16");
																																							grade6.setText("A");
																																						}
																																						else {
																																							if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 68)) {
																																								points6.setText("16");
																																								grade6.setText("A");
																																							}
																																							else {
																																								if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 69)) {
																																									points6.setText("16");
																																									grade6.setText("A");
																																								}
																																								else {
																																									if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 70)) {
																																										points6.setText("16");
																																										grade6.setText("A");
																																									}
																																									else {
																																										if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 71)) {
																																											points6.setText("16");
																																											grade6.setText("A");
																																										}
																																										else {
																																											if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 72)) {
																																												points6.setText("16");
																																												grade6.setText("A");
																																											}
																																											else {
																																												if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 73)) {
																																													points6.setText("16");
																																													grade6.setText("A");
																																												}
																																												else {
																																													if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 74)) {
																																														points6.setText("16");
																																														grade6.setText("A");
																																													}
																																													else {
																																														if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 75)) {
																																															points6.setText("16");
																																															grade6.setText("A");
																																														}
																																														else {
																																															if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 76)) {
																																																points6.setText("16");
																																																grade6.setText("A");
																																															}
																																															else {
																																																if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 77)) {
																																																	points6.setText("16");
																																																	grade6.setText("A");
																																																}
																																																else {
																																																	if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 78)) {
																																																		points6.setText("16");
																																																		grade6.setText("A");
																																																	}
																																																	else {
																																																		if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 79)) {
																																																			points6.setText("16");
																																																			grade6.setText("A");
																																																		}
																																																		else {
																																																			if ((Double.parseDouble(ch_sub6.getText().toString()) == 4) && (Double.parseDouble(no6.getText().toString()) == 80)) {
																																																				points6.setText("16");
																																																				grade6.setText("A");
																																																			}
																																																			else {
																																																				_check_colors();
																																																			}
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	private void _sub6_ch5 () {
		
	}
	
	
	private void _Reset () {
		allign_reset_calcula.setVisibility(View.GONE);
		submitdata.setVisibility(View.VISIBLE);
		if (!(spinner1.getSelectedItemPosition() == 2)) {
			ch_sub1.setText("");
			ch_sub2.setText("");
			ch_sub3.setText("");
			ch_sub4.setText("");
			ch_sub5.setText("");
			ch_sub6.setText("");
		}
		no1.setText("");
		no2.setText("");
		no3.setText("");
		no4.setText("");
		no5.setText("");
		no6.setText("");
		points1.setText("0");
		points2.setText("0");
		points3.setText("0");
		points4.setText("0");
		points5.setText("0");
		points6.setText("0");
		grade1.setText("null");
		grade2.setText("null");
		grade3.setText("null");
		grade4.setText("null");
		grade5.setText("null");
		grade6.setText("null");
		allign_gpa_message.setVisibility(View.GONE);
		_check_colors();
	}
	
	
	private void _calculate_subject4 () {
		if (file.getString("subject", "").equals("4")) {
			allign_gpa_message.setVisibility(View.VISIBLE);
			p1 = Double.parseDouble(points1.getText().toString());
			p2 = Double.parseDouble(points2.getText().toString());
			p3 = Double.parseDouble(points3.getText().toString());
			p4 = Double.parseDouble(points4.getText().toString());
			if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || (points4.getText().toString().equals("") || points1.getText().toString().equals("")))) {
				MyUtil.showMessage(getApplicationContext(), "Enter valid data");
			}
			else {
				gpa.setText(String.valueOf((p1 + (p2 + (p3 + p4))) / (Double.parseDouble(ch_sub1.getText().toString()) + (Double.parseDouble(ch_sub2.getText().toString()) + (Double.parseDouble(ch_sub3.getText().toString()) + Double.parseDouble(ch_sub4.getText().toString()))))));
				_check_colors();
			}
		}
	}
	
	
	private void _calculate_subject5 () {
		if (file.getString("subject", "").equals("5")) {
			allign_gpa_message.setVisibility(View.VISIBLE);
			p1 = Double.parseDouble(points1.getText().toString());
			p2 = Double.parseDouble(points2.getText().toString());
			p3 = Double.parseDouble(points3.getText().toString());
			p4 = Double.parseDouble(points4.getText().toString());
			p5 = Double.parseDouble(points5.getText().toString());
			if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || (points4.getText().toString().equals("") || (points5.getText().toString().equals("") || points1.getText().toString().equals(""))))) {
				MyUtil.showMessage(getApplicationContext(), "Enter valid data");
			}
			else {
				gpa.setText(String.valueOf((p1 + (p2 + (p3 + (p5 + p4)))) / (Double.parseDouble(ch_sub1.getText().toString()) + (Double.parseDouble(ch_sub2.getText().toString()) + (Double.parseDouble(ch_sub3.getText().toString()) + (Double.parseDouble(ch_sub4.getText().toString()) + Double.parseDouble(ch_sub5.getText().toString())))))));
				_check_colors();
			}
		}
	}
	
	
	private void _calculate_subject6 () {
		if (file.getString("subject", "").equals("6")) {
			allign_gpa_message.setVisibility(View.VISIBLE);
			p1 = Double.parseDouble(points1.getText().toString());
			p2 = Double.parseDouble(points2.getText().toString());
			p3 = Double.parseDouble(points3.getText().toString());
			p4 = Double.parseDouble(points4.getText().toString());
			p5 = Double.parseDouble(points5.getText().toString());
			p6 = Double.parseDouble(points6.getText().toString());
			if (points2.getText().toString().equals("") || (points3.getText().toString().equals("") || (points4.getText().toString().equals("") || (points5.getText().toString().equals("") || (points1.getText().toString().equals("") || points6.getText().toString().equals("")))))) {
				MyUtil.showMessage(getApplicationContext(), "Enter valid data");
			}
			else {
				gpa.setText(String.valueOf((p1 + (p2 + (p3 + (p5 + (p4 + p6))))) / (Double.parseDouble(ch_sub1.getText().toString()) + (Double.parseDouble(ch_sub2.getText().toString()) + (Double.parseDouble(ch_sub3.getText().toString()) + (Double.parseDouble(ch_sub4.getText().toString()) + (Double.parseDouble(ch_sub5.getText().toString()) + Double.parseDouble(ch_sub6.getText().toString()))))))));
				_check_colors();
			}
		}
	}
	
	
	private void _check_all () {
		_ch1();
		_ch2();
		_ch3();
		_ch4();
		_sub2();
		_sub2_ch2();
		_sub2_ch3();
		_sub2_ch4();
		_sub3_ch1();
		_sub3_ch2();
		_sub3_ch3();
		_sub3_ch4();
		_sub4_ch1();
		_sub4_ch2();
		_sub4_ch3();
		_sub4_ch4();
		_sub4_ch5();
		_sub5_ch1();
		_sub5_ch2();
		_sub5_ch3();
		_sub5_ch4();
		_sub5_ch5();
		_sub6_ch1();
		_sub6_ch2();
		_sub6_ch3();
		_sub6_ch4();
		_sub6_ch5();
	}
	
	
	private void _disabla_input () {
		ch_sub1.setEnabled(false);
		ch_sub2.setEnabled(false);
		ch_sub3.setEnabled(false);
		ch_sub4.setEnabled(false);
		ch_sub5.setEnabled(false);
		ch_sub6.setEnabled(false);
		no1.setEnabled(false);
		no2.setEnabled(false);
		no3.setEnabled(false);
		no4.setEnabled(false);
		no5.setEnabled(false);
		no6.setEnabled(false);
	}
	
	
	private void _enable_input () {
		ch_sub1.setEnabled(true);
		ch_sub2.setEnabled(true);
		ch_sub3.setEnabled(true);
		ch_sub4.setEnabled(true);
		ch_sub5.setEnabled(true);
		ch_sub6.setEnabled(true);
		no1.setEnabled(true);
		no2.setEnabled(true);
		no3.setEnabled(true);
		no4.setEnabled(true);
		no5.setEnabled(true);
		no6.setEnabled(true);
	}
	
	
	private void _Check_Connection () {
		try {
			command = "ping -c 1 google.com";
			connected = (Runtime.getRuntime().exec (command).waitFor() == 0); } catch (Exception e){ showMessage(e.toString());}
	}
	
	
	private void _mode () {
		if (share.getString("mode", "").equals("1")) {
			linear_al_expt_welcm.setBackgroundResource(0);
			linear_al_expt_welcm.setBackgroundColor(0xFF000000);
			linear_spinner.setBackgroundColor(0xFF000000);
			headings_linear.setBackgroundColor(0xFF000000);
			vscrol_all_data.setBackgroundColor(0xFF000000);
			allign_gpa_message.setBackgroundColor(0xFF000000);
			linear_subject_all.setBackgroundColor(0xFF000000);
			allign_gpa_message.setBackgroundColor(0xFF000000);
			ch_sub1.setTextColor(0xFFFFFFFF);
			ch_sub2.setTextColor(0xFFFFFFFF);
			ch_sub3.setTextColor(0xFFFFFFFF);
			ch_sub4.setTextColor(0xFFFFFFFF);
			ch_sub5.setTextColor(0xFFFFFFFF);
			ch_sub6.setTextColor(0xFFFFFFFF);
			ch_sub7.setTextColor(0xFFFFFFFF);
			ch_sub8.setTextColor(0xFFFFFFFF);
			ch_sub9.setTextColor(0xFFFFFFFF);
			ch_sub10.setTextColor(0xFFFFFFFF);
			ch_sub11.setTextColor(0xFFFFFFFF);
			ch_sub12.setTextColor(0xFFFFFFFF);
			ch_sub13.setTextColor(0xFFFFFFFF);
			ch_sub14.setTextColor(0xFFFFFFFF);
			ch_sub15.setTextColor(0xFFFFFFFF);
			ch_sub16.setTextColor(0xFFFFFFFF);
			no1.setTextColor(0xFFFFFFFF);
			no2.setTextColor(0xFFFFFFFF);
			no3.setTextColor(0xFFFFFFFF);
			no4.setTextColor(0xFFFFFFFF);
			no5.setTextColor(0xFFFFFFFF);
			no6.setTextColor(0xFFFFFFFF);
			no7.setTextColor(0xFFFFFFFF);
			no8.setTextColor(0xFFFFFFFF);
			no9.setTextColor(0xFFFFFFFF);
			no10.setTextColor(0xFFFFFFFF);
			no11.setTextColor(0xFFFFFFFF);
			no12.setTextColor(0xFFFFFFFF);
			no13.setTextColor(0xFFFFFFFF);
			no14.setTextColor(0xFFFFFFFF);
			no15.setTextColor(0xFFFFFFFF);
			no16.setTextColor(0xFFFFFFFF);
			textview11.setTextColor(0xFFFFFFFF);
			gpa.setTextColor(0xFF4CAF50);
		}
		else {
			if (share.getString("mode", "").equals("0")) {
				linear_al_expt_welcm.setBackgroundResource(0);
				linear_al_expt_welcm.setBackgroundColor(0xFFFFFFFF);
				linear_al_expt_welcm.setBackgroundColor(0xFFFFFFFF);
				linear_spinner.setBackgroundColor(0xFFFFFFFF);
				headings_linear.setBackgroundColor(0xFFFFFFFF);
				vscrol_all_data.setBackgroundColor(0xFFFFFFFF);
				allign_gpa_message.setBackgroundColor(0xFFFFFFFF);
				linear_subject_all.setBackgroundColor(0xFFFFFFFF);
				allign_gpa_message.setBackgroundColor(0xFFFFFFFF);
				textview11.setTextColor(0xFF000000);
				gpa.setTextColor(0xFF4CAF50);
				no1.setTextColor(0xFF000000);
				no2.setTextColor(0xFF000000);
				no3.setTextColor(0xFF000000);
				no4.setTextColor(0xFF000000);
				no5.setTextColor(0xFF000000);
				no6.setTextColor(0xFF000000);
				no7.setTextColor(0xFF000000);
				no8.setTextColor(0xFF000000);
				no9.setTextColor(0xFF000000);
				no10.setTextColor(0xFF000000);
				no11.setTextColor(0xFF000000);
				no12.setTextColor(0xFF000000);
				no13.setTextColor(0xFF000000);
				no14.setTextColor(0xFF000000);
				no15.setTextColor(0xFF000000);
				no16.setTextColor(0xFF000000);
				ch_sub1.setTextColor(0xFF000000);
				ch_sub2.setTextColor(0xFF000000);
				ch_sub3.setTextColor(0xFF000000);
				ch_sub4.setTextColor(0xFF000000);
				ch_sub5.setTextColor(0xFF000000);
				ch_sub6.setTextColor(0xFF000000);
				ch_sub7.setTextColor(0xFF000000);
				ch_sub8.setTextColor(0xFF000000);
				ch_sub9.setTextColor(0xFF000000);
				ch_sub10.setTextColor(0xFF000000);
				ch_sub11.setTextColor(0xFF000000);
				ch_sub12.setTextColor(0xFF000000);
				ch_sub13.setTextColor(0xFF000000);
				ch_sub14.setTextColor(0xFF000000);
				ch_sub15.setTextColor(0xFF000000);
				ch_sub16.setTextColor(0xFF000000);
			}
		}
	}
	
	
	private void _rotation () {
		rotate = 0;
		calculate.setRotation((float)(rotate));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 90;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(1500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 180;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(2000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 270;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(2500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 360;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(3000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 0;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(3500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 90;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(4000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 180;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(4500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 270;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(5000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 360;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(5500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 0;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(6000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 90;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(6500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 180;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(7000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 270;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(7500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 360;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(8000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 0;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(8500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 90;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(9000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 180;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(9500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 270;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(10000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 360;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(10000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 0;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(11500));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 90;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(20000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 180;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(25000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 270;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(30000));
		time = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						rotate = 360;
						calculate.setRotation((float)(rotate));
					}
				});
			}
		};
		_timer.schedule(time, (int)(35000));
	}
	
	
	private void _visible_all () {
		subject1.setVisibility(View.VISIBLE);
		subject2.setVisibility(View.VISIBLE);
		subject3.setVisibility(View.VISIBLE);
		subject4.setVisibility(View.VISIBLE);
		subject5.setVisibility(View.VISIBLE);
		subject6.setVisibility(View.VISIBLE);
		grade1.setVisibility(View.VISIBLE);
		grade2.setVisibility(View.VISIBLE);
		grade3.setVisibility(View.VISIBLE);
		grade4.setVisibility(View.VISIBLE);
		grade5.setVisibility(View.VISIBLE);
		grade6.setVisibility(View.VISIBLE);
		points1.setVisibility(View.VISIBLE);
		points2.setVisibility(View.VISIBLE);
		points3.setVisibility(View.VISIBLE);
		points4.setVisibility(View.VISIBLE);
		points5.setVisibility(View.VISIBLE);
		points6.setVisibility(View.VISIBLE);
		no1.setVisibility(View.VISIBLE);
		no2.setVisibility(View.VISIBLE);
		no3.setVisibility(View.VISIBLE);
		no4.setVisibility(View.VISIBLE);
		no5.setVisibility(View.VISIBLE);
		no6.setVisibility(View.VISIBLE);
		grade1.setVisibility(View.VISIBLE);
		grade2.setVisibility(View.VISIBLE);
		grade3.setVisibility(View.VISIBLE);
		grade4.setVisibility(View.VISIBLE);
		grade5.setVisibility(View.VISIBLE);
		grade6.setVisibility(View.VISIBLE);
		ch_sub1.setVisibility(View.VISIBLE);
		ch_sub2.setVisibility(View.VISIBLE);
		ch_sub3.setVisibility(View.VISIBLE);
		ch_sub4.setVisibility(View.VISIBLE);
		ch_sub5.setVisibility(View.VISIBLE);
		ch_sub6.setVisibility(View.VISIBLE);
		file.edit().putString("subject", "6").commit();
		share.edit().putString("share", "6").commit();
	}
	
	
	private void _numbers () {
		no_8 = 8;
		no_9 = 9;
		no_10 = 10;
		no_11 = 11;
		no_12 = 12;
		no_13 = 13;
		no_14 = 14;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
		no_8++;
	}
	
	
	private void _ch1_check () {
		
	}
	
	
	private void _ch2_check () {
		if (ch_sub1.getText().toString().equals("2") && (!no1.getText().toString().equals("") && ((Double.parseDouble(no1.getText().toString()) > 15) && (Double.parseDouble(no1.getText().toString()) < 41)))) {
			submitdata.setVisibility(View.GONE);
			allign_reset_calcula.setVisibility(View.VISIBLE);
		}
		else {
			MyUtil.showMessage(getApplicationContext(), "Credit Hour-2 valid data is 16~40");
			submitdata.setVisibility(View.VISIBLE);
			allign_reset_calcula.setVisibility(View.GONE);
			no1.setText("");
		}
	}
	
	
	private void _all_view_setting () {
		points7.setTextSize((float)14);
		points8.setTextSize((float)14);
		points9.setTextSize((float)14);
		points10.setTextSize((float)14);
		points11.setTextSize((float)14);
		points12.setTextSize((float)14);
		points13.setTextSize((float)14);
		points14.setTextSize((float)14);
		points15.setTextSize((float)14);
		points16.setTextSize((float)14);
		ch_sub6.setTextSize((float)14);
		ch_sub7.setTextSize((float)14);
		ch_sub8.setTextSize((float)14);
		ch_sub9.setTextSize((float)14);
		ch_sub10.setTextSize((float)14);
		ch_sub11.setTextSize((float)14);
		ch_sub12.setTextSize((float)14);
		ch_sub13.setTextSize((float)14);
		ch_sub14.setTextSize((float)14);
		ch_sub15.setTextSize((float)14);
		ch_sub16.setTextSize((float)14);
		no7.setTextSize((float)14);
		no8.setTextSize((float)14);
		no9.setTextSize((float)14);
		no10.setTextSize((float)14);
		no11.setTextSize((float)14);
		no12.setTextSize((float)14);
		no13.setTextSize((float)14);
		no14.setTextSize((float)14);
		no15.setTextSize((float)14);
		no16.setTextSize((float)14);
		ch_sub7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		ch_sub16.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no16.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points10.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points11.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points12.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points13.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		points16.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/default_font.ttf"), 1);
		no7.setHintTextColor(Color.parseColor("#90A4AE"));
		no8.setHintTextColor(Color.parseColor("#90A4AE"));
		no9.setHintTextColor(Color.parseColor("#90A4AE"));
		no10.setHintTextColor(Color.parseColor("#90A4AE"));
		no11.setHintTextColor(Color.parseColor("#90A4AE"));
		no12.setHintTextColor(Color.parseColor("#90A4AE"));
		no13.setHintTextColor(Color.parseColor("#90A4AE"));
		no14.setHintTextColor(Color.parseColor("#90A4AE"));
		no15.setHintTextColor(Color.parseColor("#90A4AE"));
		no16.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub7.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub8.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub9.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub10.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub11.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub12.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub13.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub14.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub15.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub16.setHintTextColor(Color.parseColor("#90A4AE"));
		ch_sub7.setHint("Credits");
		ch_sub8.setHint("Credits");
		ch_sub9.setHint("Credits");
		ch_sub10.setHint("Credits");
		ch_sub11.setHint("Credits");
		ch_sub12.setHint("Credits");
		ch_sub13.setHint("Credits");
		ch_sub14.setHint("Credits");
		ch_sub15.setHint("Credits");
		ch_sub16.setHint("Credits");
		no7.setHint("Number");
		no8.setHint("Number");
		no9.setHint("Number");
		no10.setHint("Number");
		no11.setHint("Number");
		no12.setHint("Number");
		no13.setHint("Number");
		no14.setHint("Number");
		no15.setHint("Number");
		no16.setHint("Number");
		points1.setText("0");
		points2.setText("0");
		points3.setText("0");
		points4.setText("0");
		points5.setText("0");
		points6.setText("0");
		points7.setText("0");
		points8.setText("0");
		points9.setText("0");
		points10.setText("0");
		points11.setText("0");
		points12.setText("0");
		points13.setText("0");
		points14.setText("0");
		points15.setText("0");
		points16.setText("0");
		grade1.setText("null");
		grade2.setText("null");
		grade3.setText("null");
		grade4.setText("null");
		grade5.setText("null");
		grade6.setText("null");
		points1.setTextColor(0xFF2196F3);
		points2.setTextColor(0xFF2196F3);
		points3.setTextColor(0xFF2196F3);
		points4.setTextColor(0xFF2196F3);
		points5.setTextColor(0xFF2196F3);
		points6.setTextColor(0xFF2196F3);
		points7.setTextColor(0xFF2196F3);
		points8.setTextColor(0xFF2196F3);
		points9.setTextColor(0xFF2196F3);
		points10.setTextColor(0xFF2196F3);
		points11.setTextColor(0xFF2196F3);
		points12.setTextColor(0xFF2196F3);
		points13.setTextColor(0xFF2196F3);
		points14.setTextColor(0xFF2196F3);
		points15.setTextColor(0xFF2196F3);
		points16.setTextColor(0xFF2196F3);
		grade1.setTextColor(0xFF2196F3);
		grade2.setTextColor(0xFF2196F3);
		grade3.setTextColor(0xFF2196F3);
		grade4.setTextColor(0xFF2196F3);
		grade5.setTextColor(0xFF2196F3);
		grade6.setTextColor(0xFF2196F3);
		grade7.setTextColor(0xFF2196F3);
		grade8.setTextColor(0xFF2196F3);
		grade9.setTextColor(0xFF2196F3);
		grade10.setTextColor(0xFF2196F3);
		grade11.setTextColor(0xFF2196F3);
		grade12.setTextColor(0xFF2196F3);
		grade13.setTextColor(0xFF2196F3);
		grade14.setTextColor(0xFF2196F3);
		grade15.setTextColor(0xFF2196F3);
		grade16.setTextColor(0xFF2196F3);
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
	
	
	private void _calculate_subject3 () {
		if (file.getString("subject", "").equals("3")) {
			allign_gpa_message.setVisibility(View.VISIBLE);
			p1 = Double.parseDouble(points1.getText().toString());
			p2 = Double.parseDouble(points2.getText().toString());
			p3 = Double.parseDouble(points3.getText().toString());
			if (points1.getText().toString().equals("") || (points2.getText().toString().equals("") || points3.getText().toString().equals(""))) {
				MyUtil.showMessage(getApplicationContext(), "Enter valid data");
			}
			else {
				gpa.setText(String.valueOf((p1 + (p2 + p3)) / (Double.parseDouble(ch_sub1.getText().toString()) + (Double.parseDouble(ch_sub2.getText().toString()) + Double.parseDouble(ch_sub3.getText().toString())))));
				_check_colors();
			}
		}
	}
	
	
	private void _calculate_subject2 () {
		if (file.getString("subject", "").equals("2")) {
			allign_gpa_message.setVisibility(View.VISIBLE);
			p1 = Double.parseDouble(points1.getText().toString());
			p2 = Double.parseDouble(points2.getText().toString());
			if (points1.getText().toString().equals("") || points2.getText().toString().equals("")) {
				MyUtil.showMessage(getApplicationContext(), "Enter valid data");
			}
			else {
				gpa.setText(String.valueOf((p1 + p2) / (Double.parseDouble(ch_sub1.getText().toString()) + Double.parseDouble(ch_sub2.getText().toString()))));
				_check_colors();
			}
		}
	}
	
	
	private void _calculate_subject1 () {
		if (file.getString("subject", "").equals("1")) {
			allign_gpa_message.setVisibility(View.VISIBLE);
			p1 = Double.parseDouble(points1.getText().toString());
			if (points1.getText().toString().equals("")) {
				MyUtil.showMessage(getApplicationContext(), "Enter valid data");
			}
			else {
				gpa.setText(String.valueOf(p1 / Double.parseDouble(ch_sub1.getText().toString())));
				_check_colors();
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
