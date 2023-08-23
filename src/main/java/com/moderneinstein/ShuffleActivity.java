package com.moderneinstein ; 

import android.view.ViewGroup; 
import android.view.View ; 
import android.view.View.OnClickListener ; 
import android.widget.Button ; 
import android.widget.TextView  ; 
import android.app.Service ; 
import android.app.Activity ; 

import android.content.Intent ;
import android.graphics.drawable.Drawable.Callback;
import android.content.Context ;
import android.os.Bundle ;
import android.os.Handler ; 
import android.view.LayoutInflater ; 
import android.widget.LinearLayout ;  

import android.widget.EditText ; 
import android.R.id ; 
import android.R.layout ;
import android.R.anim ; 
//import android.R.styleable ;


import java.util.Vector  ; 
import java.util.ArrayList ; 
import java.util.List ;
import java.util.Set ; 
import java.util.LinkedList  ;


	//public static Strin
	/**
	 * 	public  LinearLayout  center ; 
	public ViewGroup  groups ; 
	public static int rootId = R.id.activity_shuffle_root ; 
	public static int groupId = R.id.Text_Buffer_2  ; 
		public Button swaps  ;
//	public static int[] textViews  = new int[]{R.id.,R.id.,R.id.,}  ; 
	 */
public class ShuffleActivity extends Activity {

	public LayoutInflater inflater ;
	public static int viewId[] = {R.id.activity_shuffle_1_1_1,R.id.activity_shuffle_1_1_2,R.id.activity_shuffle_1_3_1,R.id.activity_shuffle_1_4_1,R.id_activity_shuffle_1_4_2,
	R.id.text_value_1,R.id.text_text_value_2,R.id.text_value_3,R.id.text_value_4,R.id.text_value_5}  ;
	public  int[] containId  ={R.id.activity_shuffle_1,R.id.activity_shuffle_1_1,R.id.activity_shuffle_1_2,R.id.activity_shuffle_1_3,R.id.activity_shuffle_1_4} ;
	public  View[]  icons ; 
	public   ViewGroup containers[] ;
	public Context context ; 
	public RandomStream stream ; 
	public static int limits = 5 ;
	public static int[][]  customs = new int[][]{} ;
	public Vector<TextView>  fields  ; 
	public static String[] keys  = {"Element Count ","Element Values"}  ;
	public   String[]  buffer ; 
	public  static int rootId = R.layout.activity_shuffle ; 
	@Override
	public void onCreate(Bundle SavedInstanceState){
		super.onCreate(SavedInstanceState) ;
		setContentView(rootId) ;
		inflater =  getLayoutInflater() ;
		context = getApplicationContext( ) ; 
		stream = new RandomStream() ;
		derive() ;	

		}
	public void derive(){
		emplace() ;
		List<View> views = new ArrayList<View>() ; 
		containers[0] =  (ViewGroup)findViewById(containId[0]) ; 
		containers[1] = (ViewGroup)findViewById(containId[1]) ; 
		Utility.retrieveViews((ViewGroup)containers[0],views,true) ; 
		fields = new Vector<TextView>() ; 
		buffer =new String[views.size()] ; 
		for(int rf=0;rf<views.size();rf++){
			View current = views.get(rf) ; 
			fields.addElement((TextView)current) ;
			buffer[rf] = ((TextView)current).getText().toString()  ;
		}
		}
		//buffer[rf] = ((TextView)current)
		//.getText().toString()  ;
			//buffer =new String[views.size()] ; 
	public void emplace(){
		int spread = viewId.length ; 
		 icons = new View[viewId.length] ;
		for(int ds=0;ds<spread;ds++){
			icons[ds] = findViewById(viewId[ds]) ; }
		int reach =  containId.length ; 
		containers = new ViewGroup[reach] ; 
		for(int re=reach-1;re>=0;re--){
			 containers[re]  = (ViewGroup)findViewById(containId[re]) ;
		}
	listeners() ; 
}
	public void listeners(){
		View.OnClickListener view4 = new View.OnClickListener(){
			@Override 
			public void onClick(View greet){
				Intent intent3 = new Intent(context,HelloAndroidActivity.class) ; 
				startActivity(intent3) ; 
			}
		} ;
		View.OnClickListener view5 = new View.OnClickListener(){
			 @Override 
			public void onClick(View allow){
				Intent intent2 = new Intent(context,InsertActivity.class) ;
				startActivity(intent2) ;
			}
		} ;
		icons[3].setOnClickListener(new View.OnClickListener(){
			@Override 
			public void onClick(View option){
				List<int[]> derived =  RandomStream.generateD(0,fields.size(),limits)   ;
				 shuffle(derived,InsertActivity.SWAP_DELAY) ;
			}
	   }  )   ; 
	   icons[4].setOnClickListener(new View.OnClickListener(){
			@Override 
			public void onClick(View reach){
					shift () ; 
			}
	   })  ;
	   icons[1].setOnClickListener(view5) ;
	   icons[0].setOnClickListener(view4) ; 
	}
	public void shift(){
		CharSequence source = ((EditText)icons[2]).getText()  ;
		String value = source.toString() ; 
	   String[] buffer = value.split(InsertActivity.REMOVE_TEXT) ; 
	   int[] amaze = new int[]{Integer.parseInt(buffer[0]),Integer.parseInt(buffer[1]) }  ; 
		List<int[]> recent = new LinkedList<int[]>() ;
		recent.add(amaze) ; 
		shuffle(recent,InsertActivity.SWAP_DELAY) ; 
	   
	}
	public void shuffle(List<int[]> derived,long detain){
		int  draft =  fields.size() ; 
		long stated = System.currentTimeMillis() ;

		for(int fr=0;fr<limits;fr++){
			 while(System.currentTimeMillis()-stated<detain){  }
			 stated = System.currentTimeMillis ( )  ;
			int[] chunk = derived.get(fr)  ;
			String  stored =   fields.get(chunk[1]).getText().toString() ; 
			String  gears = fields.get(chunk[0]).getText().toString() ; 
			fields.get(chunk[1]).setText(gears) ; 
			fields.get(chunk[0]).setText(stored) ; 
		} 
		}
	//	 String[] buffer = new String[textViews.length] ;
	//	List<int[]> derived =  RandomStream.generateD(draft,limits,2)   ;
	//Bundle OutState ;  
	@Override
	public void onSaveInstanceState(Bundle stated){
		super.onSaveInstanceState(stated ) ; 
		stated.putInt(keys[0],fields.size() ) ;
		stated.putStringArray(keys[1],buffer ) ; 
		}
		public void customise(){
			int allow =  customs.length ; 
			for(int fc=0;fc<allow;fc++){
				int[] parts = customs[fc] ; 
				ViewGroup frame = (ViewGroup)findViewById(parts[1]) ;
				inflater.inflate(parts[0],frame) ; 
			}
		}
	}
	
  /*
		for(int de=0;de<views.size();de++ ){
			int check = textViews[de] ; 
			 View current = (View)requireViewById(check) ; 
			views.addElement(current) ; 
			buffer[de] = current.getText().toString()  ; 
		}
	}	
	*/