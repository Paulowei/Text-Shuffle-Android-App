package com.WithHold;
import android.os.Parcelable ; 
import android.os.Bundle ; 
import android.os.Handler  ; 
import android.app.Service ; 
import android.app.Activity  ; 
import android.widget.TextView ; 
import android.widget.Button ; 
import android.view.ViewGroup ; 
import android.view.View ; 
import android.widget.LinearLayout;
import android.content.Intent ; 


public class SortingActivity extends Activity  {
    

    public static int[] buttonId  = {} ; 
    public static int[]  viewId = {} ; 
    public static int  layoutId =  R.layout.activity_sort  ; 
    public static LinearLayout rootView ;  
    public  LinearLayout sortPane ; 
    public  LinearLayout topBar ; 
    public  LinearLayout midBar  ; 
    public Intent service ; 
    public Intent travel ;
    public static  Button[] buttons ; 
    @Override
    public void onCreate(Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState) ; 
        setContentView(layoutId)  ;
        restate( ) ; 
    }

    public void restate(){
            rootView = (LinearLayout)findViewById(layoutId) ;
            sortPane = (LinearLayout)findViewById(viewId[0]) ; 
            topBar  = (LinearLayout)findViewById(viewId[1]) ; 
            midBar = (LinearLayout)findViewById(viewId[2])  ;
            stateButtons() ; 
    }
    public void  stateButtons(){
         int height = buttonId.length  ; 
         buttons = new Button[height] ; 
         for(int gc=0;gc<height;gc++){
            Button current =  (Button)findViewById(buttonId[gc]) ; 
            buttons[gc] = current  ;
         }
         configureButtons() ;
        
    }
    public void configureButtons(){
        buttons[4].setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View view){
                    advance() ;  }     }    ) ;
        buttons[3].setOnClickListener(
            new View.OnClickListener(){
            @Override 
            public void onClick(View view){
                revert()  ;
            }} 
        ) ;
            
    }
    public void 
    public void advance(){

    }
    public void revert(){

    }
    @Override
    public void onSaveInstanceState(Bundle outer){
        super.onSaveInstanceState(outer ) ; 
        
    }
}
