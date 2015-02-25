package com.example.yan.view;

import com.example.yan.R;
import com.example.yan.R.id;
import com.example.yan.R.layout;
import com.example.yan.R.menu;
import com.example.yan.presenter.LocationPresenter;
import com.example.yan.presenter.iview.ILocation;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;

public class Location extends FragmentActivity implements ILocation {
	
	LocationPresenter presenter;
	GoogleMap map;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_location);
		final Handler handler=new Handler();
		final Runnable r = new Runnable()
		{
		    public void run() 
		    {
		    	testeo();
		    	handler.postDelayed(this, 5000);
		    }
		};
		handler.postDelayed(r, 6000);
		
	}
	public void testeo()
	{
		  SupportMapFragment fm = (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
	        
	        // Getting Map for the SupportMapFragment
	        map = fm.getMap();
      map.setMyLocationEnabled(true);	
		
	}
	
	 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.location, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void setCurrentLocation() {
		
	}
}
