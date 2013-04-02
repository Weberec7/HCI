package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RatingBar;


public class rate1 extends Activity 
{
	
	
	
	public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.rate1);
   	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.rate);
	      
	       final RatingBar ratingBar_Indicator = (RatingBar)findViewById(R.id.ratingbar_Indicator);
	       
	       final RatingBar avg_ratingbar = (RatingBar)findViewById(R.id.avg_ratingbar);
	       float ratingavg = (float) 3.5;
	       float yourrating = (float) 4.5;
	       avg_ratingbar.setRating(ratingavg);
	       ratingBar_Indicator.setRating(yourrating);
	       
	       Button Media = (Button) findViewById(R.id.media);
		      Media.setOnClickListener(new View.OnClickListener() {
		         public void onClick(View arg0) {
		         Intent f = new Intent(rate1.this, media1.class);
		         startActivity(f);
		         } 
		      });
	       
	      
	      Button b = (Button) findViewById(R.id.btnClick);
	      b.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	        	 Intent f = new Intent(rate1.this, Act.class);
		         startActivity(f);
	        	 
	         } 
	      });
	      
	      
	      
	   
}
}

