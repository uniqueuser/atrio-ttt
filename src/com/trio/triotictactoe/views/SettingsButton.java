package com.trio.triotictactoe.views;

import com.trio.triotictactoe.activity.SettingsActivity;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

public class SettingsButton extends ImageButton{

	public SettingsButton(Context context) {
		super(context);
		setClickListener();
	}
	public SettingsButton(Context context,AttributeSet attr){
		super(context,attr);
		setClickListener();
	}
	
	private void setClickListener(){
			setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent settingsAcivityIntent = new Intent(getContext(), SettingsActivity.class);
				getContext().startActivity(settingsAcivityIntent);
			}
		});
	}
	
	
	
	
	

}
