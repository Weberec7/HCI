package MID.CW2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ticket2 extends Activity
{
	
	public String balcony1 = "";
    public String stands1= "";
    public String pit1= "";
    
   public void onCreate(Bundle savedInstanceState)
   {
	   
	   
      super.onCreate(savedInstanceState);
      Intent a = getIntent();
      final String name = a.getStringExtra("name");
      final String email = a.getStringExtra("email");
      
      
      String pit = a.getStringExtra("pit");
      String stands = a.getStringExtra("stands");
      String balcony = a.getStringExtra("balcony");
      
      if(pit.equals("")){pit = "0";}
      if(stands.equals("")){stands = "0";}
      if(balcony.equals("")){balcony = "0";}
      
     int p = Integer.parseInt(pit);
     int s = Integer.parseInt(stands);
     int ba = Integer.parseInt(balcony);
     int total = 0;
      
      requestWindowFeature(Window.FEATURE_LEFT_ICON);
      setContentView(R.layout.ticket2);
	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ticket1);
      Button b = (Button) findViewById(R.id.btnClick2);
      
      
      
      TextView NAME = (TextView) findViewById(R.id.name);
      NAME.setText("Name: " + name);
      
      TextView EMAIL = (TextView) findViewById(R.id.email);
      EMAIL.setText("Email: " + email);
      
      if(p!=0){
    	  pit1 = "You ordered " + pit + " pit ticket(s): £ " + Integer.toString(10*p);
    	  TextView PIT = (TextView) findViewById(R.id.orderp);
      PIT.setText(pit1);
      total += 10*p;}
      
      if(s!=0){
    	  TextView STANDS = (TextView) findViewById(R.id.orders);
    	  stands1 = "You ordered " + stands + " stands ticket(s): £ " + Integer.toString(25*s);
          STANDS.setText(stands1);
      total += 25*s;}
      
      if(ba!=0){
    	  balcony1 = "You ordered " + balcony + " pit ticket(s): £ " + Integer.toString(35*ba);
    	  TextView BALCONY = (TextView) findViewById(R.id.orderb);
          BALCONY.setText(balcony1);
      total += 35*ba;}
      
      TextView TOTAL = (TextView) findViewById(R.id.total);
      final String total1 = "Your Total: £ " + total;
      TOTAL.setText(total1);
      
      
      b.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
        	 Toast.makeText(ticket2.this, "A Copy of the Receipt has been sent to your EMail.", Toast.LENGTH_LONG).show();
        	 Intent i = new Intent(ticket2.this, ticket3.class);
        	 
        	 i.putExtra( "name", name);
	         i.putExtra("email", email);
	         i.putExtra("pit1", pit1);
	         i.putExtra("stands1", stands1);
	         i.putExtra("balcony1", balcony1);
	         i.putExtra("total1", total1);
	         startActivity(i);
	        
	         finish();
         } 
      });
      
      Button cancel = (Button) findViewById(R.id.btnClick1);
      cancel.setOnClickListener(new View.OnClickListener() {
         public void onClick(View arg0) {
        	 Intent i = new Intent(ticket2.this, Act.class);
	         startActivity(i);
	         finish();
         } 
      });
      
   }
}