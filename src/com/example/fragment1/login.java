package com.example.fragment1;


import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.FileOutputStream;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.OutputStreamWriter;  





  
import android.os.Bundle;  
import android.app.Activity;  
import android.app.Fragment;
import android.content.Context;  
import android.view.LayoutInflater;
import android.view.Menu;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.view.ViewGroup;
import android.widget.Button;  
import android.widget.EditText;  
import android.widget.TextView;
import android.widget.Toast;  

public  class login extends Fragment 
{
	EditText editTextFileName,editTextFileName1;
	TextView  t1;
	Button b1;
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
	 		Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View v= inflater.inflate(R.layout.c3, container,false);
		 editTextFileName=(EditText)v.findViewById(R.id.editText1);  
		 editTextFileName1=(EditText)v.findViewById(R.id.editText2); 
	       
	        t1=(TextView)v.findViewById(R.id.textView1);
	b1=(Button)v.findViewById(R.id.button5);
	b1.setOnClickListener(new OnClickListener() {
		
				
			  
				  
		            @Override  
		            public void onClick(View arg0) {  
		            	
						      String filename=editTextFileName.getText().toString(); 
						      filename=editTextFileName1.getText().toString(); 
					                StringBuffer stringBuffer = new StringBuffer();    
					                String aDataRow = "";  
					                String aBuffer = "";
					               
					                try {  
					                    File myFile = new File("/sdcard/"+filename);  
					                    FileInputStream fIn = new FileInputStream(myFile);  
					                    BufferedReader myReader = new BufferedReader(  
					                            new InputStreamReader(fIn));  
					                      
					                    while ((aDataRow = myReader.readLine()) != null) {  
					                        aBuffer += aDataRow + "\n";  
					                    }  
					                    myReader.close();  
					                      
					                } catch (IOException e) {  
					                    e.printStackTrace();  
					                }  
					               t1.setText(aBuffer);
					               				                
					              
					            	
					            }  
		            					              
					        });          
		
		     
	return v;
		}
			
	





}
