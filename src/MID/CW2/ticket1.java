package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ticket1 extends Activity 
{
	
	public String gettext (EditText ET) {
		
		
		return null;
  	  
    }
	public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.ticket1);
 	   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.ticket1);
 	   
 	  final EditText name = (EditText) findViewById(R.id.name);
 	  
 	 final EditText email = (EditText) findViewById(R.id.email);
 	 final EditText pit = (EditText) findViewById(R.id.pit);
 	final EditText stands = (EditText) findViewById(R.id.stands);
 	final EditText balcony = (EditText) findViewById(R.id.balcony);
 	 
 	 
 	  
	      Button b = (Button) findViewById(R.id.review_purchase);
	      b.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(ticket1.this, ticket2.class);
	         
	         if(!name.getText().toString().equals("") || !email.getText().toString().equals("")){
	         
	         
	         i.putExtra( "name", name.getText().toString() );
	         i.putExtra("email", email.getText().toString());
	         i.putExtra("pit", pit.getText().toString());
	         i.putExtra("stands", stands.getText().toString());
	         i.putExtra("balcony", balcony.getText().toString());
	         startActivity(i);
	         }
	         else if(name.getText().toString().equals("") && email.getText().toString().equals("")){
	        	 Toast.makeText(ticket1.this, "Please type in your name and email", Toast.LENGTH_LONG).show(); 
	         }
	         else if(name.getText().toString().equals("")){
	        	 Toast.makeText(ticket1.this, "Please type in your name", Toast.LENGTH_LONG).show(); 
	         }
	         else if(email.getText().toString().equals("")){
	        	 Toast.makeText(ticket1.this, "Please type in your email", Toast.LENGTH_LONG).show(); 
	         }
	         else{
	        	 i.putExtra( "name", name.getText().toString() );
		         i.putExtra("email", email.getText().toString());
		         i.putExtra("pit", pit.getText().toString());
		         i.putExtra("stands", stands.getText().toString());
		         i.putExtra("balcony", balcony.getText().toString());
		         startActivity(i);
	        	 
	         }
	         
	         
	         
	         }
	      });
	      
	      Button cancel = (Button) findViewById(R.id.cancel);
	      cancel.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	        	 Intent i = new Intent(ticket1.this, Face2.class);
		         startActivity(i);
		         finish();
	         } 
	      });
	      
	      
	   }
}
