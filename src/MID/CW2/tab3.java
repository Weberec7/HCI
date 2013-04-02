package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class tab3 extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView i = new ImageView(this);
        i.setImageResource(R.drawable.fb_declined);
        
        TextView textview = new TextView(this);
        textview.setText("This is the Third tab");
        setContentView(i);
    }

}
