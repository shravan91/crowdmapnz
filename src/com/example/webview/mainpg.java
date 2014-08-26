package com.example.webview;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.view.View.OnClickListener;

public class mainpg extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainpg);
		
		
		/*Button viewmap = (Button) findViewById(R.id.viewmap);
		viewmap.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View v) {
 
				Intent i=new Intent();
				 i.setClass(mainpg.this, viewmap.class);
			        startActivity(i);
 
			}
 
		});*/
		
		
		Button rating = (Button) findViewById(R.id.rating);
		rating.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View v) {
 
				Intent i=new Intent();
				 i.setClass(mainpg.this, rating.class);
			        startActivity(i);
 
			}
 
		});
		
		/*Button survey = (Button) findViewById(R.id.survey);
		survey.setOnClickListener(new OnClickListener() {
			 
			@Override
			public void onClick(View v) {
 
				Intent i=new Intent();
				 i.setClass(mainpg.this, survey.class);
			        startActivity(i);
 
			}
 
		});
		

		*/
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
