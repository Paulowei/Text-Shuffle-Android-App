package com.moderneinstein;

import android.app.Activity;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.Menu;
import android.view.View ; 
import android.view.ViewGroup ;
import android.widget.Button ; 
import android.widget.TextView    ;
import android.app.Service ; 



import android.content.Intent ;
import android.content.Context ; 
import android.view.View.OnClickListener ; 
import android.view.LayoutInflater ; 
import android.app.Fragment ; 
import android.app.FragmentManager ; 
import android.app.FragmentTransaction ; 
//import android.app.FragmentTransactionManager ;
import static android.R.layout ; 
import android.R.layout ; 
//import android.R.id ;
import android.util.Log;

//import java.util.logger.Logger ; 
import java.util.List ; 
import java.util.Set ; 
import java.util.Vector ;


import org.xmlpull.v1.wrapper.classic.StaticXmlPullParserWrapper; 

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */

    public static int[]  viewId = {R.layout.activity_main_1_1_1_1
        ,R.layout.activity_main_1_1_2_1,R.layout.activity_main_1_1_2_2 }  ;
    public static int[] containId =  {R.id.activity_main_1,R.layout.activity_main_1_1,
        R.layout.activity_main_1_1_1,R.layout.activity_main_1_1_2} ;
    public  ViewGroup  containers[] ; 
    public  List<View>  views  ; 
    public static String[] routes = {"ShuffleActivity","InsertActivity"}    ; 
    public static Object[][] roles = new Object[][]{{},{}}  ;
    public static String alter = "Transgress" ;
    public  static Context context ; 
    public LayoutInflater inflate ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.R.layout layouts = new android.R.layout() ;
        setContentView(android.R.layout.activity_main);
        context = this.getApplicationContext() ; 
        inflate = getLayoutInflater() ;
        configure() ;   
    }
    /**
     * 
     * public static int[] textId  =  {} ; 
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	//getMenuInflater().inflate(com.moderneinstein.R.menu.main, menu);
	return true;
    }
    public  void configure(){
        Router.configure() ; 
         views = new Vector<View>()  ; 
        emplace() ;
        listeners() ; 
        insert () ;
    }
    public void emplace(){
        int amount = containId.length ;
        containers = new ViewGroup[amount] ; 
        for(int fr=amount-1;fr>=0 ;fr--){
            int great = containId[fr] ; 
            ViewGroup  gather = (ViewGroup)findViewById(great ) ;
            containers[fr] = gather ; 
        }
        int spread =  viewId.length ; 
        for(int vs=0; vs<spread ;vs++){
            int identify =  viewId[vs] ; 
            View check = (View)findViewById(identify) ; 
            views.add(check) ; 
        } 
    } 
       /*  for(int ds=0;ds<views.size();ds++ ){
        String   points = routes[ds]  ; 
         view.get(ds).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View current){
                    routeClass(points)   ; 
                }
            }
        ) ;
        }*/    
    public void listeners(){
        View.OnClickListener list3 = new View.OnClickListener(){
            @Override 
            public void onClick(View great){
                Intent  effort = new Intent(context,InsertActivity.class) ; 
                startActivity(effort) ; 
            }
        } ;
        View.OnClickListener list4 =  new View.OnClickListener(){
            @Override 
                public void onClick( View states){
                    Intent ideas =  new Intent(context,ShuffleActivity.class) ;
                    startActivity(ideas)  ;
            }
        }  ;
        views.get(1).setOnClickListener(list3) ;
        views.get(0).setOnClickListener(list4) ; 
    }
    public void insert(){
        int range = roles.length ; 
        Object[]  noted  ; 
        for(int cs=1;cs<=range;cs++){
            noted = roles[cs-1] ; 
            Integer firstId =(Integer)(noted[0])  ; 
            Integer secondId = (Integer)(noted[1]) ; 
            ViewGroup higher = (ViewGroup)(findViewById(secondId)) ;
            inflate.inflate(firstId,higher,true) ;
        }
    }
    public  void routeClass(String stated){
        Class<?> classed = Router.derive(stated) ; 
        Intent intended = new Intent(this,classed) ; 
        startActivity(intended );
    }
    @Override 
    public void onSaveInstanceState(Bundle saved) {
        super.onSaveInstanceState(saved) ; 
    }
    public static void trace(String data ){
        String value = data  ; 
        int width = data.length() ; 
        Log.d(alter,value) ;
        Log.i(alter,value) ;
        Log.println(Log.ASSERT,alter,data)  ;
        
    }
    /**
     * 
     *   <LinearLayout
            android:id = "activity_main_container_1_1_1_1"
            android:orientation = "horizontal" 
            android:layout_height ="wrap_content"
            android:layout_width = "wrap_content"  > 
                <Button
                android:id = "activity_main_button_1_1_1_1"
                android:layout_height = "@dimen/actity_main_button_1"
                android:layout_width = "@dimen/activity_main_button_1"
                android:background  = ""/>

                <Button 
                android:id = "activity_main_button_1_1_1_2" 
                android:layout_width = ""
                android:layout_height = "@dimen/activity_main_button_1"
                android:background = ""/>
            </LinearLayout>
            <LinearLayout
            android:layout_width = "wrap_content"
            android:layout_height = "wrap_content" 
            android:id = "" 
            android:orientation = "horizontal">
                <Button
                android:id = ""
                android:layout_height = ""
                android:layout_width= "" 
                android:background ="" />
                <Button 
                android:id = "" 
                android:layout_width= "" 
                android:layout_height="" 
                android:background= "" >

            </LinearLayout>
     */
}
