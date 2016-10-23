package com.example.fragment1;







import android.graphics.Color;
import android.hardware.Sensor;
import android.net.Uri;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
  
public class callus extends Activity implements SensorEventListener {  
	 private SensorManager sensorManager;  
     private boolean isColor = false;  
     private long lastUpdate;  
  private  Button sendBtn;
  View view;
    EditText txtphoneNo;
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.c18);  
       view=(View)findViewById(R.id.textView);
        txtphoneNo = (EditText) findViewById(R.id.editText1);
               
        view.setBackgroundColor(Color.RED);
            
	        

	    sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);  
                lastUpdate = System.currentTimeMillis();  
                
                 
              }  
              //overriding two methods of SensorEventListener  
              public void onAccuracyChanged(Sensor sensor, int accuracy) {}  
              public void onSensorChanged(SensorEvent event) {  
                if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {  
                  getAccelerometer(event);  
                }  
          
              }  
          
              private void getAccelerometer(SensorEvent event) {  
                float[] values = event.values;  
                // Movement  
                float x = values[0];  
                float y = values[1];  
                float z = values[2];  
          
                float accelationSquareRoot = (x * x + y * y + z * z)  
                    / (SensorManager.GRAVITY_EARTH * SensorManager.GRAVITY_EARTH);  
                  
                long actualTime = System.currentTimeMillis();  
                  
                if (accelationSquareRoot >4) //it will be executed if you shuffle  
                {  
                    
                  if (actualTime - lastUpdate <100) {  
                    return;  
                  }  
                  lastUpdate = actualTime;//updating lastUpdate for next shuffle  
                	
                  if (isColor) {  
                	  view.setBackgroundColor(Color.RED);
                	    }

              	         
                   
     
                   else { 
                	           	            		   
                	   view.setBackgroundColor(Color.BLUE);
                	   
                	   String number= txtphoneNo.getText().toString();  
                       Intent callIntent = new Intent(Intent.ACTION_CALL);  
                       callIntent.setData(Uri.parse("tel:"+number));  
                       startActivity(callIntent);  
                       }
                	        
                	        

                	       
        	           	            		 
              
                  isColor = !isColor;  
                }  
                
              } 
             
          
              protected void onResume() {  
                super.onResume();  
                // register this class as a listener for the orientation and  
                // accelerometer sensors  
                sensorManager.registerListener(this,sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),  
                                            SensorManager.SENSOR_DELAY_NORMAL);  
              }  
          
              @Override  
              protected void onPause() {  
                // unregister listener  
                super.onPause();  
                sensorManager.unregisterListener(this);  
              }  
            }   
