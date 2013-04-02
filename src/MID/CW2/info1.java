package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class info1 extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.info1);
	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.information);
        
        Button Ticket = (Button) findViewById(R.id.bookaticket);
	      Ticket.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(info1.this, ticket1.class);
	         startActivity(i);
	         } 
	      });
	      
	      Button tour = (Button) findViewById(R.id.tour);
	      tour.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(info1.this, tour1.class);
	         startActivity(i);
	         } 
	      });
	      
	      Button Media = (Button) findViewById(R.id.media);
	      Media.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent f = new Intent(info1.this, media1.class);
	         startActivity(f);
	         } 
	      });
	      
	      Button Venue = (Button) findViewById(R.id.venue);
	      Venue.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent f = new Intent(info1.this, Venue.class);
	         startActivity(f);
	         } 
	      });
	      Button Seats = (Button) findViewById(R.id.seats);
	      Seats.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent f = new Intent(info1.this, Face2.class);
	         startActivity(f);
	         } 
	      });
	      Button b = (Button) findViewById(R.id.main_menu);
	      b.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	        	 Intent i = new Intent(info1.this, Act.class);
		         startActivity(i);
		         finish();
	         } 
	      });
	      
	      
    }
}
