/**
 *@Copyright:Copyright (c) 2008 - 2100
 *@Company:SJS
 */
package com.lpf.mysuperdemo.activity;

import android.app.Activity;
import android.os.Bundle;

import com.lpf.mysuperdemo.R;
import com.lpf.mysuperdemo.downloadfile.CustomDBPlace;

/**
 * @Title:
 * @Description:
 * @Author:liupf5
 * @Since:2015-6-8
 * @Version:1.1.0
 */
public class Test extends Activity{

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		CustomDBPlace d  = new CustomDBPlace(this);
		d.openDatabase();
	}
}
