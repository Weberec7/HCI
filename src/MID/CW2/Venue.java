package MID.CW2;

import java.util.regex.Pattern;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.text.util.Linkify;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class Venue extends Activity 
{
	public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.venue1);
		   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.information);
	      
	      TextView myWebSite = (TextView) findViewById(R.id.cialink);
	      myWebSite.setText ("Website: Cardiff International Arena");
	      Pattern pattern = Pattern.compile("Website");
	      String scheme = "http://cardiff-tickets.com/cardiff-international-arena-cia/";
	      Linkify.addLinks(myWebSite, pattern, scheme);
	      
	      TextView myDirections = (TextView) findViewById(R.id.directions);
	      myDirections.setText ("Directions: Cardiff International Arena, Mary Ann Street, Cardiff, Wales CF10 2EQ");
	      Pattern pattern1 = Pattern.compile("Directions");
	      String scheme1 = "http://maps.google.co.uk/maps/place?hl=en&xhr=t&cp=69&um=1&ie=UTF-8&q=Cardiff+International+Arena,+Mary+Ann+Street,+Cardiff,+Wales+CF10+2EQ&fb=1&gl=uk&hq=Cardiff+International+Arena,&hnear=0x486e1cb65ddfbb5f:0xf3b9d0c757fa30fc,Mary+Ann+St,+Cardiff+CF10+2&cid=14805238670205741584";
	      Linkify.addLinks(myDirections, pattern1, scheme1);
	      
	      
	      TextView myPhone = (TextView) findViewById(R.id.myphone);
	      Linkify.addLinks(myPhone  , Linkify.PHONE_NUMBERS);

	      
	      
//	      Button Directions = (Button) findViewById(R.id.directions);
//	      Directions.setOnClickListener(new View.OnClickListener() {
//	         public void onClick(View arg0) {
//	         Intent f = new Intent(Venue.this, directions1.class);
//	         startActivity(f);
//	         } 
//	      });
	      
	      Button b = (Button) findViewById(R.id.btnClick);
	      b.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(Venue.this, Act.class);
	         startActivity(i);
	         finish();
	         } 
	      });
	   }
}
