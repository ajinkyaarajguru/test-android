package com.example.stonepaperscissor;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView text1=(TextView)findViewById(R.id.textView1);
		//Editable name=(Editable)findViewById(R.id.editText1);
		final TextView input=(TextView)findViewById(R.id.editText2);
		
		Button save=(Button)findViewById(R.id.button1);
		
		save.setOnTouchListener(new OnTouchListener(){
			
			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				String n;
				n=new String("Hi");
				//n=(String) input.getText();
				n=input.toString();
				text1.setText("Name");
				System.out.println("Name: ");
				System.out.println(n);
				text1.setText(n);
				text1.setText(input.getText());
				return false;
			}
		});
		
		
		
		Button single=(Button)findViewById(R.id.button2);
		single.setOnTouchListener(new OnTouchListener() {
			
			public boolean onTouch(View arg0, MotionEvent arg1) {
			
				Intent intent=new Intent();
				intent.setClassName("com.example.stonepaperscissor","com.example.stonepaperscissor.Game");
				//intent.putExtra("time",Integer.parseInt((String)text2.getText()));
				startActivity(intent);
				return false;
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
