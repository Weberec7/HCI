package MID.CW2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

public class Act extends Activity {
	
	public static boolean ViewRatings = false;
	public static boolean ViewVoucher = false;
	public static boolean popup = true;
	public static boolean popup2 = true;
	public static boolean attendance = true;
	public float rating = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.main);
 	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.icon);
        
        this.setTitle(R.string.menu);
        
        if(!ViewRatings){
        Button band = (Button) findViewById(R.id.ratetheband);
        band.setText("Rate the Band");
	      band.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	        	 LayoutInflater inflater = (LayoutInflater) Act.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	       	    // inflate our view from the corresponding XML file
	       	    View layout = inflater.inflate(R.layout.ratingpopup, (ViewGroup)findViewById(R.id.popup_menu_root));
	       	    // create a 100px width and 200px height popup window
	       	    final PopupWindow pw = new PopupWindow(layout, -1, -1, true);
	       	    layout.getBackground().setAlpha(230);
	       	    // set actions to buttons we have in our popup
	       	    
	       	    Button button1 = (Button)layout.findViewById(R.id.popup_menu_button1);
	       	    button1.setOnClickListener(new OnClickListener() {
	       	        public void onClick(View vv) {
	       	            // close the popup
	       	            pw.dismiss();
	       	        }
	       	    });
	       	    Button button2 = (Button)layout.findViewById(R.id.popup_menu_button2);
	       	    button2.setOnClickListener(new OnClickListener() {
	       	        public void onClick(View vv) {
	       	        	pw.dismiss();
	       	            Toast.makeText(Act.this, "Your Rating Has Been Submitted", Toast.LENGTH_SHORT).show();
	       	            popup = false;
	       	            ViewRatings= true;
	       	            
	       	         Button band = (Button) findViewById(R.id.ratetheband);
	                 band.setText("View Ratings");
	         	      band.setOnClickListener(new View.OnClickListener() {
	         	         public void onClick(View arg0) {
	         	         Intent i = new Intent(Act.this, rate1.class);
	         	         
	         	         startActivity(i);
	         	         } 
	         	      });
	       	            
	       	        }
	       	    });
	       	    if(Act.popup){pw.showAtLocation(layout, Gravity.CENTER, 0, 0);}
	         } 
	      });}
        
        
        else{
        	Button band = (Button) findViewById(R.id.ratetheband);
            band.setText("View Ratings");
    	      band.setOnClickListener(new View.OnClickListener() {
    	         public void onClick(View arg0) {
    	         Intent i = new Intent(Act.this, rate1.class);
    	         startActivity(i);
    	         } 
    	      });
        
        }
	      
	      if(!ViewVoucher){
	      Button ticket = (Button) findViewById(R.id.Ticket);
	      ticket.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(Act.this, ticket1.class);
	         startActivity(i);
	         } 
	      });
	      } //end if
	      else{ Button ticket = (Button) findViewById(R.id.Ticket);
	      ticket.setOnClickListener(new View.OnClickListener() {
		         public void onClick(View arg0) {
		         Intent i = new Intent(Act.this, ticket1.class);
		         startActivity(i);
		         } 
		      });} //end else
	      
	      
	      
	      Button info = (Button) findViewById(R.id.Info);
	      info.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(Act.this, info1.class);
	         startActivity(i);
	         } 
	      });
	      if(attendance){
	    	  Button Facebook = (Button) findViewById(R.id.Face);
		      Facebook.setOnClickListener(new View.OnClickListener() {
		         public void onClick(View arg0) {
		        	 LayoutInflater inflates = (LayoutInflater) Act.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			       	    // inflate our view from the corresponding XML file
			       	    View layout = inflates.inflate(R.layout.facebookpopup, (ViewGroup)findViewById(R.id.fpopup_menu_root));
			       	    // create a 100px width and 200px height popup window
			       	    final PopupWindow p = new PopupWindow(layout, -1, -1, true);
			       	    layout.getBackground().setAlpha(230);
			       	    // set actions to buttons we have in our popup
			       	    
			       	    Button button1 = (Button)layout.findViewById(R.id.popup_menu_button1);
			       	    button1.setOnClickListener(new OnClickListener() {
			       	        public void onClick(View vv) {
			       	            // close the popup
			       	            p.dismiss();
			       	         Intent f = new Intent(Act.this, Face1.class);
			       	         startActivity(f);
			       	        }
			       	    });
			       	    Button button2 = (Button)layout.findViewById(R.id.popup_menu_button2);
			       	    button2.setOnClickListener(new OnClickListener() {
			       	        public void onClick(View vv) {
			       	            attendance= false;
			       	            popup2=false;
			       	            p.dismiss();
			       	         Button Facebook = (Button) findViewById(R.id.Face);
			       	      Facebook.setOnClickListener(new View.OnClickListener() {
			       	         public void onClick(View arg0) {
			       	         Intent j = new Intent(Act.this, Face1.class);
			       	         startActivity(j);
			       	         } 
			       	      });
			       	         Intent f = new Intent(Act.this, Face1.class);
			       	         startActivity(f);
			       	         
			       	            
			       	        }
			       	    });
			       	    if(Act.popup2){p.showAtLocation(layout, Gravity.CENTER, 0, 0);}
			         } 
			      });}//end if
	      else{
	      Button Facebook = (Button) findViewById(R.id.Face);
	      Facebook.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent j = new Intent(Act.this, Face1.class);
	         startActivity(j);
	         } 
	      });
	      }//end else
    }
}



	//final RatingBar ratingBar_default = (RatingBar)findViewById(R.id.your_rating);
	// ratingBar_default.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
	//
//		   public void onRatingChanged(RatingBar ratingBar, float rating,
//		     boolean fromUser) {
//		    ratingBar_Indicator.setRating(rating);
//		    Toast.makeText(rate1.this, "rating:"+String.valueOf(rating),
//		      Toast.LENGTH_LONG).show();
//		   }});