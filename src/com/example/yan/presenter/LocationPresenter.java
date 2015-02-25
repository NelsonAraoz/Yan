package com.example.yan.presenter;

import com.example.yan.presenter.iview.ILocation;

public class LocationPresenter {
	
	ILocation view;
	public LocationPresenter(ILocation view)
	{
		this.view=view;
	}
	public void setCurrentLocation()
	{	
		view.setCurrentLocation();
	}
	
}
