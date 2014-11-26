package com.liuzhiyi.demo_viewanimation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView tv;
    Button bt1,bt2,bt3,bt4,bt5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv=(TextView) findViewById(R.id.textView1);
		bt1=(Button) findViewById(R.id.button1);
		bt2=(Button) findViewById(R.id.button2);
		bt3=(Button) findViewById(R.id.button3);
		bt4=(Button) findViewById(R.id.button4);
		bt5=(Button) findViewById(R.id.button5);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation alpha=AnimationUtils.loadAnimation(MainActivity.this,
						R.anim.alpha_animation);
				tv.startAnimation(alpha);
			}
		});	
		bt2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation alpha=AnimationUtils.loadAnimation(MainActivity.this,
						R.anim.translate_animation);
				tv.startAnimation(alpha);
			}
		});	
		bt3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation alpha=AnimationUtils.loadAnimation(MainActivity.this,
						R.anim.scale_animation);
				tv.startAnimation(alpha);
			}
		});
	    bt4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Animation alpha=AnimationUtils.loadAnimation(MainActivity.this,
						R.anim.rotate_animation);
				tv.startAnimation(alpha);
			}
		});
	    bt5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Animation alpha=AnimationUtils.loadAnimation(MainActivity.this,
					R.anim.all_animation);
			tv.startAnimation(alpha);
		}
	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
