package com.WithHold;


import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.os.Handler;
import android.app.Service;
import android.content.Intent;
//import android.content.
import android.app.Activity;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;


import java.util.LinkedList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Random ;

import android.widget.ImageView;
//import android.graphics.drawable.Icon ;
import android.graphics.Bitmap;
import android.R.layout ; 
import android.R.id ; 


public class SpawnActivity extends Activity {

    public LinearLayout layout;
    public ViewGroup central;
    public ViewGroup container;

    public static int layoutId = R.id.activity_spawn_container_1;
    public static int containId = R.id.activity_spawn_container_1_2;
    public static int centralId = R.id.activity_spawn_container_1_1;
    public  Button[] buttons ; 
    public static int[] buttonId = {}   ;
    public static int feedId = R.id.layout_template_1_container_1;
    public  LinkedList<ImageView> listed;
    public  Vector<Bitmap> colours ; 
    public static Random random ; 
    // public static ArrayList<Icon> images ;
    public static LayoutInflater inflate;
    public static long  SWAP_TIME = Long.valueOf(5000);
    public static int COLOUR_BOUND = 256;
    public static int IMAGE_HEIGHT = 50 ; 
    public static int IMAGE_WIDTH =  50 ; 
    public static int  ID_RANGE =  1000 ; 
    public static int LIMIT = 6 ;
    // public

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spawn);
        random = new Random(System.currentTimeMillis()) ;
        configure();
        restate();
    }

    public void configure() {
        central = (ViewGroup) findViewById(layoutId);
        container = (ViewGroup) findViewById(containId);
        layout = (LinearLayout) findViewById(centralId);
        inflate = getLayoutInflater();
        int width = buttonId.length ; 
        buttons = new Button[width] ;
        for(int rs=0;rs<width;rs++){
        buttons[rs] = (android.widget.Button) findViewById(buttonId[rs]); 
        }
        restate() ; 
       // button2 = (android.widget.Button) findViewById(button2Id);
        // images = new ArrayList<Icon>() ;

    }

    public void spawn() {
        RelativeLayout template = (RelativeLayout) (findViewById(feedId));
        listed = new LinkedList<ImageView>();
        // Utility.retrieveHeight(template,1,listed) ;
        int breadth = LIMIT   ;
        for (int rs = breadth - 1; rs >= 0; rs--) {
            ImageView stated = new ImageView(this);
            stated.setVisibility(View.VISIBLE);
            List<int[]> stores = RandomStream.generateN(0,COLOUR_BOUND,3,1) ; 
            Bitmap taken = BitmapSource.create(IMAGE_HEIGHT,IMAGE_WIDTH,stores.get(0))  ;
            stated.setImageBitmap(taken) ;
             stated.setId(random.nextInt(0,ID_RANGE) ) ; 
            colours.add(taken) ; 
            listed.add(stated);
            central.addView(stated);
            central.forceLayout() ; 
        }
        //emplace();
    }

    // ImageView stated = listed.get(rs) ;
    public void emplace(List<int[]> swaps){
            //Will implement 
            int range = listed.size() ; 
           //List<int[]> swaps = RandomStream.generateN(0,range,2,range ) ;
            long begin = System.currentTimeMillis() ;
            for(int cd=0;cd<range;cd++){
             //   Thread.sleep(SWAP_TIME)  ;
            while(System.currentTimeMillis()-begin<SWAP_TIME){
                //WAIT_TIME // Execute a process on this thread or a separate thread ; 
            }
            begin = System.currentTimeMillis() ;
                int[] current =  swaps.get(cd) ; 
                Bitmap temp4 = colours.get(current[1]) ;
                Bitmap temp2 = colours.get(current[0]) ;  
                listed.get(current[1]).setImageBitmap(temp4) ;
                listed.get(current[0]).setImageBitmap(temp2) ; 
              }
    }

    public void remove() {
        int depth = listed.size();
        for (int ds = 0; ds < depth; ds++) {
            int mains = listed.size();
            // listed.remove(mains-1) ;
            View current = listed.get(mains - 1);
            central.removeView(current);
            listed.removeLast();
        }
    }

    public void restate() {
        int spans = listed.size( ) ; 
        buttons[0].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (central.getChildCount() == 0) {
                            spawn();
                        } else {
                            List<int[]>  collects = RandomStream.generateN(0,spans,2,spans) ;
                            emplace(collects);
                        }
                    }
                });
        buttons[1].setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (listed.size() > 0) {
                            remove();
                        }
                    }
                });
        buttons[2].setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public  void onClick(View current){

                    List<int[]> source = SortingSource.InsertionSort() ;
                }
            }
        ) ;
    }


    //  public Button button4;
    //public Button button2;
   // public static int button4Id = R.id.activity_spawn_container_button_1_2_1;
 //  public static int button2Id = R.id.activity_spawn_container_button_1_2_2;  
            // Bitmap  temp4 = listed.get(lower).getImag; 
            //          int lower = current[0]  ; 
       //       int upper = current[1] ; 
}