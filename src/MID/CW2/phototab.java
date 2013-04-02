package MID.CW2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class phototab extends Activity {
	
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ImageView i = new ImageView(this);
        i.setImageResource(R.drawable.phototab);
        
        TextView textview = new TextView(this);
        textview.setText("This is the Photo tab");
        setContentView(i);
    }

}
