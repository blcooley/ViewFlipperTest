package com.coolmodev.viewflippertest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ViewFlipper;

public class ViewFlipperActivity extends Activity {
	
	private ViewFlipper mFlipper;
	private WebView web1;
	private WebView web2;
	private WebView web3;
	private boolean isLarge;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mFlipper = (ViewFlipper)findViewById(R.id.vflipper);
        web1 = (WebView)findViewById(R.id.web1);
        web2 = (WebView)findViewById(R.id.web2);
        web3 = (WebView)findViewById(R.id.web3);
        
        web1.loadData("One", "text/html", "utf-8");
        web2.loadData("Two", "text/html", "utf-8");
        web3.loadData("Three", "text/html", "utf-8");
    }
    
    public void moveLeft(View v) {
    	mFlipper.showPrevious();
    }

    public void moveRight(View v) {
    	mFlipper.showNext();
    }
    
    public void toggleSize(View v) {
    	if (isLarge) {
    		web1.getSettings().setTextSize(WebSettings.TextSize.SMALLER);
    		web2.getSettings().setTextSize(WebSettings.TextSize.SMALLER);
    		web3.getSettings().setTextSize(WebSettings.TextSize.SMALLER);
    		isLarge = false;
    	} else {
    		web1.getSettings().setTextSize(WebSettings.TextSize.LARGER);
    		web2.getSettings().setTextSize(WebSettings.TextSize.LARGER);
    		web3.getSettings().setTextSize(WebSettings.TextSize.LARGER);
    		isLarge = true;
    	}
    }
}