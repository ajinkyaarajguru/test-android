package com.example.stonepaperscissor;

import java.util.Random;

import com.example.stonepaperscissor.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		
		Toast.makeText(this, "Starting the Game", Toast.LENGTH_LONG).show();
		final TextView text1=(TextView)findViewById(R.id.textView1);
		final TextView text2=(TextView)findViewById(R.id.textView2);
		
		Button stone=(Button)findViewById(R.id.button1);
		stone.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				text1.setText("Stone");
				compPlayer(1,text2);
				return false;
			}
		});
		
		Button paper=(Button)findViewById(R.id.button2);
		paper.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				text1.setText("Paper");
				compPlayer(2,text2);
				return false;
			}
		});
		
		Button scissor=(Button)findViewById(R.id.button3);
		scissor.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View arg0, MotionEvent arg1) {
				// TODO Auto-generated method stub
				text1.setText("Scissor");
				compPlayer(3,text2);
				return false;
			}
		});
		
	}
	
	
	public void compPlayer(int p, TextView t)
	{
		int n;
		
		int START = 1;
	    int END = 3;
	    Random random = new Random();
	    n=showRandomInteger(START, END, random);
		System.out.println(n);
		//t.setText(s);
		//Toast.makeText(this, n, Toast.LENGTH_SHORT).show();
		//return n;
		if(n==1)
			t.setText("Stone");
		else if(n==2)
			t.setText("Paper");
		else if(n==3)
			t.setText("Scissor");
		else
			t.setText("Error");
		if(p==n)
			Toast.makeText(this, "Tie", Toast.LENGTH_SHORT).show();
		else if(p==1 && n==2)// stone vs paper
			Toast.makeText(this, "comp Wins", Toast.LENGTH_SHORT).show();
		else if(p==1 && n==3)// stone vs scissor
			Toast.makeText(this, "Player Wins", Toast.LENGTH_SHORT).show();
		else if(p==2 && n==1)// paper vs stone
			Toast.makeText(this, "Player Wins", Toast.LENGTH_SHORT).show();
		else if(p==2 && n==3)// paper vs scissor
			Toast.makeText(this, "comp Wins", Toast.LENGTH_SHORT).show();
		else if(p==3 && n==1)// scissor vs stone
			Toast.makeText(this, "Comp Wins", Toast.LENGTH_SHORT).show();
		else if(p==3 && n==2)// scissor vs paper
			Toast.makeText(this, "Player Wins", Toast.LENGTH_SHORT).show();
	}

	private int showRandomInteger(int aStart, int aEnd, Random aRandom) {
		// TODO Auto-generated method stub
		if ( aStart > aEnd ) {
		      throw new IllegalArgumentException("Start cannot exceed End.");
		    }
		    //get the range, casting to long to avoid overflow problems
		    long range = (long)aEnd - (long)aStart + 1;
		    // compute a fraction of the range, 0 <= frac < range
		    long fraction = (long)(range * aRandom.nextDouble());
		    int randomNumber =  (int)(fraction + aStart);    
		    //log("Generated : " + randomNumber);
		    return randomNumber;
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_game, menu);
		return true;
	}

}
