package MID.CW2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

public class ratingpopup extends Activity {
	
	public void onCreate(Bundle savedInstanceState)
	   {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.ratingpopup);
	      final PopupWindow pw;
	
	// get the instance of the LayoutInflater
    LayoutInflater inflater = (LayoutInflater) ratingpopup.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    // inflate our view from the corresponding XML file
    View layout = inflater.inflate(R.layout.rate1, (ViewGroup)findViewById(R.id.popup_menu_root));
    // create a 100px width and 200px height popup window
    pw = new PopupWindow(layout, 100, 200, true);
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
            Toast.makeText(ratingpopup.this, "Your Rating has been Submitted..", Toast.LENGTH_LONG).show();
        }
    });
//    Button button3 = (Button)layout.findViewById(R.id.popup_menu_button3);
//    button3.setOnClickListener(new OnClickListener() {
//        public void onClick(View vv) {
//            finish();
//        }
//    });
    // finally show the popup in the center of the window
    pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
}
}




