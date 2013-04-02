package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Face2 extends Activity {
	public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      requestWindowFeature(Window.FEATURE_LEFT_ICON);
	      setContentView(R.layout.face2);
		   setFeatureDrawableResource(Window.FEATURE_LEFT_ICON, R.drawable.information);
	      Button b = (Button) findViewById(R.id.Face2);
	      b.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(Face2.this, Act.class);
	         startActivity(i);
	         } 
	      });
	      
	      Button c = (Button) findViewById(R.id.Face1);
	      c.setOnClickListener(new View.OnClickListener() {
	         public void onClick(View arg0) {
	         Intent i = new Intent(Face2.this, ticket1.class);
	         startActivity(i);
	         } 
	      });
	      
	   }

}
