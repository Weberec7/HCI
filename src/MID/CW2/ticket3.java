package MID.CW2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class ticket3 extends Activity
{
   public void onCreate(Bundle savedInstanceState)
   {
	   Act.ViewVoucher=true;
	   Intent a = getIntent();
	      final String name = a.getStringExtra("name");
	      final String email = a.getStringExtra("email");
	      
	      
	      String pit = a.getStringExtra("pit1");
	      String stands = a.getStringExtra("stands1");
	      String balcony = a.getStringExtra("balcony1");
	      String total = a.getStringExtra("total1");
	   
      super.onCreate(savedInstanceState);
      requestWindowFeature(Window.FEATURE_LEFT_ICON);
      setContentView(R.layout.ticket3);
	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ticket1);
	   
	   TextView NAME = (TextView) findViewById(R.id.name);
	      NAME.setText("Name: " + name);
	      
	      TextView EMAIL = (TextView) findViewById(R.id.email);
	      EMAIL.setText("Email: " + email);
	      
	      if(!pit.equals("")){
	    	  
	    	  TextView PIT = (TextView) findViewById(R.id.orderp);
	      PIT.setText(pit);}
	      
	      if(!stands.equals("")){
	    	  TextView STANDS = (TextView) findViewById(R.id.orders);
	          STANDS.setText(stands);}
	      
	      if(!balcony.equals("")){
	    	  TextView BALCONY = (TextView) findViewById(R.id.orderb);
	          BALCONY.setText(balcony);}
	      
	      TextView TOTAL = (TextView) findViewById(R.id.total);
	      TOTAL.setText(total);
	   
      Button b = (Button) findViewById(R.id.btnClick3);
      b.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
        	 Intent i = new Intent(ticket3.this, Act.class);
	         startActivity(i);
	         finish();
         } 
      });
   }
}