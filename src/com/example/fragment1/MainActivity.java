
package com.example.fragment1;


import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	ImageButton b1,b2,b3,b4,b6;
	Button b5;
	  final static int INTERVAL = 500; // 1 second
	    private static View myView = null;
	    boolean whichColor = true;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		b1=(ImageButton)findViewById(R.id.imageButton1);
		b2=(ImageButton)findViewById(R.id.imageButton2);
		b3=(ImageButton)findViewById(R.id.imageButton3);
		b4=(ImageButton)findViewById(R.id.imageButton4);
		b6=(ImageButton)findViewById(R.id.imageButton6);
		
		b5=(Button)findViewById(R.id.button5);
		myView = (View) findViewById(R.id.bb);
		 myView.setBackgroundResource( R.drawable.sk1);
        new Thread(new Runnable() {	
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(INTERVAL);
                    } 
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    updateColor();
                    whichColor = !whichColor;
                }
            }
        }).start();
    }

    private void updateColor() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (whichColor){ 
                	 myView.setBackgroundResource( R.drawable.sk1);
                }
                else{ 
                	 myView.setBackgroundResource( R.drawable.ccxx);
                  
                    
                }
               
                
                	
            }
        });
    
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				course f1= new course();
				FragmentManager fm=getFragmentManager();
				FragmentTransaction ft=fm.beginTransaction();
				ft.add(R.id.india1,f1);
				ft.addToBackStack("ff1");
				ft.commit();
				// TODO Auto-generated method stub
		
			}
		});
		
b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				about f2= new about();
				FragmentManager fm=getFragmentManager();
				FragmentTransaction ft=fm.beginTransaction();
				ft.add(R.id.india1,f2);
				ft.addToBackStack("ff2");
				ft.commit();
				// TODO Auto-generated method stub
			
		
			}	
			
		});
b4.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		login f1= new login();
		FragmentManager fm=getFragmentManager();
		FragmentTransaction ft=fm.beginTransaction();
		ft.add(R.id.india1,f1);
		ft.addToBackStack("ff3");
		ft.commit();
		// TODO Auto-generated method stub
			}
});
		

b1.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		home f1= new home();
		FragmentManager fm=getFragmentManager();
		FragmentTransaction ft=fm.beginTransaction();
		ft.add(R.id.india1,f1);
		ft.addToBackStack("ff1");
		ft.commit();
		// TODO Auto-generated method stub
		
	}
});

	
    b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			cont f1= new cont();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f1);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
	
    
	b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent i=new Intent(MainActivity.this,callus.class);
			startActivity(i);
	}
	});

    
}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
