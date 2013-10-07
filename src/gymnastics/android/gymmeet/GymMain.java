package gymnastics.android.gymmeet;


import java.util.concurrent.atomic.AtomicInteger;

import android.app.Activity;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.view.Window;
import android.view.WindowManager;
import android.content.Context;
import android.view.View;

public class GymMain extends Activity {
	//ConnectedApp connected = new ConnectedApp(this);
	WakeLock wakeLock;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	//this here makes screen stay on
        PowerManager powerManager = (PowerManager) getSystemService(Context.POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.FULL_WAKE_LOCK, "wakelock");
    	
    	//this sets the layout (check under the res folder)
    	setContentView(R.layout.layout);
        
        //get info from php file
        //make a toast
    	AtomicInteger nun;
    	
    }
    
   
    
  
    
    

}
