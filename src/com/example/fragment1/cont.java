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
import android.widget.Toast;  
  
 public class cont extends Fragment {  
	EditText editTextFileName,editTextFileName1,editTextData1,editTextData2,editTextData4,editTextData5,editTextData6,editTextData7,editTextData8,editTextData9,editTextData10,editTextData11,editTextData12,editTextData13,editTextData14,editTextData15,editTextData16,editTextData17,editTextData18,editTextData19,editTextData20,editTextData21,editTextData22,editTextData23,editTextData24,editTextData25,editTextData26,editTextData27,editTextData28,editTextData29,editTextData30,editTextData31,editTextData32,editTextData33,editTextData34,editTextData35;  
    Button saveButton; 
 @Override  
 public View onCreateView(LayoutInflater inflater, ViewGroup container,
 		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View v= inflater.inflate(R.layout.c5, container,false);
	 		
        
	editTextFileName=(EditText)v.findViewById(R.id.edittext);
	editTextFileName1=(EditText)v.findViewById(R.id.password);
        editTextData1=(EditText)v.findViewById(R.id.editText1); 
        editTextData2=(EditText)v.findViewById(R.id.editText2);
        editTextData4=(EditText)v.findViewById(R.id.editText4);
        editTextData5=(EditText)v.findViewById(R.id.editText5);
        editTextData6=(EditText)v.findViewById(R.id.editText6);
        editTextData7=(EditText)v.findViewById(R.id.editText7);
        editTextData8=(EditText)v.findViewById(R.id.editText8);
        editTextData9=(EditText)v.findViewById(R.id.editText9);
        editTextData10=(EditText)v.findViewById(R.id.editText10);
        editTextData11=(EditText)v.findViewById(R.id.editText11);
        editTextData12=(EditText)v.findViewById(R.id.editText12);
        editTextData13=(EditText)v.findViewById(R.id.editText13);
        editTextData14=(EditText)v.findViewById(R.id.editText14);
        editTextData15=(EditText)v.findViewById(R.id.editText15);
        editTextData16=(EditText)v.findViewById(R.id.editText16);
        editTextData17=(EditText)v.findViewById(R.id.editText17);
        editTextData18=(EditText)v.findViewById(R.id.editText18);
        editTextData19=(EditText)v.findViewById(R.id.editText19);
        editTextData20=(EditText)v.findViewById(R.id.editText20);
        editTextData21=(EditText)v.findViewById(R.id.editText21);
        editTextData22=(EditText)v.findViewById(R.id.editText22);
        editTextData23=(EditText)v.findViewById(R.id.editText23);
        editTextData24=(EditText)v.findViewById(R.id.editText24);
        editTextData25=(EditText)v.findViewById(R.id.editText25);
        editTextData26=(EditText)v.findViewById(R.id.editText26);
        editTextData27=(EditText)v.findViewById(R.id.editText27);
        editTextData28=(EditText)v.findViewById(R.id.editText28);
        editTextData29=(EditText)v.findViewById(R.id.editText29);
        editTextData30=(EditText)v.findViewById(R.id.editText30);
        editTextData31=(EditText)v.findViewById(R.id.editText31);
        editTextData32=(EditText)v.findViewById(R.id.editText32);
        editTextData33=(EditText)v.findViewById(R.id.editText33);
        editTextData34=(EditText)v.findViewById(R.id.editText34);
        editTextData35=(EditText)v.findViewById(R.id.editText35);
   
        saveButton=(Button)v.findViewById(R.id.button1);  
       
        saveButton.setOnClickListener(new OnClickListener(){  

   
              public void onClick(View arg0) {  
              
           	String   filename=editTextFileName.getText().toString();  
            filename=editTextFileName1.getText().toString();
                  String data1=editTextData1.getText().toString();  
                  String data2=editTextData2.getText().toString();  
                  String data4=editTextData4.getText().toString();       
                  String data5=editTextData5.getText().toString();  
                  String data6=editTextData6.getText().toString();  
                  String data7=editTextData7.getText().toString();  
                  String data8=editTextData8.getText().toString();       
                  String data9=editTextData9.getText().toString();
                  String data10=editTextData10.getText().toString();  
                  String data11=editTextData11.getText().toString();  
                  String data12=editTextData12.getText().toString();       
                  String data13=editTextData13.getText().toString();
                  String data14=editTextData14.getText().toString();  
                  String data15=editTextData15.getText().toString();  
                  String data16=editTextData16.getText().toString();       
                  String data17=editTextData17.getText().toString();
                  String data18=editTextData18.getText().toString();  
                  String data19=editTextData19.getText().toString();  
                  String data20=editTextData20.getText().toString();       
                  String data21=editTextData21.getText().toString();
                  String data22=editTextData22.getText().toString();  
                  String data23=editTextData23.getText().toString();  
                  String data24=editTextData24.getText().toString();       
                  String data25=editTextData25.getText().toString();
                  String data26=editTextData26.getText().toString();  
                  String data27=editTextData27.getText().toString();  
                  String data28=editTextData28.getText().toString();       
                  String data29=editTextData29.getText().toString();
                  String data30=editTextData30.getText().toString();  
                  String data31=editTextData31.getText().toString();  
                  String data32=editTextData32.getText().toString();       
                  String data33=editTextData33.getText().toString();
                  String data34=editTextData34.getText().toString();       
                  String data35=editTextData35.getText().toString();
  
                  
                  
           
                FileOutputStream fos;  
                   try {  
                       File myFile = new File("/sdcard/"+filename);  
                        myFile.createNewFile();  
                        FileOutputStream fOut = new   
  
FileOutputStream(myFile);  
                        OutputStreamWriter myOutWriter = new   
  
OutputStreamWriter(fOut);  
  myOutWriter.append(data1);
                        
                        myOutWriter.append(data2);
                                              myOutWriter.append(data4);
                        myOutWriter.append(data5);  
                        myOutWriter.append(data6);
                        myOutWriter.append(data7);
                        myOutWriter.append(data8);
                        myOutWriter.append(data9); 
                        myOutWriter.append(data10);
                        myOutWriter.append(data11);
                        myOutWriter.append(data12);
                        myOutWriter.append(data13);  
                        myOutWriter.append(data14);
                        myOutWriter.append(data15); 
                        myOutWriter.append(data16); 
                        myOutWriter.append(data17); 
                        myOutWriter.append(data18); 
                        myOutWriter.append(data19); 
                        myOutWriter.append(data20); 
                        myOutWriter.append(data21); 
                        myOutWriter.append(data22);
                        myOutWriter.append(data23);
                        myOutWriter.append(data24);  
                        myOutWriter.append(data25);
                        myOutWriter.append(data26);
                        myOutWriter.append(data27);
                        myOutWriter.append(data28);
                        myOutWriter.append(data29);
                        myOutWriter.append(data30);
                        myOutWriter.append(data31);
                        myOutWriter.append(data32);
                        myOutWriter.append(data33);
                        myOutWriter.append(data34);
                        myOutWriter.append(data35);  
                        myOutWriter.close();
                        fOut.close();  
                     
                      
                     
                   } catch (FileNotFoundException e) {e.printStackTrace();}  
                   catch (IOException e) {e.printStackTrace();}  
                  
            }  
              
        });  
  	return v;
              }
    
      
  
 }
  
    
