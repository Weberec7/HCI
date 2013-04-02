package MID.CW2;


import android.app.TabActivity;
import android.os.Bundle;
import android.content.Intent;
//import android.content.res.Resources;
import android.view.Window;
import android.widget.TabHost;

public class Face1 extends TabActivity {
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.face1);
 	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.fb_login);

//	    Resources res = getResources(); // Resource object to get Drawables
//	    res.getDrawable(R.drawable.tabs))
	    
	    TabHost tabHost = getTabHost();  // The activity TabHost
	    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
	    Intent intent;  // Reusable Intent for each tab

	    // Create an Intent to launch an Activity for the tab (to be reused)
	    intent = new Intent().setClass(this, tab1.class);

	    // Initialize a TabSpec for each tab and add it to the TabHost
	    spec = tabHost.newTabSpec("Attending").setIndicator("Attending")
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, tab2.class);
	    spec = tabHost.newTabSpec("Maybe").setIndicator("Maybe")
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, tab3.class);
	    spec = tabHost.newTabSpec("Declined").setIndicator("Declined")
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(0);
	}



	

}
