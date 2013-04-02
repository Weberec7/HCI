package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class directions1 extends Activity 
{
	public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.directions1);
	      Button b = (Button) findViewById(R.id.btnClick);
	      b.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(directions1.this, Act.class);
	         startActivity(i);
	         finish();
	         } 
	      });
	   }
}
