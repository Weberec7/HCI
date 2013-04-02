package MID.CW2;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class textview2 extends TextView {

	
	
	public textview2(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public textview2(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public textview2(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onFocusChanged(boolean focused, int direction, Rect previouslyFocusedRect) {
	    if(focused)
	        super.onFocusChanged(focused, direction, previouslyFocusedRect);
	}

	@Override
	public void onWindowFocusChanged(boolean focused) {
	    if(focused)
	        super.onWindowFocusChanged(focused);
	}


	@Override
	public boolean isFocused() {
	    return true;
	}

}
