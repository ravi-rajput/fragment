package com.example.fragment1;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class course extends Fragment
{
	ImageButton imageButton1,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6,imageButton7,imageButton8,imageButton9,imageButton10,imageButton11,imageButton12;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View v= inflater.inflate(R.layout.c1, container,false);
	
imageButton1 = (ImageButton) v.findViewById(R.id.imageButton1);

 imageButton1.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			css f2= new css();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});

 imageButton2 = (ImageButton) v.findViewById(R.id.imageButton2);

 imageButton2.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			html f2= new html();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton3 = (ImageButton) v.findViewById(R.id.imageButton3);

 imageButton3.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			javascrpt f2= new javascrpt();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton4 = (ImageButton) v.findViewById(R.id.imageButton4);

 imageButton4.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			cpp f2= new cpp();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton5 = (ImageButton) v.findViewById(R.id.imageButton5);

 imageButton5.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			sql f2= new sql();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton6 = (ImageButton) v.findViewById(R.id.imageButton6);

 imageButton6.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			unix f2= new unix();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton7 = (ImageButton) v.findViewById(R.id.imageButton7);

 imageButton7.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			ios f2= new ios();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
	

 imageButton8 = (ImageButton) v.findViewById(R.id.imageButton8);

 imageButton8.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			java f2= new java();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
	

 imageButton9 = (ImageButton) v.findViewById(R.id.imageButton9);

 imageButton9.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			perl f2= new perl();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton10 = (ImageButton) v.findViewById(R.id.imageButton10);

 imageButton10.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			python f2= new python();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton11 = (ImageButton) v.findViewById(R.id.imageButton11);

 imageButton11.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			ruby f1= new ruby();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f1);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});
 imageButton12 = (ImageButton) v.findViewById(R.id.imageButton12);

 imageButton12.setOnClickListener(new OnClickListener() {
			
		@Override
		public void onClick(View arg0) {

			svn f2= new svn();
			FragmentManager fm=getFragmentManager();
			FragmentTransaction ft=fm.beginTransaction();
			ft.add(R.id.india1,f2);
			ft.addToBackStack("ff1");
			ft.commit();
			// TODO Auto-generated method stub
			
		}
	});


	return v;
}
}
