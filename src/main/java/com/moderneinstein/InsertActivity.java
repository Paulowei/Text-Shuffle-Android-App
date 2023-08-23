package com.moderneinstein;

import android.widget.Button ; 
import android.view.ViewGroup ; 
import android.os.Bundle ; 
import android.os.Handler ; 
import android.widget.TextView ; 
import android.widget.LinearLayout ; 


import java.util.Vector ; 
import java.util.Arrays ; 
import java.util.ArrayList ; 
import java.lang.reflect.Array ; 
import java.util.Set ; 
import java.util.List  ; 
import java.util.LinkedList ; 
import android.content.Context ;


import android.widget.EditText ; 
import android.view.View ; 
import android.app.Service ;
import android.app.Activity ; 
import android.content.SharedPreferences ; 
import android.content.Intent ; 
import android.R.layout ; 
import android.R.id ;

public class InsertActivity extends Activity {
    
    public SharedPreferences preferences ; 
    public static int rootId   =  R.layout.view_insert;     
    public  int containId[]= {R.id.activity_insert_1,R.id.activity_insert_1_1,R.id.activity_insert_1_2,R.id.activity_insert_1_3,R.id.activity_insert_1_4} ; 
  //  public static int  buttonId[] = {} ; 
    public static int[]  viewId = {R.id.activity_insert_1_1_1,R.id.activity_insert_1_1_2,R.id.activity_insert_1_3_1,R.id.activity_insert_1_3_2,R.id.activity_insert_1_4_1,
    R.id.activity_insert_1_4_2 , R.id.activity_insert_1_4_3 }  ;
    public static int[][] customs = new int[][]{{},{}} ; k
    public List<ViewGroup> containers ; 
     public  LinkedList<String> texts ; 
    public  ArrayList<CustomView1> views ;  
    public static long SWAP_DELAY = 1500 ;
    public static String  REMOVE_TEXT = " "  ;
    public Context general ; 
    public static Class<?> classes[] =new Class<?>[]{InsertActivity.class,ShuffleActivity.class,HelloAndroidActivity.class}  ;
    /**
     *    public static ViewGroup parent ; 
    public static ViewGroup container ;
        public EditText insertText ;
    public EditText removeText 
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ; 
        setContentView(rootId) ; 
        general = this.getApplicationContext( ); 
        preferences= getPreferences(MODE_WORLD_WRITEABLE) ;
        calibrate() ; 
    }

    public void calibrate(){
        icons = new ArrayList<View>() ; 
      //  parent = (ViewGroup)findViewById(rootId) ;
      //  container = (ViewGroup)findViewById(containId[0]) ;
       // insertText = (EditText)findViewById(viewId[0])  ;
       // removeText = (EditText)findViewById(viewId[1]) ; 
        orient() ;
        insertViews(containers.get(0)) ;
    }

    public void orient(){
        int  crest = viewId.length ; 
        View temps = new Button (this.getApplicationContext());
        for(int vs=0;vs<crest;vs++){ 
            temps = (View)findViewById(viewId[vs]) ;
            icons.add(temps) ;
        }
        int frames = containId.length ; 
        ViewGroup holder ; 
        for(int fc=frames-1;fc>=0;fc--){
             holder =  (ViewGroup)findViewById(containId[fc]) ;  
            containers.add(holder) ;
        }
        listeners() ; 
    }
    public void listeners(){
            icons.get(5).setOnClickListener(
                new View.OnClickListener(){
                    @Override 
                    public void onClick(View stated){ 
                        String noted = ((EditText)icons.get(3)).getText().toString() ; 
                        noted = noted.trim() ;
                        String[] both = noted.split(REMOVE_TEXT) ;  
                        int[] buffer = new int[]{Integer.parseInt(both[1]),Integer.parseInt(both[0])} ;
                        List<int[]>  changes = List.of(buffer) ; 
                        retrace(changes,SWAP_DELAY) ;
                           }    }     ) ;
            icons.get(4).setOnClickListener(
                new View.OnClickListener(){
                    @Override 
                    public void onClick(View  branch){
                        String allowed =  ((EditText) icons.get(2)).getText().toString() ; 
                        CustomView1 custom  = new CustomView1(general, allowed )  ;
                        containers.get(0).addView(custom) ;    }    }   )  ;
            icons.get(1).setOnClickListener(
                new View.OnClickListener(){
                    @Override 
                    public void onClick(View stated){
                        Intent intent = new Intent(getApplicationContext(),classes[2]) ; 
                        startActivity(intent) ;   }   }   )  ;
            icons.get(0).setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View state ){
                        Intent  noted = new Intent(general,classes[1]) ;
                        startActivity(noted) ;     }   }   )  ;
            View.OnClickListener click3 = new View.OnClickListener(){
                @Override 
                public void onClick(View great){
                    CustomView1 noted = views.get(0) ; 
                    containers.get(2).removeViewAt(0) ;
                    views.remove(0) ; 
                    containers.get(2).requestLayout() ; 
                }
            } ;
    }
    public void restate(List<int[]> traces){
        int grace = traces.size() ; 
        for(int fr=grace;fr>=0;fr--){
            int[] chunk = traces.get(fr) ;
            TextView north = views.get(chunk[1]) ; 
            TextView south = views.get(chunk[0]) ; 
            String held = north.getText().toString();
            north.setText(south.getText()) ; 
            south.setText(held) ;
        }
    }
    public void  retrace(List<int[]> frames,long delay){
        int cases =frames.size() ; 
        long initial = System.currentTimeMillis() ; 
        for(int re=0 ;re<cases;re++){
            while(System.currentTimeMillis()-initial<delay){} ; 
             int[] parts = frames.get(re)  ; 
            TextView above = views.get(parts[1]) ; 
            TextView below = views.get(parts[0]) ; 
            String saved =  (String)below.getText() ; 
            below.setText (above.getText()) ; 
            above.setText(saved) ;
        }
    }
    public void insertViews(ViewGroup refer ){
        int width = texts.size( ) ; 
        TextView temps ; 
        for(int rs=width-1;rs>=0;rs--){
            String current = texts.get(rs) ;
            CustomView1 drawn = new CustomView1(general,current,false) ; 
            drawn.setText(current) ;
            views.add(drawn) ;
            refer.addView(drawn) ; 
        }
       // restate(swaps ) ; 
    }
    public  void customise(){
        int length =  customs.length ; 
        for(int fr=0;fr<length;fr++){
            int[] packet = customs[fr] ; 
            ViewGroup  above =  (ViewGroup)findViewById(packet[1]) ;
            getLayoutInflater().inflate(packet[0],above) ;
        }
    }
    /*
     * 
     *   public void  combine(){
        insertText.setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View lines){
                    lines.requestFocus() ; 
                    String value = insertText.getText().toString() ; 
                    insertText(value) ; 
                }
            }
        )  ;
        */
        /* 
        removeText.setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View crest){
                    String taken = removeText.getText().toString() ; 
                    String[] buffer = taken.split(REMOVE_TEXT) ;
                    Integer valid= Integer.parseInt(taken) ;
                  //  removeText(valid)  ;
                }   
            }
        )  ;
    }
    void insertText(String value){
         
    }
     */
    /*
     *  int laces =  texts.size() ; 
                        List<int[]> swaps = RandomStream.generateD(0,laces,laces) ;  
                        retrace(swaps,SWAP_DELAY) ;
     */
}

